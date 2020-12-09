drop database if exists kolokvij_vjezba_2;
create database kolokvij_vjezba_2 character set utf8mb4;

use kolokvij_vjezba_2;

create table cura(

    sifra       int not null primary key auto_increment,
    haljina      varchar(33) not null,
    drugiputa   datetime not null,
    suknja      varchar(38),
    narukvica   int,
    introvertno bit,
    majica      varchar(40) not null,
    decko       int
);

create table neprijatelj(

    sifra        int not null primary key auto_increment,
    majica       varchar(32),
    haljina      varchar(43) not null,
    lipa         decimal(16,8),
    modelnaocala varchar(49) not null,
    kuna         decimal(12.6)not null,
    jmbg         char(11),
    cura         int
    );

create table brat(

    sifra       int not null primary key auto_increment,
    suknja      varchar(47),
    ogrlica     int not null,
    asocijalno  bit not null,
    neprijatelj int not null
);

create table decko(

    sifra int not null primary key auto_increment,
    indiferentno bit,
    vesta varchar(34),
    asocijalno bit not null
);

create table decko_zarucnica(

    sifra       int not null primary key auto_increment,
    decko       int not null,
    zarucnica   int not null
);

create table zarucnica(

    sifra        int not null primary key auto_increment,
    narukvica    int,
    bojakose     varchar(37) not null,
    novcica      decimal(15,9),
    lipa         decimal(15,8) not null,
    indiferentno bit not null
);

create table prijatelj(

    sifra int not null primary key auto_increment,
    modelnaocala varchar(37),
    treciputa datetime not null,
    ekstrovertno bit not null,
    prviputa    datetime,
    svekar int not null
);

create table svekar(

    sifra int not null primary key auto_increment,
    stillfrizura    varchar(48),
    ogrlica int not null,
    asocijalno bit not null
);

# 19 min

alter table brat add foreign key (neprijatelj) references neprijatelj (sifra);

alter table neprijatelj add foreign key (cura) references cura (sifra);

alter table cura add foreign key (decko) references decko (sifra);

alter table decko_zarucnica add foreign key (decko) references decko (sifra); 
alter table decko_zarucnica add foreign key (zarucnica) references zarucnica (sifra);

alter table prijatelj add foreign key (svekar) references svekar (sifra);

# 4 min

# 1. U tablice neprijatelj, cura i decko_zarucnica unesite po 3 retka.

insert into zarucnica (bojakose, lipa, indiferentno)
values ('boja1', 15.8, 0),
		('boja2', 18.4, 0),
		('boja3', 12.6, 0);
	
select sifra from zarucnica;

insert into decko (asocijalno)
values (1),
		(1),
		(1);	
	
insert into decko_zarucnica (decko, zarucnica)
values (1,2),
		(2,1),
		(3,2);

insert into cura (decko, haljina, drugiputa, majica)
values (1, 'haljina1', '2020-10-12', 'majica1'),
		(2, 'haljina2', '2020-04-16', 'majica2'),
		(3, 'haljina3', '2020-06-22', 'majica3');
		
insert into neprijatelj (haljina, modelnaocala, kuna)
values ('haljina1', 'modelnaocala1', 120.48),
		('haljina2', 'modelnaocala2', 248.36),
		('haljina3', 'modelnaocala3', 170.25);

# 4 min
	
# 2. U tablici prijatelj postavite svim zapisima kolonu treciputa na vrijednost 30. travnja 2020.

update prijatelj set treciputa ='2020-04-30';

select * from prijatelj;

# 2 min

# 3. U tablici brat obrišite sve zapise čija je vrijednost kolone ogrlica različito od 14.

delete from brat where ogrlica <>14;

# 4. Izlistajte suknja iz tablice cura uz uvjet da vrijednost kolone drugiputa nepoznate.

select * from cura;

select * from cura where drugiputa is null;

select suknja from cura where drugiputa is null;

# 10 min

# 5. Prikažite novcica iz tablice zarucnica, neprijatelj iz tablice brat te haljina iz tablice
#    neprijatelj uz uvjet da su vrijednosti kolone drugiputa iz tablice cura poznate te da su
#    vrijednosti kolone vesta iz tablice decko sadrže niz znakova ba. Podatke posložite po haljina 
#    iz tablice neprijatelj silazno.

select a.novcica, e.haljina, g.neprijatelj
from zarucnica a
inner join decko_zarucnica b on a.sifra = b.zarucnica 
inner join decko c on b.decko = c.sifra
inner join cura d on c.sifra = d.decko
inner join neprijatelj e on d.sifra = e.cura
inner join brat g on e.sifra = g.neprijatelj
where d.drugiputa is not null and c.vesta like '%ba%';

# 6. Prikažite kolone vesta i asocijalno iz tablice decko čiji se primarni ključ ne nalaze u 
#    tablici decko_zarucnica.

select * from decko d
where d.sifra not in (select decko from decko_zarucnica);
​
insert into decko (vesta, asocijalno) values
('vesta1', 1),
('vesta2', 1),
('novavesta1', 1);

# 30 min 

# total 01:09:00 h/m/s