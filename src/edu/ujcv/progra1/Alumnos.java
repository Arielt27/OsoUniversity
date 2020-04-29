package edu.ujcv.progra1;
import java.util.ArrayList;

public class Alumnos extends ArrayList<Alumnos> {
    // Atributos
    private String nombre;
    private String cuenta;
    private Boolean status;


    // Constructor
    public Alumnos(String name, String cta, Boolean status)
    {
        this.nombre = name;
        this.cuenta = cta;
        this.status = status;
    }


    // Metodos Get y Set
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getCuenta()
    {
        return cuenta;
    }

    public void setCuenta(String cuenta)
    {
        this.cuenta = cuenta;
    }

    public Boolean getStatus()
    {
        return status;
    }

    public void setStatus(Boolean status)
    {
        this.status = status;
    }


    // Metodo ToString
    @Override
    public String toString()
    {
        return "    " + getNombre() + "       " + getCuenta() + "                 " + getStatus();
    }
}
