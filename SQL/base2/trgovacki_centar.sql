drop database if exists trgovacki_centar;
create database trgovacki_centar;

use trgovacki_centar;

create table trgovina(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    sef int not null,
    web varchar(50)
);

create table osoba(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    iban varchar(50)
);

create table trgovina_osoba(
    sifra int not null primary key auto_increment,
    trgovina int not null,
    osoba int not null
);


alter table trgovina add foreign key (sef) references osoba(sifra);

alter table trgovina_osoba add foreign key (trgovina) references trgovina(sifra);
alter table trgovina_osoba add foreign key (osoba) references osoba(sifra);