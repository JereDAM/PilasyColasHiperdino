package es.hiperdino.cajero;

import java.util.LinkedList;
import java.util.Queue;

import es.hiperdino.cliente.Cliente;


public class Cajero {

    private final int NUMERO_CAJA = 18;
    private boolean cajaabierta = false;
    static Queue<Cliente> colaClientes = new LinkedList<>();

    static Cliente nuevoCliente = new Cliente();



    public static void anadirCliente(){
        colaClientes.add(nuevoCliente);
    }

    public static void siguienteCliente(){
        colaClientes.poll();
    }

    public boolean isCajaAbierta(){
        if(!cajaabierta){
            return true;
        }
        return false;
    }

    public int cerrarCaja(){
        if(!cajaabierta){
            return 0;
        }
        return 1;
    }

    public void atencionCliente(){
        if(colaClientes.isEmpty()){
            System.out.println("No hay nadie");
        }else{
            System.out.println(colaClientes.poll()); 
        }
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
