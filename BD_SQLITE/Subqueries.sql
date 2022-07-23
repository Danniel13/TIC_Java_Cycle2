-- SQLite
--SUBQUERIES
--Es tener la posibilidad de hacer una consulta previa para obtener un valor y crear 

select salary from employees
where first_name='PAYAM';



--------------SUBCONSULTAS FILA UNICA-------------------

--LISTANDO TODOS LOS EMPLEADOS QUE GANEN MENOS SALARIO QUE PAYAM: SUBCONSULTA ENTRE PARENTESIS
SELECT last_name, salary FROM employees
WHERE salary< (
  SELECT salary FROM employees --SUBCONSULTA SOLO DEBE TRAER UNA FILA UNA COLUMNA
  WHERE first_name = 'PAYAM'
)
ORDER BY salary DESC;



--SUB CONSULTA QUE TRAE LOS DE ID DE TRABAJO IGUAL A VALLI Y MAYOR SALARIO QUE VALLI
select last_name, job_id,job_title , salary from employees
natural JOIN jobs --join para traer el nombre del trabajo!!

where job_id = (
  select job_id from employees
  where first_name = 'VALLI'
)
AND salary > (
  SELECT salary FROM employees
  WHERE first_name = 'VALLI'
);




--------------SUBCONSULTAS MULTIFILA-------------------

SELECT * FROM departments
WHERE location_id = 1700;

--IN:
select last_name, department_id from employees 
where department_id IN (  --Tiene que ser IN para COMPARAR MULTIPLES ELEMENTOS
  SELECT department_id 
  from departments
  WHERE location_id = 1700
);


--NOT IN:
select last_name, department_id from employees 
where department_id Not IN (  --Tiene que ser IN para hacer una comparacion con varios
  SELECT department_id 
  from departments
  WHERE location_id = 1700
);


---SUBCONSULTAS COMO TABLA:

SELECT ROUND  (AVG(average_salary), 0)From (
select avg(Salary) average_salary
from employees
group by department_id
) department_salary;
