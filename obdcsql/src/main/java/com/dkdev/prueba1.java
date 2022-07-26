package com.dkdev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class prueba1 {
  public static void main(String[] args) { //NUEVO MAIN INDEPENDIENTE DE APP.JAVA
      var url = "jdbc:sqlite:D:\\Users\\Danniel\\Documents\\D3r1ck\\Cursos\\Mision TIC 2022\\Programacion\\Repositorios Git\\Test_Java\\BD_SQLITE\\hr.db";
      try{//intento de conexion BD
        var connection = DriverManager.getConnection(url); //Estableciendo la conexion
     
        // var departamentos = listardeptos(connection);
        // departamentos.forEach(System.out::println);
        
        // var cargos = listarcargos(connection);
        // cargos.forEach(System.out::println);

        var sc = new Scanner(System.in);
        System.out.println("Ingrese el apellido del empleado: ");
        var empleado = sc.nextLine();

        var companeros = listarconsultarh(connection,empleado.toUpperCase());
        companeros.forEach(System.out::println);
        sc.close();


        connection.close();




    } catch(SQLException e){
      e.printStackTrace();
    }

  }

    public static List<departments> listardeptos(Connection conn) throws SQLException{

      var response = new ArrayList<departments>();

      var statement = conn.createStatement();
      var rst= statement.executeQuery("select * from departments");
      while (rst.next()){
        var departamento = new departments();
        departamento.setId(rst.getInt("department_id"));
        departamento.setName(rst.getString("department_name"));
        departamento.setLocationId(rst.getInt("location_id"));

        response.add(departamento);
      }
      rst.close();


      return response;

  }


public static List<jobs> listarcargos(Connection conn) throws SQLException{
  var response = new ArrayList<jobs>();
  var statement = conn.createStatement();
  var rset = statement.executeQuery("SELECT * FROM jobs");
  while (rset.next()) {
        var cargo = new jobs();
        cargo.setId(rset.getInt("job_id"));
        cargo.setTitle(rset.getString("job_title"));
        cargo.setMinSalary(rset.getDouble("Min_Salary"));
        cargo.setMaxSalary(rset.getDouble("Max_Salary"));

        response.add(cargo);
  }
  rset.close();

  return response;
}

// ------------------------BUSQUEDA DE DATO EN BD:

public static List<employment> listarconsultarh(Connection conn, String empleado) throws SQLException{

  var response = new ArrayList<employment>();
  var sql="select last_name, hire_date"
  + "from employees "
  +"where department_id = ("
  +"select department_id"
  +"from employees "
  +"where last_name = ?"
  + ")"
  + "and last_name <> =;";

  var statement = conn.prepareStatement(sql);
  statement.setString(1, empleado);
  statement.setString(2, empleado);
  var rset = statement.executeQuery();
  while (rset.next()) {
    var compa = new employment();
    compa.setLast_name(rset.getString("last_name"));
    compa.setDate_contract(rset.getString("date_contract"));

    response.add(compa);

    
  }

rset.close();

  
  
  
  
  return response;

  

}





}