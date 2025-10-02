package com.tde.motorVallarta.persistence.destination.entity;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tblDescargas_Card_Boletera")
public class TblDescargasCardBoletera {

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

    @Column(name = "codigo_Evento_Card")
    private Integer codigoEventoCard;

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

    @Column(name = "tipo_Tecnologia")
    private Integer tipoTecnologia;

    @Column(name = "card_UID_MSB_LSB", length = 8)
    private String cardUidMsbLsb;

    @Column(name = "tipo_tarjeta")
    private Integer tipoTarjeta;

    @Column(name = "subTipo_tarjeta")
    private Integer subTipoTarjeta;

    @Column(name = "saldo_Inicial")
    private Double saldoInicial;

    @Column(name = "cobro")
    private Double cobro;

    @Column(name = "saldo_Final")
    private Double saldoFinal;

    @Column(name = "num_Serie_Punto_Venta")
    private Integer numSeriePuntoVenta;

    @Column(name = "folio_Ultima_Recarga")
    private Integer folioUltimaRecarga;

    @Column(name = "sam_UID_Debita", length = 16)
    private String samUidDebita;

    @Column(name = "sam_UID_Recarga", length = 16)
    private String samUidRecarga;

    @Column(name = "sam_UID_Activa", length = 16)
    private String samUidActiva;

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
