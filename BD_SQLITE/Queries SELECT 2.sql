-- SQLite

-- CONSULTAS SEGUNDA PARTE:
--TRAER CANTIDAD DE DATOS //FILTRAR: SELECCIONAR DATOS DE LA LISTA

SELECT * FROM employees where department_id = 9; --Generación de condición para que traiga solo los que 
-- tienen el valor 9 en la columna department_ID //FILTRO

select employee_id, last_name, department_id from employees where last_name = 'Whalen';


-- LISTAR EMPLEADOS CON SALARIO MAYOR A 7000
select * from employees where salary > 7000;


-- LISTAR POR FECHA
SELECT * FROM EMPLOYEES WHERE HIRE_DATE = '1994-12-07';


-- TRAER DATOS DENTRO DE UN RAGO ESPECIFICO MEDIANTE EL OPERADOR BETWEEN:
select * from employees where salary BETWEEN 5500 and 7900;

-- COMPARAR SI LOS VALORES INDICADOS SE ENCUENTRAN EN LA LISTA
select * from employees where manager_id IN (100,101,201)

-- LIKE:  Traer elementos que tengan un caracter especificado empezando al cadena en este caso K
SELECT employee_id, last_name, department_id FROM EMPLOYEES WHERE last_name LIKE 'K%';


-- LIKE:  BUSCA UN CARACTER EN UN CAMPO: EN CUALQUIER POSICION
SELECT employee_id, last_name, department_id FROM EMPLOYEES WHERE last_name LIKE '%P%';

-- LIKE:  Traer elementos que tengan un caracter especificado TERMINANDO al cadena en este caso S:

SELECT employee_id, last_name, department_id FROM EMPLOYEES WHERE last_name LIKE '%S';

-- LIKE:  Busca todos los caracteres que en su segundo caracter tenga una A: con linea al piso _ :
SELECT employee_id, last_name, department_id FROM EMPLOYEES WHERE last_name LIKE '_a%';



-- LIKE:  Busca todos los caracteres que en su segundo caracter tenga una A: con linea al piso:.
SELECT employee_id, last_name, department_id FROM EMPLOYEES WHERE last_name LIKE '%_a_';



--IS: 

SELECT last_name from employees where Comission_Pct is not null

-- AND:

SELECT employee_id, last_name, job_id, salary FROM employees WHERE salary >= 10000 AND job_id LIKE '%10%';

--OR

  SELECT employee_id, last_name, job_id, salary FROM employees WHERE salary >= 10000 OR job_id LIKE '%MAN%';



--ORDER BY: ORDENAR FILAS: POR DEFECTO
SELECT last_name, hire_date, salary, department_id, salary * 1.1 as new_salary  from employees ORDER by salary;



--ORDER BY: ORDENAR FILAS: DESENDENTE
SELECT last_name, hire_date, salary, department_id, salary * 1.1 as new_salary  from employees ORDER by salary DESC;

-- ORDENAR POR DEPTO:

SELECT last_name, hire_date, salary, department_id, salary * 1.1 as new_salary  from employees ORDER by department_id DESC;

----ORDER BY: ORDENAR FILAS: ASCENDENTE

SELECT last_name, hire_date, salary, department_id, salary * 1.1 as new_salary  from employees ORDER by department_id ASC;


----ORDER BY: ORDENAR FILAS: ASCENDENTE FECHA:

SELECT last_name, hire_date, salary, department_id, salary * 1.1 as new_salary  from employees ORDER by department_id ASC;

-- ORDENAR POR NUMERO DE COLUMNA

SELECT last_name, hire_date, salary, department_id, salary * 1.1 as new_salary  from employees ORDER by 2, 3, 1 ;

-- EJERCICIOS:

-- -- Debido a problemas de presupuesto, el departamento de recursos humanos
-- necesita un informe que muestre el apellido y el salario de los empleados que
-- ganan más de $ 12.000.

SELECT last_name,  salary from employees WHERE SALARY >12000;


--. Cree un informe que muestre el apellido y el número de departamento para el
--número de empleado 176.


SELECT last_name , salary from employees  where employee_id =176


-- El departamento de recursos humanos necesita encontrar empleados con
-- sueldos altos y bajos. Crea un informe para mostrar el apellido y el salario de
-- cualquier empleado cuyo salario no esté en el rango de $ 5.000 a $ 12.000.

select last_name , salary from employees where salary not  BETWEEN 5000 and 12000;


-- --El departamento de recursos humanos necesita un informe que muestre el
-- apellido y la fecha de contratación de todos los empleados que fueron
-- contratados en 1994

select last_name , hire_date from employees where hire_date LIKE "1994%";


-- 10.Muestra todos los apellidos de los empleados en los que la tercera letra del
-- nombre es "a".

SELECT first_name, last_name  FROM employees where first_name like '__a%';



-- Muestre los apellidos de todos los empleados que tienen tanto una "a" como
-- una "e" en su apellido.


select last_name from employees where last_name LIKE "%a%" AND last_name LIKE "%e%";





