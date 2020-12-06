drop database if exists snake; 
create database snake;
use snake;







-- make the snake entity --
create table SNAKE(
	snakeID			int not null primary key auto_increment,
	playerID		int not null,

	x_coord			int not null,
	y_coord			int not null,
	scoreID			int not null,
	headBumpCheck	bit DEFAULT(0)
);


-- player information --
create table player(
	playerID		int not null primary key auto_increment,
	playerName		varchar(50) not null
);


create table team(
	playerID		int not null,
	snakeID			int not null

);



alter table team add foreign key (playerID) references player(playerID);

alter table team add foreign key (snakeID) references SNAKE(snakeID);
