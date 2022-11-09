DROP table IF EXISTS cliente;

create table trabajador(
	id long auto_increment primary key,
	nombre varchar(250),
	apellido varchar(250),
	puesto_trabajo varchar(250),
    salario double
);

insert into trabajador (nombre, apellido,puesto_trabajo) values('Jose','Marin','carpintero',3244);
insert into trabajador (nombre, apellido,puesto_trabajo) values('Juan','Lopez','herrero',2000);
insert into trabajador (nombre, apellido,puesto_trabajo) values('Pedro','Guillem','pintor',2300);
insert into trabajador (nombre, apellido,puesto_trabajo) values('Jordi','Martin','carpintero',3244);
insert into trabajador (nombre, apellido,puesto_trabajo) values('Jonatan','Vicente','herrero',2000);