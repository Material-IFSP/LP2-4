-- Criando banco 
create database aulajava;

use aulajava;

-- criando as tabelas
create table tbFuncs (
	cod_Func int auto_increment Not NULL,
	nome_Func char(30),
    sal_Func decimal(10, 2),
    cod_Cargo smallint,
    primary key(cod_Func)
);
create table tbCargos (
	cd_cargo smallint not null,
    ds_cargo char(20),
    primary key(cd_cargo)
);

-- Adicionando relacionamentos entre as tabelas
ALTER TABLE tbFuncs ADD CONSTRAINT `fk_Funcs_Cargos` FOREIGN KEY ( `cod_Cargo` ) REFERENCES tbCargos ( `cd_cargo` );

-- Inserindo valores nas tabelas de Cargos
insert into tbCargos values (1, "Desenvolvedor .NET" );
insert into tbCargos values	(2, "Dev. Angular"); 
insert into tbCargos values (3, "Dev. Python");
insert into tbCargos values (4, "Dev. Java");
select * from tbCargos;

-- Inserindo valores nas tabelas de Funcionarios
insert into tbFuncs values(1, "Anderson", 4600, 2);
insert into tbFuncs values(2, 'Angelo', 3500, 1);
insert into tbFuncs values(3, 'Grazy', 5000, 3);
insert into tbFuncs values(4, 'Elessão', 500, 4);
insert into tbFuncs values(5, 'Renatuu', 5500, 4);
SELECT * FROM tbFuncs WHERE nome_Func like "%Renatuu%";
