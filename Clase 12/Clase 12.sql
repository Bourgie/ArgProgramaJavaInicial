
-- creo base de datos
create database Qatar2022;


-- verifico que se creo la bd correctamente
show databases;



-- entro a la base de datos creada para poder crear las tablas
use Qatar2022; 




-- controlo que no tenga tablas y sea accesible
show tables;



-- crear una tabla en la base de datos
create table Empleado( IdEmpleado int not null
                      ,DNI int not null
                      ,nombre varchar(65)
                      ,apellido varchar(65)
                      ,nacionalidad varchar(45)
                      , Depto varchar(45)
                      );
                      
                      
-- controlo que se haya creado bien la tabla
show tables; 



-- Veo los campos dentro de la tabla        
desc empleado;          

   
-- Creo clave primaria y la hago autoincremental
alter table empleado add primary key (IdEmpleado);


-- Clave primaria: la hago autoincremental
alter table empleado modify IdEmpleado int auto_increment;

--  Insertar un empleado nuevo en la nómina de trabajo.
INSERT INTO empleado (DNI,nombre,apellido,nacionalidad,Depto)
VALUES(99888777,'Lionel Andrés','Messi','Argentino','sistemas');

INSERT INTO empleado (DNI,nombre,apellido,nacionalidad,Depto)
VALUES(11222333,'Emiliano','Martinez','Argentino','mantenimiento');

INSERT INTO empleado (DNI,nombre,apellido,nacionalidad,Depto)
VALUES(44555666,'Enzo','Perez','Argentino','logistica');

INSERT INTO empleado (DNI,nombre,apellido,nacionalidad,Depto)
VALUES(44555666,'Diego','Ramiro','Argentino','dev java');

INSERT INTO empleado (DNI,nombre,apellido,nacionalidad,Depto)
VALUES(55533332,'Nicolas','Bourgie','Argentino','dev java');

-- Seleccionamos y mostramos todos(*) los datos de la tabla 
select * from empleado;

--  Conocer los empleados que trabajan en el departamento de “logística” (puede ser cualquiera de los que agreguen).

select * from empleado where Depto= 'logistica';

-- Seleccionamos fila y algunas columnas tabla con where
select  Depto, apellido, nombre as Nombre from empleado where Depto= 'logistica';


--  Modificar la nacionalidad de algún empleado.
UPDATE empleado SET DNI = 55222333, nombre = 'Nicolas', apellido = 'Bourgie', Nacionalidad='Italiano'
WHERE IdEmpleado = 5;

--  Eliminar un departamento.
delete from empleado where depto=sistemas;

--  Mostrar todos los departamentos ordenados alfabéticamente.
select Depto from Empleado order by Depto asc;
