# DZ
# Na današnji dan uz unosa vlastitog datuma rođenja upit ispisuje
# koliko ste stari godina, mjeseci, dana

drop database if exists edunovajp23;
create database edunovajp23 character set utf8;

use edunovajp23;

# rijesenje 1

create table users(
	name	 varchar(10),
	dob		 datetime
);

insert into users (name, dob)
values ('Filip', '1995-05-07');

select
timestampdiff( year, dob, now() ) as 'Year',
timestampdiff( month, dob, now() ) % 12 as 'Months',
timestampdiff( day, dob, now() ) % (((3*365) + 366)/12) as 'Days'
from users;

select * from users;

/*
# rijesenje 2
SELECT 
timestampdiff(year, date('1989-10-05'), now())  as 'Year',
timestampdiff(month, date('1989-10-05'), now()) % 12  as 'Months',
timestampdiff(day, date('1989-10-05'), now()) % 30.4375  as 'Days' ;
*/