#11. Fakultet
#Studenti polažu kolegije kroz rokove. Student može rok prijaviti više puta a na jedan
#rok može izaći više studenata.
#G:\xampp\mysql\bin\mysql -uedunova -pedunova < "C:\Users\WEB DOG\Desktop\JP23\bases\11. Fakultet\fakultet.sql"
drop database if exists  fakultet;
create database fakultet;

use fakultet;

create table kolegij(
    sifra int not null primary key auto_increment,
    naziv varchar(50) not null,
    pocetak datetime not null
);

create table rok(
    sifra int not null primary key auto_increment,
    datum datetime not null,
    kolegij int not null
);

create table student(
    sifra int not null primary key auto_increment,
    ime varchar(50) not null,
    prezime varchar(50) not null,
    oib char(11) not null
);

create table student_rok(
    sifra int not null primary key auto_increment,
    student int not null,
    rok int not null
);


alter table rok add foreign key (kolegij) references kolegij(sifra);

alter table student_rok add foreign key (student) references student(sifra);
alter table student_rok add foreign key (rok) references rok(sifra);