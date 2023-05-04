package es.hiperdino.cliente;

import java.util.Stack;

import es.hiperdino.producto.Producto;

public class Cliente {
    private String nombre;
    Stack<String> cestaCompra = new Stack<String>();

    public String getNombre() {
       return this.nombre = Producto.nombreAleatorio();
    }

    public void meterEnCesta(){
        cestaCompra.push(Producto.productoAleatorio());
    }

    public void mostrarCesta(){ //Resulta que no sirve xd
        System.out.println(cestaCompra);
    }

    @Override

    public String toString(){

        String mensajeCliente = "";

        mensajeCliente += "============================== \n";
        mensajeCliente += "*Nombre:" + this.nombre + "\n";
        mensajeCliente += "*Total de productos" + cestaCompra.size() + "\n";
        mensajeCliente += "*Lista de articulos en la cesta" + "\n";
        mensajeCliente += cestaCompra;
        mensajeCliente += "==============================";

        return mensajeCliente;
    }
}
