package ar.edu.unahur.obj2.operaciones.Motor.EstDeEnriquecimiento;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.Alerta;
import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaDecorator.GeoLocalizacion;
import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaDecorator.HistorialForense;

public class ModoForense implements EstrategiaEnriquecimiento{
    
    @Override
    public Alerta enriquecer(Alerta alerta){
    Alerta alertaGeolocalizacion = new GeoLocalizacion(alerta);
        return new HistorialForense(alertaGeolocalizacion);
    }

   

}
