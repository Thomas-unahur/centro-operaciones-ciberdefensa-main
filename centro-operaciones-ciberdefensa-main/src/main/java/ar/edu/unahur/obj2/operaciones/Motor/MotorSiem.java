package ar.edu.unahur.obj2.operaciones.Motor;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.Alerta;
import ar.edu.unahur.obj2.operaciones.Analistas.Analista;
import ar.edu.unahur.obj2.operaciones.Analistas.AnalistaSinCriterioException;
import ar.edu.unahur.obj2.operaciones.Motor.EstDeEnriquecimiento.EstrategiaEnriquecimiento;

public class MotorSiem {
    private List<Alerta> alertasPendientes;
    private EstrategiaEnriquecimiento estrategiaEnriquecimiento;
    
    public MotorSiem(EstrategiaEnriquecimiento estrategiaEnriquecimiento) {
        this.alertasPendientes = new ArrayList<>();
        this.estrategiaEnriquecimiento = estrategiaEnriquecimiento;
    }

    public void cambiarEstrategia(EstrategiaEnriquecimiento estrategiaEnriquecimiento){
        this.estrategiaEnriquecimiento = estrategiaEnriquecimiento;
    }
    
    public void asignarAlerta(Analista analista){
        
        if (analista.getCriterioAlerta() == null) {
            throw new AnalistaSinCriterioException("no se puede asignar trabajo a un analista sin criterio configurado");
        }

        Alerta alertaAsignada = alertasPendientes.stream().filter(alerta -> analista.getCriterioAlerta().esAsignable(alerta))
            .findFirst()
            .orElseThrow(() -> new NoSuchElementException("no se encontro una alerta asignable"));
        
        alertasPendientes.remove(alertaAsignada);
       
        Alerta alertaEnriquecida  = estrategiaEnriquecimiento.enriquecer(alertaAsignada);

        analista.agregarAlerta(alertaEnriquecida);
    }






    public void setEstrategiaEnriquecimiento(EstrategiaEnriquecimiento estrategiaEnriquecimiento) {
        this.estrategiaEnriquecimiento = estrategiaEnriquecimiento;
    }



    public List<Alerta> getAlertasPendientes() {
        return alertasPendientes;
    }

    public EstrategiaEnriquecimiento getEstrategiaEnriquecimiento() {
        return estrategiaEnriquecimiento;
    }

    
    
}
