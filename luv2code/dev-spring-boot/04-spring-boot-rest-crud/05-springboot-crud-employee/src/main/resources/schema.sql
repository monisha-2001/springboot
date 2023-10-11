CREATE TABLE employee (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(45) DEFAULT NULL,
    last_name VARCHAR(45) DEFAULT NULL,
    email VARCHAR(45) DEFAULT NULL,
    PRIMARY KEY (id)

);

INSERT INTO employee VALUES
    (1,'Monisha','basavaraju','monisha@gmail.com'),
    (2,'Manoj','Gowda','manoj@gmail.com'),
    (3,'Gautham','Gowda','gautham@gmail.com'),
    (4,'Moulya','Gnana','moulya@gmail.com'),
    (5,'Lavanya','Ranga','lavanya@gmail.com');

