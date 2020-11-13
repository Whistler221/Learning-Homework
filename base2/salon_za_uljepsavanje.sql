drop database if exists salon_za_uljepsavanje;
create database salon_za_uljepsavanje;

use salon_za_uljepsavanje;

create table djelatnica(
    sifra       int not null,
    ime         varchar(50),
    prezime     varchar(50),
	-- why not use 'oib' as 'sifra' since its guaranteed to be unique?
	-- oib should be char. what if oib starts with a 0?
    oib         char(13) not null,
    iban        varchar(50)
);

create table korisnik(
    sifra       int not null,
    ime         varchar(50),
    prezime     varchar(50),
	-- do we need a customer's oib?
	-- if something is not null it means it's mandatory.
    oib         char(13) not null
);

create table usluga(
    sifra   int not null,
    naziv   varchar(50),
	--12 digits, 2 digits for decimals
    cijena  decimal(12, 2),
	-- let's add a relationship between usluga and posjeta
	posjeta int not null
);

create table posjeta(
    sifra int not null,
    djelatnica int not null,
    korisnik int not null
);

alter table usluga
	add foreign key (posjeta) references posjeta(sifra);
-- add more foreign keys
-- make a folder for this script
-- add diagram for script
-- push
