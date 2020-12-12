drop database if exists kolokvij_vjezba_5;
create database kolokvij_vjezba_5 character set utf8mb4;

use kolokvij_vjezba_5;

create table punac(

    sifra       int not null primary key auto_increment,
    dukserina   varchar(33),
    prviputa    datetime not null,
    majica      varchar(36),
    svekar      int not null

);

create table svekar(

    sifra       int not null primary key auto_increment,
    bojakose    varchar(33),
    majica      varchar(31),
    carape      varchar(31) not null,
    haljina     varchar(43),
    narukvica   int,
    eura        decimal(14,5) not null

);

create table svekar_cura(

    sifra       int not null primary key auto_increment,
    svekar      int not null,
    cura        int not null

);

create table cura(
    
    sifra       int not null primary key auto_increment,
    carape      varchar(41) not null,
    maraka      decimal(17,10) not null,
    asocionalno bit,
    vesta       int not null

);

create table punica(

    sifra           int not null primary key auto_increment,
    hlace           varchar(43) not null, 
    nausnica        int not null,
    ogrlica         int,
    vesta           varchar(49) not null,
    modelnaocala    varchar(31) not null,
    treciputa       datetime not null,
    punac           int not null

);


create table ostavljena(
    sifra       int not null primary key auto_increment,
    majica      varchar(33),
    ogrlica     int not null,
    carape      varchar(44),
    stilfrizura varchar(42),
    punica      int not null

);

create table mladic(

    sifra           int not null primary key auto_increment,
    kratkamajica    varchar(48) not null,
    haljina         varchar(30) not null,
    asocionalno      bit,
    zarucnik        int not null

);

create table zarucnik(
    sifra           int not null primary key auto_increment,
    jmbg            char(11),
    lipa            decimal(12,8),
    indiferentno    bit

);

# 13 min

alter table ostavljena add foreign key (punica) references punica(sifra);

alter table punica add foreign key (punac) references punac(sifra);

alter table punac add foreign key (svekar) references svekar(sifra);

alter table svekar_cura add foreign key (svekar) references svekar(sifra);

alter table svekar_cura add foreign key (cura) references cura(sifra);

 alter table mladic add foreign key (zarucnik) references zarucnik(sifra);

# 2 min

# 1.U tablice punica, punac i svekar_cura unesite po 3 retka.

insert into svekar (sifra, carape, eura)
values (1, 'carape1', 240.44),
        (2, 'carape2', 140.12),
        (3, 'carape3', 320.24);

insert into punac(sifra, prviputa, majica, svekar)
values (1, '2018-04-06', 'majica1', 1),
        (2, '2018-05-12', 'majica2', 2),
        (3, '2018-06-21', 'majica3', 3);

insert into punica (sifra, hlace, nausnica, vesta, modelnaocala, treciputa, punac)
values (1, 'hlace1', 2, 'vesta1', 'modelnaoacla1', '2018-10-12', 1),
        (2, 'hlace2', 4, 'vesta2', 'modelnaoacla2', '2018-06-04', 2),
        (3, 'hlace3', 5, 'vesta3', 'modelnaoacla3', '2018-08-22', 3);

# 4 min 

# 2.U tablici mladic postavite svim zapisima kolonu haljina
#   na vrijednost Osijek.

select haljina from mladic where haljina= 'Osijek';

# 3.U tablici ostavljena obrišite sve zapise čija je vrijednost 
#   kolone ogrlica jednako 17.

delete from ostavljena where ogrlica =17;


# 4.Izlistajte majica iz tablice punac uz uvjet da vrijednost 
#   kolone prviputa nepoznate.

select majica from punac where prviputa is null;

# 2 min

# 5.Prikažite asocijalno iz tablice cura, stilfrizura iz tablice 
#   ostavljena te nausnica iz tablice punica uz uvjet da su 
#   vrijednosti kolone prviputa iz tablice punac poznate te da su 
#   vrijednosti kolone majica iz tablice svekar sadrže niz znakova ba. 
#   Podatke posložite po nausnica iz tablice punica silazno.

select a.asocionalno, g.stilfrizura, e.nausnica 
from cura a
inner join svekar_cura b on a.sifra = b.cura 
inner join svekar c on b.svekar = c.sifra 
inner join punac d on c.sifra = d.svekar 
inner join punica e on d.sifra = e.punac 
inner join ostavljena g on e.sifra = g.punica 
where d.prviputa is not null and c.majica like '%ba%';

# 13 min


#6. Prikažite kolone majica i carape iz tablice svekar čiji se primarni 
#   ključ ne nalaze u tablici svekar_cura.

select majica, carape from svekar where sifra not in (select svekar from svekar_cura);

# 1 min

# 35 min total