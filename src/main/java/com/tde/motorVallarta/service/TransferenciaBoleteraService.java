package com.tde.motorVallarta.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Service;

import com.tde.motorVallarta.persistence.destination.entity.TblDescargasCardBoletera;
import com.tde.motorVallarta.persistence.destination.entity.TblDescargasEfectivoBoletera;
import com.tde.motorVallarta.persistence.destination.entity.TblDescargasLocalizacionPasajeBoletera;
import com.tde.motorVallarta.persistence.destination.repo.TblDescargasCardBoleteraRepository;
import com.tde.motorVallarta.persistence.destination.repo.TblDescargasEfectivoBoleteraRepository;
import com.tde.motorVallarta.persistence.destination.repo.TblDescargasLocalizacionPasajeBoleteraRepository;
import com.tde.motorVallarta.persistence.origin.entity.TblDescargaViaxerBoleteraExp;
import com.tde.motorVallarta.persistence.origin.repo.TblDescargaViaxerBoleteraExpRepository;


@Service
public class TransferenciaBoleteraService {

    private final TblDescargaViaxerBoleteraExpRepository origenRepo;
    private final TblDescargasLocalizacionPasajeBoleteraRepository localizacionRepo;
    private final TblDescargasEfectivoBoleteraRepository efectivoRepo;
    private final TblDescargasCardBoleteraRepository cardRepo;

    public TransferenciaBoleteraService(
            TblDescargaViaxerBoleteraExpRepository origenRepo,
            TblDescargasLocalizacionPasajeBoleteraRepository localizacionRepo,
            TblDescargasEfectivoBoleteraRepository efectivoRepo,
            TblDescargasCardBoleteraRepository cardRepo) {
        this.origenRepo = origenRepo;
        this.localizacionRepo = localizacionRepo;
        this.efectivoRepo = efectivoRepo;
        this.cardRepo = cardRepo;
    }

    /**
     * Procesa todos los registros de la tabla origen y los transfiere
     * a las tablas destino correspondientes. Después de insertarlos,
     * los elimina de la tabla origen.
     */
    @Transactional("readingCardTransactionManager") // <-- usa el transaction manager de Vallarta
    public void transferir() {
        List<TblDescargaViaxerBoleteraExp> registros = (List<TblDescargaViaxerBoleteraExp>) origenRepo.findTopByVarControl();

        for (TblDescargaViaxerBoleteraExp exp : registros) {
            boolean insertado = false;

            switch (exp.getTipoArch()) {
                case 1:
                    TblDescargasLocalizacionPasajeBoletera loc = new TblDescargasLocalizacionPasajeBoletera();
                    loc.setIdDgprs(exp.getIdDgprs());
                    loc.setStrModemId(exp.getStrModemId());
                    loc.setFechaHoraInsert(exp.getFechaHoraInsert());
                    loc.setIntVarControl(exp.getIntVarControl());
                    // TODO: mapear exp.getC1()...exp.getC22()
                    localizacionRepo.save(loc);
                    insertado = true;
                    break;

                case 2:
                    TblDescargasEfectivoBoletera efectivo = new TblDescargasEfectivoBoletera();
                    efectivo.setIdDgprs(exp.getIdDgprs());
                    efectivo.setStrModemId(exp.getStrModemId());
                    efectivo.setFechaHoraInsert(exp.getFechaHoraInsert());
                    efectivo.setIntVarControl(exp.getIntVarControl());
                    // TODO: mapear exp.getC1()...exp.getC41()
                    efectivoRepo.save(efectivo);
                    insertado = true;
                    break;

                case 3:
                    TblDescargasCardBoletera card = new TblDescargasCardBoletera();
                    card.setIdDgprs(exp.getIdDgprs());
                    card.setStrModemId(exp.getStrModemId());
                    card.setFechaHoraInsert(exp.getFechaHoraInsert());
                    card.setIntVarControl(exp.getIntVarControl());
                    // TODO: mapear exp.getC1()...exp.getC36()
                    cardRepo.save(card);
                    insertado = true;
                    break;

                default:
                    System.out.println("⚠ TipoArch no reconocido: " + exp.getTipoArch());
            }

            // si se insertó bien, eliminar de origen
            if (insertado) {
                origenRepo.delete(exp);
            }
        }
    }
}
