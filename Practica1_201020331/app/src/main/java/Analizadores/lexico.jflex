package Analizadores;

import	java_cup.runtime.Symbol;  
import com.compi1.azurdia.practica1_201020331.Error_lexico;

import java.util.ArrayList;

%%

%cupsym Tabla_simbolos  
%class Lexico           
%cup                    
%public                 
%unicode                
%line                   
%column                 
%char                   
%ignorecase     

numero = [0-9]+
letra = [A-Za-z]
punto = "."
entero = {numero}{punto}{numero}

%{
//codigo que se utilizara en el analizador lexico
private ArrayList<Object> lista_errores_lexicos = new ArrayList<Object>();

public ArrayList<Object> getLista_errores_lexicos(){
	return lista_errores_lexicos;
}

//metodo que recopila los errores lexico y los guarda
public void listar_error(String l, int x, int y){
	Error_lexico error = new Error_lexico(l,x,y);
	lista_errores_lexicos.add(error);
}	

%}

%%


/* PALABRAS RESERVADAS */ 

"graficar"      {return new Symbol(Tabla_simbolos.r_graficar, yycolumn,yyline,new String(yytext()));}
"circulo"       {return new Symbol(Tabla_simbolos.r_circulo, yycolumn,yyline,new String(yytext()));}
"cuadrado"      {return new Symbol(Tabla_simbolos.r_cuadrado, yycolumn,yyline,new String(yytext()));}
"rectangulo"    {return new Symbol(Tabla_simbolos.r_rectangulo, yycolumn,yyline,new String(yytext()));}
"linea"    		{return new Symbol(Tabla_simbolos.r_linea, yycolumn,yyline,new String(yytext()));}
"poligono"      {return new Symbol(Tabla_simbolos.r_poligono, yycolumn,yyline,new String(yytext()));}
"("             {return new Symbol(Tabla_simbolos.s_parentesisa, yycolumn,yyline,new String(yytext()));}
{numero}		{return new Symbol(Tabla_simbolos.numero, yycolumn,yyline,new String(yytext()));}
{entero}		{return new Symbol(Tabla_simbolos.numero_entero, yycolumn,yyline,new String(yytext()));}
"+"				{return new Symbol(Tabla_simbolos.s_suma, yycolumn,yyline,new String(yytext()));}
"-"				{return new Symbol(Tabla_simbolos.s_resta, yycolumn,yyline,new String(yytext()));}
"*"				{return new Symbol(Tabla_simbolos.s_multiplicacion, yycolumn,yyline,new String(yytext()));}
"/"				{return new Symbol(Tabla_simbolos.s_division, yycolumn,yyline,new String(yytext()));}
","				{return new Symbol(Tabla_simbolos.s_coma, yycolumn,yyline,new String(yytext()));}
"azul"          {return new Symbol(Tabla_simbolos.r_azul, yycolumn,yyline,new String(yytext()));}
"rojo"          {return new Symbol(Tabla_simbolos.r_rojo, yycolumn,yyline,new String(yytext()));}
"verde"         {return new Symbol(Tabla_simbolos.r_verde, yycolumn,yyline,new String(yytext()));}
"amarillo"      {return new Symbol(Tabla_simbolos.r_amarillo, yycolumn,yyline,new String(yytext()));}
"naranja"       {return new Symbol(Tabla_simbolos.r_naranja, yycolumn,yyline,new String(yytext()));}
"morado"        {return new Symbol(Tabla_simbolos.r_morado, yycolumn,yyline,new String(yytext()));}
"cafe"          {return new Symbol(Tabla_simbolos.r_cafe, yycolumn,yyline,new String(yytext()));}
"negro"         {return new Symbol(Tabla_simbolos.r_negro, yycolumn,yyline,new String(yytext()));}
")"             {return new Symbol(Tabla_simbolos.s_parentesisc, yycolumn,yyline,new String(yytext()));}

[ \t\r\f\n]+ 	{ /* Se ignoran */}  

/* CUAQUIER OTRO */ 
.         		{listar_error(new String(yytext()),yyline,yycolumn);
				return new Symbol(Tabla_simbolos.error, yycolumn,yyline,new String(yytext()));} 	