package Figuras;

/**
 * Created by Cristian on 14/08/2015.
 */
public class Circulo {
    //PROPIEDADES DE LA CLASE CUADRADO
    private int pos_x;
    private int pos_y;
    private int radio;
    private String color;
    //CONSTRUCTOR DE LA CLASE CUADRADO
    public Circulo(){
        pos_x = 0;
        pos_y = 0;
        radio = 0;
        color = null;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getRadio() {
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
