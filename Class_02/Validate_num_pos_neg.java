package Class_02;

import java.util.Scanner;

public class Validate_num_pos_neg {
  public static void main(String[] args) {
  
    //LECTURA DE NUMERO ENTERO POSITIVO
    var num1 = 0;
    var sc = new Scanner(System.in); //definicion de variable sc, con el atributo Scanner
    System.out.print("Ingrese un numero: ");
    num1 = sc.nextInt();//Linea de entrada
    
    if (num1 >0){  //Definición de condición
    System.out.printf("El número: " + num1 + " es positivo");  //Impresión si la condición se cumple
    }
    else if (num1 ==0) { //Definición de condición
    System.out.printf("El número: " + num1 + " es un numero neutro");  //Impresión si la condición se cumple
    }
    else if (num1 <0) { //Definición de condición
      System.out.printf("El número: " + num1 + " es un numero negativo"); //Impresión si la condición se cumple
    }
    sc.close();
  }

}
