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

    // Creando Alumnos Con Constructor
    Alumnos Student   = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student2  = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student3  = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student4  = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student5  = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student6  = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student7  = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student8  = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student9  = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student10 = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());

    ArrayList<Alumnos> estudiante = new ArrayList<Alumnos>();

    public String listaGeneral()
    {
        ArrayList mostrar = estudiante;

        estudiante.add(0,Student);
        estudiante.add(1,Student2);
        estudiante.add(2,Student3);
        estudiante.add(3,Student4);
        estudiante.add(4,Student5);
        estudiante.add(5,Student6);
        estudiante.add(6,Student7);
        estudiante.add(7,Student8);
        estudiante.add(8,Student9);
        estudiante.add(9,Student10);

        for  (int x=0; x<estudiante.size(); x++)
        {
            mostrar = estudiante.get(x);
            System.out.println("                       " + mostrar);
        }

        return "";
    }
}
