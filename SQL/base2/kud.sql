drop database if exists kulturno_umjetnicko_drustvo;
create database kulturno_umjetnicko_drustvo;

use kulturno_umjetnicko_drustvo;

create table clan(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    email varchar(50) not null
);

create table nastup(
    sifra int not null primary key auto_increment,
    zarada decimal(18,2),
    mjesto varchar(50) not null
);

create table nastup_clan(
    sifra int not null primary key auto_increment,
    nastup int not null,
    clan int not null
);


alter table nastup_clan add foreign key (nastup) references nastup(sifra);
alter table nastup_clan add foreign key (clan) references clan(sifra);

insert into clan (ime, prezime, email)
values ('ime1', 'prezime1', 'email@1'),
		('ime2', 'ime2', 'email@2'),
		('ime3', 'prezime3', 'email@3');
		
insert into nastup (zarada, mjesto)
values (5999.99, 'grad1'),
		(12000, 'grad2'),
		(8999.99, 'grad3');
		
insert into nastup_clan (nastup, clan)
values (1, 3),
		(2, 1),
		(3, 2),
		(1, 2);