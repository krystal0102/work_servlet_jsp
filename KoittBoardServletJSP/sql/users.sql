# no : 회원번호
# email : 이메일 (아이디용도)
# password : 비밀번호
# name : 이름

CREATE TABLE users (
	no			INT				NOT NULL	PRIMARY KEY		AUTO_INCREMENT,
	email		VARCHAR(255)	NOT NULL,
	password	VARCHAR(255)	NOT NULL,	
	name		VARCHAR(255)	NOT NULL,
	UNIQUE (email)
);	#UNIQUE 다른 사용자와 중복이 되지 않기 위해 사용

DROP TABLE users;

SHOW TABLES;

INSERT INTO users (email, password, name) VALUES ('teachertophoon@gmail.com', '1234', '정상훈');
INSERT INTO users (email, password, name) VALUES ('sujeong@gmail.com', '1234', '이수정');
INSERT INTO users (email, password, name) VALUES ('dongwon@gmail.com', '1234', '강동원');

DESC users;

SELECT * FROM users;