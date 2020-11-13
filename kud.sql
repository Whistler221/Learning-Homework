drop database if exists kulturno_umjetnicko_drustvo;
create database kulturno_umjetnicko_drustvo;

use kulturno_umjetnicko_drustvo;

create table clan(
    sifra int,
    ime varchar(50),
    prezime varchar(50),
    email varchar(50)
);

create table nastup(
    sifra int,
    zarada decimal(18,2),
    mjesto varchar(50)
);

create table nastup_clan(
    sifra int,
    nastup int,
    clan int
);