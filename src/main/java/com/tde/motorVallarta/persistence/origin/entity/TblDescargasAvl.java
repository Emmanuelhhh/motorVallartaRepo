package com.tde.motorVallarta.persistence.origin.entity;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tblDescargasAVL")
public class TblDescargasAvl implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "intTipoAVL")
    private Integer intTipoAvl;

    @Column(name = "strModemID", length = 50)
    private String strModemId;

    @Column(name = "fLongitud_grad")
    private Double fLongitudGrad;

    @Column(name = "fLatitud_grad")
    private Double fLatitudGrad;

    @Column(name = "intVelocidad")
    private Integer intVelocidad;

    @Column(name = "intAltitud")
    private Integer intAltitud;

    @Column(name = "intNum_Sat")
    private Integer intNumSat;

    @Column(name = "intHeading")
    private Integer intHeading;

    @Column(name = "dFecha_Hora_SAT")
    private LocalDateTime dFechaHoraSat;

    @Column(name = "intTipo_Evento")
    private Integer intTipoEvento;

    @Column(name = "intVariable1")
    private Integer intVariable1;

    @Column(name = "intVariable2")
    private Integer intVariable2;

    @Column(name = "intVariable3")
    private Integer intVariable3;

    @Column(name = "intVariable4")
    private Integer intVariable4;

    @Column(name = "dFechaHoraComputadora")
    private LocalDateTime dFechaHoraComputadora;

    @Column(name = "intVarControl")
    private Integer intVarControl;

    @Column(name = "intId_Asignacion")
    private Long intIdAsignacion;

    @Column(name = "intStatus")
    private Integer intStatus;
}
