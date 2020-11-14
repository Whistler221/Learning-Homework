drop database if exists frizerski_salon;
create database frizerski_salon;

use frizerski_salon;

create table djelatnica(
    sifra       int not null primary key auto_increment,
    osoba       int not null,
    usluga      int not null,
    iban        varchar(50)
);

create table korisnik(
    sifra       int not null primary key auto_increment,
    osoba       int not null,
    usluga      int not null,
    posjeta     int not null
);

create table osoba(
    sifra       int not null primary key auto_increment,
    ime         varchar(50),
    prezime     varchar(50)
);

create table usluga(
    sifra   int not null primary key auto_increment,
    naziv   varchar(50) not null,
    cijena  decimal(12,2),
    posjeta int not null
);

create table posjeta(
    sifra       int not null primary key auto_increment,
    djelatnica  int not null,
    korisnik    int not null,
    usluga      int not null
);

alter table korisnik add foreign key (osoba) references osoba(sifra);

alter table djelatnica add foreign key (osoba) references osoba(sifra);

alter table posjeta add foreign key (djelatnica) references djelatnica(sifra);
alter table posjeta add foreign key (korisnik) references korisnik(sifra);

alter table usluga add foreign key (posjeta) references posjeta(sifra);