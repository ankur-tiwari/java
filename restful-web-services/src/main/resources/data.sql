INSERT INTO user_details(id, name, birthdate) VALUES(1001, 'KL. Rahul', current_date());
INSERT INTO user_details(id, name, birthdate) VALUES(1002, 'Rohit Sharma', current_date());
INSERT INTO user_details(id, name, birthdate) VALUES(1003, 'Virat Kohli', current_date());
INSERT INTO user_details(id, name, birthdate) VALUES(1004, 'Ishan Kishan', current_date());
INSERT INTO user_details(id, name, birthdate) VALUES(1005, 'Jaspreet Bumrah', current_date());
INSERT INTO user_details(id, name, birthdate) VALUES(1006, 'Kuldeep Yadav', current_date());


INSERT INTO post(id, description, user_id) VALUES(2001, 'Playing T20 world cup', 1002);
INSERT INTO post(id, description, user_id) VALUES(2002, 'Playing T20 world cup', 1003);
INSERT INTO post(id, description, user_id) VALUES(2003, 'Included in playing 11', 1002);
INSERT INTO post(id, description, user_id) VALUES(2004, 'Included in playing 11', 1003);
INSERT INTO post(id, description, user_id) VALUES(2005, 'Playing T20 world cup', 1001);
INSERT INTO post(id, description, user_id) VALUES(2006, 'Not included in playing 11', 1001);