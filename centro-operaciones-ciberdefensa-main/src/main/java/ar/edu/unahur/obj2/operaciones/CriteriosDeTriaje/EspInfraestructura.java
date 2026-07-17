package ar.edu.unahur.obj2.operaciones.CriteriosDeTriaje;

import java.util.List;

import ar.edu.unahur.obj2.operaciones.AlertasDeSeguridad.AlertaEstandar;

public class EspInfraestructura implements CriterioAlerta{

    private List<String> listaIpsCriticas;


    public void AgregarIpCritica(String ipCritica){
        listaIpsCriticas.add(ipCritica);
    }

    @Override
    public Boolean esAsignable(AlertaEstandar alerta){
        return  listaIpsCriticas.contains(alerta.getIpOrigen());
    }
}
