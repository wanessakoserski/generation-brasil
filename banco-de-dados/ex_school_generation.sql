CREATE DATABASE db_school;

USE db_school;

CREATE TABLE tb_students(

	Registration BIGINT auto_increment,
	NameStudent VARCHAR(255),
    Age INT,
    Classroom INT,
    AnnualGradeAverage DECIMAL(5,1),
    
    PRIMARY KEY (Registration)

);

SELECT * FROM tb_students;

INSERT INTO tb_students (NameStudent, Age, Classroom, AnnualGradeAverage)
VALUES ("Ryan Paixão", 19, 341, 8.2);

INSERT INTO tb_students (NameStudent, Age, Classroom, AnnualGradeAverage)
VALUES ("Marcelo Santos", 23, 560, 9.0);

INSERT INTO tb_students (NameStudent, Age, Classroom, AnnualGradeAverage)
VALUES ("Matheus Lima", 23, 102, 7.5);

INSERT INTO tb_students (NameStudent, Age, Classroom, AnnualGradeAverage)
VALUES ("Wanessa Koserski", 20, 202, 4.2);

INSERT INTO tb_students (NameStudent, Age, Classroom, AnnualGradeAverage)
VALUES ("Jessica Lopes", 25, 341, 6.0);

INSERT INTO tb_students (NameStudent, Age, Classroom, AnnualGradeAverage)
VALUES ("Fernanda Neves", 22, 111, 4.8);

INSERT INTO tb_students (NameStudent, Age, Classroom, AnnualGradeAverage)
VALUES ("Matheus Victor", 19, 316, 5.9);

INSERT INTO tb_students (NameStudent, Age, Classroom, AnnualGradeAverage)
VALUES ("Dario Reis", 23, 298, 9.9);

SELECT * FROM tb_students WHERE AnnualGradeAverage > 7.0;

SELECT * FROM tb_students WHERE AnnualGradeAverage < 7.0;

UPDATE tb_students SET AnnualGradeAverage = 10 WHERE Registration = 4;