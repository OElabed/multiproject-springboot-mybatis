INSERT INTO privilege (id, name, gender) VALUES (1, 'PRIVILEGE_ADMIN_READ', 'description for privilege admin read');
INSERT INTO privilege (id, name, gender) VALUES (2, 'PRIVILEGE_USER_READ', 'description for privilege user read');

INSERT INTO role (id, name, description) VALUES (1, 'ROLE_ADMIN', 'description for role admin');
INSERT INTO role (id, name, description) VALUES (2, 'ROLE_USER', 'description for role user');

--INSERT INTO account (id, username, password) VALUES (1, 'admin', '$2a$10$MTFVrdqbHOi.CCUhkrkZnOBdrZEfk3gzIUyZBdQvLWvdF/0pnkEO2');
--INSERT INTO account (id, username, password) VALUES (2, 'user', '$2a$10$6KDklkImZgGANWR8pDAwSexf6Bt4Z9I0nDiwdih9Q38HI4eAkWk0u');

INSERT INTO authority (id, username, password) VALUES (1, 'admin', '$2a$10$MTFVrdqbHOi.CCUhkrkZnOBdrZEfk3gzIUyZBdQvLWvdF/0pnkEO2');
INSERT INTO authority (id, username, password) VALUES (2, 'user', '$2a$10$6KDklkImZgGANWR8pDAwSexf6Bt4Z9I0nDiwdih9Q38HI4eAkWk0u');
