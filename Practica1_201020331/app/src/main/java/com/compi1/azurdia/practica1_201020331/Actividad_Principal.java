package com.compi1.azurdia.practica1_201020331;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Analizadores.*;


public class Actividad_Principal extends AppCompatActivity {

    private Button b_compilar;
    private EditText eT_entrada;
    private TextView tV_salida;

    private String salida;

    private Lexico analisis_lexico;
    private Sintactico analisis_sintactico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_principal);
        inicializar_componentntes();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad__principal, menu);
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

    private void inicializar_componentntes(){
        b_compilar = (Button) findViewById(R.id.b_compilar);
        eT_entrada = (EditText) findViewById(R.id.eT_entrada);
        tV_salida = (TextView) findViewById(R.id.tV_resultados);
        salida = null;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public void click_compilar(View v) {
        String entrada = eT_entrada.getText().toString();
        if (analizar(entrada) == true){
            tV_salida.setText(getSalida());
            Intent nuevo_layout = new Intent(Actividad_Principal.this,Actividad_graficas.class);
            startActivity(nuevo_layout);
        }else{
            tV_salida.setText(getSalida());
            Toast toast = Toast.makeText(this, "No funciono", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void imprimir_resultados(){
        if(Logica.getLista_errores_lexicos().isEmpty()==false){
            int cont = 0;
            for(cont = 0; cont < Logica.getLista_errores_lexicos().size(); cont++){
                Error_lexico error = (Error_lexico) Logica.getLista_errores_lexicos().get(cont);
                if(cont == 0){
                    salida = error.getError_l() + " Pos_x: " + error.getPos_x() + " Pos_y: "
                            + error.getPos_y() + "; \n";
                }else {
                    salida = salida + error.getError_l() + " Pos_x: " + error.getPos_x() + " Pos_y: "
                            + error.getPos_y() + "; \n";
                }
            }
        }else{
            salida = "NO SE HAN ENCONTRADO ERRORES LEXICOS";
        }
    }

    /*METODO QUE NOS PERMITE ANALIZAR EL TEXTO QUE INGRESAREMOS*/
    public boolean analizar(String texto_entrada){
        boolean status = false;
        try {
            analisis_lexico = new Lexico(new BufferedReader(new StringReader(texto_entrada)));
            analisis_sintactico = new Sintactico(analisis_lexico);
            analisis_sintactico.parse();
            Logica.setLista_errores_lexicos(analisis_lexico.getLista_errores_lexicos());
            imprimir_resultados();
            status = analisis_sintactico.get_Estado();
            Logica.setLista_figuras(analisis_sintactico.getLista_figuras());
        } catch (Exception ex) {
            analisis_lexico = new Lexico(new BufferedReader(new StringReader(texto_entrada)));
            Logica.setLista_errores_lexicos(analisis_lexico.getLista_errores_lexicos());
            imprimir_resultados();
            Logger.getLogger(Actividad_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }//fin catch
        return status;
    }//fin del metodo analizador del texto
}
