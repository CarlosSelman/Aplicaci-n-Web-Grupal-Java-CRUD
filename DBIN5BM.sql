drop database if exists ProyectoIN5BM;
create database ProyectoIN5BM;
use ProyectoIN5BM;

create table Persona(
    codigoPersona int not null auto_increment primary key,
    DPI varchar(15) not null,
    NombrePersona varchar(200) not null
);
insert into persona(DPI, NombrePersona) values (2018325,'Carlos Andrés Selman David');
insert into persona(DPI, NombrePersona) values (2016228,'Martín Alejandro Tecun Charles');
insert into persona(DPI, NombrePersona) values (2019038,'Antony Josué Toribio Pérez');
insert into persona(DPI, NombrePersona) values (2019017,'Oscar Joaquín Sián Orón');
insert into persona(DPI, NombrePersona) values (2016262,'Juan José Rodas Mansilla');
insert into persona(DPI, NombrePersona) values (2016243,'José Andrés Subuyuj Guzmán');
insert into persona(DPI, NombrePersona) values (2019041,'Jorge Eduardo Morataya Socop');
insert into persona(DPI, NombrePersona) values (2019047,'Luis Rodrigo Morales Florián');
insert into persona(DPI, NombrePersona) values (2016497,'José Alejandro Zuñiga Collado');
insert into persona(DPI, NombrePersona) values (2019035,'Fredy Jose Daniel Reyes Saban');