drop database if exists vjezba4; 
create database vjezba4 character set utf8;

use vjezba4;

create table zupan(
	sifra 	int not null primary key auto_increment,
	ime 	varchar(50) not null,
	prezime varchar(50) not null
);

create table zupanija(
	sifra int not null primary key auto_increment,
	naziv varchar(50) not null,
	zupan int not null
); 

create table opcina(
	sifra 		int not null primary key auto_increment,
	zupanija 	int not null,
	naziv 		varchar(50) not null
);

create table mjesto(
	sifra 	int not null primary key auto_increment,
	opcina	int not null,
	naziv	varchar(50) not null
);

alter table zupanija add foreign key (zupan) references zupan (sifra);

alter table opcina add foreign key (zupanija) references zupanija (sifra);

alter table mjesto add foreign key (opcina) references opcina (sifra);

insert into zupan (ime, prezime)
values ('ime1', 'prezime1'), #1
		('ime2', 'prezime2'), #2
		('ime3', 'prezime3'); #3
		
insert into zupanija (naziv, zupan)
values ('naziv1', 1), #1
		('naziv2', 2), #2 
		('naziv3', 3); #3
		
insert into opcina (zupanija, naziv)
values (1, 'naziv1'),
		(2, 'naziv2'),
		(3, 'naziv3'),
		(1, 'naziv4'),
		(2, 'naziv5'),
		(3, 'naziv6');
		
insert into mjesto (opcina, naziv)
values (1, 'naziv1'),
		(2, 'naziv2'),
		(3, 'naziv3'),
		(1, 'naziv4'),
		(2, 'naziv5'),
		(3, 'naziv6'),		
		(1, 'naziv7'),
		(2, 'naziv8'),
		(3, 'naziv9'),
		(1, 'naziv10'),
		(2, 'naziv11'),
		(3, 'naziv12');
		
update mjesto set naziv='Batrina' 	 where sifra=6;
update mjesto set naziv='Luzani'	 where sifra=7;
update mjesto set naziv='Oriovac'	 where sifra=8;
update mjesto set naziv='Sibinj' 	 where sifra=9;
update mjesto set naziv='Slobodnica' where sifra=10;

delete from opcina where sifra=5;
delete from opcina where sifra=6;