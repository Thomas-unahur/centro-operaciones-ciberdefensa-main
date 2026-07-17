package ar.edu.unahur.obj2.operaciones.Motor.EstDeEnriquecimiento;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.Alerta;

public interface EstrategiaEnriquecimiento {
    Alerta enriquecer(Alerta alerta);
}
