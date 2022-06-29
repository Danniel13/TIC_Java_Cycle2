package Class_02;

import java.util.Scanner; //Importacion libreria para poder usar INPUT: Scanner


public class Input {
  public static void main(String[] args) {
    var input1 = "";
    var sc = new Scanner(System.in); //definicion de variable sc, con el atributo Scanner
    System.out.print("Ingrese su nombre: ");
    input1 = sc.nextLine();//Linea de entrada


    System.out.printf("Hola, %s", input1);//Salida

    sc.close(); //Cierre de scaner- input
  }
}
