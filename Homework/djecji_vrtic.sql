drop database if exists djecji_vrtic;
create database djecji_vrtic;

use djecji_vrtic;

create table skupina(
    sifra       int,
    naziv       varchar(50),
    odgajatelj  int,
    broj_dijece int
);

create table dijete(
    sifra           int,
    ime             varchar(50),
    prezime         varchar(50),
    broj_roditelja  int
);

create table odgajatelj(
    sifra   int,
    ime     varchar(50),
    prezime varchar(50),
    iban    varchar(50)
);