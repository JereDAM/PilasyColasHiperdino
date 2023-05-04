package es.hiperdino.cajero;

import java.util.LinkedList;
import java.util.Queue;

import es.hiperdino.cliente.Cliente;


public class Cajero {

    private final int NUMERO_CAJA = 18;
    static Queue<Cliente> colaClientes = new LinkedList<>();

    static Cliente nuevoCliente = new Cliente();



    public static void anadirCliente(){
        colaClientes.add(nuevoCliente);
    }

    public static void siguienteCliente(){
        colaClientes.poll();
    }

    public String toString(){

        String mensajeCajero = "";

        mensajeCajero += "============================== \n";
        mensajeCajero += "*Número de caja:" + this.NUMERO_CAJA + "\n";
        mensajeCajero += "*Total de clientes" + colaClientes.size() + "\n";
        mensajeCajero += "*Clientes en la cola" + "\n";
        mensajeCajero += colaClientes;
        mensajeCajero += "==============================";

        return mensajeCajero;
    }

}
