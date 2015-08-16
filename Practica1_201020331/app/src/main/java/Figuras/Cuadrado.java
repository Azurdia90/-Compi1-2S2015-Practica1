package Figuras;

/**
 * Created by Cristian on 14/08/2015.
 */
public class Cuadrado {
    //PROPIEDADES DE LA CLASE CUADRADO
    private int pos_x;
    private int pos_y;
    private int tamaño;
    private String color;
    //CONSTRUCTOR DE LA CLASE CUADRADO
    public Cuadrado(){
        pos_x = 0;
        pos_y = 0;
        tamaño = 0;
        color = null;
    }

    public Cuadrado(int x, int y, int t, String c){
        pos_x = x;
        pos_y = y;
        tamaño = t;
        color = c;
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

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}//FIN DE LA CLASE CUADRADO
