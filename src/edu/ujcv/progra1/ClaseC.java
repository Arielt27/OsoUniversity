package edu.ujcv.progra1;
import java.util.ArrayList;

public class ClaseC
{
    // Atributos
    private String nombre;
    private String apellido;


    // Constructor
    public ClaseC(){}


    // Get y Set
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }


    // METODOS

    // Creando Objeto necesario para Crear 1 Alumno
    CrearAlumnos crear = new CrearAlumnos();

    ClaseA A = new ClaseA();

    public String listaGeneral()
    {
        ClaseA A = new ClaseA();

        return " " + A.copiarArray();
    }

}
