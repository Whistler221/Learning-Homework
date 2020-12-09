drop database if exists snake; 
create database snake;
use snake;


-- game field creation and handling --
create table gameField(
	x_coord			int not null,
	y_coord			int not null,

	snakeID			int not null
);
		-- handeling of the game field --


 -- make the snake entity --
create table Game(
	gameID			int not null primary key auto_increment,
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


-- score board creation and handling
create table scoreBoard(
	scoreBoardID	int not null primary key auto_increment,
	gameID			int not null,
	playerID		int not null,
	score			int not null
);



alter table SNAKE add foreign key (playerID) references player(playerID);

alter table gameField add foreign key (gameID) references SNAKE(snakeID);

alter table scoreBoard add foreign key (playerID) references player(playerID);

	


