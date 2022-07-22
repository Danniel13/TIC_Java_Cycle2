-- SQLite
-- FUNCIONES DE GRUPO O MULTILINEA:

--Salario maximo en la columna salario
SELECT max(salary) from employees;


--Salario minimo en la columna salario
SELECT min(salary) from employees;


--Calcular cantidad de datos en una columna
SELECT count(salary) from employees;

--Saca el promedio de los elementos: Suma todos los elementos y los divide por la cantidad de elementos
SELECT avg(salary) as 'promedio' from employees;


--Cuente todos los deptos distintos:

select count(DISTINCT department_id) as distintos_total, count(department_id)  as total_column_depid from employees;



--Consulta estructurada department_ID= 3

select max(salary) as Salario_Maximo,  min(salary) as Salario_Minimo, count(salary) as Total_registros_count, avg(salary) as promedio_salario from employees where department_id = 3;


---------------GROUP BY: FUNCIONES DE GRUPO 

select department_id, avg(salary) from employees group by department_id;
---------------

SELECT avg(salary) from employees GROUP BY department_id;


--------------GROUP BY HAVING:

select department_id, max(salary) from employees GROUP BY department_id HAVING max(salary)>10000;

--Numero de personas con el mismo trabajo:

SELECT job_id, COUNT(*)
FROM employees
GROUP BY job_id;

-- Cree un informe para mostrar el número de gerente y el salario del empleado
-- con el salario más bajo para ese gerente. Excluir a cualquiera cuyo gerente
-- no sea conocido. Excluya cualquier grupo donde el salario mínimo sea de $
-- 6,000 o menos. Ordene la salida en orden descendente de salario

SELECT manager_id , min(salary) as salario
from employees 
where manager_id is not null --No trae los manager_id vacios o nulos
GROUP by manager_id
having min(salary)> 6000 --trae salarios mayores a 6000
ORDER BY salary DESC; --Ordenar salario descendente



--UNIR DIFERENTES TABLAS EN UNA SOLA: 

--JOIN

--NATURAL JOIN: Busca que exista en ambas tablas un mismo valor de campo para hacer
--la relación --

--Union tabla departmentes and locations:

--VALIDAR UNION DE LAS DOS TABLAS!!
SELECT * from departments;
select * from locations;


-- natural JOIN locations; --Hace relacion entre llaves foraneas en este caso LOCATION_ID
-- hHace union de datos teniendo en cuenta la data de location_ID!!
SELECT * from departments
natural JOIN locations;





--Union tablas con campos especifico para traer:

SELECT department_id, department_name, street_address, city from departments
natural JOIN locations;


--Bautizar columnas para evitar confusión entre dos tablas:

SELECT * from departments;
SELECT * from locations;

SELECT department_id, department_name, street_address, city from departments 
natural JOIN locations;



SELECT * from locations
natural JOIN departments;



--ALIAS: PARA DIFERENCIAR DE DONDE VIENE CADA DATO SE PONE INICIAL DEL NOMBRE DE CADA TABLA.

SELECT d.department_id, d.department_name, l.street_address, l.city from departments d
NATURAL JOIN locations l;


--ALIAS- PARA DIFERENCIAR COLUMNAS RELACIONADAS:

-- CON USIN SE INDICA LA COLUMNA QUE VA A RELACIONAR: PARA CUANDO SE REPITEN NOMBRES EN COLUMNAS
SELECT d.department_id, d.department_name, l.street_address, l.city from departments d
JOIN locations l USING (location_id);

--Haciendo join con 3 tablas: DEPARTMENTS--- LOCATIONS --- COUNTRIES

SELECT d.department_id, d.department_name, l.street_address, l.city, c.country_name from departments d
NATURAL JOIN locations l
NATURAL JOIN countries c;

--Cuando hay datos con el mismo valor de cabecera en las tablas que se quieren unir no
-- es recomendable usar natural join
-- ON: CUALES SON LOS CAMPOS DE TAL TABLA TAL CAMPO:

SELECT d.department_id, d.department_name, l.street_address, l.city, c.country_name
FROM departments d
JOIN locations l ON (D.location_id = l.location_id)
JOIN countries c ON (l.country_id = c.country_id);




-- //USING JOIN: SE ESPECIFICAN LOS CAMPOS QUE QUIEREN TRAERSE Y RELACIONARSE
-- SELECT d.department_id, d.department_name, l.street_address, l.city, c.country_name
-- FROM departments d
-- JOIN locations l USING (l.location_id)
-- JOIN countries c USING (c.country_id );

