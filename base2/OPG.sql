drop database if exists obiteljsko_poljoprivredno_gospodarstvo;
create database obiteljsko_poljoprivredno_gospodarstvo;

use obiteljsko_poljoprivredno_gospodarstvo;

create table proizvod(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    cijena decimal(18,2)
);

create table djelatnik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    iban varchar(50)
);

create table sirovina(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    kolicina int
);

create table proizvod_sirovina(
    sifra int not null primary key auto_increment,
    proizvod int not null,
    sirovina int not null
);

create table proizvod_djelatnik(
    sifra int not null primary key auto_increment,
    proizvod int not null,
    djelatnik int not null
);


alter table proizvod_sirovina add foreign key (proizvod) references proizvod(sifra);
alter table proizvod_sirovina add foreign key (sirovina) references sirovina(sifra);

alter table proizvod_djelatnik add foreign key (proizvod) references proizvod(sifra);
alter table proizvod_djelatnik add foreign key (djelatnik) references djelatnik(sifra);