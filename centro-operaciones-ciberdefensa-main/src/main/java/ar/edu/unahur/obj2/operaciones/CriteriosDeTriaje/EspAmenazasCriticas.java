package ar.edu.unahur.obj2.operaciones.CriteriosDeTriaje;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.Alerta;

public class EspAmenazasCriticas implements CriterioAlerta{

    @Override
    public Boolean esAsignable(Alerta alerta){
        return alerta.getSeveridadBase() > 75;
    }
}
