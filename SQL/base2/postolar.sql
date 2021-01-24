drop database if exists postolar;
create database postolar;

use postolar;

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50),
    prezime varchar(50),
    broj_mobitela int    
);
create table postolar(
    sifra int not null primary key auto_increment,
    osoba int not null,
    iban varchar(50)
);

create table segrt(
    sifra int not null primary key auto_increment,
    osoba int not null,
    iban varchar(50)
);

create table obuca(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    boja varchar(50) not null,
    vlasnik int not null
);

create table popravak(
    sifra int not null primary key auto_increment,
    postolar int not null,
    segrt int,
    cijena decimal(18,2)
);

create table popravak_obuca(
    sifra int not null primary key auto_increment,
    popravak int not null,
    obuca int not null
);


alter table postolar add foreign key (osoba) references osoba(sifra);

alter table segrt add foreign key (osoba) references osoba(sifra);

alter table obuca add foreign key (vlasnik) references osoba(sifra);

alter table popravak add foreign key (postolar) references postolar(sifra);
alter table popravak add foreign key (segrt) references segrt(sifra);

alter table popravak_obuca add foreign key (popravak) references popravak(sifra);
alter table popravak_obuca add foreign key (obuca) references obuca(sifra);