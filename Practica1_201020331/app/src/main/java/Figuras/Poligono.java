package Figuras;

import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Cristian on 14/08/2015.
 */
public class Poligono {
    //PROPIEDADES DE LA CLASE POLIGONO
    private float pos_x;
    private float pos_y;
    private float radio;
    private float largo;
    private float alto;
    private int lados;
    private Path path;
    private Paint color;

    //METODO CONSTRUCTOR DE LA CLASE POLIGONO
    public Poligono(){
        this. pos_x = 0;
        this.pos_y = 0;
        this.largo = 0;
        this.alto = 0;
        this.lados = 0;
        this.color = null;
    }

    //METODO CONSTRUCTOR DE LA CLASE
    public Poligono(float x, float y, float l, float a, int ld, Paint c){
        this. pos_x = x;
        this.pos_y = y;
        this.largo = l;
        this.alto = a;
        this.lados = ld;
        this.color = c;
        path = new Path();
        //Se generara el radio en base al alto o el ancho
        if(this.alto > 0 && this.largo > 0){
            if(this.largo >  this.alto){
                this.radio =  this.largo/2.0f;
            }else{
                this.radio = this.alto/2.0f;
            }
        }else{//si alguno de estos valores dan cero
            this.radio = 1.0f; //se crea default un radio 1
        }//fin del verificado del radio

        //Si por algun motivo los lados son menores a 3
        if(this.lados < 3){
            this.lados = 3;
        }
        //se genera el poligono en base a los datos obtenidos
        generar_poligono(this.pos_x,this.pos_y,this.radio,this.lados);
    }//fin del metodo contructor de la clase

    public void generar_base(float x, float y, float r, Path.Direction d){
        path.reset();
        path.addCircle(x, y, r, d);
    }

    //CLASE QUE GENERA EL POLIGONO
    public void generar_poligono(float x, float y, float r, int lados ){
        //VARIABLE QUE NOS PERMITE CALCULAR EL TAMAÑO DE LAS SECCCIONES
        double seccion = 2.0 * Math.PI/lados;
        int cont = 0 ;
        //VACIAMOS EL OBJETO POR SI TUVIERA INFORMACION
        path.reset();
        //ESTABLECEMOS EL CENTRO DE LA FIGURA
        path.moveTo((float)(x + r*Math.cos(0)),(float)(y + r*Math.sin(0)));
        //GENERAMOS LAS LINEAS DEL POLIGONO
        for(cont = 0; cont < lados; cont++){
            path.lineTo((float)(x + r*Math.cos(seccion * cont)), (float)(y + r * Math.sin(seccion *cont)));
        }
        //CERRAMOS EL OBJETO
        path.close();
    }//FIN DE LA CLASE QUE GENERA EL POLIGONO


    public Paint getColor() {
        return color;
    }

    public void setColor(Paint color) {
        this.color = color;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

}//FIN DE LA CLASE POLIGONO
