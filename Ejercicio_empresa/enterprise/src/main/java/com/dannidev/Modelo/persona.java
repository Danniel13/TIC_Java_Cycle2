package com.dannidev.Modelo;

public abstract class persona {
  //Atributos: Variables que se van a definir para que tengan valores
  private String nombre;  //Protected: Solamente la clase y las clases que hereden de persona van a poder usar el atributo tipo protected
  private Integer edad;



  //Constructores

  public persona(String nombre, Integer edad){
    //This para referirse a nombre de variable del atributo de la clase
    this.nombre = nombre;
    this.edad = edad;

  }


  //Metodos


  
  public abstract void mostrar(); 
  //Preguntar acerca del public void deberia traer información tipo string y integer


   //Creación de metodo para que devuelva valos nombre y edad para poderlos mapear en los otros archivos(clases)
  //GENERACION DE GETTERS: Dar acceso de lectura a un atributo de la clase principal

  public String getNombre() {
    return nombre;//Devuelve contenido de nombre
  }


  public Integer getEdad() {
    return edad;//Devuelve contenido de edad
  }
  
  
}
