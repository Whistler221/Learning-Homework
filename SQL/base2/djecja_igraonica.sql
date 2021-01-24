drop database if exists djecja_igraonica;
create database djecja_igraonica character set utf8;

use djecja_igraonica;

create table dijete(
    sifra int not null primary key auto_increment,
    ime 			varchar(50) not null,
    prezime 		varchar(50) not null,
    broj_roditelja 	varchar(50) not null
);

create table odgajatelj(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    email varchar(50) not null
);

create table skupina(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    odgajatelj int not null
);

create table skupina_dijete(
    sifra int not null primary key auto_increment,
    skupina int not null,
    dijete int not null
);


alter table skupina add foreign key (odgajatelj) references odgajatelj(sifra);

alter table skupina_dijete add foreign key (skupina) references skupina(sifra);
alter table skupina_dijete add foreign key (dijete) references dijete(sifra);

insert into dijete (ime, prezime ,broj_roditelja)
values ('Dario', 'Simmic', '+385 98 182 9468'),
		('Marin', 'Jurkovic', '+385 98 566 9784'),
		('Ivan', 'Opacak', '+385 95 756 4913');
		
insert into odgajatelj (ime, prezime, email)
values ('Stjepan', 'Visnjic', 'stjepan21@gmail.com'),
		('Ivica', 'Strgar', 'ivica31@gmail.com'),
		('Goran', 'Abramovic', 'goran24@gmail.com');
		
insert into skupina (naziv,odgajatelj)
values ('naziv1', 1),
		('naziv2', 2),
		('naziv3', 3);
		
insert into skupina_dijete (skupina,dijete)
values (1, 2),
		(2, 1),
		(3, 1),
		(1, 3),
		(2, 2);