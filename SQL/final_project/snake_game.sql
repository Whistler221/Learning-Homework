drop database if exists snake; 
create database snake;
use snake;


create table gameCODE(
	main_game_tick				int not null,


	change_movement_function	int not null,
	generate_apple				int not null,
	generate_new_game			int not null,
	grow_snake					int not null,
	reset_game					int not null,
	headbumpcheck				int not null
);

create table gameField(
	gameFieldID				int not null primary key auto_increment,
	snakeID					int not null,

	gameFieldWidth			int not null,
	gameFieldLength			int not null
);


create table pixel(
	pixelID				int not null primary key auto_increment,
	gameFieldID			int not null,	

	gameField_x_coord	int not null,
	gameField_y_coord	int not null,
	snake_on_pixel		int not null,
	apple				int not null
);


create table snake(
	snakeID					int not null primary key auto_increment,

	head_x_coord			int not null,
	head_y_coord			int not null
);

create table movement(
	direction				int not null primary key auto_increment,
	snakeID					int not null,

	directions_function		int not null
);


create table player(
	playerID				int not null primary key auto_increment,
	snakeID					int not null,

	playerName				varchar(50) not null,
	scoreID					int not null
);


create table scoreBoard(
	scoreID					int not null primary key auto_increment,
	playerID				int not null,
	
	score					int not null
);


alter table pixel add foreign key (gameFieldID) references gameField(gameFieldID);
alter table gameField add foreign key (snakeID) references snake(snakeID);
alter table movement add foreign key (snakeID) references snake(snakeID);
alter table player add foreign key (snakeID) references snake(snakeID);
alter table scoreBoard add foreign key (playerID) references player(playerID);