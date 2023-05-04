package es.hiperdino.cajero;

import java.util.LinkedList;
import java.util.Queue;

import es.hiperdino.cliente.Cliente;


public class Cajero {

    private final int NUMERO_CAJA = 18;
    private boolean cajaabierta = false;
    Queue<Cliente> colaClientes = new LinkedList<>();

    public void anadirCliente(Cliente nuevoCliente){
        colaClientes.add(nuevoCliente);
    }

    public void siguienteCliente(){
        colaClientes.poll();
    }

    public boolean isCajaAbierta(){
        if(!cajaabierta){
            return true;
        }
        return false;
    }

    public boolean getCajaAbierta(){
        return cajaabierta;
    }

    public void abrirCaja() {
        if(cajaabierta){
            System.out.println("La caja ya está abierta");
        }else{
            System.out.println("La caja se está abriendo");
            cajaabierta = true;
        }
    }

    public void atencionCliente(){
        if(colaClientes.isEmpty()){
            System.out.println("No hay nadie");
        }else{
            System.out.println(colaClientes.poll()); 
        }
    }

@Override
    public String toString(){

        String mensajeCajero = "";

        mensajeCajero += "============================== \n";
        mensajeCajero += "*Número de caja: " + this.NUMERO_CAJA + "\n";
        mensajeCajero += "*Total de clientes: " + colaClientes.size() + "\n";
        mensajeCajero += "*Clientes en la cola" + "\n";
        mensajeCajero += colaClientes;
        mensajeCajero += "==============================" + "\n";

        return mensajeCajero;
    }

}
