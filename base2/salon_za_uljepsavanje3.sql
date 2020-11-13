drop database if exists salon_za_uljepsavanje;
create database salon_za_uljepsavanje;

use salon_za_uljepsavanje;

create table djelatnica(
    oib         char(11) not null primary key,
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
    cijena  decimal(12,2)
);

create table posjeta(
    sifra       int not null primary key auto_increment,
    djelatnica  int not null,
    korisnik    int not null,
    usluga      int not null
);

alter table korisnik add foreign key (osoba) references osoba(sifra);
alter table korisnik add foreign key (usluga) references usluga(sifra);
alter table korisnik add foreign key (posjeta) references posjeta(sifra);

alter table djelatnica add foreign key (osoba) references osoba(sifra);
alter table djelatnica add foreign key (usluga) references usluga(sifra);