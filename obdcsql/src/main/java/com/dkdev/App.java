package com.dkdev;

import java.beans.Statement;
import java.nio.channels.GatheringByteChannel;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.xml.stream.events.StartElement;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){

      Integer register;

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
        

        //EXECUTE:DDL CREACION DE TABLAS !! SELECT!!
        //statment.executeQuery("CREATE TABLE DEMO (ID INTEGER PRIMARY KEY, NAME VARCHAR(100) NOT NULL);"); //SENTENCIA CREACION TABLA

        //EXECUTEUPDATE: DML: INSERT DELETE UPDATE

          //ADD REGISTERS:
          // statment.executeUpdate("INSERT INTO DEMO (ID, NAME) VALUES (1, 'First register')");
          // statment.executeUpdate("INSERT INTO DEMO (ID, NAME) VALUES (2, 'Second register')");


          // //UPDATE!!
          // statment.executeUpdate("UPDATE  DEMO SET NAME= 'Este dato se modifico' where ID = 2;");


          // //DELETE REGISTER2!!
          // statment.executeUpdate("DELETE FROM DEMO WHERE ID='2';");

          // DELETE BD
          // statment.executeUpdate("DELETE FROM DEMO WHERE ID='2';");
          // statment.executeQuery("DROP TABLE DEMO;");



          //BD Creation:
          // statment.executeQuery("CREATE TABLE DEMO (ID INTEGER PRIMARY KEY, NAME VARCHAR(100) NOT NULL);"); //SENTENCIA CREACION TABLA


          // //DECLARACION DE VARIABLES COMO CONSULTAS:
          //  register = statment.executeUpdate("INSERT INTO DEMO (ID, NAME) VALUES (1, 'First register')");
          //  register = statment.executeUpdate("INSERT INTO DEMO (ID, NAME) VALUES (2, 'Second register')");
          //  register = statment.executeUpdate("INSERT INTO DEMO (ID, NAME) VALUES (3, 'Third register')");

          //    //UPDATE!!
          // register = statment.executeUpdate("UPDATE  DEMO SET NAME= 'Este dato se modifico' where ID = 2;");

              // SELECT//
              //RSET: VARIABLE TIPO RESULT SET!!
              var rset = statment.executeQuery("SELECT ID, NAME FROM DEMO;"); //RSET DONDE ALMACENA LOS DATOS TRAIDOS

            //RECORRER RESULTADO: NECESARIO PARA TRAER DATOS DE SELECT:
            System.out.println("Querie select Table DEMO: ");
            while (rset.next()) {
              System.out.printf("ID: %d, NAME: %s %n", //Va a traer un valor ID de la consulta y un name con cambiod e linea
              rset.getInt("ID"), //Estableciendo el format!!
              rset.getString("NAME"));//Estableciendo el format!!
              
              }
            rset.close(); //Siempre cerrar resultset despues del cierre del while




              System.out.println("--------------------------------------------------------------------------------------");
              System.out.println("Querie select Table countries: ");

            //SELECT * TABLE COUNTRIES

            var rset2 = statment.executeQuery("SELECT country_id, country_name, region_id  FROM countries;"); //RSET DONDE ALMACENA LOS DATOS TRAIDOS

            //RECORRER RESULTADO: NECESARIO PARA TRAER DATOS DE SELECT:
            while (rset2.next()) {
              System.out.printf("country_id: %s, country_name: %s, region_id %d  %n", //Va a traer un valor ID de la consulta y un name con cambiod e linea
              rset2.getString("country_id"), //Estableciendo el format!!
              rset2.getString("country_name"),
              rset2.getInt("region_id"));//Estableciendo el format!!
              
              }
            rset2.close(); //Siempre cerrar resultset despues del cierre del while



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

