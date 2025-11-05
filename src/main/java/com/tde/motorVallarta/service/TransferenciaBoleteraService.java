package com.tde.motorVallarta.service;


import com.tde.motorVallarta.persistence.origin.entity.TblDescargaViaxerBoleteraExp;
import com.tde.motorVallarta.persistence.origin.repo.TblDescargaViaxerBoleteraExpRepository;
import com.tde.motorVallarta.persistence.destination.entity.*;
import com.tde.motorVallarta.persistence.destination.repo.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

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
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    @Transactional("readingTransactionManager")
    public void transferir() {
        Iterable<TblDescargaViaxerBoleteraExp> registros = origenRepo.findTopByVarControl();
        System.out.println("REGISTROS TblDescargaViaxerBoleteraExp ");

        for (TblDescargaViaxerBoleteraExp exp : registros) {
            boolean insertado = false;

            switch (exp.getTipoArch()) {
                case 1:
                    TblDescargasLocalizacionPasajeBoletera loc = new TblDescargasLocalizacionPasajeBoletera();
                    // Campos comunes
                    loc.setIdDgprs(exp.getIdDgprs());
                    loc.setStrModemId(exp.getStrModemId());
                    loc.setFechaHoraInsert(exp.getFechaHoraInsert());
                    loc.setIntVarControl(exp.getIntVarControl());
                    // c1..c22
                    loc.setContadorEventosValidos(parseInt(exp.getC1()));
                    loc.setIdRuta(parseInt(exp.getC2()));
                    loc.setIdRamal(parseInt(exp.getC3()));
                    loc.setIdUnidad(parseInt(exp.getC4()));
                    loc.setFechaEvento(parseDateTime(exp.getC5()));
                    loc.setCodigoEventoPasaje(parseInt(exp.getC6()));
                    loc.setCodigoSubEvento(parseInt(exp.getC7()));
                    loc.setParametroSubEvento1(parseInt(exp.getC8()));
                    loc.setParametroSubEvento2(parseInt(exp.getC9()));
                    loc.setGpsLongitud(parseDouble(exp.getC10()));
                    loc.setGpsLatitud(parseDouble(exp.getC11()));
                    loc.setGpsNsat(parseShort(exp.getC12()));
                    loc.setGpsVelocidad(parseInt(exp.getC13()));
                    loc.setFechaHoraSat(parseDateTime(exp.getC14()));
                    loc.setPasajeBicamSubidasPta1(parseInt(exp.getC15()));
                    loc.setPasajeBicamBajadasPta1(parseInt(exp.getC16()));
                    loc.setPasajeBicamSubidasPta2(parseInt(exp.getC17()));
                    loc.setPasajeBicamBajadasPta2(parseInt(exp.getC18()));
                    loc.setPasajeBicamSubidasPta3(parseInt(exp.getC19()));
                    loc.setPasajeBicamBajadasPta3(parseInt(exp.getC20()));
                    loc.setPasajeBicamSubidasPta4(parseInt(exp.getC21()));
                    loc.setPasajeBicamBajadasPta4(parseInt(exp.getC22()));
                    localizacionRepo.save(loc);
                    insertado = true;
                    break;

                case 2:
                    TblDescargasEfectivoBoletera efectivo = new TblDescargasEfectivoBoletera();
                    // Campos comunes
                    efectivo.setIdDgprs(exp.getIdDgprs());
                    efectivo.setStrModemId(exp.getStrModemId());
                    efectivo.setFechaHoraInsert(exp.getFechaHoraInsert());
                    efectivo.setIntVarControl(exp.getIntVarControl());
                    // c1..c41
                    efectivo.setContadorEventosValidos(parseInt(exp.getC1()));
                    efectivo.setIdRuta(parseInt(exp.getC2()));
                    efectivo.setIdRamal(parseInt(exp.getC3()));
                    efectivo.setIdUnidad(parseInt(exp.getC4()));
                    efectivo.setFechaEvento(parseDateTime(exp.getC5()));
                    efectivo.setCodigoEventoEfectivo(parseInt(exp.getC6()));
                    efectivo.setFolioInicioBoleto(exp.getC7());
                    efectivo.setFolioFinBoleto(exp.getC8());
                    efectivo.setOrigen(parseInt(exp.getC9()));
                    efectivo.setDestino(parseInt(exp.getC10()));
                    efectivo.setVersionTarifas(parseInt(exp.getC11()));
                    efectivo.setBoletosOrdinario(parseInt(exp.getC12()));
                    efectivo.setBoletosEstudiante(parseInt(exp.getC13()));
                    efectivo.setBoletosInsen(parseInt(exp.getC14()));
                    efectivo.setBoletosNino(parseInt(exp.getC15()));
                    efectivo.setBoletosCapDiferentes(parseInt(exp.getC16()));
                    efectivo.setBoletosHotel(parseInt(exp.getC17()));
                    efectivo.setBoletosTipo7(parseInt(exp.getC18()));
                    efectivo.setBoletosTipo8(parseInt(exp.getC19()));
                    efectivo.setBoletosTipo9(parseInt(exp.getC20()));
                    efectivo.setBoletosTipo10(parseInt(exp.getC21()));
                    efectivo.setBoletosTipo11(parseInt(exp.getC22()));
                    efectivo.setBoletosTipo12(parseInt(exp.getC23()));
                    efectivo.setBoletosTipo13(parseInt(exp.getC24()));
                    efectivo.setBoletosTipo14(parseInt(exp.getC25()));
                    efectivo.setBoletosTipo15(parseInt(exp.getC26()));
                    efectivo.setBoletosTipo16(parseInt(exp.getC27()));
                    efectivo.setCobroTotalEfectivo(parseDouble(exp.getC28()));
                    efectivo.setGpsLongitud(parseDouble(exp.getC29()));
                    efectivo.setGpsLatitud(parseDouble(exp.getC30()));
                    efectivo.setGpsNsat(parseInt(exp.getC31()));
                    efectivo.setGpsVelocidad(parseInt(exp.getC32()));
                    efectivo.setFechaHoraSat(parseDateTime(exp.getC33()));
                    efectivo.setPasajeBicamSubidasPta1(parseInt(exp.getC34()));
                    efectivo.setPasajeBicamBajadasPta1(parseInt(exp.getC35()));
                    efectivo.setPasajeBicamSubidasPta2(parseInt(exp.getC36()));
                    efectivo.setPasajeBicamBajadasPta2(parseInt(exp.getC37()));
                    efectivo.setPasajeBicamSubidasPta3(parseInt(exp.getC38()));
                    efectivo.setPasajeBicamBajadasPta3(parseInt(exp.getC39()));
                    efectivo.setPasajeBicamSubidasPta4(parseInt(exp.getC40()));
                    efectivo.setPasajeBicamBajadasPta4(parseInt(exp.getC41()));
                    efectivoRepo.save(efectivo);
                    insertado = true;
                    break;

                case 3:
                    TblDescargasCardBoletera card = new TblDescargasCardBoletera();
                    // Campos comunes
                    card.setIdDgprs(exp.getIdDgprs());
                    card.setStrModemId(exp.getStrModemId());
                    card.setFechaHoraInsert(exp.getFechaHoraInsert());
                    card.setIntVarControl(exp.getIntVarControl());
                    // c1..c36
                    card.setContadorEventosValidos(parseInt(exp.getC1()));
                    card.setIdRuta(parseInt(exp.getC2()));
                    card.setIdRamal(parseInt(exp.getC3()));
                    card.setIdUnidad(parseInt(exp.getC4()));
                    card.setFechaEvento(parseDateTime(exp.getC5()));
                    card.setCodigoEventoCard(parseInt(exp.getC6()));
                    card.setFolioInicioBoleto(exp.getC7());
                    card.setFolioFinBoleto(exp.getC8());
                    card.setOrigen(parseInt(exp.getC9()));
                    card.setDestino(parseInt(exp.getC10()));
                    card.setVersionTarifas(parseInt(exp.getC11()));
                    card.setTipoTecnologia(parseInt(exp.getC12()));
                    card.setCardUidMsbLsb(exp.getC13());
                    card.setTipoTarjeta(parseInt(exp.getC14()));
                    card.setSubTipoTarjeta(parseInt(exp.getC15()));
                    card.setSaldoInicial(parseDouble(exp.getC16()));
                    card.setCobro(parseDouble(exp.getC17()));
                    card.setSaldoFinal(parseDouble(exp.getC18()));
                    card.setNumSeriePuntoVenta(parseInt(exp.getC19()));
                    card.setFolioUltimaRecarga(parseInt(exp.getC20()));
                    card.setSamUidDebita(exp.getC21());
                    card.setSamUidRecarga(exp.getC22());
                    card.setSamUidActiva(exp.getC23());
                    card.setGpsLongitud(parseDouble(exp.getC24()));
                    card.setGpsLatitud(parseDouble(exp.getC25()));
                    card.setGpsNsat(parseInt(exp.getC26()));
                    card.setGpsVelocidad(parseInt(exp.getC27()));
                    card.setFechaHoraSat(parseDateTime(exp.getC28()));
                    card.setPasajeBicamSubidasPta1(parseInt(exp.getC29()));
                    card.setPasajeBicamBajadasPta1(parseInt(exp.getC30()));
                    card.setPasajeBicamSubidasPta2(parseInt(exp.getC31()));
                    card.setPasajeBicamBajadasPta2(parseInt(exp.getC32()));
                    card.setPasajeBicamSubidasPta3(parseInt(exp.getC33()));
                    card.setPasajeBicamBajadasPta3(parseInt(exp.getC34()));
                    card.setPasajeBicamSubidasPta4(parseInt(exp.getC35()));
                    card.setPasajeBicamBajadasPta4(parseInt(exp.getC36()));
                    cardRepo.save(card);
                    insertado = true;
                    break;
            }

            if (insertado) {
                origenRepo.delete(exp);
            }
        }
    }

    // Utilidades de conversión
    private Integer parseInt(String value) {
        try { return value != null ? Integer.valueOf(value) : null; } catch (Exception e) { return null; }
    }
    private Long parseLong(String value) {
        try { return value != null ? Long.valueOf(value) : null; } catch (Exception e) { return null; }
    }
    private Double parseDouble(String value) {
        try { return value != null ? Double.valueOf(value) : null; } catch (Exception e) { return null; }
    }
    private Short parseShort(String value) {
        try { return value != null ? Short.valueOf(value) : null; } catch (Exception e) { return null; }
    }
    private LocalDateTime parseDateTime(String value) {
        try {
            return value != null && !value.trim().isEmpty()
                    ? LocalDateTime.parse(value, FORMATTER)
                    : null;
        } catch (Exception e) {
            return null; // o log.warn("Fecha inválida: " + value, e);
        }
    }
}
