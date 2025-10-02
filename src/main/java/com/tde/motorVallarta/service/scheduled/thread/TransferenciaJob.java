package com.tde.motorVallarta.service.scheduled.thread;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.tde.motorVallarta.service.TransferenciaBoleteraService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class TransferenciaJob {

    @Autowired
    private TransferenciaBoleteraService transferenciaBoleteraService;

    private final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

    private static final Logger log = LoggerFactory.getLogger(TransferenciaJob.class);

    /**
     * Ejecuta el job de transferencia cada minuto (puedes ajustar el cron).
     * Expresión cron: segundo minuto hora díaMes mes díaSemana
     */
    @Scheduled(cron = "0 * * * * ?")
    public void ejecutarTransferencia() {
        log.info("Inicia proceso de transferencia de datos (motorVallarta)");

        // Ejecuta inmediatamente
        scheduledExecutorService.schedule(
            () -> executeSafely(() -> transferenciaBoleteraService.transferir()), 
            0, TimeUnit.SECONDS
        );

        log.info("Tarea programada");
    }

    private synchronized void executeSafely(Runnable task) {
        try {
            task.run();
        } catch (Exception e) {
            log.error("Error ejecutando tarea de transferencia", e);
        }
    }
}
