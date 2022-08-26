package com.google.qa.screenplaydatatable.models;

import java.util.List;
import java.util.Map;

public class DatosModel {
    private String nombre = null;
    private String apellido = null;
    private String resultado_esperado = null;


    public DatosModel(Map<String, String> map) {
        this.apellido = map.get("apellido");
        this.nombre = map.get("nombre");
        this.resultado_esperado = map.get("resultado_esperado");
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public String getResultado_esperado() {
        return resultado_esperado;
    }



}
