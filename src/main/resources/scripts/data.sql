INSERT INTO BOOK (TITLE) VALUES ('book-3');
SET @book1 = LAST_INSERT_ID();
INSERT INTO BOOK (TITLE) VALUES ('book-4');
SET @book2 = LAST_INSERT_ID();

INSERT INTO CUSTOMER (firstName) VALUES ('homie');
SET @customer1 = LAST_INSERT_ID();
INSERT INTO CUSTOMER (firstName) VALUES ('Lord albaticus');
SET @customer2 = LAST_INSERT_ID();


