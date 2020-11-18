drop database if exists vjezba3;
create database vjezba3 character set utf8;
use vjezba3;

create table programerski_jezik(
	sifra 	int not null primary key auto_increment,
	ime 	varchar(50) not null
);

create table kategorija(
	sifra	int not null primary key auto_increment,
	ime 	varchar(50) not null
);

create table kategorija_programerski_jezik(
	programerski_jezik 	int not null,
	kategorija			int not null
);

alter table kategorija_programerski_jezik add foreign key (programerski_jezik) references programerski_jezik (sifra);

alter table kategorija_programerski_jezik add foreign key (kategorija) references kategorija (sifra);

insert into programerski_jezik(ime) values 
											("Java"), #1
											("Swift"), #2
											("PHP"), #3
											("Go"); #4
	
insert into kategorija(ime) values
									("oop"), #1
									("osx"), #2
									("linux"), #3
									("win"); #4
									
insert into kategorija_programerski_jezik (programerski_jezik, kategorija) values 
																					(1,1),
																					(1,4),
																					(1,2),
																					(2,2),
																					(3,1),
																					(3,3),
																					(3,4),
																					(4,3),
																					(4,2);