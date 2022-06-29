package Class_02;

import java.util.Scanner;

public class valida_letter {
  public static void main(String[] args) {
    var letter = "";
    var sc = new Scanner(System.in); //definicion de variable sc, con el atributo Scanner
    System.out.print("Ingrese una letra: ");
    letter = sc.nextLine();//Linea de entrada
    
    if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {  //Definición de condición
      System.out.printf("El caracter: " + letter + " es una vocal");
    }
    else {
      System.out.printf("El caracter: " + letter + " es una letra");
    }
    sc.close();
  }
  }

