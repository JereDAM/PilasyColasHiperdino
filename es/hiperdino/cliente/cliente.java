package es.hiperdino.cliente;

import java.util.Stack;

import es.hiperdino.producto.Producto;

public class Cliente {
    private String nombre;
    Stack<String> cestaCompra = new Stack<String>();

    public String getNombre() {
       return this.nombre = Producto.clienteAleatorio();
    }

    public void meterEnCesta(){
        cestaCompra.push(Producto.productoAleatorio());
    }

    public void mostrarCesta(){
        System.out.println(cestaCompra);
    }

}
