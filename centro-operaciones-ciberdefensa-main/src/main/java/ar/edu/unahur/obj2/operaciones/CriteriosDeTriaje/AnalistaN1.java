package ar.edu.unahur.obj2.operaciones.CriteriosDeTriaje;

import ar.edu.unahur.obj2.operaciones.Alerta;

public class AnalistaN1 implements CriterioAlerta{
    
    @Override
    public Boolean esAsignable(Alerta alerta){
        return Boolean.TRUE;
    }
}
