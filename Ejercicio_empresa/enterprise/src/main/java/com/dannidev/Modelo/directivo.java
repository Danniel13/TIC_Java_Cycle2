package com.dannidev.Modelo;

public class directivo extends empleado {
  //Atrributos
  public String categoria;
  public empleado[] subordinados; //Todas las relaciones significan que se tiene que crear atributos en la clase
  //Ponemos array: [] Por que es de uno a muchos un directivo a muchos empleados


  //Constructo


  //Metodos
  @Override
  public void mostrar() {
    // TODO Auto-generated method stub
    super.mostrar(); //Se trae metodo mostrar desde empleado y de empleado se trae de persona
  }


}

