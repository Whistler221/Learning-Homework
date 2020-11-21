drop database if exists frizerski_salon;
create database frizerski_salon CHARACTER SET utf8mb4;

use frizerski_salon;

create table djelatnica(
    sifra       int not null primary key auto_increment,
    osoba       int not null,
    iban        varchar(50)
);

create table korisnik(
    sifra       int not null primary key auto_increment,
    osoba       int not null,
    usluga      int not null,
    posjeta     int not null
);

create table osoba(
    sifra       int not null primary key auto_increment,
    ime         varchar(50),
    prezime     varchar(50)
);

create table usluga(
    sifra   int not null primary key auto_increment,
    naziv   varchar(50) not null,
    cijena  decimal(12,2)
);

create table posjeta(
    sifra       int not null primary key auto_increment,
    djelatnica  int not null,
    korisnik    int not null,
    usluga      int not null
);

alter table djelatnica add foreign key (osoba) references osoba(sifra);

alter table korisnik add foreign key (osoba) references osoba(sifra);

alter table posjeta add foreign key (djelatnica) references djelatnica(sifra);
alter table posjeta add foreign key (korisnik) references korisnik(sifra);
alter table posjeta add foreign key (usluga) references usluga(sifra);

insert into osoba (ime,prezime) values
('Ivan','Abramovic'),
('Snjezana','Misic'),
('Marija','Simunovic'),
('Dario','Horvat'),
('Adam','Kuzmic');

insert into djelatnica (osoba,iban) values
(1,'HR3423400091658118587'),
(2,'HR8724840081891152978'),
(3,'HR5123400097326243441');

insert into korosnik (osoba)
select sifra from osoba where sifra>3;

insert into usluga (naziv,cijena) values
('Šišanje',34,99)
('Prannje kose',20),
('Bojanje',69,99);

insert into posjeta (korisnik,djelatnica,usluga) values
(1,2,1),
(3,1,1),
(2,3,2),
(1,1,3),
(4,1,2),
(3,2,3);