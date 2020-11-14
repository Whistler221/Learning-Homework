drop database if exists djecji_vrtic;
create database djecji_vrtic;

use djecji_vrtic;

create table dijete(
    sifra           int not null primary key auto_increment,
    ime             varchar(50) not null,
    prezime         varchar(50) not null,
    odgojna_skupina int not null
);

create table odgajateljica(
    sifra           int not null primary key auto_increment,
    struna_sprema   int not null,
    oib             char(11),
    ime             varchar(50) not null,
    prezime         varchar(50) not null
);

create table struna_sprema(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    razina varchar(50)
);

create table odgojna_skupina(
    sifra   int not null primary key auto_increment,
    odgajateljica int not null,
    broj_dijece int not null
);

alter table odgojna_skupina add foreign key (odgajateljica) references odgajateljica(sifra);

alter table dijete add foreign key (odgojna_skupina) references odgojna_skupina(sifra);

alter table odgajateljica add foreign key (struna_sprema) references struna_sprema(sifra);