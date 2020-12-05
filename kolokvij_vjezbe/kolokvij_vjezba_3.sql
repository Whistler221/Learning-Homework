drop database if exists kolokvij_vjezba_3;
create database kolokvij_vjezba_3 character set utf8mb4;

use kolokvij_vjezba_3;

create table ostavljena(

    sifra        int not null primary key auto_increment,
    kuna         decimal(17.5),
    lipa         decimal(15.6),
    majica       varchar(36),
    modelnaocala varchar(31) not null,
    prijatelj    int
);

create table prijatelj(

    sifra        int not null primary key auto_increment,
    kuna         decimal(16.10),
    haljina      varchar(37),
    lipa         decimal(13.10),
    dukserica    character(31),
    indiferentno bit not null
);

create table prijatelj_brat(

    sifra       int not null primary key auto_increment,
    prijatelj   int not null,
    brat        int not null
);

create table brat(

    sifra         int not null primary key auto_increment,
    jmbg          char(11),
    ogrlica       int not null,
    ekstroventno  bit not null
);

create table snasa(

    sifra       int not null primary key auto_increment,
    introvertno bit,
    kuna        decimal(15.6) not null,
    eura        decimal(12.9) not null,
    treciputa   datetime,
    ostavljena  int not null
);

create table punica(

    sifra        int not null primary key auto_increment,
    asocijalno   bit,
    kratkamajica varchar(44),
    kuna         decimal(13.8) not null,
    vesta        varchar(32) not null,
    snasa        int
);

create table svekar(

    sifra       int not null primary key auto_increment,
    novcica     decimal(16.8) not null,
    suknja      varchar(44) not null,
    bojakose    varchar(36),
    prstena     int,
    narukvica   int not null,
    cura        int not null,
);

create table cura(

    sifra       int not null primary key auto_increment,
    dukserica   varchar(49),
    maraka      decimal(13.7),
    drugiputa   datetime,
    majica      varchar(49),
    novcica     decimal(15.8),
    ogrlica     int not null
);

alter table punica add foreign key (snasa) references snasa (sifra);

alter table snasa add foreign key (ostavljena) references ostavljena (sifra);

alter table ostavljena add foreign key (prijatelj) references prijatelj (sifra);

alter table prijatelj_brat add foreign key (prijatelj) references prijatelj (sifra);
alter table prijatelj_brat add foreign key (brat) references brat (sifra);

# 15 min

# 1. U tablice snasa, ostavljena i prijatelj_brat unesite po 3 retka.


# 2. U tablici svekar postavite svim zapisima kolonu suknja 
#    na vrijednost Osijek.


# 3. U tablici punica obrišite sve zapise čija je vrijednost 
#    kolone kratkamajica jednako AB.


#4. Izlistajte majica iz tablice ostavljena uz uvjet da 
#   vrijednost kolone lipa nije 9,10,20,30 ili 35.


#5. Prikažite ekstroventno iz tablice brat, vesta iz tablice 
#   punica te kuna iz tablice snasa uz uvjet da su vrijednosti
#   kolone lipa iz tablice ostavljena različito od 91 te da su
#   vrijednosti kolone haljina iz tablice prijatelj sadrže niz
#   znakova ba. Podatke posložite po kuna iz tablice snasa silazno.


#6. Prikažite kolone haljina i lipa iz tablice prijatelj čiji se
#   primarni ključ ne nalaze u tablici prijatelj_brat.