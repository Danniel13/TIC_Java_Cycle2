-- SQLite
--Insert: Para insertar datos en tabla

--Insert a apartir de una consulta select:

create TABLE sales_reps(
  id INT(10),
  last_name varchar(20),
  salary float (10),
  comission_pct float(30));



--INSERTA DATOS DE OTRA TABLA CON LOS DATOS RELACIONADOS TENIENDO EN CUENTA EL JOBID: 5

INSERT INTO sales_reps(id, last_name, salary, Comission_Pct)
SELECT employee_id, last_name, salary, Comission_Pct from employees
where job_id like '%5%';


select * from sales_reps;



--------------------------------------------------------------------------------------
-- UBDATE 

UPDATE employees --SELECCION DE TABLA
SET department_id = 50 -- INSERTAR VALOR DE 50 EN:
WHERE employee_id = 113-- EL EMPLOYEE ID= 113


--SI SE DEJA SIN WHERE HACE LA ACTUALIZACION A TODA LA TABLA 
UPDATE employees 
SET department_id = 50

----------------------------------------------------------------------------------------
-- DELETE

select * from departments
where department_name = 'Finance';

select * from departments;


DELETE FROM departments
WHERE department_name = 'Finance';


