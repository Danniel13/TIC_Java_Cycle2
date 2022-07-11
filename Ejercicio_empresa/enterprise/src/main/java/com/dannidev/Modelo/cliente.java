package com.dannidev.Modelo;

public class cliente extends persona {
  //Atributos
  private String telefono;



  //constructor

  public cliente(String nombre, Integer edad, String telefono) {
    super(nombre, edad);
    this.telefono = telefono;
  }

  //Metodos

  @Override
  public void mostrar() {
    System.out.printf("El cliente %s tiene una edad %d años y su número de teléfono es %s %n", getNombre(), getEdad(), telefono);
    
  }

public String getTelefono() {
  return telefono;
}


public void setTelefono(String telefono) {
  if(telefono== null || telefono.isEmpty()){
    return;

  }
  this.telefono = telefono;
}
  
}
