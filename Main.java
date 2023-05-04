import java.util.Random;
import java.util.Scanner;

import es.hiperdino.cajero.Cajero;
import es.hiperdino.cliente.Cliente;

public class Main {
    public static void main(String[] args) {
      
        int aparicionMenu = -1;
        int numeroOpcion;
        Random productoRandom = new Random();
        int cantidadProducto;

        Cajero miCajero = new Cajero();


        while (aparicionMenu != 0) {
            System.out.println("Selecciona una de las siguientes opciones");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar caja");

            Scanner teclado = new Scanner(System.in);

            numeroOpcion = teclado.nextInt();

            switch (numeroOpcion) {
                case 1:
                    miCajero.abrirCaja();
                    break;
                case 2:
                    if(miCajero.getCajaAbierta()){
                        Cliente nuevoCliente = new Cliente();
                        cantidadProducto = productoRandom.nextInt(20);
                        for (int i = 0; i < cantidadProducto; i++) {
                            nuevoCliente.meterEnCesta();
                        }
                        miCajero.anadirCliente(nuevoCliente);
                    }else{
                        System.out.println("pides lo imposible adrian");
                    }          
                    break;
                case 3:
                    miCajero.atencionCliente();
                    break;
                case 4:
                    System.out.println(miCajero);
                    break;
                case 5:
                    aparicionMenu = 0;
                    break;
                default:
                    break;
            }

        }
    }
}