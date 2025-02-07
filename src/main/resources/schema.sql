-- src/main/resources/schema.sql

DROP TABLE IF EXISTS person;
CREATE TABLE person
(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    message VARCHAR(1024)
);
