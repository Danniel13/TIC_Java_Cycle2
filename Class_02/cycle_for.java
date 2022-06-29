package Class_02;
//For para hallar factorial de un numero:
public class cycle_for {
  public static void main(String[] args) {
    var resultado = 1;
    for(var num = 5; num>0; num--){  //Inicialización-Condición-Avance -->Respectivamente
      resultado *= num;

    }
    System.out.println(resultado);
  }
  }

