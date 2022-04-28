package com.digitalCastaway.utils;

public class SupermarketUtils {
    private static final String []NOMBRES_PERSONA = {
            "Goyo",
            "Luecrecia",
            "Montese",
            "Francisco",
            "Nicolás",
            "Yolanda",
            "Matias",
            "Lionel",
            "Igor",
    };
    public static final String []NOMBRES_PRODUCTOS = {
            "Pistacho",
            "Millo",
            "Pasas",
            "Leche",
            "Tortilla",
            "Pasticho",
            "Gofio",
            "Plátano",
            "Pan de pipas",
            "Merengue",
            "Tacos salmón",
            "Takis",
            "Chetos Pelotazo",
    };

    /* generar método para hacer estas cosas numero aleatorio de personas entre cero y el tamaño del array length*/

    public static String generarNombreAleatorio() {
        return NOMBRES_PERSONA[(int) (Math.random () * NOMBRES_PERSONA.length)];
    }

    public static String generarNombreProductoAleatorio() {
        return NOMBRES_PRODUCTOS[(int) (Math.random () * NOMBRES_PRODUCTOS.length)];
    }
}
