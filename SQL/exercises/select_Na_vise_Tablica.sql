select * from smjer;

#osnovna konstrukcija, zamjenska imena a ,b, c, d....
select a.naziv as smjer, b.naziv as smjer
from grupa a inner join smjer b on a.smjer=b.sifra;
where b.naziv like '%a%';


select g.sifra , g.naziv , s.naziv as smjer
from grupa g inner join smjer on g.sifra =s.sifra
where s.naziv like '%a%';

#stari nacin inner join

select a.sifra , a.naziv , b.naziv as smjer
from grupa a, smjer b
where a.smjer =b.sifra and b.naziv

select * from grupa;

select a.sifra , b.prezime
from predavac a inner join osoba b on a.osoba=b.sifra;

# zadatak
# Unesite novog predavaca i on neka se zove Shaquille O'Neal

select * from predavac;
select * from osoba;
insert into osoba(ime,prezime,email) values ('Shaquille','O''Neal','shaki@gmail.com');
insert into osoba(ime,prezime,email) values ("Shaquille","O'Neal","shaki@gmail.com");
insert into osoba(ime,prezime,email) values ('Shaquille','O\'Neal','shaki@gmail.com');

select * from osoba where ime='Shaquille';

insert into predavac (osoba) values (21);

select sifra from predavac where osoba=21;


# Grupu jp23 vodi Tomislav Jakopec, a grupu PP22 vodi Shaquille O'Neal

select * from predavac;
select * from osoba;
select * from grupa;

delete from predavac where sifra=3;

update grupa set predavac=1 where sifra=1;

update grupa set predavac=2 where sifra=2;

select * from grupa; 

# spajane vise tablica

select a.naziv , b.naziv as smjer , d.ime, d.prezime
from grupa a
inner join smjer b on a.smjer =b.sifra
inner join predavac c on a.predavac =c.sifra
inner join osoba d on c.osoba =d.sifra;

# zadatak: Ispisite imena i prezimena svih polaznika grupre JP23

select d.prezime , d.ime
from grupa a 
inner join clan b on a.sifra =b.grupa
inner join polaznik c on b.polaznik =c.sifra
inner join osoba d on c.osoba=d.sifra
where a.naziv ='JP23';

select * from smjer; #3
select * from grupa; #2

# inner join 2  rezultata
select a.naziv, b.naziv as grupa
from smjer a inner join grupa b on a.sifra =b.smjer;

# right join okrenuti na jeft 
select b.naziv, a.naziv as grupa
from smjer a left join grupa b on a.sifra =b.smjer;