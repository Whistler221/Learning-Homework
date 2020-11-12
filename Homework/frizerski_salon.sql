drop database if exists frizerski_salon;
create database frizerski_salon;

use frizerski_salon;

create table djelatnica(
    sifra int,
    ime varchar(50),
    prezime varchar(50),
    iban varchar(50)
);

create table korisnik(
    sifra int,
    ime varchar(50),
    prezime varchar(50)
);

create table usluga(
    sifra int,
    naziv varchar(50),
    cijena decimal(18,2)
);

create table posjeta(
    sifra int,
    korisnik int,
    djelatnica int,
    usluga int
);