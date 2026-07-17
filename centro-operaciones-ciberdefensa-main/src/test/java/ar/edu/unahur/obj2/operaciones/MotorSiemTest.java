package ar.edu.unahur.obj2.operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaEstandar;
import ar.edu.unahur.obj2.operaciones.Motor.MotorSiem;
import ar.edu.unahur.obj2.operaciones.Motor.EstDeEnriquecimiento.ModoForense;
import ar.edu.unahur.obj2.operaciones.Motor.EstDeEnriquecimiento.ModoRapido;

public class MotorSiemTest {
    @Test
    public void testCambiarEstrategiaDeEnriquecimiento() {
     
        MotorSiem motor = new MotorSiem(new ModoRapido());
        ModoForense modoNuevo = new ModoForense();

        motor.cambiarEstrategia(modoNuevo);
        assertEquals(modoNuevo, motor.getEstrategiaEnriquecimiento());
    }

}
