DROP table IF EXISTS trabajador;

create table trabajador(
	id long auto_increment primary key,
	nombre varchar(250),
	apellido varchar(250),
	puesto_trabajo varchar(250),
	salario double);

insert into trabajador(nombre,apellido,puesto_trabajo,salario) values('Jose','Marin','carpintero',3244);
insert into trabajador(nombre,apellido,puesto_trabajo,salario) values('Juan','Lopez','herrero',2000);
insert into trabajador(nombre,apellido,puesto_trabajo,salario) values('Pedro','Guillem','pintor',2300);
insert into trabajador(nombre,apellido,puesto_trabajo,salario) values('Jordi','Martin','carpintero',3244);
insert into trabajador(nombre,apellido,puesto_trabajo,salario) values('Jonatan','Vicente','herrero',2000);