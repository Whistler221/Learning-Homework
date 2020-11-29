#baza mjesta
#odaberite sva mjesta iz osjecko baranjcke zupanije
select * from mjesto where naziv like '31%';
select * from mjesto where zupanija =14;

#odaberite sva mjesta u hrvatskoj koja ne zavrsavaju sa slovom k 

select * from mjesto where naziv not like '%k';

# unijeti 3 novamjesta 
insert into mjesto (postanskibroj, zupanija, naziv) values
				('20002', 19, 'Batrina'),
				('20003', 19, 'Oriovac'),
				('20004', 19, 'Sibinj');
			
# nazive svih mjesta koji imaju pocetno slovo a postavite na XXXX

describe mjesto;
update mjesto set naziv='XXXX' where naziv like 'p%g';
update mjesto set naziv='XXXX' where naziv like 'dr%a%e';
update mjesto set naziv='XXXX' where naziv like 'd_o_o' ;
select * from mjesto where naziv='XXXX';


# Mjestima dodati kolonu brojstanovnika i u nju postaviti slucajne vrijednosti
# izmedju 10000 i 100000 
alter table mjesto add brojstanovnika int not null;  
update mjesto set brojstanovnika = ceil( 10000 + (rand() * 90000));
select * from mjesto; 
			
# odberite podatke na nacin da ispis u Gridu izgleda npr: ovako:			
# Grad : Osijek, 31000 (Zupanija: 14

select * from mjesto where naziv='Osijek';
select from mjesto;

select naziv as 'Grad:', postanskibroj as 'Poštanski broj:', zupanija as 'Županija' 
from mjesto where naziv='Osijek';

select naziv as 'Grad:', 'naziv' as naziv, postanskibroj as 'Poštanski broj:', 
zupanija as 'Županija:' from mjesto;