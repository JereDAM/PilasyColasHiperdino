package es.hiperdino.cliente;
import java.util.Random;

public class cliente {
    private static String []arrayClientes = {"Jeremy", "Cristofer", "Adrian", "Alba", "Alby", "Maria", "Adan", "Alejandro", "Pablo", "Ricardo", "Alexis", "Saul"};


    public static String clienteAleatorio() {
        
        Random clienteRandom = new Random();

        int clienteAleatorio = clienteRandom.nextInt(arrayClientes.length);
        return arrayClientes[clienteAleatorio];
    }
}
