Create database AcademiaDB;
use AcademiaDB;

create table tbUsuario (
    nome varchar(50) not null, 
    idade int not null, 
    peso float, 
    altura float, 
    objetivo varchar(30)  
);

drop table tbUsuario;
select * from tbUsuario;
