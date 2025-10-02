package com.tde.motorVallarta.persistence.destination.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tblDescargas_Efectivo_Boletera")
public class TblDescargasEfectivoBoletera {

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

    @Column(name = "codigo_Evento_Efectivo")
    private Integer codigoEventoEfectivo;

    @Column(name = "folio_inicio_boleto", length = 11)
    private String folioInicioBoleto;

    @Column(name = "folio_Fin_boleto", length = 11)
    private String folioFinBoleto;

    @Column(name = "origen")
    private Integer origen;

    @Column(name = "destino")
    private Integer destino;

    @Column(name = "version_Tarifas")
    private Integer versionTarifas;

    @Column(name = "boletos_Ordinario")
    private Integer boletosOrdinario;

    @Column(name = "boletos_Estudiante")
    private Integer boletosEstudiante;

    @Column(name = "boletos_INSEN")
    private Integer boletosInsen;

    @Column(name = "boletos_Niño")
    private Integer boletosNino;

    @Column(name = "boletos_CapDiferentes")
    private Integer boletosCapDiferentes;

    @Column(name = "boletos_Hotel")
    private Integer boletosHotel;

    @Column(name = "boletos_Tipo7")
    private Integer boletosTipo7;

    @Column(name = "boletos_Tipo8")
    private Integer boletosTipo8;

    @Column(name = "boletos_Tipo9")
    private Integer boletosTipo9;

    @Column(name = "boletos_Tipo10")
    private Integer boletosTipo10;

    @Column(name = "boletos_Tipo11")
    private Integer boletosTipo11;

    @Column(name = "boletos_Tipo12")
    private Integer boletosTipo12;

    @Column(name = "boletos_Tipo13")
    private Integer boletosTipo13;

    @Column(name = "boletos_Tipo14")
    private Integer boletosTipo14;

    @Column(name = "boletos_Tipo15")
    private Integer boletosTipo15;

    @Column(name = "boletos_Tipo16")
    private Integer boletosTipo16;

    @Column(name = "cobro_Total_Efectivo")
    private Double cobroTotalEfectivo;

    @Column(name = "gps_Longitud")
    private Double gpsLongitud;

    @Column(name = "gps_Latitud")
    private Double gpsLatitud;

    @Column(name = "gps_NSAT")
    private Integer gpsNsat;

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
