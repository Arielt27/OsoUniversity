package edu.ujcv.progra1;

public class Main
{
    public static void main(String[] args)
    {
        // Creando Objeto LectorTeclado
        LectorTeclado lt = LectorTeclado.getInstance();

        // Creando Objeto Menus
        Menus MP = new Menus();

        // Creando Objeto Universidad
        Universidad Avance = new Universidad();

        // Imprimiendo Menu Principal y leyendo opcion
        System.out.print(MP.MenuPrincipal());
        int Opc = lt.obtenerEnteroValidado("Ingrese una Opcion Valida");

        // Inicio Ciclo While
        while (Opc != 5)
        {
            // Inicio Switch
            switch (Opc)
            {
                case 1: // PROXIMO PARCIAL
                    System.out.println(" ");
                    System.out.println("******Proximo Parcial******");

                    System.out.println("Avanzando al Proximo Parcial");

                    System.out.println(" ");
                    System.out.print(MP.MenuPrincipal());
                    Opc = lt.obtenerEnteroValidado("Ingrese una Opcion Valida");
                    break;

                case 2: // CONSULTAR ALUMNOS
                    System.out.println(" ");
                    System.out.println("                        ******Consultar Alumnos******");

                    System.out.println("*        Alumno        |       Numero de Cuenta       |         Estado        *");
                    System.out.println();

                    System.out.println(" ");
                    System.out.print(MP.MenuPrincipal());
                    Opc = lt.obtenerEnteroValidado("Ingrese una Opcion Valida");
                    break;

                case 3: // CONSULTAR CLASES
                    System.out.println(" ");
                    System.out.println("                      ******Consultar Clases******");

                    System.out.println(" ");
                    System.out.println("*        Clase         |            Alumno           |         Estatus      ");

                    System.out.println("         Clase A       ");
                    System.out.println(" ");

                    System.out.println("         Clase B       ");
                    System.out.println(" ");

                    System.out.println("         Clase C       ");
                    System.out.println(" ");

                    System.out.println("         Clase D       ");
                    System.out.println(" ");

                    System.out.println("         Clase E       ");
                    System.out.println(" ");

                    System.out.println("         Clase F       ");
                    System.out.println(" ");

                    System.out.println("         Clase G       ");

                    System.out.println("True = Aprobado  |   False = Reprobado");

                    System.out.println(" ");
                    System.out.print(MP.MenuPrincipal());
                    Opc = lt.obtenerEnteroValidado("Ingrese una Opcion Valida");
                    break;

                case 4: // EVALUAR TERNA
                    System.out.println(" ");
                    System.out.println("******Evaluar Ternas******");

                    System.out.println("Evaluacion de ternas");

                    System.out.println(" ");
                    System.out.print(MP.MenuPrincipal());
                    Opc = lt.obtenerEnteroValidado("Ingrese una Opcion Valida");
                    break;

                default: // CASO POR DEFECTO MUESTRA MENU PRINCIPAL
                    System.out.println(" ");
                    System.out.println("Ingrese Una Opción Válida");
                    System.out.print(MP.MenuPrincipal());
                    Opc = lt.obtenerEnteroValidado("Ingrese una Opción Correcta");
                    break;
            }
        }
    }
}
