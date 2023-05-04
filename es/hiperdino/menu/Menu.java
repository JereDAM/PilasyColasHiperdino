package es.hiperdino.menu;

import es.hiperdino.cajero.Cajero;

public class Menu {

    private static int aparicionMenu = -1;
    private static int numeroOpcion;
    
    public static void Menuhiperdino(){

        while (aparicionMenu != 0) {
            System.out.println("Selecciona una de las siguientes opciones");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Cerrar caja");

            switch (numeroOpcion) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }

        }
    }
}
