package com.compi1.azurdia.practica1_201020331;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import org.apache.http.impl.conn.LoggingSessionInputBuffer;

import Figuras.*;
import java.util.ArrayList;

public class Actividad_graficas extends AppCompatActivity {

    private ArrayList<Object> lista_figuras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Graficadora graficadora = new Graficadora(this);
        setContentView(graficadora);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad_graficas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public class Graficadora extends View{
        public Graficadora(Context context){
            super(context);
        }
        Circulo circulo;
        Cuadrado cuadrado;
        Rectangulo rectangulo;
        Linea linea;
        Poligono poligono;

        @Override
        protected void onDraw(Canvas canvas){
            Paint paint_rojo = new Paint();
            paint_rojo.setAntiAlias(true);
            paint_rojo.setColor(Color.RED);

            for (int cont =0; cont<Logica.getLista_figuras().size(); cont++  ){
                if(Logica.getLista_figuras().get(cont) instanceof  Circulo){
                    circulo = (Circulo) Logica.getLista_figuras().get(cont);
                    canvas.drawCircle(circulo.getPos_x(), circulo.getPos_y(), circulo.getRadio(), paint_rojo);
                }else if(Logica.getLista_figuras().get(cont) instanceof Cuadrado){


                }else if(Logica.getLista_figuras().get(cont) instanceof Rectangulo){
                    rectangulo = (Rectangulo)Logica.getLista_figuras().get(cont);
                    canvas.drawRect(rectangulo.getPos_x(),rectangulo.getAlto(),rectangulo.getPos_y(),rectangulo.getAncho(),paint_rojo);
                }else if(Logica.getLista_figuras().get(cont) instanceof  Linea){
                    linea = (Linea)Logica.getLista_figuras().get(cont);
                    canvas.drawLine(linea.getPos_x(),linea.getPos_y(),linea.getPos_x2(),linea.getPos_y2(),paint_rojo);
                }else if(Logica.getLista_figuras().get(cont) instanceof  Poligono){
                    poligono = (Poligono)Logica.getLista_figuras().get(cont);
                    
                }

            }//fin del recorrido de la lista de figuras
        }//FIN DEL METODO SOBREESCRITO ONDRAW
    }//FIN DE LA CLASE PARA GRAFICAR EN EL NUEVO VIEW
}//FIN DE LA CLASE DEL ACTIVITY
