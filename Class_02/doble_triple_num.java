package Class_02;
import java.util.Scanner;

public class doble_triple_num {
  public static void main(String[] args) {
    Integer num1;
    var sc = new Scanner(System.in); //definicion de variable sc, con el atributo Scanner
    System.out.print("Ingrese un numero: ");
    num1 = sc.nextInt();//Linea de entrada 
    
    System.out.println("El doble del número ingresado es: " + (num1*2));
    System.out.println("El triple del número ingresado es: " + (num1*3));
    sc.close();
  }

}