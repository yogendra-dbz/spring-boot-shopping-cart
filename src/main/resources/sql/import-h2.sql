-- password in plaintext: "password"
INSERT INTO USER (user_id, password, email, username, name, last_name, active)
VALUES
  (1, '$2a$06$OAPObzhRdRXBCbk7Hj/ot.jY3zPwR8n7/mfLtKIgTzdJa4.6TwsIm', 'user@mail.com', 'user', 'Name', 'Surname',
   1);
-- password in plaintext: "password"
INSERT INTO USER (user_id, password, email, username, name, last_name, active)
VALUES
  (2, '$2a$06$OAPObzhRdRXBCbk7Hj/ot.jY3zPwR8n7/mfLtKIgTzdJa4.6TwsIm', 'johndoe@gmail.com', 'johndoe', 'John', 'Doe', 1);
-- password in plaintext: "password"
INSERT INTO USER (user_id, password, email, username, name, last_name, active)
VALUES (3, '$2a$06$OAPObzhRdRXBCbk7Hj/ot.jY3zPwR8n7/mfLtKIgTzdJa4.6TwsIm', 'name@gmail.com', 'namesurname', 'Name',
        'Surname', 1);

INSERT INTO ROLE (role_id, role)
VALUES (1, 'ROLE_ADMIN');
INSERT INTO ROLE (role_id, role)
VALUES (2, 'ROLE_USER');

INSERT INTO USER_ROLE (user_id, role_id)
VALUES (1, 1);
INSERT INTO USER_ROLE (user_id, role_id)
VALUES (1, 2);
INSERT INTO USER_ROLE (user_id, role_id)
VALUES (2, 2);
INSERT INTO USER_ROLE (user_id, role_id)
VALUES (3, 2);

INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Composition Notebook', 'Quick notes? We have you covered!', 10, 12.99);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Subject Notebook', 'Make notes leisurely!', 7, 15.99);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Monthly Desk Pad', 'Plan your events of the month, well in advance', 9, 20.99);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Task Planner', 'Plan your day, on the go', 40, 32.99);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Office Bag', 'Your best friend', 80, 43.99);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Office Pen', 'The companion you require the most', 80, 3.99);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Pencil', 'Mistakes while writing? Do not worry!', 700, 6.99);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Glue', 'The best adhesive.', 500, 2.99);