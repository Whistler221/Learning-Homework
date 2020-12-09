drop database if exists project51;
create database project51 character set utf8;

use project51;

create table employee_info(
    employeeID   int not null primary key auto_increment,
    first_name   varchar(50) not null,
    last_name    varchar(50) not null,
    adress       varchar(50) not null,
    phone_number varchar(50) not null,
    gender       varchar(50) not null,
    dateofbirth  datetime not null,
    hourly_wage  decimal(22,2) not null
);

create table employee_paycheck(
    employeeID  int not null,
    paycheck    int not null
);


create table paycheck(
    paycheckID int not null primary key auto_increment,
    paycheck decimal(22,4) not null,
    currency varchar(30) not null,
    iban     varchar(50) not null
);


create table project(
    projectID           int not null primary key auto_increment,
    project_name        varchar(60) not null,
    project_description varchar(600) not null,
    startdate           datetime not null,
    enddate             datetime not null,
    project_location    varchar(70) not null,
    price               decimal(16,2) not null
);

create table employee_project(
    projectID   int not null,
    employeeID  int not null,
    fromdate    datetime not null,
    todate      datetime not null
);

create table company(
    companyID               int not null primary key auto_increment,
    company_name            varchar(120) not null,
    date_of_establishment   datetime not null,
    company_description     varchar(500) not null,
    adress                  varchar(100) not null
);

create table employee_company(
    employeeID  int not null,
    companyID   int not null,
    fromdate    datetime not null,
    todate      datetime not null

);

create table company_project(
    companyID int not null,
    projectID int not null

);

alter table employee_paycheck add foreign key (employeeID) references employee_info (employeeID);
alter table employee_paycheck add foreign key (paycheck) references paycheck (paycheckID);

alter table employee_project add foreign key (projectID) references project (projectID);
alter table employee_project add foreign key (employeeID) references employee_info (employeeID);

alter table employee_company add foreign key (employeeID) references employee_info (employeeID);
alter table employee_company add foreign key (companyID) references company (companyID);

alter table company_project add foreign key (companyID) references company (companyID);
alter table company_project add foreign key (projectID) references project (projectID);

insert into employee_info (employeeID, first_name, last_name, adress, phone_number, gender, dateofbirth, hourly_wage)
values (1, 'name1', 'lastname1', 'adress1', '+1 210-430-0509', 'male', '1980-06-08', 18.50 ),
		(2, 'name2', 'lastname2', 'adress2', '+1 210-430-0509', 'female', '1978-09-05', 16.20 ),
		(3, 'name3', 'lastname3', 'adress3', '+1 402-762-7229', 'male', '1974-02-16', 17.40 ),
		(4, 'name4', 'lastname4', 'adress4', '+1 231-534-2181', 'female', '1972-10-20', 19.80 ),
		(5, 'name5', 'lastname5', 'adress5', '+1 229-912-4234', 'female', '1990-12-18', 22.40 );
		
insert into paycheck (paycheckID, paycheck, currency, iban)
values (1, 5500.00, 'euro', 'NL73ABNA6266038226'),
		(2, 6500.00, 'usd', 'NL71ABNA2405012723'),
		(3, 7500.00, 'british pound', 'NL46INGB9406362538'),
		(4, 8500.00, 'hrk', 'NL28INGB8966820263'),
		(5, 9500.00, 'BAM', 'NL02RABO2899665057');
		
insert into employee_paycheck (employeeID, paycheck)
values (1,5),
		(2,4),
		(3,3),
		(4,2),
		(5,1);
		
insert into project (projectID, project_name, project_description, startdate, enddate, project_location, price)
values (1, 'name1', 'description1', '1988-02-12', '1990-04-12', 'location1', 120000.00),
		(2, 'name2', 'description2', '1996-04-14', '1998-06-14', 'location2', 200000.00),
		(3, 'name3', 'description3', '1994-06-16', '1996-08-16', 'location3', 140000.00),
		(4, 'name4', 'description4', '1992-08-18', '1994-10-18', 'location4', 160000.00),
		(5, 'name5', 'description5', '1990-10-22', '1992-12-20', 'location5', 180000.00);
		
insert into employee_project (projectID, employeeID, fromdate, todate)
values (1, 1, '2010-02-08', '2012-04-16'),
		(2, 2, '2012-04-16', '2014-06-18'),
		(3, 3, '2014-06-18', '2016-08-20'),
		(4, 4, '2016-08-20', '2018-10-22'),
		(5, 5, '2018-10-12', '2020-12-10');
		
insert into company (companyID, company_name, date_of_establishment, company_description, adress)
values (1, 'name1', '1960-05-07', 'description1', 'adress1'),
		(2, 'name2', '1963-07-09', 'description2', 'adress2'),
		(3, 'name3', '1965-09-011', 'description3', 'adress3'),
		(4, 'name4', '1967-011-13', 'description4', 'adress4'),
		(5, 'name5', '1969-03-015', 'description5', 'adress5');
		
insert into employee_company (employeeID, companyID, fromdate, todate)
values (1, 1, '1982-04-02','2020-08-06'),
		(1, 1, '1982-05-04','2020-10-08'),
		(1, 1, '1982-02-05','2020-02-10'),
		(1, 1, '1982-06-06','2020-04-12'),
		(1, 1, '1982-08-07','2020-06-14');
		
insert into company_project (companyID, projectID)
values (1,5),
		(2,4),
		(3,3),
		(4,2),
		(5,1);

select * from employee_info; 

select * from employee_paycheck; 

select * from paycheck;

select * from project;

select * from employee_project;

select * from company;

select * from employee_company;

select * from company_project;