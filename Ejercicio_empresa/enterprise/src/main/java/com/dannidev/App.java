package com.dannidev;

 import com.dannidev.Modelo.cliente;
import com.dannidev.Modelo.directivo;
import com.dannidev.Modelo.empleado;
import com.dannidev.Modelo.empresa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
      //Creando para probar app:
      //Adiciona info en clase empresa
    

    //Adicionando información en clase empleado:
    var empleado1 = new empleado("Danniel Gonzalez", 28, 3_000_000d);//-->Constructor: Metodo especial que se tiene dentro de la clase que se llama en este caso "empleado"
    //Definición de constructor desde las clases!!
    System.out.println(empleado1.getNombre() + " " + empleado1.getSueldobruto() );

    var empleado2 = new empleado("Lorenci Daza", 32);
    System.out.println(empleado2.getNombre() + " " + empleado2.getSueldobruto());//Va a traer el sueldo definido por defecto en el constructor de la clase empleado
 
    System.out.println("-------------------------------------------------------------------------------");
System.out.println("Creación directivo");
var directivo1= new directivo("Pepito Perez", 45);
System.out.println("Nombre: " + directivo1.getNombre());
System.out.println("Edad: " + directivo1.getEdad());
System.out.println("Categoria: " + directivo1.getCategoria());
System.out.println("Sueldo bruto: " + directivo1.getSueldobruto());

//Creacion clientes:
var cliente1 = new cliente("Camila Jimeno", 29, "3175009380");
var cliente2 = new cliente("Jesus Jiménes", 31, "3124448796");
var cliente3 = new cliente("Homero Jimeno", 46, "3198754796");


//Creación Empleados:
var empleados = new empleado[]{empleado1,empleado2,directivo1};
//Creación Empresa:
var empresa = new empresa("Ecoplanta", empleados);
empresa.agregarcte(cliente1);
empresa.agregarcte(cliente2);
empresa.agregarcte(cliente3);


System.out.println("-------------------------------------------------------------------------------");

//IMPRIMIR DATOS:

empleado1.setSueldobruto(500d);//No se aplica por que se realizo un if en empleado que si se 
//seteaba algo menor al salario base no se aplicaba

// cliente1.setTelefono("3719710");
empresa.mostrar();

    }


    
}
