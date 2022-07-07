package com.dannidev.Modelo;

public abstract class ficha {
  
  public casilla encuentraen;
  public color color;
  
  //METODOS:
  public void comer(){

  }

  public abstract void  mover();
  //Es abstracto por que no se puede decir como se mueven todas las fichas, eso lo haran las subclases
  
}
