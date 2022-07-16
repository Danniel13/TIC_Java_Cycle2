-- SQLite
-- FUNCIONES:

SELECT datetime('now');

SELECT datetime('now', 'localtime');

-- Calcule el número de días desde la firma de el birthay:

SELECT julianday('now') - julianday('1994-03-20');



-- El departamento de recursos humanos necesita un informe para mostrar el
-- número de empleado, apellido, salario y el salario aumentado en un 15.5%
-- (expresado como un número entero) para cada empleado. Etiquete la
-- columna New Salary.



SELECT employee_id ,last_name ,salary ,ROUND (salary *1.155) as "New salary" FROM employees;


-- Modifique la consulta anterior para agregar una columna que reste el salario
-- anterior del nuevo salario. Nombre la columna Increase.


SELECT employee_id ,last_name ,salary , ROUND (salary *1.155) as "new salary",  ROUND ((salary *1.155)- salary) as "Increase" FROM employees;

--CAMBIAR CAMPO DE LASTNAME: PARA MAYUSCULAS:
update employees set last_name = UPPER(last_name), first_name = upper(first_name);

--Escriba una consulta que muestre el apellido (con la primera letra en
-- mayúscula y todas las demás letras en minúscula) y la longitud del apellido
-- para todos los empleados cuyo nombre comienza con las letras "J", "A" o
-- "M”. Dé a cada columna un nombre apropiado. Ordene los resultados por los
-- apellidos de los empleados.

-- select last_name from employees WHERE LOWER(last_name) = ''
-- select last_name, SUBSTRING(last_name,1,1) || lower(SUBSTRING(last_name, 2, 8)) as last_name, length(last_name) as 



-- Cree una consulta que muestre los apellidos y los montos de las comisiones
-- de los empleados. Si un empleado no gana comisión, muestre "Sin
-- comisión". Etiquete la columna COMM

SELECT last_name , COALESCE (Comission_Pct, 'sin comision') as comm FROM employees;



