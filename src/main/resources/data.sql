INSERT INTO tourist_db.tag (name) VALUES ('Restaurant');
INSERT INTO tourist_db.tag (name) VALUES ('Pricy');
INSERT INTO tourist_db.tag (name) VALUES ('Middle-price');
INSERT INTO tourist_db.tag (name) VALUES ('Cheap');
INSERT INTO tourist_db.tag (name) VALUES ('Basic');

INSERT INTO tourist_db.tourist_attraction (name, city, description) VALUES ('Divan', 'Copenhagen', 'Cheap Kabob');
INSERT INTO tourist_db.tourist_attraction (name, city, description) VALUES ('Kebabistan', 'Copenhagen', 'Veriii nice');
INSERT INTO tourist_db.tourist_attraction (name, city, description) VALUES ('Berlin Doner Kebab', 'Copenhagen', 'Good');

INSERT INTO tourist_db.tourist_attraction_tags (tags_id, tourist_attraction_db_id) VALUES (2,1);
INSERT INTO tourist_db.tourist_attraction_tags (tags_id, tourist_attraction_db_id) VALUES (5,1);
INSERT INTO tourist_db.tourist_attraction_tags (tags_id, tourist_attraction_db_id) VALUES (3,2);
INSERT INTO tourist_db.tourist_attraction_tags (tags_id, tourist_attraction_db_id) VALUES (4,3);
INSERT INTO tourist_db.tourist_attraction_tags (tags_id, tourist_attraction_db_id) VALUES (1,1);