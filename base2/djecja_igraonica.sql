drop database if exists djecja_igraonica;
create database djecja_igraonica;

use djecja_igraonica

create table dijete(
    sifra           int not null primary key auto_increment,
    osoba           int not null,
    broj_roditelja  int not null
);

create table dadilja( 
    sifra   int not null primary key auto_increment,
    osoba   int not null,
    iban    varchar(50) not null,
    email   varchar(50) not null
);

create table osoba(
    sifra   int not null primary key auto_increment,
    ime     varchar(50) not null,
    prezime varchar(50) not null
);

create table igraonica(
    sifra   int not null primary key auto_increment,
    skupina int not null,
    dijete  int not null,
    dadilja int not null
);

create table djecja_igraonica(
    sifra       int not null primary key auto_increment,
    dijete      int not null,
    igraonica   int not null
);

alter table dijete 
        add foreign key (osoba) references osoba(sifra);

alter table dadilja 
        add foreign key (osoba) references osoba(sifra);

alter table igraonica 
        add foreign key (dadilja) references dadilja(sifra);

alter table djecja_igraonica 
        add foreign key (igraonica) references igraonica(sifra);
alter table djecja_igraonica
        add foreign key (dijete) references dijete(sifra);