drop database if exists djecja_igraonica;
create database djecja_igraonica;

use djecja_igraonica

create table dijete(
    
    sifra           int,
    ime             varchar(50),
    prezime         varchar(50),
    broj_roditelja  int
);

create table dadilja(
    
    sifra   int,
    ime     varchar(50),
    prezime varchar(50),
    email   varchar(50)
);

create table skupina(
    
    sifra   int,
    naziv   varchar(50),
    dadilja int
);

create table skupina_dijete(

    sifra   int,
    skupina int,
    dijete  int
);