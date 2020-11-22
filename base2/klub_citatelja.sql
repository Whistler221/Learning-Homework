drop database if exists klub_citatelja;
create database klub_citatelja;

use klub_citatelja;

create table clan(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    email varchar(50) not null
);

create table knjiga(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    vrsta varchar(50) not null,
    vlasnik int not null
);

create table clan_knjiga(
    sifra int not null primary key auto_increment,
    clan int not null,
    knjiga int not null,
    stanje boolean
);


alter table knjiga add foreign key (vlasnik) references clan(sifra);

alter table clan_knjiga add foreign key (clan) references clan(sifra);
alter table clan_knjiga add foreign key (knjiga) references knjiga(sifra);

insert into clan (ime, prezime, email)
values ('ime1', 'prezime1', 'email@1'),
		('ime2', 'prezime2', 'email@2'),
		('ime3', 'prezime3', 'email@3');
		
insert into knjiga (naziv, vrsta, vlasnik)
values ('naziv1', 'vrsta1', 1),
		('naziv2','vrsta2', 2);
		
insert into clan_knjiga (clan, knjiga, stanje)
values (1, 1, 1),
		(2, 1 , 1),
		(3, 2, 1),
		(1, 2, 1);