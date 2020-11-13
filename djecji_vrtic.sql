drop database if exists djecji_vrtic;
create database djecji_vrtic;

use djecji_vrtic;

create table skupina(
    sifra       int not null primary key auto_increment,
    naziv       varchar(50) not null,
    odgajatelj  int not null,
    dijete      int not null,
    broj_dijece int not null
);

create table dijete(
    sifra           int not null primary key auto_increment,
    ime             varchar(50) not null,
    prezime         varchar(50) not null,
    skupina         int not null,
    broj_roditelja  int not null
);

create table odgajatelj(
    sifra   int not null primary key auto_increment,
    ime     varchar(50) not null,
    prezime varchar(50) not null,
    osoba   int not null,
    iban    varchar(50)
);

alter table skupina add foreign key (dijete) references dijete (sifra);

alter table skupina add foreign key (odgajatelj) references odgajatelj (sifra);