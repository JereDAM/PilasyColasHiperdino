package es.hiperdino.producto;

import java.util.Random;

public class Producto {
    
    private static String []arrayProductos = {"Jamon", "Queso", "Fanta", "Helado", "Fresas", "Arandanos", "Frambuesas", "Plátanos", "Sardinas", "Pan", "Col", "Croissant"};
    private static String []arrayNombres = {"Jeremy", "Cristofer", "Adrian", "Alba", "Alby", "Maria", "Adan", "Alejandro", "Pablo", "Ricardo", "Alexis", "Saul"};

    public static String productoAleatorio() {
        
        Random productoRandom = new Random();

        int productoAleatorio = productoRandom.nextInt(arrayProductos.length);
        return arrayProductos[productoAleatorio];
    }

    public static String clienteAleatorio() {
        
        Random nombreRandom = new Random();

        int nombreAleatorio = nombreRandom.nextInt(arrayNombres.length);
        return arrayNombres[nombreAleatorio];
    }
}
