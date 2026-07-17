package ar.edu.unahur.obj2.operaciones.CriteriosDeTriaje;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaEstandar;

public class AnalistaN1 implements CriterioAlerta{
    
    @Override
    public Boolean esAsignable(AlertaEstandar alerta){
        return Boolean.TRUE;
    }
}
