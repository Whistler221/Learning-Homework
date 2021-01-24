drop database if exists taksi_sluzba;
create database taksi_sluzba;

use taksi_sluzba;

create table vozilo(
    sifra int not null primary key auto_increment,
    registracija varchar(10) not null,
    vozac int not null
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    broj_mobitela int not null
);

create table vozac(
    sifra int not null primary key auto_increment,
    osoba int not null,
    iban varchar(50)
);

create table putnik(
    sifra int not null primary key auto_increment,
    osoba int not null
);

create table voznja(
    sifra int not null primary key auto_increment,
    vozilo int not null,
    prijedena_putanja int
);

create table voznja_putnik(
    voznja int not null,
    putnik int not null
);


alter table vozilo add foreign key (vozac) references vozac(sifra);

alter table vozac add foreign key (osoba) references osoba(sifra);

alter table putnik add foreign key (osoba) references osoba(sifra);

alter table voznja add foreign key (vozilo) references vozilo(sifra);

alter table voznja_putnik add foreign key (voznja) references voznja(sifra);
alter table voznja_putnik add foreign key (putnik) references putnik(sifra);