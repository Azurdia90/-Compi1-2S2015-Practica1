package com.compi1.azurdia.practica1_201020331;

/**
 * Created by Cristian on 21/08/2015.
 */
public class Error_lexico {
    //atributos de la clase
    private String error_l;
    private int pos_x;
    private int pos_y;
    //metodo constructor de la clase
    public Error_lexico(String e, int x, int y){
        this.error_l = e;
        this.pos_x = x;
        this.pos_y = y;
    }

    public String getError_l() {
        return error_l;
    }

    public void setError_l(String error_l) {
        this.error_l = error_l;
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

}//fin de la clase de errores lexicos
