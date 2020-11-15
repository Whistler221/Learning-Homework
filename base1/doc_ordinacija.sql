drop database if exists doc_ordinacija;
create database doc_ordinacija;

use doc_ordinacija;

create table doktor(
    sifra int not null primary key auto_increment,
    osoba int not null
);

create table medicinska_sestra(
    sifra int not null primary key auto_increment,
    osoba int not null
);

create table asistiranje_med_sestre(
    medicinska_sestra       int not null,
    ljecenje                int not null
);

create table ljecenje(
    sifra       int not null primary key auto_increment,
    doktor      int not null,
    pacijent    int not null,
    datum       datetime
);

create table pacijent(
    sifra int not null primary key auto_increment,
    osoba int not null
);

create table osoba(
    sifra   int not null primary key auto_increment,
    ime     varchar(50) not null,
    prezime varchar(50) not null,
    iban    varchar(50)
);
 

 alter table asistiranje_med_sestre add foreign key (medicinska_sestra) references medicinska_sestra (sifra);
 alter table asistiranje_med_sestre add foreign key (ljecenje) references ljecenje (sifra);

 alter table ljecenje add foreign key (doktor) references doktor (sifra);
 alter table ljecenje add foreign key (pacijent) references pacijent (sifra);

 alter table doktor add foreign key (osoba) references osoba (sifra);
 alter table medicinska_sestra add foreign key (osoba) references osoba (sifra);
 alter table pacijent add foreign key (osoba) references osoba (sifra);