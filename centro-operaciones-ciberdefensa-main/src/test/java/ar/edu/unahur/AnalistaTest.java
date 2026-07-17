package ar.edu.unahur;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaEstandar;
import ar.edu.unahur.obj2.operaciones.Analistas.Analista;
import ar.edu.unahur.obj2.operaciones.CriteriosDeTriaje.AnalistaN1;
import ar.edu.unahur.obj2.operaciones.CriteriosDeTriaje.EspAmenazasCriticas;

public class AnalistaTest {
    @Test
    public void testInicializacionAnalistaCorrecta() {

        AnalistaN1 criterioInicial = new AnalistaN1();
        Analista analista = new Analista("LEG-4560", criterioInicial, new ArrayList<>());

        assertEquals("LEG-4560", analista.getLegajo());
        assertEquals(criterioInicial, analista.getCriterioAlerta());
        assertTrue(analista.listasProcesadas().isEmpty());
    }

    @Test
    public void testCambiarCriterioDeAlerta() {

        Analista analista = new Analista("LEG-4560", new AnalistaN1(), new ArrayList<>());
        EspAmenazasCriticas nuevoCriterio = new EspAmenazasCriticas();
       
        analista.setCriterioAlerta(nuevoCriterio);
        assertEquals(nuevoCriterio, analista.getCriterioAlerta());
    }

    @Test
    public void testAgregarAlertaLaGuardaEnElHistorial() {
        Analista analista = new Analista("LEG-4560", new AnalistaN1(), new ArrayList<>());
        AlertaEstandar alerta = new AlertaEstandar("AL-100", "10.0.0.4", 50, 200);

        analista.agregarAlerta(alerta);
        assertEquals(1, analista.listasProcesadas().size(), "El historial debería tener exactamente 1 alerta.");
        assertTrue(analista.listasProcesadas().contains(alerta));
    }
}
