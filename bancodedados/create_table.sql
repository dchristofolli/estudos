use estudos;
create table pessoas(
	id int(10) auto_increment,
	nome varchar(50) not null,
	ano_nascimento int(4) not null,
	primary key(id)
);