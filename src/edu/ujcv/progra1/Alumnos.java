package edu.ujcv.progra1;
import java.util.ArrayList;

// Esta clase sirve para guardar los alumnos en un arraylist y luego pasarlos a la class asignatura
public class Alumnos
{
    ArrayList alumnosGeneral()
    {
        // CREACION DE OBJETOS NECESARIOS PARA ALUMNO Y EVALUACION

        CrearAlumnos Estudiante = new CrearAlumnos(); // Objeto CrearAlumnos

        ArrayList alumnos = new ArrayList();          // Creando Objeto ArrayList

        // Añadiendo Estudiantes y Evaluacion al ArrayList alumnos

        alumnos.add(Estudiante.crearAlumno() + "    " + Estudiante.evaluacion());

        return alumnos;
    }
}
