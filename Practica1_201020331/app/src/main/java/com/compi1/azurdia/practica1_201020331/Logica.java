package com.compi1.azurdia.practica1_201020331;

import java.util.ArrayList;

/**
 * Created by Cristian on 20/08/2015.
 */
public class Logica {

    private static ArrayList<Object> lista_figuras;
    private static ArrayList<Error_lexico> lista_errores_lexicos;

    public static ArrayList<Object> getLista_figuras() {
        return lista_figuras;
    }

    public static void setLista_figuras(ArrayList<Object> lista_figuras) {
        Logica.lista_figuras = lista_figuras;
    }

    public static ArrayList<Error_lexico> getLista_errores_lexicos() {
        return lista_errores_lexicos;
    }

    public static void setLista_errores_lexicos(ArrayList<Error_lexico> lista_errores_lexicos) {
        Logica.lista_errores_lexicos = lista_errores_lexicos;
    }

}//FIN DE LA CLASE DE LA LOGICA DE LA APLICACION
