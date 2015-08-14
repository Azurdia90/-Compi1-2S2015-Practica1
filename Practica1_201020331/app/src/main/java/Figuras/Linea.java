package Figuras;

/**
 * Created by Cristian on 14/08/2015.
 */
public class Linea {
    //PROPIEDDES DE LA CLASE LINEA
    private int pos_x;
    private int pos_y;
    private int pos_x2;
    private int pos_y2;
    private String color;
    //METODO CONSTRUCTOR DE LA CLASE
    public Linea(){
        this.pos_x = 0;
        this.pos_y = 0;
        this.pos_x2 = 0;
        this.pos_y2 = 0;
        this.color = null;
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

    public int getPos_x2() {
        return pos_x2;
    }

    public void setPos_x2(int pos_x2) {
        this.pos_x2 = pos_x2;
    }

    public int getPos_y2() {
        return pos_y2;
    }

    public void setPos_y2(int pos_y2) {
        this.pos_y2 = pos_y2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}//FIN DE LA CLASE LINEA
