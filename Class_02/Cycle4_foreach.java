package Class_02;

public class Cycle4_foreach {
  //Recorrido de array con for each
  public static void main(String[] args) {
      
  var frutas=new String[]{
    "Manzana", "Pera", "Naranja", "Mandarina", "Limon"
  };
  for(var fruta: frutas){
    System.out.println("La fruta es: " + fruta);
  }
  
}
}