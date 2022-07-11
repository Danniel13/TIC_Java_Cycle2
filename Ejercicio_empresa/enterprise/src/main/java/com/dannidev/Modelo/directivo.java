package com.dannidev.Modelo;



public class directivo extends empleado {
  
  
  public static final String CAT_DEFAULT ="Sin categoria"; //Asignación variable estática con public final para que no se pueda modificar.
  
  
  
  
  
  
  //Atrributos
  private String categoria;
  private empleado[] subordinados; //Todas las relaciones significan que se tiene que crear atributos en la clase
  //Ponemos array: [] Por que es de uno a muchos un directivo a muchos empleados



  //Constructor
  //SOBRE CARGA DE COSNTRUCTORES: ESTO PARA EN CASO DE QUE SE QUIERAN VALORES POR DEFECTO COMO POR EJEMPLO COGE VALOR POR DEFECTO
  //DE CATEGORIA: SIN CATEGORIA //sueldobruto= 999.999d
  //CON CATEGORIA-*SEGUN EJERCICIO*:
  //Constructor Principal
  public directivo(String nombre, Integer edad, Double sueldobruto, String categoria) {
    super(nombre, edad, sueldobruto); //Super llama al global empleado los parametros nombre, edad, sueldo bruto y adiciona
    //parametros de categoria y subordinados
    this.categoria = categoria;
    this.subordinados = new empleado[10];
  }
  
  
  public directivo(String nombre, Integer edad, String categoria) {
    this(nombre, edad, SUELD_DIRECTIVO, categoria); //This para heredar de constructor principal
    
    
  }


 

  //SIN CATEGORIA-*SEGUN EJERCICIO*:

  public directivo(String nombre, Integer edad) {
    this(nombre, edad, CAT_DEFAULT);
    
  }


  public directivo(String nombre, Integer edad, Double sueldobruto) {
    this(nombre, edad, sueldobruto, CAT_DEFAULT);
  
  }





  //Metodos
  @Override
  public void mostrar() {
    //Va a tener un output exclusivo para que marque Directivo en lugar de empleado.
    System.out.printf("El Directivo %s tiene una edad %d años y su sueldo es $ %,.2f y su categoría es %s %n", getNombre(), getEdad(), getSueldobruto(), categoria);
   }

   public String getCategoria() {
     return categoria;
   }


   public empleado[] getSubordinados() {
     return subordinados;
   }

}

