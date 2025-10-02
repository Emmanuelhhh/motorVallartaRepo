package com.tde.motorVallarta.persistence.destination.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tblDescargas_Localizacion_Pasaje_Boletera")
public class TblDescargasLocalizacionPasajeBoletera {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "id_DGPRS")
    private Long idDgprs;

    @Column(name = "strModem_ID", length = 10)
    private String strModemId;

    @Column(name = "dt_FechaHoraInsert")
    private LocalDateTime fechaHoraInsert;

    @Column(name = "intVarControl")
    private Integer intVarControl;

    @Column(name = "contador_Eventos_Validos")
    private Integer contadorEventosValidos;

    @Column(name = "id_Ruta")
    private Integer idRuta;

    @Column(name = "id_Ramal")
    private Integer idRamal;

    @Column(name = "id_Unidad")
    private Integer idUnidad;

    @Column(name = "dt_FechaEvento")
    private LocalDateTime fechaEvento;

    @Column(name = "codigo_Evento_Pasaje")
    private Integer codigoEventoPasaje;

    @Column(name = "codigo_SubEvento")
    private Integer codigoSubEvento;

    @Column(name = "parametro_SubEvento1")
    private Integer parametroSubEvento1;

    @Column(name = "parametro_SubEvento2")
    private Integer parametroSubEvento2;

    @Column(name = "gps_Longitud")
    private Double gpsLongitud;

    @Column(name = "gps_Latitud")
    private Double gpsLatitud;

    @Column(name = "gps_NSAT")
    private Short gpsNsat;  // tinyint → Short (más seguro que Integer si quieres reflejar su rango 0–255)

    @Column(name = "gps_Velocidad")
    private Integer gpsVelocidad;

    @Column(name = "dt_FechaHora_SAT")
    private LocalDateTime fechaHoraSat;

    @Column(name = "pasaje_Bicam_SubidasPta1")
    private Integer pasajeBicamSubidasPta1;

    @Column(name = "pasaje_Bicam_BajadasPta1")
    private Integer pasajeBicamBajadasPta1;

    @Column(name = "pasaje_Bicam_SubidasPta2")
    private Integer pasajeBicamSubidasPta2;

    @Column(name = "pasaje_Bicam_BajadasPta2")
    private Integer pasajeBicamBajadasPta2;

    @Column(name = "pasaje_Bicam_SubidasPta3")
    private Integer pasajeBicamSubidasPta3;

    @Column(name = "pasaje_Bicam_BajadasPta3")
    private Integer pasajeBicamBajadasPta3;

    @Column(name = "pasaje_Bicam_SubidasPta4")
    private Integer pasajeBicamSubidasPta4;

    @Column(name = "pasaje_Bicam_BajadasPta4")
    private Integer pasajeBicamBajadasPta4;
}
