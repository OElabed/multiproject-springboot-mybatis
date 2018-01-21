insert into POST (POST_TEXT) values ('Hello World!');


INSERT INTO role (id, name, description) VALUES (1, 'ROLE_ADMIN', 'description for role admin');
INSERT INTO role (id, name, description) VALUES (2, 'ROLE_USER', 'description for role user');


INSERT INTO account (id, username, password) VALUES (1,  'admin', '$2a$10$MTFVrdqbHOi.CCUhkrkZnOBdrZEfk3gzIUyZBdQvLWvdF/0pnkEO2');
INSERT INTO account (id, username, password) VALUES (2,  'user', '$2a$10$6KDklkImZgGANWR8pDAwSexf6Bt4Z9I0nDiwdih9Q38HI4eAkWk0u');



INSERT INTO privilege (id, name, gender) VALUES (1,  'PRIVILAGE_ONE', 'DIRECTOR');
INSERT INTO privilege (id, name, gender) VALUES (2,  'PRIVILAGE_TOW', 'OPERATOR');
