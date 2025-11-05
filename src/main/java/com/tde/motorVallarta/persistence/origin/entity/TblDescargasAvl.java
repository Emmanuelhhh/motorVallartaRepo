package com.tde.motorVallarta.persistence.origin.entity;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tbldescargasavl")
public class TblDescargasAvl implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "inttipoavl")
    private Integer tipoAvl;

    @Column(name = "strmodemid", length = 50)
    private String idModem;

    @Column(name = "flongitud_grad")
    private Double longitudGrad;

    @Column(name = "flatitud_grad")
    private Double latidudGrad;

    @Column(name = "intvelocidad")
    private Integer velocidad;

    @Column(name = "intnum_sat")
    private Integer numSat;


    @Column(name = "dfecha_hora_sat")
    private LocalDateTime fechaHoraSat;

    @Column(name = "inttipo_evento")
    private Integer tipoEvento;

    @Column(name = "intvariable1")
    private Integer variable1;


    @Column(name = "dfechahoracomputadora")
    private LocalDateTime fechaHoraComputadora;

    @Column(name = "intvarcontrol")
    private Integer varControl;


    @Column(name = "intstatus")
    private Integer intStatus;
}
