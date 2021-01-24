drop database if exists vjezba21;
create database vjezba21 character set utf8;

use vjezba21;

create table automobil(
	sifra 				int not null primary key auto_increment,
	boja 				varchar(50) not null,
	model 				varchar(50) not null,
	registracija 		varchar(50) not null,
	cijena 				decimal(18.2)
);

insert into automobil (boja, model, registracija, cijena)
values ('boja1', 'model1', 'registracija1', 6499.99),
		('boja2', 'mode2', 'registracija2', 5000),
		('boja3', 'model3', 'registracija3', 12499.99),
		('boja4', 'model4', 'registracija4', 18000),
		('boja5', 'model5', 'registracija5', 19999.99);
		
select * from automobil;
update automobil set boja='crvena' where sifra=1;

update automobil set model='BMW' where sifra=2;

delete from automobil where sifra=2;