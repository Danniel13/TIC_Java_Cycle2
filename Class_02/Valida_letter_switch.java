package Class_02;

import java.util.Scanner;

public class Valida_letter_switch {
  public static void main(String[] args) {
    var letter = "";
    var sc = new Scanner(System.in); //definicion de variable sc, con el atributo Scanner
    System.out.print("Ingrese una letra: ");
    letter = sc.nextLine();//Linea de entrada
    
    switch (letter) {
      case "a":
      case "e":
      case "i":
      case "o":
      case "u":
        System.out.println("El caracter: " + letter + " es una vocal");
        break;
    
      default:
        System.out.println("El caracter: " + letter + " es una consonante");
        break;
    }
      sc.close();
  }
}
