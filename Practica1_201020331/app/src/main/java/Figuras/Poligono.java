package Figuras;

/**
 * Created by Cristian on 14/08/2015.
 */
public class Poligono {
    //PROPIEDADES DE LA CLASE POLIGONO
    private int pos_x;
    private int pos_y;
    private int largo;
    private int alto;
    private int lados;
    private String color;
    //METODO CONSTRUCTOR DE LA CLASE POLIGONO
    public Poligono(){
        this. pos_x = 0;
        this.pos_y = 0;
        this.largo = 0;
        this.alto = 0;
        this.lados = 0;
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

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}//FIN DE LA CLASE POLIGONO
