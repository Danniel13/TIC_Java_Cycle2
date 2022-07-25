package com.dkdev;

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
    
      // <!-- https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc -->
// <dependency>
//     <groupId>org.xerial</groupId>
//     <artifactId>sqlite-jdbc</artifactId>
//     <version>3.36.0.3</version>
// </dependency>

        // Creación conexión BD:
        var urlDB = "jbdc:sqlite:C:\\Users\\D3rick\\hr.db"; //SE PONE RUTA DE BASE DE DATOS CON DOBLE BACKSLASH
        try{//intento de conexion BD
        var connectionDB = DriverManager.getConnection(urlDB); //Estableciendo la conexion
        connectionDB.close();
        } catch(SQLException e){//DEFINICION DE EXCEPCION
          System.err.println("Error trabajando con la base de datos: \n" + e.getMessage());//ERROR EN CASO DE FALLAR CONEXION
        }

      }
    }

