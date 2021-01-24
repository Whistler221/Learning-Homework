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
    cura        int not null
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

insert into prijatelj (sifra, indiferentno)
values (1, 1),
		(2, 0),
		(3, 1);
	
insert into brat (sifra, ogrlica, ekstroventno)	
values (1, 4, 1),
		(2, 6, 0),
		(3, 8, 1);
	
insert into prijatelj_brat (prijatelj, brat)	
values (1, 2),
		(2, 3),
		(3, 1);
	
insert into ostavljena (sifra, modelnaocala)
values (1, 'modelnaocala1'),
		(2, 'modelnaocala2'),
		(3, 'modelnaocala3');	

# 5 min 
	

# 2. U tablici svekar postavite svim zapisima kolonu suknja 
#    na vrijednost Osijek.

insert into cura (sifra, ogrlica)
values (1, 4),
		(2, 6),
		(3, 9);
	
insert into svekar (sifra, novcica, suknja, narukvica, cura)
values (1, 12.4, 'suknja1', 6, 1),
		(2, 10.6, 'suknja2', 12, 2),
		(3, 17.8, 'suknja3', 18, 3);
		
update svekar set suknja ='Osijek';

select * from svekar;



# 3. U tablici punica obrišite sve zapise čija je vrijednost 
#    kolone kratkamajica jednako AB.

insert into snasa (sifra, kuna, eura, ostavljena)
values (1, 242.82, 122.44, 1),
		(2, 327.82, 145.24, 2),
		(3, 142.21, 189.57, 3);
	
insert into punica (sifra, kuna, vesta, snasa)
values (1, 326.99, 'vesta1', 1),
		(2, 256.88, 'vesta2', 2),
		(3, 128.44, 'vesta3', 3);
	
delete from punica where kratkamajica='AB';	

# 8 min
	
#4. Izlistajte majica iz tablice ostavljena uz uvjet da 
#   vrijednost kolone lipa nije 9,10,20,30 ili 35.

select majica from ostavljena where lipa % 0.09 != 0 and lipa % 0.1 != 0 and lipa % 0.2 !=0 and lipa % 0.3 != 0 and lipa % 0.35 != 0;

# 15 min

#5. Prikažite ekstroventno iz tablice brat, vesta iz tablice 
#   punica te kuna iz tablice snasa uz uvjet da su vrijednosti
#   kolone lipa iz tablice ostavljena različito od 91 te da su
#   vrijednosti kolone haljina iz tablice prijatelj sadrže niz
#   znakova ba. Podatke posložite po kuna iz tablice snasa silazno.

select a.ekstroventno, e.snasa, g.vesta
from brat a
inner join prijatelj_brat b on a.sifra = b.brat
inner join prijatelj c on b.prijatelj = c.sifra
inner join ostavljena d on c.sifra = d.prijatelj
inner join snasa e on d.sifra = e.ostavljena 
inner join punica g on e.sifra = g.snasa 
where d.lipa is <>91 and c.haljina like '%ba%';

#6. Prikažite kolone haljina i lipa iz tablice prijatelj čiji se
#   primarni ključ ne nalaze u tablici prijatelj_brat.

select * from d.prijatelj
where d.sifra not in (select prijatelj from prijatelj_brat);

# 15 min

# 58 min total