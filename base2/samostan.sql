drop database if exists samostan;
create database samostan;

use samostan;

create table svecenik(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    nadredeni_svecenik int not null
);

create table posao(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    vrijeme varchar(50)
);

create table svecenik_posao(
    svecenik int not null,
    posao int not null
);

alter table svecenik add foreign key (nadredeni_svecenik) references svecenik(sifra);

alter table svecenik_posao add foreign key (svecenik) references svecenik(sifra);
alter table svecenik_posao add foreign key (posao) references posao(sifra);