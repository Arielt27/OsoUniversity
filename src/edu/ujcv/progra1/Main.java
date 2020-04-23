package edu.ujcv.progra1;

public class Main
{
    public static void main(String[] args)
    {
        // Creando Objeto LectorTeclado
        LectorTeclado lt = LectorTeclado.getInstance();

        // Creando Objeto Menus
        Menus MP = new Menus();

        // Creando Objeto Alumnos

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

                    System.out.println("Ya estamos en el siguiente Parcial");

                    System.out.println(" ");
                    System.out.print(MP.MenuPrincipal());
                    Opc = lt.obtenerEnteroValidado("Ingrese una Opcion Valida");
                    break;

                case 2: // CONSULTAR ALUMNOS
                    System.out.println(" ");
                    System.out.println("******Consultar Alumnos******");

                    for (int i = 1; i <= 21; i++)
                    {
                        System.out.println(i + " " + CrearAlumnos.crearAlumno() + CrearAlumnos.numeroCuenta());
                    }

                    System.out.println(" ");
                    System.out.print(MP.MenuPrincipal());
                    Opc = lt.obtenerEnteroValidado("Ingrese una Opcion Valida");
                    break;

                case 3: // CONSULTAR CLASES
                    System.out.println(" ");
                    System.out.println("******Consultar Clases******");

                    System.out.println(" ");
                    System.out.println("*     Clases        |        Alumnos     *");

                    //Asignaturas clase1 = new Asignaturas();
                    Alumnos clase1 = new Alumnos();

                    for(int i = 0; i<3; i++)
                        System.out.println("      Clase A       " + clase1.alumnosGeneral());

                    System.out.println(" ");
                    //for(int i = 0; i<3; i++)
                        System.out.println("      Clase B       ");

                    System.out.println(" ");
                    //for(int i = 0; i<3; i++)
                        System.out.println("      Clase C       ");

                    System.out.println(" ");
                    //for(int i = 0; i<3; i++)
                        System.out.println("      Clase D       ");

                    System.out.println(" ");
                    //for(int i = 0; i<3; i++)
                        System.out.println("      Clase E       ");

                    System.out.println(" ");
                    //for(int i = 0; i<3; i++)
                        System.out.println("      Clase F       ");

                    System.out.println(" ");
                    //for(int i = 0; i<3; i++)
                        System.out.println("      Clase G       ");

                    System.out.println(" ");
                    System.out.print(MP.MenuPrincipal());
                    Opc = lt.obtenerEnteroValidado("Ingrese una Opcion Valida");
                    break;

                case 4: // EVALUAR TERNA
                    System.out.println(" ");
                    System.out.println("******Evaluar Ternas******");

                    System.out.println("Se evaluaron las ternas");

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
