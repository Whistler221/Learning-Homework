drop database if exists muzej;
create database muzej;

use muzej;

create table izlozba(
    sifra   int not null primary key auto_increment,
    sponzor int not null
);

create table djelo(
    sifra   int not null primary key auto_increment,
    naziv   varchar(50) not null,
    izlozba int not null
);

create table kustos(
    sifra   int not null primary key auto_increment,
    ime     varchar(50) not null,
    prezime varchar(50)not null,
    izlozba int not null
);

create table sponzor(
    sifra   int not null primary key auto_increment,
    naziv   varchar(50) not null
);

alter table djelo
    add foreign key (izlozba) references izlozba(sifra);

alter table kustos
    add foreign key (izlozba) references izlozba(sifra);

alter table izlozba
    add foreign key (sponzor) references sponzor(sifra);
    
insert into sponzor (naziv)
values ('naziv1'),
		('naziv2'),
		('naziv3');
		
insert into izlozba (sponzor)
values (1),
		(2),
		(3);
		
insert into djelo (naziv, izlozba)
values ('naziv1', 1),
		('naziv2', 2),
		('naziv3', 3);
		
insert into kustos (ime, prezime, izlozba)
values ('ime1', 'prezime1', 1),
		('ime2', 'prezime2', 2),
		('Ime3', 'prezime3', 3);