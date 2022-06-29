package Class_02;

public class HelloWorld {
  public static void main(String[] args) {
    var print1 = "Hello World";
    var print2= "Hello 2";
    var name1= "Daniel";
    System.out.print(print1);
    System.out.println("!");
    System.out.print(print2);
    System.out.println("!!");

    //Formas de mostrar en pantalla:
    //"".format()
    //"%d: Num entero %f: decimal %s: cadena "
    //.2f para dos decimales
    System.out.printf("Hola, %s: %d %.2f", name1, 18, 5.58); 
  }
}
