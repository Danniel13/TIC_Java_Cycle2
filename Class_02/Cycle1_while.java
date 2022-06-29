package Class_02;

import java.util.Scanner;

//Programa que saca los numeros del 5 hasta el 0 y luego el mensaje boom
public class Cycle1_while {
  public static void main(String[] args) {
    var num = 5; //Definición de variable y valor
    var sc = new Scanner(System.in); //definicion de variable sc, con el atributo Scanner
    System.out.print("Ingrese un numero: ");
    num = sc.nextInt();//Linea de entrada
    
    while (num >=0){ //Condición
      System.out.println(num--); //decremento de variable 1 a 1 e impresió en pantalla por cada ciclo
      }
      System.out.println("Boom !! :'v"); //Instruccion final del ciclo
      sc.close();
    }
}

