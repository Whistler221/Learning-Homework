create database doktorska_ordinacija;

use doktorska_ordinacija;

create table medicinska_sestra(

    sifra       int,
    ime         varchar(50),
    prezime     varchar(50),
    iban        varchar(50),
    oib         char(11)
);

create table doktor(

    sifra       int,
    ime         varchar(50),
    prezime     varchar(50),
    iban        varchar(50),
    oib         char(11)
);

create table pacijent(
    
    sifra       int,
    ime         varchar(50),
    prezime     varchar(50),
    oib         char(11)
);

create table lijecenje(

    sifra               int,
    doktor              int,
    medicinska_sestra   int,
    pacijent            int,
    trajanje        boolean
);