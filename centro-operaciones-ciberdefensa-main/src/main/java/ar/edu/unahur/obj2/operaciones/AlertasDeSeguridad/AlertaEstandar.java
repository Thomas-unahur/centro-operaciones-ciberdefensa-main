package ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad;

public class AlertaEstandar implements Alerta{
    private String id;
    private String ipOrigen;
    private Integer severidadBase;
    private Integer tiempoDeDeteccion;
    public AlertaEstandar(String id, String ipOrigen, Integer severidadBase, Integer tiempoDeDeteccion) {
        this.id = id;
        this.ipOrigen = ipOrigen;
        this.severidadBase = severidadBase;
        this.tiempoDeDeteccion = tiempoDeDeteccion;
    }


    @Override
    public Boolean esCritica(){
        return this.severidadBase > 90;
    }

    public String getId() {
        return id;
    }
    public String getIpOrigen() {
        return ipOrigen;
    }
    public Integer getSeveridadBase() {
        return severidadBase;
    }
    public Integer getTiempoDeDeteccion() {
        return tiempoDeDeteccion;
    }

    
}
