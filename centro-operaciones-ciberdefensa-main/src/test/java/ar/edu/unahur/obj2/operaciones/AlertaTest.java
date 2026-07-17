package ar.edu.unahur.obj2.operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaEstandar;
import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaInvalidaException;

public class AlertaTest {
    @Test
    public void testCrearAlertaEstandarExitosamente() {
        AlertaEstandar alerta = new AlertaEstandar("AL-001", "192.168.1.50", 45, 120);
        assertEquals("AL-001", alerta.getId());
        assertEquals("192.168.1.50", alerta.getIpOrigen());
        assertEquals(45, alerta.getSeveridadBase());
        assertEquals(120, alerta.getTiempoDeDeteccion());
        assertFalse(alerta.esCritica(), "una severidad de 45 no es critica");
    }

    @Test
    public void testAlertaEsCriticaCuandoSuperaNoventa() {
        AlertaEstandar alertaCritica = new AlertaEstandar("AL-002", "10.0.0.1", 95, 30);
        assertTrue(alertaCritica.esCritica());
    }

    @Test
    public void testSeveridadNegativaLanzaAlertaInvalidaException() {
        assertThrows(AlertaInvalidaException.class, () -> {
            new AlertaEstandar("AL-003", "10.0.0.1", -10, 15);
        });
    }

}
