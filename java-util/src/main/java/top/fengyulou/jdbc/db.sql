CREATE DATABASE chapter01;
USE chapter01;
CREATE TABLE users(
                      id INT PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(40),
                      password VARCHAR(40),
                      email VARCHAR(60),
                      birthday DATE
)CHARACTER SET utf8 COLLATE utf8_general_ci;

INSERT INTO users (name,password,email,birthday)
VALUES ('zs','123456','zs@sina.com','1980-12-04'),('lisi','123456','lisi@sina.com','1981-12-04'),('wangwu','123456','wangwu@sina.com','1979-12-04')