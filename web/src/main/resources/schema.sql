
drop table if exists role;
create table role (id int , name VARCHAR(50), description VARCHAR(200));

drop table if exists account;
create table account (id int , username VARCHAR(50), password VARCHAR(200));

drop table if exists authority;
create table authority (id int , username VARCHAR(50), password VARCHAR(200));



drop table if exists privilege;
create table privilege (id int , name VARCHAR(50), gender VARCHAR(50));

