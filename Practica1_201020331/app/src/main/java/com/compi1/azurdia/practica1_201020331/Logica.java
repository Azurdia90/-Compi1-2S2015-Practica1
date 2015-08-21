package com.compi1.azurdia.practica1_201020331;

import java.util.ArrayList;

/**
 * Created by Cristian on 20/08/2015.
 */
class Logica {

    private static ArrayList<Object> lista_figuras;

    public static ArrayList<Object> getLista_figuras() {
        return lista_figuras;
    }

    public static void setLista_figuras(ArrayList<Object> lista_figuras) {
        Logica.lista_figuras = lista_figuras;
    }
}
