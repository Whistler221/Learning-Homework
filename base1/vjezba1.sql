drop database if exists vjezba1;
create database vjezba1 character set utf8;

use vjezba1;

create table table1(
	sifra 	 int not null primary key auto_increment,
	cijena	 decimal(14.2),
	naziv 	 varchar(50) not null,
	lokacija varchar(50)
	
);

insert into table1 (sifra,cijena,naziv,lokacija)
values (null,88.88,'xx','Batrina'),
		(null,214.22,'xx','Pozega'),
		(null,133.88,'xx','Giletinci'),
		(null,144.88,'xx','Vinkovci'),
		(null,128.99,'xx','Nova_Gradiska');