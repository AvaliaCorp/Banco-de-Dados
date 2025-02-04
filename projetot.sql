-- Criando o banco de dados 
create database projeto;

-- Usando o banco de dados 'projeto'
use projeto;

-- Criando as tabelas
create table if not exists empresa(
id_empresa 	 	varchar(45) primary key default(uuid()), -- UUID é para criar um id bem mais dificil automáticamente
nome 			varchar(45) unique not null,
email_comercial varchar(45) not null,
senha 			varchar(45) not null,
CNPJ 			varchar (45) 
);

create table if not exists usuario(
id_usuario 	varchar(45) primary key default(uuid()),
email 		varchar(45) not null,
senha 		varchar(45) not null,
nome 		varchar(45) not null,
version long
);

create table if not exists avaliacao(
id_avaliacao 	integer auto_increment primary key,
id_usuario 		varchar(45),
titulo			varchar(45),
nota 			real,
texto 			text not null,
status boolean default(false),
foreign key(id_usuario) references usuario(id_usuario) on delete cascade
);

create table if not exists comentario(
id 				integer auto_increment primary key,
texto 			text not null,
id_autor 		varchar(45),
id_avaliacao 	integer,
id_comentario   integer,
foreign key(id_autor) references usuario(id_usuario) on delete cascade,
foreign key (id_avaliacao) references avaliacao(id_avaliacao) on delete cascade,
foreign key (id_comentario) references comentario(id) on delete cascade
);
alter table comentario
add column data_comentario date;

create table if not exists resposta(
id 					integer auto_increment primary key,
texto 				text not null,
data_resposta 		date not null,
id_usuario		 	varchar(45),
id_empresa 			varchar(45),
foreign key (id_usuario) references usuario(id_usuario) on delete cascade,
foreign key (id_empresa) references empresa(id_empresa) on delete cascade
);

create table if not exists likes(
id_usuario varchar(45),
id_comentario integer,
id_avaliacao integer,
foreign key (id_usuario) references usuario(id_usuario)on delete set null,
foreign key (id_comentario) references comentario(id_comentario) on delete cascade,
foreign key (id_avaliacao) references avaliacao(id_avaliacao) on delete cascade
);

-- Inserindo valores nas tabelas
insert into usuario values(default, "pedro@gmail.com", "123456", "Pedro", '1');

insert into usuario values(default, "joao@gmail.com", "67898", "Joao", "2");
select * from usuario;

insert into empresa values(default,"Padaria Dois Irmãos", "Empresa@gmail.com", "6000004", "1134522467");
select * from empresa;

insert into avaliacao values(default,"505d345e-e2f3-11ef-b41d-10dcb6258f69", "Reclamação a padaria que não funciona direito", 10, "a empresa trabalha com pães", "2");
select * from avaliacao;

insert into comentario values(default, "A empresa está de parabens pelo serviço prestado", "59069449-de5b-11ef-8429-0a0027000002", 1, null,  "2024-01-15");
insert into resposta values(null, "Estaremos reolvendo seu problema","2025-01-15", "5497fcd6-dd76-11ef-b5ca-10dcb6258f69", "54a87468-dd76-11ef-b5ca-10dcb6258f69");

insert into likes values('59069449-de5b-11ef-8429-0a0027000002', '' );

