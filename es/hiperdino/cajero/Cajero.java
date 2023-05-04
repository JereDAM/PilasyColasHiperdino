package es.hiperdino.cajero;

import java.util.LinkedList;
import java.util.Queue;

import es.hiperdino.cliente.Cliente;


public class Cajero {

    Queue<Cliente> colaClientes = new LinkedList<>();

    Cliente nuevoCliente = new Cliente();

    public void anadirCliente(){
        colaClientes.add(nuevoCliente);
    }

    public void siguienteCliente(){
        colaClientes.poll();
    }
}
