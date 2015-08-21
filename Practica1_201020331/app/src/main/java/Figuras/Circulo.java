package Figuras;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Cristian on 14/08/2015.
 */
public class Circulo{
    //PROPIEDADES DE LA CLASE CUADRADO
    private Integer pos_x;
    private Integer pos_y;
    private Integer radio;
    private String color;
    //CONSTRUCTOR DE LA CLASE CUADRADO
    public Circulo(){
        pos_x = 0;
        pos_y = 0;
        radio = 0;
        color = null;
    }

    public Circulo(Integer x, Integer y, Integer r, String c){
        pos_x = x;
        pos_y = y;
        radio = r;
        color = c;
    }

    public Integer getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public Integer getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}//FIN DE LA CLASE CIRCULO
