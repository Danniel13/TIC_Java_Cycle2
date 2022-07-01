package Exercises.Class1.Clase01.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       ejercicio_3();
   }

   private static void ejercicio_1() {

    // Ejercicio 1: Implemente un algoritmo que dado un nombre en una variable de tipo cadena, imprima un saludo en consola.
    var name = "Danniel";
    System.out.print("Bienvenido " + name + "!!");
   }

   private static void ejercicio_2() {

   //Ejercicio 2: Implemente un algoritmo que reciba un número por teclado y cuente cuántas cifras o dígitos contiene e imprima el mensaje en consola.
   int numero;
   int count=0;
   var sc = new Scanner(System.in);
   System.out.print("Ingrese el numero a contar : ");
   numero = sc.nextInt();
   while(numero>0){
       numero = numero/10;
       count++; 
   }
   System.out.printf("El numero ingresado tiene %s digitos",count);

   sc.close();

   }

   private static void ejercicio_3() {
    //Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
  
  Integer num1;
  var sc = new Scanner(System.in); //definicion de variable sc, con el atributo Scanner
  System.out.print("Ingrese un numero: ");
  num1 = sc.nextInt();//Linea de entrada 
  
  System.out.println("El doble del número ingresado es:" + (num1*2));
  System.out.println("El Triple del número ingresado es:" + (num1*3));
  sc.close();
  }
}
