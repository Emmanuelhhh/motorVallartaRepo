package com.tde.motorVallarta.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tde.motorVallarta.persistence.origin.entity.TblDescargasAvl;
import com.tde.motorVallarta.persistence.origin.repo.TblDescargasAvlRepositoryO;
import com.tde.motorVallarta.persistence.destination.entity.TblDescargasAvlD;
import com.tde.motorVallarta.persistence.destination.repo.TblDescargasAvlRepositoryD;
import com.tde.motorVallarta.persistence.origin.repo.TblDescargasAvlRepositoryO;
import com.tde.motorVallarta.persistence.destination.entity.TblDescargasAvlD;
import com.tde.motorVallarta.persistence.destination.repo.TblDescargasAvlRepositoryD;



@Service
public class AVLTransferenciaService {

    @Autowired
    private TblDescargasAvlRepositoryO descargasAvlRepoO;

    @Autowired
    private TblDescargasAvlRepositoryD avlRepoD;

    @Transactional
    public void transferirDatos(Integer varControl) {
        // Convertimos el Iterable a una lista para poder manipularlo
        List<TblDescargasAvl> registros = new ArrayList<>();
        descargasAvlRepoO.findTopByVarControl(varControl).forEach(registros::add);

        System.out.println("REGISTROS AVL BARRAS DESCARGAS AVL BARRAS  ");

        // Lista para almacenar los registros que fallaron
        List<TblDescargasAvl> registrosFallidos = new ArrayList<>();

        for (TblDescargasAvl registroO : registros) {
            try {
            	TblDescargasAvlD registroD = convertirADestino(registroO);
            	avlRepoD.save(registroD); // Guardar registro individualmente
            } catch (Exception e) {
                registrosFallidos.add(registroO); // Almacenar los fallidos
                System.err.println("Error al transferir registro: " + registroO.getIdModem() + ", " + e.getMessage());
            }
        }

        // Elimina solo los registros que no fallaron
        registros.removeAll(registrosFallidos);
        descargasAvlRepoO.deleteAll(registros);

        System.out.println("FIN DEL PROCESO");
    }

    

private TblDescargasAvlD convertirADestino(TblDescargasAvl origen) {
	TblDescargasAvlD destino = new TblDescargasAvlD();

    destino.setId(origen.getId());
    destino.setTipoAvl(origen.getTipoAvl());
    destino.setModemId(origen.getIdModem());
    destino.setLongitudGrad(origen.getLongitudGrad());
    destino.setLatitudGrad(origen.getLatidudGrad());
    destino.setVelocidad(origen.getVelocidad());
    destino.setNumSat(origen.getNumSat());
    destino.setFechaHoraSat(origen.getFechaHoraSat());
    destino.setTipoEvento(origen.getTipoEvento());
    destino.setVariable1(origen.getVariable1());
    destino.setDFechaHoraComputadora(origen.getFechaHoraComputadora());
    destino.setIntVarControl(origen.getVarControl());

    // Campos adicionales en DescargasAvlD que no están en DescargasAvlO
    // Puedes inicializar `avl` como null o asignar un valor predeterminado
  //  destino.setAvl(null);  // O asigna un objeto `Avl` según tu lógica.

    return destino;
}
}
