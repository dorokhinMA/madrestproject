DELETE FROM address;
DELETE FROM persons;
DELETE FROM phones;

INSERT INTO address_book.address (address) VALUES ('Moscow');
INSERT INTO address_book.address (address) VALUES ('Saint-Peterburg');
INSERT INTO address_book.address (address) VALUES ('Orel');

INSERT INTO address_book.persons (fio, address_id) VALUES ('Ivanov Ivan Ivanovich', 1);
INSERT INTO address_book.persons (fio, address_id) VALUES ('Petrov Petr Petrovich', 1);
INSERT INTO address_book.persons (fio, address_id) VALUES ('Maximov Maxim Maximovich', 2);
INSERT INTO address_book.persons (fio, address_id) VALUES ('Nikolaev Nikolay Nikolaevich', 3);

INSERT INTO address_book.phones (number, person_id) VALUES ('+7(800)-111-11-11', 1);
INSERT INTO address_book.phones (number, person_id) VALUES ('+7(800)-222-22-22', 1);
INSERT INTO address_book.phones (number, person_id) VALUES ('+7(800)-333-33-33', 2);
INSERT INTO address_book.phones (number, person_id) VALUES ('+7(800)-444-44-44', 4);