package com.dannidev.Modelo;

public class empresa {
 //Atributos:
 private String nombre;
  private cliente[] clientes;//Una empresa a muchos clientes
  private empleado[] empleados;//Una empresa a muchos empleados
  private Integer numclientes;

//!!!!!!!!!!REVISAR FORMULACIÓN DE CONSTRUCTOR POR LA ADICION DE NUMCLIENTES!!!!!!!!!!
//Constructores
public empresa (String nombre, empleado[] empleados){ //Por defecto va a crear 100 clientes
  this(nombre, new cliente[100], empleados);//Debe llevar el orden del constructor principal osea el de abajo!!
  this.numclientes= 0;
  
  // this.nombre = nombre;
  // this.empleados = empleados;
  // this.clientes = new cliente[100]; 
  
}


public empresa(String nombre, cliente[] clientes, empleado[] empleados) { //Establece numero de clientes en el parametro
  this.nombre = nombre;
  this.clientes = clientes;
  this.empleados = empleados;
}

  //Metodos

public void agregarcte(cliente  cliente){ //Metodo publico para agregar cliente! se llama desde principal app.java
  clientes[numclientes] = cliente;
  numclientes++;
}


public String getNombre() {
  return nombre;
}




public void mostrar(){
  System.out.printf("La empresa %s tiene los siguientes empleados: %n", nombre);
  //FOR EACH PARA RECORRER TODOS LOS EMPLEADOS:
  for (var empleado : empleados) {
      empleado.mostrar();
    
  }
  System.out.println("-------------------------------------------------------------------------------");
  System.out.println("Y tiene los siguientes clientes: ");
  //FOR EACH PARA RECORRER TODOS LOS CLIENTES:
  for (var cliente : clientes) {
    if (cliente == null) {
      break;
  }
    cliente.mostrar();//Si no se pone un If para condicionar que si existe un null el programa haga un break en la ejecucion
    //botara el mensaje: xception in thread "main" java.lang.NullPointerException// at com.dannidev.Modelo.empresa.mostrar(empresa.java:40)
    
  }

}

}
