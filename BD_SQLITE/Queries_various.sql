-- SQLite

-- Alter table: Add new colum:
-- ALTER TABLE malo add column nombre varchar(100); 
-- ALTER TABLE malo add COLUMN Fecha DATE;
-- ALTER TABLE Persona add COLUMN Email VARCHAR(100)  NOT NULL;


-- -- Borrar una tabla:
-- DROP TABLE malo;


-- --DELETE COLUMN: Alter table
-- ALTER TABLE Test drop column nombre;


--AGREGANDO RESTRICCIONES:

--AGREGANDO NOT NULL:
-- ALTER TABLE Persona MODIFY Age INTEGER NOT NULL;

--ADD CONSTRAINT -->No permite sqlite sirve para asignar a algun campo
--ya creado el UNIQUE.

-- CONSTRAINT persona_email_unique UNIQUE (Email),-- ->Creación de campo unico no permitira elementos repetidos en esta columna "email"
-- CONSTRAINT Persona_PK PRIMARY KEY (ID)--CONSTRAINT para asignar llave primaria a un elemento de la tabla


-------Creación de relación y asignación de llave foranea:---------
--   CONSTRAINT Ordenes_Persona_FK FOREIGN KEY (ID_PERSONA) REFERENCES Persona (ID)


-- ------CREACION FECHA DEFAULT COMO CAMPO QUE BOTA FECHA ACTUAL------
--   Fecha DATE DEFAULT CURRENT_DATE,



-- ---Creación campo con restricción: -----
-- CONSTRAINT CHK_Person CHECK (Age>=18)