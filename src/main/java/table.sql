CREATE TABLE IF NOT EXISTS users
(

    id         serial primary key,
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    username   VARCHAR(255),
    password   VARCHAR(255)

);