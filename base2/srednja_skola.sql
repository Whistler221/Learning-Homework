drop database if exists srednja_skola;
create database srednja_skola;

use srednja_skola;

create table razred(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    ucionica varchar(50)
);

create table profesor(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    iban varchar(50)
);

create table ucenik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11),
    razred int not null
);

create table razred_profesor(
    sifra int not null primary key auto_increment,
    razred int not null,
    profesor int not null
);


alter table ucenik add foreign key (razred) references razred(sifra);

alter table razred_profesor add foreign key (razred) references razred(sifra);
alter table razred_profesor add foreign key (profesor) references profesor(sifra);