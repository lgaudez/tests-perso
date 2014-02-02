INSERT INTO monapp.roles (id,role) VALUES (1,'admin'), (2,'moderator'), (3,'user');

INSERT INTO monapp.users (id,login, password, firstName, lastName, mail,citizenShip, spokenLanguages, dateOfBirth, phone) VALUES
  (1,'leo', '123456', 'léo', 'Gaudez', 'leo.gaudez@toncul.com', 'français', 'anglais; français', '2012-09-16', '0635466778' ),
  (2,'admin', '123456','vfdv', 'vfd', 'leo.vfd@tontcul.com', 'français', 'anglais; français', '1989-04-05', '0635466778' ),
  (3,'utilisateur1', '123456', 'vfdv', 'vfd', 'leo.vfd@ttoncul.com', 'français', 'anglais; français', '1989-04-05', '0635466778');

INSERT INTO monapp.user_roles (user_id, role_id) VALUES (1, 2), (2, 1), (3,3);