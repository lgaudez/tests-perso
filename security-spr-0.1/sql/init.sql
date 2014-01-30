INSERT INTO monapp.roles (id,role) VALUES (1,'admin'), (2,'moderator'), (3,'user');

INSERT INTO monapp.users (id,login, password, firstName, lastName, mail,citizenShip, spokenLanguages, dateOfBirth) VALUES
  (1,'leo', '123456', 'léo', 'Gaudez', 'leo.gaudez@toncul.com', 'français', 'anglais; français', '05/04/1989' ),
  (2,'admin', '123456','vfdv', 'vfd', 'leo.vfd@tontcul.com', 'français', 'anglais; français', '05/04/1989' ),
  (3,'utilisateur1', '123456', 'vfdv', 'vfd', 'leo.vfd@ttoncul.com', 'français', 'anglais; français', '05/04/1989');

INSERT INTO monapp.user_roles (user_id, role_id) VALUES (1, 2), (2, 1), (3,3);