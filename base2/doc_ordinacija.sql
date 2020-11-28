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
	sifra int not null primary key auto_increment,
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
 
insert into osoba (ime, prezime, iban)
values ('Zvonimir', 'Crnkovic', 'HR2625000091961547851'),
		('Damir', 'Marijanovic', 'HR1123600008555235951'),
		('Ivana', 'Dujic', 'HR5724020067515522821'),
		('Sandra', 'Condric', 'HR8825000096955458942'),
		('Miroslav', 'Jozic', 'HR8124840088285658963'),
		('Igor', 'Levic', 'HR6924840082649342744');
	
insert into doktor (osoba)		
values (1),
		(2);
	
insert into medicinska_sestra (osoba)
values (3),
		(4);

insert into pacijent (osoba)
values (5),
		(6);
		
insert into ljecenje (doktor, pacijent , datum)
values (1, 2, '2020-08-16'),
		(2, 1, '2020-06-12');
		
insert into asistiranje_med_sestre (medicinska_sestra, ljecenje)
values (1,1),
		(2,2);