INSERT INTO users (email, password, name) VALUES ('apple@koitt.com', 1234, '김사과');

SELECT * FROM users ORDER BY no DESC; 

INSERT INTO board (title, content, user_no, regdate) VALUES ('사과-1', '사과내용-1', 11, CURDATE());
INSERT INTO board (title, content, user_no, regdate) VALUES ('사과-2', '사과내용-2', 11, CURDATE());
INSERT INTO board (title, content, user_no, regdate) VALUES ('사과-3', '사과내용-3', 11, CURDATE());

SELECT * FROM board ORDER BY no DESC; 


SELECT b.no, b.title, b.content, u.email, b.regdate
FROM board b, users u WHERE b.user_no = u.no;