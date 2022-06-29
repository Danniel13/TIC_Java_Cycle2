package Class_02;
import java.util.Scanner;

public class Exercises_class02 {
    public static void main(String[] args) {
        ciclo4();
    }

    private static void condicional1() {
        int numero;
        var sc = new Scanner(System.in);

        System.out.print("Ingrese el número: ");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número no es positivo ni negativo");
        }

        sc.close();
    }

    private static void condicional2() {
        var sc = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        var letra = sc.nextLine();

        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
                break;
        }

        // if (letra.equals("a")) {
        // System.out.println("Es una vocal");
        // } else if (letra.equals("e")) {
        // System.out.println("Es una vocal");
        // } else if (letra.equals("i")) {
        // System.out.println("Es una vocal");
        // } else if (letra.equals("o")) {
        // System.out.println("Es una vocal");
        // } else if (letra.equals("u")) {
        // System.out.println("Es una vocal");
        // } else {
        // System.out.println("Es una consonante");
        // }

        sc.close();
    }

    private static void ciclo1() {
        var numero = 0;

        System.out.println(numero--);
        while (numero > 0) {
            System.out.println(numero--);
        }
        System.out.println("Boooooooooom!");
    }

    private static void ciclo2() {
        var numero = 0;

        do {
            System.out.println(numero);
            numero--;
        } while (numero > 0);
        System.out.println("Despegue!!");
    }

    private static void ciclo3() {
        var resultado = 1;
        for (var numero = 5; numero > 0; numero--) {
            resultado *= numero;
        }
        System.out.println(resultado);
    }

    private static void ciclo4() {
        var frutas = new String[]{
            "Manzana", "Pera", "Naranja", "Mandarina", "Limon"
        };
        for (var fruta : frutas) {
            System.out.println("La fruta es: "+ fruta);
        }
    }
}
