drop database if exists salon_za_uljepsavanje;
create database salon_za_uljepsavanje;

use salon_za_uljepsavanje;

create table djelatnica(
    sifra       int not null,
    ime         varchar(50),
    prezime     varchar(50),
    oib         int not null,
    iban        varchar(50)
);

create table korisnik(
    sifra       int not null,
    ime         varchar(50),
    prezime     varchar(50),
    oib         int not null
);

create table usluga(
    sifra   int not null,
    naziv   varchar(50),
    cijena  decimal(12.5)
);

create table posjeta(
    sifra int not null,
    djelatnica int not null,
    korisnik int not null
);