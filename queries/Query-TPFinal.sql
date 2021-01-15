Create database AcademiaDB;
use AcademiaDB;

create table tbUsuario (
	id int auto_increment not null,
    nome varchar(50) not null, 
    idade int not null, 
    peso decimal(3,2), 
    altura decimal(3, 2), 
    objetivo varchar(30),
    primary key (id)
);

select * from tbUsuario;