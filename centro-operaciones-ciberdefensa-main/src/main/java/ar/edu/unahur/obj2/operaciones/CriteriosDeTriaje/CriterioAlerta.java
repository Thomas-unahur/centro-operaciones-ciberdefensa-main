package ar.edu.unahur.obj2.operaciones.CriteriosDeTriaje;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaEstandar;

public interface CriterioAlerta {
    Boolean esAsignable(AlertaEstandar alerta);
}
