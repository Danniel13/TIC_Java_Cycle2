-- SQLite
-- CREATE TABLE Customers (
-- personID integer,
-- lastName varchar(255),
-- firstName varchar(255),
-- address varchar(100),
-- city varchar(100));


-- CREATE TABLE Orders (
--   ID integer NOT NULL,
--   Numero INTEGER NOT NULL, 
-- ------CREACION FECHA DEFAULT COMO CAMPO QUE BOTA FECHA ACTUAL------
--   Fecha DATE DEFAULT CURRENT_DATE,
--   ID_Persona INTEGER NOT NULL,
--   CONSTRAINT Orders_PK PRIMARY KEY (ID),
--   CONSTRAINT Orders_Num_UQ UNIQUE (numero),
-- --------Creación de relación y asignación de llave foranea:---------
--   CONSTRAINT Ordenes_Persona_FK FOREIGN KEY (ID_PERSONA) REFERENCES Persona (ID)
-- );
  

-- CREATE TABLE Test (ID integer)

-- create table Persona(
--   ID INTEGER NOT NULL,
--   LastName VARCHAR(100) NOT NULL,
--   FirstName VARCHAR(100) NOT NULL,
--   Age INTEGER,
--   Email VARCHAR(50) NOT NULL,
--   CONSTRAINT persona_email_unique UNIQUE (Email),-- ->Creación de campo unico no permitira elementos repetidos en esta columna "email"
--   CONSTRAINT Persona_PK PRIMARY KEY (ID)--CONSTRAINT para asignar llave primaria a un elemento de la tabla
-- );




