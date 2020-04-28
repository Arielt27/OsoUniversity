package edu.ujcv.progra1;
import java.util.ArrayList;

public class Asignaturas
{
    // Creando Objeto necesario para Crear 1 Alumno
    CrearAlumnos crear = new CrearAlumnos();

    // Creando Alumno Con Constructor
    Alumnos Student = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student2 = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student3 = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student4 = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student5 = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student6 = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student7 = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());
    Alumnos Student8 = new Alumnos(crear.crearAlumno(), crear.numeroCuenta(), crear.evaluacion());

    // Creando Array Principal
    ArrayList general = new ArrayList();

    // Creando Array de Alumnos
    ArrayList<Alumnos> arregloAlumnos = new ArrayList();

    // Creando Arrays de Clases o Asignaturas
    ArrayList<Alumnos> A = new ArrayList();
    ArrayList<ArrayList<Alumnos>> B = new ArrayList();
    ArrayList<Alumnos> C = new ArrayList();

    ArrayList General()
    {
        general.add(Student);
        general.add(Student2);
        general.add(Student3);
        general.add(Student4);
        general.add(Student5);
        general.add(Student6);
        general.add(Student7);
        general.add(Student8);

        return general;
    }

    ArrayList<Alumnos> ClaseA()
    {
        A.add(Student);
        A.add(Student2);
        A.add(Student3);
        A.add(Student4);

        return A;
    }

    /*ArrayList<ArrayList<Alumnos>> ClaseB()
    {
        int i = 0;

        for(i = 0; i < A.size(); i++)
        {
            if(A.iterator() == true)
            {
                B.add(ClaseA());
            }
        }
        return B;
    }*/

    ArrayList<Alumnos> ClaseC()
    {
        C.add(Student5);
        C.add(Student6);
        C.add(Student7);
        C.add(Student8);

        return C;
    }

    /*ArrayList ClaseD()
    {





        return D;
    }

    ArrayList ClaseE()
    {

        ArrayList E = new ArrayList();



        return E;
    }

    ArrayList ClaseF()
    {

        ArrayList F = new ArrayList();



        return F;
    }

    ArrayList ClaseG()
    {

        ArrayList G = new ArrayList();



        return G;
    }*/
}