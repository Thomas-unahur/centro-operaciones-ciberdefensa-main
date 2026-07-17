package ar.edu.unahur.obj2.operaciones.Analistas;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.Alerta;
import ar.edu.unahur.obj2.operaciones.CriteriosDeTriaje.CriterioAlerta;

public class Analista {
    private final String legajo;
    private CriterioAlerta criterioAlerta;
    private List<Alerta> historialDeAlertas;
   
    public Analista(String legajo, CriterioAlerta criterioAlerta, List<Alerta> historialDeAlertas) {
        this.legajo = legajo;
        this.criterioAlerta = criterioAlerta;
        this.historialDeAlertas = new ArrayList<>();
    }

    public List<Alerta> listasProcesadas(){
        return this.historialDeAlertas;
    }

    public void agregarAlerta(Alerta alerta){
        historialDeAlertas.add(alerta);
    }

    public void setCriterioAlerta(CriterioAlerta criterioAlerta) {
        this.criterioAlerta = criterioAlerta;
    }

    public String getLegajo() {
        return legajo;
    }

    public CriterioAlerta getCriterioAlerta() {
        return criterioAlerta;
    }

    
}
