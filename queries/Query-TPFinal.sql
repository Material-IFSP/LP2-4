Create database AcademiaDB;
use AcademiaDB;

create table tbUsuario (
    nome varchar(50) not null, 
    idade int not null, 
    peso float, 
    altura float, 
    objetivo varchar(30)  
);

select * from tbUsuario;
delete from tbUsuario where idade != 0;