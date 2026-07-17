package ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad;

public class AlertaInvalidaException extends RuntimeException{
    public AlertaInvalidaException(String mensaje){
        super(mensaje);
    }
}
