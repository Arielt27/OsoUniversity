package edu.ujcv.progra1;
import java.util.Random;

public class CrearAlumnos
{
    public static String[] nombres =
            {
                    "Andrea", "David", "Jose", "Daniel", "Juan", "Erick", "Marcos", "Daniela",
                    "Erika", "Gustavo", "Jonathan", "Maria", "Carlos", "Cristian", "Perla", "Jennifer",
                    "Alejandra", "Cristina", "Allizon", "Melvin", "Mario", "Christopher", "Jafeth", "Jhonny",
                    "Raul", "Pedro", "Karla", "Isaias", "Sindy", "Scarleth", "Johan", "David", "Fernanda", "Marta","Alma"
            };

    public static String[] apellidos =
            {
                    "Gomez", "Torres", "Cardenas", "Mejia", "Cardona", "Menjivar", "Arteaga", "Carrillo",
                    "Mendez", "Castillo", "Lopez", "Almeida", "Cruz", "Caceres", "Martinez", "Duque",
                    "Mendoza", "Funez", "Sauceda", "Bolivar", "Paz", "Alvarez", "Raudales", "Ortez", "Portillo"
            };

    public static String crearAlumno()
    {
        Random A = new Random();

        int index1 = A.nextInt(nombres.length);
        int index2 = A.nextInt(apellidos.length);

        return nombres[index1] + " " + apellidos[index2] + "     ";
    }

    public static int año()
    {
        int a = (int) Math.floor(Math.random()*(2015-2020+1)+2020);  // Valor entre M y N, ambos incluidos.

        return a;
    }

    public static int middle()
    {
        int b = (int) Math.floor(Math.random()*(100-999+1)+999);

        return b;
    }

    public static int fin()
    {
        int c = (int) Math.floor(Math.random()*(100-999+1)+999);

        return c;
    }

    public static String numeroCuenta()
    {
        return " " + año() + middle() + fin();
    }
}