DROP TABLE IF EXISTS POST;

CREATE TABLE POST (
	ID INT NOT NULL AUTO_INCREMENT,
	POST_TEXT TEXT DEFAULT 'HELLO',
	PRIMARY KEY (ID)
);


drop table if exists role;
create table role (id int , name VARCHAR(50), description VARCHAR(200));

drop table if exists account;
create table account (id int , username VARCHAR(50), password VARCHAR(200));



drop table if exists privilege;
create table privilege (id int , name VARCHAR(50), gender VARCHAR(50));

