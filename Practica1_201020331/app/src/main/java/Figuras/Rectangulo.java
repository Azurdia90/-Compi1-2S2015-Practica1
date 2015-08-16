package Figuras;

/**
 * Created by Cristian on 14/08/2015.
 */
public class Rectangulo {
    //PROPIEDADES DE LA CLASE RECTANGULO
    private int pos_x;
    private int pos_y;
    private int alto;
    private int ancho;
    private String color;
    //CONSTRUCTOR DE LA CLASE RECTANGULO
    public Rectangulo(){
        this.pos_x = 0;
        this.pos_y = 0;
        this.alto  = 0;
        this.ancho = 0;
        this.color = null;
    }

    public Rectangulo(int x, int y, int a, int an, String c){
        this.pos_x = x;
        this.pos_y = y;
        this.alto  = a;
        this.ancho = an;
        this.color = c;
    }

    //GETTER AND SETTER DE LA CLASE RECTANGULO
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

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}//FIN DE LA CLASE RECTANGULO
