-- SQLite
--ADVANCED QUERIES JOIN:

-- 1--Escriba una consulta para el departamento de recursos humanos para producir
-- las direcciones de todos los departamentos. Utilice las tablas de LOCATIONS y
-- COUNTRIES. Muestre la identificación de ubicación, la dirección, la ciudad, el
-- estado o la provincia y el país en la salida. Use una NATURAL JOIN para
-- producir los resultados.
SELECT location_id, street_address, city, state_province, country_id from locations
NATURAL JOIN countries;


-----------------------------------------------------------------------------------

-- 2-- El departamento de recursos humanos necesita un informe de sólo aquellos
-- empleados con los departamentos correspondientes. Escriba una consulta para
-- mostrar el apellido, el número de departamento y el nombre de departamento
-- para estos empleados.

select e.last_name, e.department_id, d.department_name  from employees e
JOIN departments d USING (department_id);

--Other form:


select e.last_name, e.department_id, d.department_name  from employees e
JOIN departments d on e.department_id = d.department_id;


--Other form:


select e.last_name, e.department_id, d.department_name  from employees e
NATURAL JOIN departments d;

----------------------------------------------------------------------------------

-- . El departamento de recursos humanos quiere determinar los nombres de
-- todos los empleados que fueron contratados después de GUY. Cree una
-- consulta para mostrar el nombre y la fecha de contratación de cualquier
-- empleado contratado después del empleado GUY

SELECT e.first_name, e.hire_date from employees e
JOIN employees guy on (e.hire_date > guy.hire_date  and guy.first_name = 'KAREN');
--USAMOS SELFJOIN POR QUE NECESITAMOS RELACIONAR CON LA MISMA TABLA LA CONDICION SE HACE CON NOEQUIJOIN


