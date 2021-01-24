drop database if exists vodoinstaler;
create database vodoinstaler;

use vodoinstaler;

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    iban varchar(50)
);

create table vodoinstaler(
    sifra int not null primary key auto_increment,
    osoba int not null
);

create table segrt(
    sifra int not null primary key auto_increment,
    osoba int not null
);

create table popravak(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    cijena decimal(18,2),
    vodoinstaler int not null,
    segrt int
);

create table kvar(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    uzrok varchar(50) not null
);

create table popravak_kvar(
    sifra int not null primary key auto_increment,
    popravak int not null,
    kvar int not null
);


alter table vodoinstaler add foreign key (osoba) references osoba(sifra);

alter table segrt add foreign key (osoba) references osoba(sifra);

alter table popravak add foreign key (vodoinstaler) references vodoinstaler(sifra);
alter table popravak add foreign key (segrt) references segrt(sifra);

alter table popravak_kvar add foreign key (popravak) references popravak(sifra);
alter table popravak_kvar add foreign key (kvar) references kvar(sifra);