package ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaDecorator;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.Alerta;

public class GeoLocalizacion extends AlertaDecorator{

    public GeoLocalizacion(Alerta alertaDecorada) {
        super(alertaDecorada);
        }

    @Override
    public Integer getSeveridadBase(){
        return alertaDecorada.getSeveridadBase() + 5;
    }
}
