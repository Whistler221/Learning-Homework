drop database if exists djecji_vrtic;
create database djecji_vrtic;

use djecji_vrtic;

create table dijete(
    sifra           int not null primary key auto_increment,
    ime             varchar(50) not null,
    prezime         varchar(50) not null,
    odgojna_skupina int not null
);

create table odgajateljica(
    sifra           int not null primary key auto_increment,
    strucna_sprema   int not null,
    oib             char(11),
    ime             varchar(50) not null,
    prezime         varchar(50) not null
);

create table strucna_sprema(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null
);

create table odgojna_skupina(
    sifra   int not null primary key auto_increment,
    odgajateljica int not null,
    broj_dijece int not null
);

alter table odgojna_skupina add foreign key (odgajateljica) references odgajateljica(sifra);

alter table dijete add foreign key (odgojna_skupina) references odgojna_skupina(sifra);

alter table odgajateljica add foreign key (strucna_sprema) references strucna_sprema(sifra);

insert into strucna_sprema (naziv)
values ('SSS'),
		('VSS');
		
insert into odgajateljica (strucna_sprema, oib, ime, prezime)
values (1, '87642558419', 'Sandra', 'Misic'),
		(2, '01751115946', 'Marija', 'Nisic');
		
insert into odgojna_skupina (odgajateljica, broj_dijece)
values (1, 14),
		(2, 16);
		
insert into dijete (ime, prezime, odgojna_skupina)
values ('Dado', 'Radic', 1),
		('Stjepan', 'Kovacic', 2);