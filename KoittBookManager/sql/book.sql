DROP DATABASE bookmgr;

CREATE DATABASE bookmgr;

SHOW DATABASES;

DROP TABLE Book;

CREATE TABLE Book(
	isbn			INT				NOT NULL 		PRIMARY KEY AUTO_INCREMENT,
	title			VARCHAR(20)		NOT NULL,
	author			VARCHAR(20)		NOT	NULL,
	publisher		VARCHAR(20)		NOT NULL,
	price			INT				NOT NULL,
	description		VARCHAR(255)		NULL
)

SHOW TABLES;

