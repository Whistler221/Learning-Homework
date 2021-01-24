drop database if exists urar_silvija;
create database urar_silvija;

use urar_silvija;

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    broj_mobitela int    
);
create table urar(
    sifra int not null primary key auto_increment,
    osoba int not null,
    iban varchar(50)
);

create table segrt(
    sifra int not null primary key auto_increment,
    osoba int not null,
    iban varchar(50)
);

create table sat(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    vrsta varchar(50) not null,
    vlasnik int not null
);

create table popravak(
    sifra int not null primary key auto_increment,
    urar int not null,
    segrt int,
    cijena decimal(18,2)
);

create table popravak_sat(
    sifra int not null primary key auto_increment,
    popravak int not null,
    sat int not null
);


alter table urar add foreign key (osoba) references osoba(sifra);

alter table segrt add foreign key (osoba) references osoba(sifra);

alter table sat add foreign key (vlasnik) references osoba(sifra);

alter table popravak add foreign key (urar) references urar(sifra);
alter table popravak add foreign key (segrt) references segrt(sifra);

alter table popravak_sat add foreign key (popravak) references popravak(sifra);
alter table popravak_sat add foreign key (sat) references sat(sifra);