drop database if exists frizerski_salon;
create database frizerski_salon;

use frizerski_salon;

create table djelatnica(
    sifra   int not null primary key auto_increment,
    iban    varchar(50)
);

create table korisnik(
    sifra   int not null primary key auto_increment,
    osoba   int not null,
    posjeta int not null,
    usluga  int not null
);

create table osoba(
    sifra   int not null primary key auto_increment,
    ime     varchar(50) not null,
    prezime varchar(50) not null
);

create table usluga(
    sifra   int not null primary key auto_increment,
    naziv   varchar(50) not null,
    cijena  decimal(18,2)
);

create table posjeta(
    sifra           int not null primary key auto_increment,
    datum_posjete   datetime not null
);

alter table korisnik add foreign key (osoba) references osoba(sifra);
alter table korisnik add foreign key (posjeta) references posjeta(sifra);
alter table korisnik add foreign key (usluga) references usluga(sifra);