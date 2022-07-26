package com.dkdev;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

      //ES NECESARIO AÑADIR DEPENDENCIA DE SQLITE AL PROYECTO EN POM:
       // <dependency>
//     <groupId>org.xerial</groupId>
//     <artifactId>sqlite-jdbc</artifactId>
//     <version>3.36.0.3</version>
// </dependency>

        // Creación conexión BD:
        var urlDB = "jdbc:sqlite:D:\\Users\\Danniel\\Documents\\D3r1ck\\Cursos\\Mision TIC 2022\\Programacion\\Repositorios Git\\Test_Java\\BD_SQLITE\\hr.db"; //SE PONE RUTA DE BASE DE DATOS CON DOBLE BACKSLASH
        try{//intento de conexion BD
        var connectionDB = DriverManager.getConnection(urlDB); //Estableciendo la conexion
        System.out.println("Conexión a base de datos Ok");
        var statment = connectionDB.createStatement(); //CREACION INSTRUCCION SQL
        //statment.executeQuery("CREATE TABLE DEMO (ID INTEGER PRIMARY KEY, NAME VARCHAR(100) NOT NULL);"); //SENTENCIA CREACION TABLA
          // statment.executeUpdate("INSERT INTO DEMO (ID, NAME) VALUES (1, 'First register')");
          statment.executeUpdate("INSERT INTO DEMO (ID, NAME) VALUES (2, 'Second register')");
         

          ////
         //INTENTO DE CONSULTA SELECT:
          // var consu1 = statment.executeQuery("SELECT * FROM employees");

          // System.out.println(consu1);
        //////


        connectionDB.close();
        System.out.println("Connection to BD closed");
        } catch(SQLException e){//DEFINICION DE EXCEPCION
          System.err.println("Error trabajando con la base de datos: \n" + e.getMessage());//ERROR EN CASO DE FALLAR CONEXION
        }

      }
    }

