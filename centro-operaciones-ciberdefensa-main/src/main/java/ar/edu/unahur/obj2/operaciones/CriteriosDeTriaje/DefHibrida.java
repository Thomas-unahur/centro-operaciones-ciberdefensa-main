package ar.edu.unahur.obj2.operaciones.CriteriosDeTriaje;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaEstandar;

public class DefHibrida implements CriterioAlerta{

    private EspAmenazasCriticas espAmenazasCriticas;
    private EspInfraestructura espInfraestructura;

    public DefHibrida(EspAmenazasCriticas espAmenazasCriticas, EspInfraestructura espInfraestructura){
        this.espAmenazasCriticas = espAmenazasCriticas;
        this.espInfraestructura = espInfraestructura;
    }

    @Override
    public Boolean esAsignable(AlertaEstandar alerta){
        return espAmenazasCriticas.esAsignable(alerta) || espInfraestructura.esAsignable(alerta);
    }
}
