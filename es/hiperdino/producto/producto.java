package es.hiperdino.producto;

import java.util.Random;

public class producto {
    
    private static String []arrayProductos = {"Jamon", "Queso", "Fanta", "Helado", "Fresas", "Arandanos", "Frambuesas", "Plátanos", "Sardinas", "Pan", "Col", "Croissant"};


    public static String productoAleatorio() {
        
        Random productoRandom = new Random();

        int productoAleatorio = productoRandom.nextInt(arrayProductos.length);
        return arrayProductos[productoAleatorio];
    }
}
