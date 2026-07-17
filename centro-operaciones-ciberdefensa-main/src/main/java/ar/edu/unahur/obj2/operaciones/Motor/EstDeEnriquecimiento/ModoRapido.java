package ar.edu.unahur.obj2.operaciones.Motor.EstDeEnriquecimiento;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.Alerta;

public class ModoRapido implements EstrategiaEnriquecimiento{
    
    @Override
    public Alerta enriquecer(Alerta alerta){
        return alerta;
    }
}
