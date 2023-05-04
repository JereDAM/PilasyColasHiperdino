package es.hiperdino.menu;

import java.beans.beancontext.BeanContextSupport;

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
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar caja");

            switch (numeroOpcion) {
                case 1:
                    Cajero.isCajaAbierta();
                    break;
                case 2:
                    Cajero.anadirCliente();
                    break;
                case 3:
                    Cajero.atencionCliente();
                case 4:
                    System.out.println(Cajero.toString());
                case 5:
                    
                default:
                    break;
            }

        }
    }
}
