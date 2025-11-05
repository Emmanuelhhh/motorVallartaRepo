package com.tde.motorVallarta.persistence.destination.entity;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tblDescargasAVL_Boletera")
public class TblDescargasAvlD {

	 @Id
	 @Column(name = "id")
	 private Long id;

    @Column(name = "inttipoavl")
    private Integer tipoAvl;

    @Column(name = "strmodemid", length = 50)
    private String modemId;

    @Column(name = "flongitud_grad")
    private Double longitudGrad;

    @Column(name = "flatitud_grad")
    private Double latitudGrad;

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
    private LocalDateTime dFechaHoraComputadora;

    @Column(name = "intvarcontrol")
    private Integer intVarControl;

 

    @Column(name = "intstatus")
    private Integer intStatus;
}
