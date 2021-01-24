drop database if exists osnovna_skola;
create database osnovna_skola;

use osnovna_skola;

create table radionica(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    ucitelj int not null
);

create table ucitelj(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    iban varchar(50)
);

create table dijete(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    broj_roditelja int not null
);

create table radionica_dijete(
    sifra int not null primary key auto_increment,
    radionica int not null,
    dijete int not null
);


alter table radionica add foreign key (ucitelj) references ucitelj(sifra);

alter table radionica_dijete add foreign key (radionica) references radionica(sifra);
alter table radionica_dijete add foreign key (dijete) references dijete (sifra);