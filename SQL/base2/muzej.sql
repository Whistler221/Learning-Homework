drop database if exists muzej;
create database muzej;

use muzej;

create table izlozba(
    sifra int not null primary key auto_increment,
    broj_djela int,
    kustos int not null,
    sponzor int not null
);

create table djelo(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    autor int not null,
    cijena decimal(18,2),
    izlozba int not null
);

create table autor(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null
);

create table kustos(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    email varchar(50) not null
);

create table sponzor(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    iznos decimal(18,2)
);

alter table izlozba add foreign key (kustos) references kustos(sifra);
alter table izlozba add foreign key (sponzor) references sponzor(sifra);

alter table djelo add foreign key (autor) references autor(sifra);
alter table djelo add foreign key (izlozba) references izlozba(sifra);


insert into sponzor (naziv,iznos) values
('sponzor1',19999.99),
('sponzor2',2000.00);

insert into kustos (ime,prezime,email) values
('ime1','prezime1','email1@gmail.com'),
('ime1','prezime2','email2@gmail.com');

insert into izlozba (broj_djela,kustos,sponzor) values
(13,1,1),
(20,2,1),
(10,1,2);

insert into autor (ime,prezime) values
('ime1','prezime1'),
('ime2','prezime2');

insert into djelo (naziv,autor,cijena,izlozba) values
('naziv1',1,1200000,1),
('naziv2',1,2000000,1),
('naziv3',1,2200000,2),
('naziv4',1,5400000,1),
('naziv5',2,6000000,2),
('naziv6',2,3400000,1),
('naziv7',2,5000000,1),
('naziv8',1,2000000,3),
('naziv9',2,3600000,2),
('naziv10',1,600000,3),
('naziv11',1,5300000,3),
('naziv12',2,21000000,2),
('naziv13',2,500000,1);