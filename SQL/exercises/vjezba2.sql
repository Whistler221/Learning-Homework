drop database if exists vjezba2;
create database vjezba2 character set utf8;
use vjezba2;
create table tecaj(
	sifra 		int not null primary key auto_increment,
	naziv 		varchar(50) not null,
	cijena 		decimal(18,2),
	lokacija	varchar(50) not null,
	student 	int not null
);
		
create table student(
	sifra 	int not null primary key auto_increment,
	ime  	varchar(50) not null,
	prezime	varchar(50) not null,
	email 	varchar(50) not null
);
alter table tecaj add foreign key (student) references student (sifra);
	
insert into student (sifra,ime,prezime,email) values
(null,'Marko','Marijanovic','marko21@gmailcom'),
(null,'Stjepan','Kuzmic','stjepan11@gmail.com'),
(null,'Ivan','Grozdanivic','ivan45@gmail.com'),
(null,'Kreso','Horvat','kreso211@gmail.com');
		
insert into tecaj (sifra,naziv,cijena,lokacija,student) values
(null,'java_prigramiranje',5999.99,'Osijek',1),
(null,'python_programiranje',6999.99,'Zagreb',2);