package com.dannidev.Modelo;

public class empleado extends persona {
  
  public static final Double  SUELD_DIRECTIVO = 2625000d;
  //Atributos
  private Double sueldobruto;


  //Constructores

  //Se definen constructores segun la necesidad: en este caso dos uno con los 3 parametros y otro con dos parametros y 
  //la otra con un parametro por defecto en el sueldobruto

  /*
  //POLIMORFISMO: SOBRECARGA: Para el mismo metodo usar dos constructores:

  
  public empleado(String nombre, Integer edad) {
    super(nombre, edad);//super: Llama al constructor de persona en este caso llamando parametro nombre y edad.
    this.sueldobruto = 999_999d;  //Suedo por defecto en caso de que se cree empleado con solo datos de nombre y edad
  }
  */
  /*
  Reutilización de código de constructor principal empleado definido abajo:
  */
  public empleado(String nombre, Integer edad) {
    
    this(nombre, edad, 4500000d);//Asigna el valor 999_999d al atributo sueldobruto del constructor principal osea el de abajo:


  }

  public empleado(String nombre, Integer edad, Double sueldobruto) {
    super(nombre, edad);
    this.sueldobruto = sueldobruto;
  }


//Metodos
   
  //Poner publico getsueldobruto
public Double getSueldobruto() {
  return sueldobruto;
}

//Poner set a atributo Sueldo bruto:

public void setSueldobruto(Double sueldobruto) {
 if (sueldobruto < this.sueldobruto){  //En caso de que se modifique el sueldo bruto en app.java 
  return;
 }
 
  this.sueldobruto = sueldobruto;
}






  public  void calcularsalarioneto(){
 

  }




  @Override
  public void mostrar() {
    // TODO Implementar mostrar empleado
    System.out.printf("El empleado %s tiene una edad %d años y su sueldo es $ %,.2f %n", getNombre(), getEdad(), sueldobruto);
    
  }
  
}
