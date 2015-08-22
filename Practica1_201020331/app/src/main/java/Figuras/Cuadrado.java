package Figuras;

import android.graphics.Paint;

/**
 * Created by Cristian on 14/08/2015.
 */
public class Cuadrado {
    //PROPIEDADES DE LA CLASE CUADRADO
    private float pos_x;
    private float pos_y;
    private float tamaño;
    private Paint color;

    //CONSTRUCTOR DE LA CLASE CUADRADO
    public Cuadrado(){
        pos_x = 0;
        pos_y = 0;
        tamaño = 0;
        color = null;
    }

    public Cuadrado(float x, float y, float t, Paint c){
        pos_x = x;
        pos_y = y;
        tamaño = t;
        color = c;
    }

    public float getPos_x() {
        return pos_x;
    }

    public void setPos_x(float pos_x) {
        this.pos_x = pos_x;
    }

    public float getPos_y() {
        return pos_y;
    }

    public void setPos_y(float pos_y) {
        this.pos_y = pos_y;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public Paint getColor() {
        return color;
    }

    public void setColor(Paint color) {
        this.color = color;
    }
}//FIN DE LA CLASE CUADRADO
