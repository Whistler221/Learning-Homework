select * from smjer;

update smjer set cijena=1000 where sifra=2;

update smjer set
	cijena=null,
	trajanje=200
where sifra=2;

update smjer set naziv=null where sifra=1;

select * from grupa;

update grupa set predavac=7 where sifra=1;
select * from predavac where sifra=7;

select * from predavac;
select * from osoba;
update grupa set predavac=1 where sifra=1;

select * from osoba;
update osoba set oib='67087745283' where sifra=1;
update osoba set oib='34517861663' where sifra=2;
update osoba set oib='12907222990' where sifra=3;
update osoba set oib='05045688183' where sifra=4;
update osoba set oib='47853475396' where sifra=5;

select * from smjer;
alter table smjer add broj decimal(18.2);
alter table smjer add iznos decimal(18.2) not null default 0;

update smjer set broj=rand();

# svim smjerovima postavite iznose izmedju 10 i 100

update smjer set iznos=rand()*100;

update smjer set iznos=10 + (rand()*90);

# sve iznose uvecajte za 10 
update smjer set iznos=iznos+10;

#svi brojevima dodjeliti iznos umanjen za 15 

update smjer set broj=iznos-15;

#sve cijene smanjite za 10% 

update smjer set cijena=cijena*0.9;

delete from smjer;
select * from grupa;
#gdije je smjer vanski kljuc
SELECT
TABLE_NAME,COLUMN_NAME,CONSTRAINT_NAME, REFERENCED_TABLE_NAME,REFERENCED_COLUMN_NAME
FROM
INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE
REFERENCED_TABLE_SCHEMA = 'edunovajp23' AND
REFERENCED_TABLE_NAME = 'smjer';



delete from smjer where sifra=3;

# zadatak: Obriši smjer Java programiranje i sve podatke koji o njemu ovise
select * from smjer; #1
select * from grupa; #1
delete from clan where grupa=1;
delete from grupa where sifra=1;
delete from smjer where sifra=1;

# čitati: cascade