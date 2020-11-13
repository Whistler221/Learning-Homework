drop database if exists djecja_igraonica;
create database djecja_igraonica;

use djecja_igraonica

create table dijete(
    
    sifra           int not null primary key auto_increment,
    ime             varchar(50) not null,
    prezime         varchar(50) not null,
    skupina         int not null,
    broj_roditelja  int not null
);

create table dadilja(
    
    sifra   int not null primary key auto_increment,
    ime     varchar(50) not null,
    prezime varchar(50) not null,
    skupina int not null,
    email   varchar(50) not null
);

create table skupina(
    
    sifra   int not null primary key auto_increment,
    naziv   varchar(50) not null,
    dijete  int not null,
    dadilja int not null
);

create table igraonica(

    sifra   int not null primary key auto_increment,
    skupina int not null,
    dijete  int not null,
    dadilja int not null
);

alter table dadilja add foreign key (skupina) references skupina(sifra); 
alter table dadilja add foreign key (skupina) references igraonica(sifra);

alter table dijete add foreign key (skupina) references skupina (sifra);
alter table dijete add foreign key (skupina) references igraonica (sifra);