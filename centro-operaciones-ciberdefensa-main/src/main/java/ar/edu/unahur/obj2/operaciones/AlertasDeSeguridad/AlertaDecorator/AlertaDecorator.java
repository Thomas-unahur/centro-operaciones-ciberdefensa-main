package ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaDecorator;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.Alerta;

public abstract class AlertaDecorator implements Alerta{
    protected Alerta alertaDecorada;

    public AlertaDecorator(Alerta alertaDecorada){
        this.alertaDecorada = alertaDecorada;
    }

    @Override
    public Boolean esCritica(){
        return alertaDecorada.esCritica();
    }

    @Override
    public String getId() {
        return alertaDecorada.getId();
    }
    @Override
    public String getIpOrigen() {
        return alertaDecorada.getIpOrigen();
    }
    @Override
    public Integer getSeveridadBase() {
        return alertaDecorada.getSeveridadBase();
    }
    @Override
    public Integer getTiempoDeDeteccion() {
        return alertaDecorada.getTiempoDeDeteccion();
    }

}
