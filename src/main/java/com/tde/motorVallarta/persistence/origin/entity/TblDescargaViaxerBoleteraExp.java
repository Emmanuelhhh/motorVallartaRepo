package com.tde.motorVallarta.persistence.origin.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tblDescarga_Viaxer_BOLETERA_Exp")
public class TblDescargaViaxerBoleteraExp implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_DGPRS")
    private Long idDgprs;

    @Column(name = "tipoArch")
    private Integer tipoArch;

    @Column(name = "strModem_ID", length = 10)
    private String strModemId;

    @Column(name = "dt_FechaHoraInsert", nullable = false)
    private LocalDateTime fechaHoraInsert;

    @Column(name = "intVarControl")
    private Integer intVarControl;

    @Column(name = "c1", length = 20) private String c1;
    @Column(name = "c2", length = 20) private String c2;
    @Column(name = "c3", length = 20) private String c3;
    @Column(name = "c4", length = 20) private String c4;
    @Column(name = "c5", length = 20) private String c5;
    @Column(name = "c6", length = 20) private String c6;
    @Column(name = "c7", length = 20) private String c7;
    @Column(name = "c8", length = 20) private String c8;
    @Column(name = "c9", length = 20) private String c9;
    @Column(name = "c10", length = 20) private String c10;
    @Column(name = "c11", length = 20) private String c11;
    @Column(name = "c12", length = 20) private String c12;
    @Column(name = "c13", length = 20) private String c13;
    @Column(name = "c14", length = 20) private String c14;
    @Column(name = "c15", length = 20) private String c15;
    @Column(name = "c16", length = 20) private String c16;
    @Column(name = "c17", length = 20) private String c17;
    @Column(name = "c18", length = 20) private String c18;
    @Column(name = "c19", length = 20) private String c19;
    @Column(name = "c20", length = 20) private String c20;
    @Column(name = "c21", length = 20) private String c21;
    @Column(name = "c22", length = 20) private String c22;
    @Column(name = "c23", length = 20) private String c23;
    @Column(name = "c24", length = 20) private String c24;
    @Column(name = "c25", length = 20) private String c25;
    @Column(name = "c26", length = 20) private String c26;
    @Column(name = "c27", length = 20) private String c27;
    @Column(name = "c28", length = 20) private String c28;
    @Column(name = "c29", length = 20) private String c29;
    @Column(name = "c30", length = 20) private String c30;
    @Column(name = "c31", length = 20) private String c31;
    @Column(name = "c32", length = 20) private String c32;
    @Column(name = "c33", length = 20) private String c33;
    @Column(name = "c34", length = 20) private String c34;
    @Column(name = "c35", length = 20) private String c35;
    @Column(name = "c36", length = 20) private String c36;
    @Column(name = "c37", length = 20) private String c37;
    @Column(name = "c38", length = 20) private String c38;
    @Column(name = "c39", length = 20) private String c39;
    @Column(name = "c40", length = 20) private String c40;
    @Column(name = "c41", length = 20) private String c41;
}
