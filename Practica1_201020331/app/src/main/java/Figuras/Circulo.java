package Figuras;

import android.graphics.Paint;


/**
 * Created by Cristian on 14/08/2015.
 */
public class Circulo{
    //PROPIEDADES DE LA CLASE CUADRADO
    private float pos_x;
    private float pos_y;
    private float radio;
    private Paint color;
    //CONSTRUCTOR DE LA CLASE CUADRADO
    public Circulo(){
        pos_x = 0;
        pos_y = 0;
        radio = 0;
        color = null;
    }

    public Circulo(float x, float y, float r, Paint c){
        pos_x = x;
        pos_y = y;
        radio = r;
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

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Paint getColor() {
        return color;
    }

    public void setColor(Paint color) {
        this.color = color;
    }
}//FIN DE LA CLASE CIRCULO
