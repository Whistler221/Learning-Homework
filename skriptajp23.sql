# winr+r, upisi cmd te zaljepi sljedecu liniju (prilagoditi putanje - diskove)
# c:\xampp\mysql\bin\mysql -uedunova -pedunova < D:\skriptajp23.sql
drop database if exists edunovajp23;
create database edunovajp23;

use edunovajp23;

create table smjer(
    sifra       int not null primary key auto_increment,
    naziv       varchar(50) not null,
    cijena      decimal(18,2),
    trajanje    int ,
    verificiran boolean 
);

create table grupa(
    sifra           int not null primary key auto_increment,
    naziv           varchar(20) not null,
    smjer           int not null,
    predavac        int,
    datumpocetka    datetime,
    brojpolaznika       int not null
);

create table osoba (
        sifra   int not null primary key auto_increment,
        ime     varchar(50) not null,
        prezime varchar(50) not null,
        oib     char(11),
        email   varchar(50) not null
);

create table predavac(
    sifra   int not null primary key auto_increment,
    osoba   int not null,
    iban    varchar(50) # komentar
);

create table polaznik(
    sifra   int not null primary key auto_increment,
    osoba   int not null,
    ime     varchar(50) not null,
    prezime varchar(50) not null,
    oib     char(11),
    email   varchar(50)not null,
    iban    varchar(50)
);

create table clan(
    grupa       int not null,
    polaznik    int not null
);

alter table grupa add foreign key (smjer) references smjer (sifra);
alter table grupa add foreign key (predavac) references predavac (sifra);

alter table predavac add foreign key (osoba) references osoba (sifra);

alter table polaznik add foreign key (osoba) references osoba (sifra);

alter table clan add foreign key (grupa) references grupa (sifra);
alter table clan add foreign key (polaznik) references polaznik (sifra);