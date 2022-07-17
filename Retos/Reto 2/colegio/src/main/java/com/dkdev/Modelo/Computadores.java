package com.dkdev.Modelo;

import org.w3c.dom.traversal.DocumentTraversal;

public class Computadores {
  //ATRIBUTOS

  protected final static  Integer PESO_BASE = 5;
  protected final static  char CONSUMO_W ='F';
  protected final static  Double PRECIO_BASE = 100.0;
  protected double precioBase;
  protected char consumoW;
  protected Integer peso;


  //CONSTRUCTORES:
  public Computadores() {
    //Si no existe ningun dato de entrada dejar por defencto los valores establecidos en la definicion de variables por default
    this(PRECIO_BASE, PESO_BASE, CONSUMO_W);


  }
   public Computadores(Double precioBase, Integer peso) {
    //Devuelva los valores de las variables establecidas anteriormente
    this(precioBase, peso, CONSUMO_W);

  } 
    
    
    public Computadores(Double precioBase, Integer peso, char consumoW) {
      //Constructor predefinico: Trae los datos establecidos en las variables
    this.precioBase = precioBase; 
    this.peso = peso; 
    this.consumoW = consumoW; 
  }



//METODOS:
public Double calcularPrecio() { 
  Double adicion = 0.0;
switch (consumoW) {
  case 'A':
    adicion += 100.0;
  break;
  case 'B':
    adicion += 80.0;
  break;
  case 'C':
  adicion += 60.0;
  break;
  case 'D':
  adicion += 50.0;
  break;
  case 'E':
  adicion += 30.0;
  break;
  case 'F':
  adicion += 10.0;
  break;

  default:
    break;
}


if (peso>= 0 && peso <19){
  adicion +=10.0;
} else if (peso >=20 && peso<49){
  adicion += 50.0;
}else if(peso >= 50 && peso <=79){
  adicion += 80;
}else if(peso >=80){
  adicion += 100;
}

return precioBase + adicion;
  }


  //GETTERS:
public double getPrecioBase() {
  return precioBase;
}
public char getConsumoW() {
  return consumoW;
}
public Integer getPeso() {
  return peso;
}


  
}
