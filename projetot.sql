-- Criando o banco de dados 
create database projeto;

-- Usando o banco de dados 'projeto'
use projeto;

-- Criando as tabelas
create table empresa(
id_empresa 	 	varchar(45) primary key default(uuid()), -- UUID é para criar um id bem mais dificil automáticamente
nome 			varchar(45) unique not null,
email_comercial varchar(45) not null,
senha 			varchar(45) not null,
CNPJ 			varchar (45) 
);

create table usuario(
id_usuario 	varchar(45) primary key default(uuid()),
email 		varchar(45) not null,
senha 		varchar(45) not null,
nome 		varchar(45) not null
);

create table avaliacao(
id_avaliacao 	integer auto_increment primary key,
id_usuario 		varchar(45),
titulo			varchar(45),
nota 			real,
texto 			text not null,
foreign key(id_usuario) references usuario(id_usuario)
);

create table comentario(
id 				integer auto_increment primary key,
texto 			text not null,
id_autor 		varchar(45),
id_avaliacao 	integer,
id_comentario   integer,
foreign key(id_autor) references usuario(id_usuario),
foreign key (id_avaliacao) references avaliacao(id_avaliacao),
foreign key (id_comentario) references comentario(id_comentario)
);
alter table comentario
add column data_comentario date;

create table resposta(
id 					integer auto_increment primary key,
texto 				text not null,
data_resposta 		date not null,
id_usuario		 	varchar(45),
id_empresa 			varchar(45),
foreign key (id_usuario) references usuario(id_usuario),
foreign key (id_empresa) references empresa(id_empresa)
);

-- Inserindo valores nas tabelas
insert into usuario values(default, "pedro@gmail.com", "123456", "Pedro");

insert into usuario values(default, "joao@gmail.com", "67898", "Joao");

insert into empresa values(default,"Padaria Dois Irmãos", "Empresa@gmail.com", "6000004", "1134522467");

insert into avaliacao values(null,"f7272d8a-d35b-11ef-9ad8-0a0027000002", "Reclamação a padaria que não funciona direito", 10, "a empresa trabalha com pães");

insert into resposta values(null, "Estaremos reolvendo seu problema","2025-01-15", "f7272d8a-d35b-11ef-9ad8-0a0027000002", "f8735769-d35b-11ef-9ad8-0a0027000002");

insert into comentario values(null, "A empresa está de parabens pelo serviço prestado", "f7272d8a-d35b-11ef-9ad8-0a0027000002", 1, 1);