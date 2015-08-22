package Figuras;

import android.graphics.Paint;

/**
 * Created by Cristian on 14/08/2015.
 */
public class Rectangulo {
    //PROPIEDADES DE LA CLASE RECTANGULO
    private float pos_x;
    private float pos_y;
    private float alto;
    private float ancho;
    private Paint color;
    //CONSTRUCTOR DE LA CLASE RECTANGULO
    public Rectangulo(){
        this.pos_x = 0;
        this.pos_y = 0;
        this.alto  = 0;
        this.ancho = 0;
        this.color = null;
    }

    public Rectangulo(float x, float y, float a, float an, Paint c){
        this.pos_x = x;
        this.pos_y = y;
        this.alto  = a;
        this.ancho = an;
        this.color = c;
    }

    //GETTER AND SETTER DE LA CLASE RECTANGULO
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

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public Paint getColor() {
        return color;
    }

    public void setColor(Paint color) {
        this.color = color;
    }

}//FIN DE LA CLASE RECTANGULO
