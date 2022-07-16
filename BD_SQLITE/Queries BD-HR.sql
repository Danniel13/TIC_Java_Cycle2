-- SQLite
-- ------Seleccionar datos- Traer datos:-------
-- TRAER TODOS LOS DATOS DE UNA TABLA:
-- SELECT * FROM DEPARTMENTS; 
-- SELECT * FROM countries; 


-----SELECT: Proyeccion datos- Traer datos(COLUMNAS ESPECIFICAS):-------
SELECT department_name, location_id FROM DEPARTMENTS; 


----SELECT PARA TRAER FILAS ESPECIFICAS:
SELECT * FROM DEPARTMENTS WHERE department_id = 7; 



SELECT * FROM employees;



-- [Creacion columna temporal con operando de suma]:
SELECT last_name, salary, department_id, salary +5000 FROM employees;

-- [Creacion columna temporal con operando de aumento 20% con alias: "new salary"]:
SELECT last_name, salary, department_id, salary *1.2 New_Salary FROM employees;


--Bautizar columnas en select:
select last_name as "Apellido", salary as "Sueldo", department_id as "Codigo Departamento", salary * 1.2 as "Nuevo Salario" FROM employees;



--Agregar columna: comision_pct:

alter table employees add Comission_Pct float;

-- Eliminando columna comision_pct:

alter table employees drop COLUMN Comission_Pct;

-- Trayendo datos especificos:
select employee_id, last_name, salary, Comission_Pct FROM employees;

-- VALIDAR ESTA CONSULTA:---------------
-- select employee_id, last_name, salary, Comission_Pct, salary * coalesce(comission_pct,0) /100 as comission, salary * (100+coalesce(Comission_pct,0)) /100 as new salary  FROM employees;


--Eliminar datos repetidos:

-- vALIDAR LOS DATOS NO REPETIDOS LOS DISTINTOS UNOS DE LOS OTROS:
select DISTINCT department_id from employees;




-- VALIDACION DE DATOS UNICOS EN DOS COLUMNAS
SELECT DISTINCT department_id, manager_id FROM employees;


--CONCATENAR CAMPOS
select last_name || ', ' || job_id as "Employee And Title" from employees;

--Concatenacion:
SELECT employee_id ||","|| first_name ||","|| last_name ||","|| email ||","|| phone_number ||","||
hire_date ||","|| job_id ||","|| salary ||","|| manager_id ||","|| department_id  as THE_OUTPUT
FROM employees ;




