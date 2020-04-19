package edu.ujcv.progra1;

public class Main
{
    public static void main(String[] args)
    {
        // Creando Objeto Lector Teclado
        LectorTeclado lt = LectorTeclado.getInstance();

        // Creando Objeto MenuPrincipal
        Menus MP = new Menus();

        System.out.print(MP.MenuPrincipal());
        int Opc = lt.obtenerEnteroValidado("Ingrese una Opcion Valida");

    }
}
