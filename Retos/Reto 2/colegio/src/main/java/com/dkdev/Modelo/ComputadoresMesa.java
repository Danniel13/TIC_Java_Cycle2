package com.dkdev.Modelo;

public class ComputadoresMesa extends Computadores {
  
  //ATRIBUTOS
  private final static Integer ALMACENAMIENTO_BASE= 50;
  private Integer almacenamiento;
  

  //CONSTRUCTORES:

public ComputadoresMesa() { 
  //Si no trae ninguna entrada traer datos de clase padre:
  this(PRECIO_BASE, PESO_BASE, CONSUMO_W, ALMACENAMIENTO_BASE);

} 


public ComputadoresMesa(Double precioBase, Integer peso) {
  this(precioBase, peso, CONSUMO_W, ALMACENAMIENTO_BASE);
  

 }


public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
  super(precioBase, peso, consumoW);
  this.almacenamiento = almacenamiento;


 } 
 
 
 
 // Métodos 
 
public Double calcularPrecio() { 
  double adicion = super.calcularPrecio();
  if(almacenamiento> 100){
    adicion +=50;
  }
  return adicion;
 }


 public Integer getCarga() { 
  return almacenamiento;
  }


  
  
  


}
