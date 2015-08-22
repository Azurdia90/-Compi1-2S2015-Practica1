package Figuras;

import android.graphics.Paint;

/**
 * Created by Cristian on 14/08/2015.
 */
public class Linea {
    //PROPIEDDES DE LA CLASE LINEA
    private float pos_x;
    private float pos_y;
    private float pos_x2;
    private float pos_y2;
    private Paint color;

    //METODO CONSTRUCTOR DE LA CLASE
    public Linea(){
        this.pos_x = 0;
        this.pos_y = 0;
        this.pos_x2 = 0;
        this.pos_y2 = 0;
        this.color = null;
    }

    public Linea(float x, float y, float x2, float y2, Paint c){
        this.pos_x = x;
        this.pos_y = y;
        this.pos_x2 = x2;
        this.pos_y2 = y2;
        this.color = c;
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

    public float getPos_x2() {
        return pos_x2;
    }

    public void setPos_x2(float pos_x2) {
        this.pos_x2 = pos_x2;
    }

    public float getPos_y2() {
        return pos_y2;
    }

    public void setPos_y2(float pos_y2) {
        this.pos_y2 = pos_y2;
    }

    public Paint getColor() {
        return color;
    }

    public void setColor(Paint color) {
        this.color = color;
    }
}//FIN DE LA CLASE LINEA
