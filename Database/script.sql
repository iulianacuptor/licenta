DROP SCHEMA IF EXISTS licenta ;
create database licenta;
use licenta;

-- Tabele:

create table roles(
	idRole int primary key auto_increment,
    roleName varchar(50) not null
);

create table users(
	idUser int primary key auto_increment,
    firstName varchar(256) not null,
    lastName varchar(256) not null,
    email varchar(256) not null unique,
    pass varchar(256) not null,
    idRole int,
    foreign key(idRole) references Roles(idRole)
);

create table publishingHouse(
	idPublisher int primary key auto_increment,
    publisherName varchar (256) not null
);

create table series(
	idSerie int primary key auto_increment,
    serieName varchar(256) not null
);

create table bookStatus(
	idStatus int primary key auto_increment,
    bookStatus varchar(20) not null,
    startDate datetime,
    endDate datetime
);

create table books(
	idBook int primary key auto_increment,
    bookName varchar(256) not null,
    rating double,
    synopsis varchar(512) not null,
    pages int not null,
    genre varchar(256), 
    idPublisher int,
    idSerie int,
    idUser int,
    idStatus int,
    foreign key(idPublisher) references PublishingHouse(idPublisher),
    foreign key(idSerie) references Series(idSerie),
    foreign key(idUser) references Users(idUser),
    foreign key(idStatus) references BookStatus(idStatus)
);

create table review(
	idReview int primary key auto_increment,
    reviewDescription varchar(512) not null,
    rating double not null,
    createdAt datetime not null,
    idUser int,
    idBook int,
    foreign key(idUser) references Users(idUser),
    foreign key(idBook) references Books(idBook)
);

create table authors(
	idAuthor int primary key auto_increment,
	firstName varchar(256) not null,
    lastName varchar(256) not null
);

create table multipleAuthors(
	idAuthor int,
    idBook int,
	foreign key(idBook) references Books(idBook),
    foreign key(idAuthor) references Authors(idAuthor)
);

create table images(
	idImage int primary key auto_increment,
    imageURL varchar(64) not null,
    idBook int,
    foreign key(idBook) references Books(idBook)
);
