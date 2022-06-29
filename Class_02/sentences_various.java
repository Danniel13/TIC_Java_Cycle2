package Class_02;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class sentences_various {
  public static void main(String[] args) {
    cycle4(); //Metodo con el que inicia la ejecución
  }

  private static void Conditional1() {
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

  private static void conditional2(){
  //Lectura de letra por pantalla y validación si es vocal o letra
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
    
  private static void conditioal2switch(){
    var letter = "";
    var sc = new Scanner(System.in); //definicion de variable sc, con el atributo Scanner
    System.out.print("Ingrese una letra: ");
    letter = sc.nextLine();//Linea de entrada
    
    switch (letter) {
      case "a":
        System.out.println("El caracter: " + letter + " es una vocal");
        break;
      case "e":
        System.out.println("El caracter: " + letter + " es una vocal");
        break;
      case "i":
        System.out.println("El caracter: " + letter + " es una vocal");
        break;
      case "o":
        System.out.println("El caracter: " + letter + " es una vocal");
        break;
      case "u":
        System.out.println("El caracter: " + letter + " es una vocal");
        break;
    
      default:
        System.out.println("El caracter: " + letter + " es una consonante");
        break;
    }

  }

  private static void cycle1(){
    var num = 5; //Definición de variable y valor

    while (num >=0){ //Condición
      System.out.println(num--); //decremento de variable 1 a 1 e impresió en pantalla por cada ciclo
      }
      System.out.println("Boom !! :'v"); //Instruccion final del ciclo
      
    }


  private static void cycle2(){
    var num = 10;
    do {    //Ejecuta bloque de ciclo minimo una vez 
      System.out.println(num);
      num --;
    } while (num>0);
    System.out.println("Despegue! :v");
  }
  
  private static void cycle3(){
    var resultado = 1;
    for(var num = 5; num>0; num--){  //Inicialización-Condición-Avance -->Respectivamente
      resultado *= num;

    }
    System.out.println(resultado);
  }

  private static void cycle4(){
    //FOR EACH: RECORRE ELEMENTOS EN ARRAY
    var frutas=new String[]{
      "Manzana", "Pera", "Naranja", "Mandarina", "Limon"
    };
    for(var fruta: frutas){
      System.out.println("La fruta es: " + fruta);
    }
    }
  }


