DROP table IF EXISTS trabajador;

create table trabajador(
	id long auto_increment primary key,
	nombre varchar(250),
	apellido varchar(250),
	puesto_trabajo varchar(250),
	salario double);

insert into trabajador(nombre,apellido,puesto_trabajo, salario) values('Jose','Marin','carpintero',1111);
insert into trabajador(nombre,apellido,puesto_trabajo, salario) values('Juan','Lopez','herrero',2222);
insert into trabajador(nombre,apellido,puesto_trabajo, salario) values('Pedro','Guillem','pintor',3333);
insert into trabajador(nombre,apellido,puesto_trabajo, salario) values('Jordi','Martin','carpintero',4444);
insert into trabajador(nombre,apellido,puesto_trabajo, salario) values('Jonatan','Vicente','herrero',5555);