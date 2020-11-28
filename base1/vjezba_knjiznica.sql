# vjezba knjiznica

# 1. odaberite sve autore koji nemaju definiran  rodjenja

select * from autor  where datumrodenja is null;

# 2.  autora s prezimenom preišić ispraviti u Perišićc

select * from autor where prezime='preišić';

update autor set prezime='Perišićc' where sifra=3;

select * from autor where sifra=3;

update autor set datumrodenja = '1920-04-16 09:43:37' where sifra=3;

select * from autor where prezime like 'p%c';

select * from autor where prezime= 'preišić';
select * from autor where prezime= 'Perišićc';

# 3. kreirati tablic grad (id, naziv). U tablicu autor doddati kolonu grad koja je 
#    vanjski ključ na grad(id)

create table grad(
	id		int not null primary key auto_increment,
	naziv 	varchar(50) not null
);

insert into grad (naziv) values ('Batrina');

alter table autor add grad  int not null;

select * from autor;

alter table autor add foreign key (grad) references grad (id);


# 4. Koliko je izdavača društvo s ograničenom odgovornošću?

select * from izdavac where naziv like '%d%o%o%';

# 5. odaberite sva mjesta koja u svom nazivu imaju slovo Z

select * from mjesto where naziv like '%z%';

# 6. Unesite sebe kao autora i unesite kataložni zapis čiji ste Vi autor

select * from autor;

insert into autor (sifra, ime, prezime, datumrodenja, grad) values (20775, 'Filip', 'Klobucar', '1995-05-07', 0);

select * from autor where sifra=20775;

drop table grad;

alter table autor drop grad;

delete from autor where sifra=20775;

update autor set grad = 'Batrina' where sifra=20775;

