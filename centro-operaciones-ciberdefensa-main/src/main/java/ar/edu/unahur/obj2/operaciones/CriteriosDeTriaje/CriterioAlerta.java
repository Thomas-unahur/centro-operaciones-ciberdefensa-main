package ar.edu.unahur.obj2.operaciones.CriteriosDeTriaje;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.Alerta;

public interface CriterioAlerta {
    Boolean esAsignable(Alerta alerta);
}
