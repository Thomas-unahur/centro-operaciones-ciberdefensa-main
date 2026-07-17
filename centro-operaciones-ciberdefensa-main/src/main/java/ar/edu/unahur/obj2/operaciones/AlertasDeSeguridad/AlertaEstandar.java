package ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad;

public class AlertaEstandar implements Alerta{
    private String id;
    private String ipOrigen;
    private Integer severidadBase;
    private Integer tiempoDeDeteccion;
    
    public AlertaEstandar(String id, String ipOrigen, Integer severidadBase, Integer tiempoDeDeteccion) {
        
        if(severidadBase < 0){
            throw new AlertaInvalidaException("no se puede tener severidad negativa");
        }

        if(ipOrigen.isEmpty() || ipOrigen == null){
            throw new AlertaInvalidaException("no se puede tener una ip vacia");
        }

        if(ipOrigen.isEmpty() || ipOrigen == null){
            throw new AlertaInvalidaException("el codigo no puede estar vacio");
        }
        
        
        this.id = id;
        this.ipOrigen = ipOrigen;
        this.severidadBase = severidadBase;
        this.tiempoDeDeteccion = tiempoDeDeteccion;


    }


    @Override
    public Boolean esCritica(){
        return this.severidadBase > 90;
    }
    @Override
    public String getId() {
        return id;
    }
    @Override
    public String getIpOrigen() {
        return ipOrigen;
    }
    @Override
    public Integer getSeveridadBase() {
        return severidadBase;
    }
    @Override
    public Integer getTiempoDeDeteccion() {
        return tiempoDeDeteccion;
    }

    
}
