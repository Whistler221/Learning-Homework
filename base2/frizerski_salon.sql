drop database if exists frizerski_salon;
create database frizerski_salon CHARACTER SET utf8;

use frizerski_salon;

create table djelatnica(
    sifra       int not null primary key auto_increment,
    osoba       int not null,
    iban        varchar(50)
);

create table korisnik(
    sifra       int not null primary key auto_increment,
    osoba       int not null
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

insert into osoba (ime, prezime)
	values ('Sandra', 'Kuzmic'), 		#1
		   ('Marija', 'Marijanvic'), 	#2
		   ('Nikolina', 'Simic'), 		#3
		   ('Tamara', 'Nisic'), 		#4
		   ('Mira','Jurkovic'), 		#5 
		   ('Mirna', 'Varoscic'); 		#6

insert into djelatnica (osoba, iban)
	values (1, 'HR6324020065522666443'),	#1
			(2, 'HR7324020066159741893'), 	#2
			(3, 'HR1125000092568185636'); 	#3
	
insert into usluga (naziv, cijena) 
	values ('šišanje', 34.99), 		#1
		   ('pranje', 19.99), 		#2
		   ('bojanje kose', 79.99); #3

insert into korisnik (osoba)
	values (4), #1
			(5), #2
			(6); #3
	
insert into posjeta (djelatnica, korisnik, usluga) 
	values (3, 2, 1),
		 	(1, 3, 2),
			(2, 1, 3),
			(1, 3, 1);