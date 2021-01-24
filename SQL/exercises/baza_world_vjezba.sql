
select b.name
from country a
inner join city b on b.countrycode=a.code
where a.Continent='Europe';

select Continent from Country;

# odaberite nazive zemalja u kojima se prica spanjolski jezik

select 
from country c
inner join countrylanguage cl on <.Code = cl.Country.Code
where cl. language = 'Spanish';
