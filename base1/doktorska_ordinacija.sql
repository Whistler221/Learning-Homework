drop database if exists doktorska_ordinacija;
create database doktorska_ordinacija;

use doktorska_ordinacija;

create table medicinska_sestra(
    sifra       int not null primary key auto_increment,
    iban        varchar(50) not null,
    skupina     int not null,
    osoba       int not null
);

create table doktor(
    sifra       int not null primary key auto_increment,
    iban        varchar(50) not null,
    osoba       int not null
);

create table pacijent(
    sifra       int not null primary key auto_increment,
    skupina     int not null,
    osoba       int not null
);

create table osoba(
    sifra       int not null primary key auto_increment,
    ime         varchar(50) not null,
    prezime     varchar(50) not null,
    oib         char(11)
);

create table skupina(
    sifra               int not null primary key auto_increment,
    medicinska_sestra   int not null,
    pacijent            int not null
);

create table terapija(
    sifra               int not null primary key auto_increment,
    medicinska_sestra   int not null,
    doktor              int not null,
    pacijent            int not null,
    naziv               varchar(50) not null,
    trajanje            datetime  
);

create table lijecenje(

    sifra               int not null primary key auto_increment,
    medicinska_sestra   int not null,
    pacijent            int not null,
    doktor              int not null,
    terapija            int not null,
    skupina             int not null,
    trajanje            boolean
);

--kurva_spjerdala

alter table medicinska_sestra add foreign key (osoba) references osoba(sifra);
alter table doktor add foreign key (osoba) references osoba (sifra);
alter table pacijent add foreign key (osoba) references osoba (sifra);

alter table skupina add foreign key (medicinska_sestra) references medicinska_sestra (sifra);
alter table skupina add foreign key (pacijent) references pacijent (sifra);

alter table terapija add foreign key (medicinska_sestra) references medicinska_sestra (sifra);
alter table terapija add foreign key (doktor) references doktor (sifra);

alter table lijecenje add foreign key (terapija) references terapija (sifra);