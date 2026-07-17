package ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad;

public interface Alerta {
    Boolean esCritica();
    String getId();
    String getIpOrigen();
    Integer getSeveridadBase();
    Integer getTiempoDeDeteccion();
}
