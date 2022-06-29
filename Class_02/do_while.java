package Class_02;

public class do_while {
  public static void main(String[] args) {
    int x = 20;
        do
        {
            //El código dentro del do se imprime incluso
            //si la condición es falsa
            System.out.println("Valor de x :" + x);
            x++;
        }
        while (x < 20);
    }
  }

