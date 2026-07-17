package ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaDecorator;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.Alerta;

public class HistorialForense extends AlertaDecorator{

    public HistorialForense(Alerta alertaDecorada) {
        super(alertaDecorada);
    }
    
    @Override
    public Integer getSeveridadBase(){
        return alertaDecorada.getSeveridadBase() + 15;
    }
}
