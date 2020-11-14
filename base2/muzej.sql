drop database if exists muzej;
create database muzej;

use muzej;

create table izlozba(
    sifra   int not null primary key auto_increment,
    sponzor int not null
);

create table djelo(
    sifra   int not null primary key auto_increment,
    ime     int not null,
    izlozba int not null
);

create table kustos(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50)not null,
    izlozba int not null
);

create table sponzor(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null
);

alter table djelo add foreign key (izlozba) references izlozba(sifra);

alter table kustos add foreign key (izlozba) references izlozba(sifra);

alter table izlozba add foreign key (sponzor) references sponzor(sifra);