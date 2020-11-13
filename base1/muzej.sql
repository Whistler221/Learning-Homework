drop database if exists muzej;
create database muzej;

use muzej;

create table izlozba(
    sifra int,
    broj_djela int,
    kustos int,
    sponzor int
);

create table djelo(
    sifra int,
    naziv varchar(50),
    autor int,
    cijena decimal(18,2)
);

create table autor(
    sifra int,
    ime varchar(50),
    prezime varchar(50)
);

create table kustos(
    sifra int,
    ime varchar(50),
    prezime varchar(50),
    email varchar(50)
);

create table sponzor(
    sifra int,
    naziv varchar(50),
    iznos decimal(18,2)
);