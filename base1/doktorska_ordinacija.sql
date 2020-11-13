drop database if exists doktorska_ordinacija;
create database doktorska_ordinacija;

use doktorska_ordinacija;

create table medicinska_sestra(

    sifra       int not null primary key auto_increment,
    ime         varchar(50) not null,
    prezime     varchar(50) not null,
    iban        varchar(50),
    oib         char(11)
);

create table doktor(

    sifra       int not null primary key auto_increment,
    ime         varchar(50) not null,
    prezime     varchar(50) not null,
    iban        varchar(50),
    oib         char(11)
);

create table pacijent(
    
    sifra       int not null primary key auto_increment,
    ime         varchar(50) not null,
    prezime     varchar(50) not null,
    skupina     int not null,
    oib         char(11)
);

create table lijecenje(

    sifra               int not null primary key auto_increment,
    doktor              int not null,
    medicinska_sestra   int not null,
    pacijent            int not null,
    skupina             int not null,
    trajanje            boolean
);

alter table lijecenje add foreign key (doktor) references doktor(sifra);

alter table lijecenje add foreign key (medicinska_sestra) references medicinska_sestra(sifra);

alter table pacijent add foreign key (skupina) references lijecenje (sifra);