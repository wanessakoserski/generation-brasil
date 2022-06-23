-- comentário

-- criação do banco de dados
CREATE DATABASE db_rh_generation;

-- indica que banco de dados vai ser utilizado/manipulado
USE db_rh_generation;

-- criar tabelas
CREATE TABLE tb_funcionarios(

	id BIGINT auto_increment,
    nome VARCHAR(255), 
    salario DECIMAL(9,2),
    setor VARCHAR(255),
    
    PRIMARY KEY (id) -- ou id BIGINT PRIMARY KEY auto_increment;

);

-- *a partir daqui paramos de mexer com modelagem e passamos a usar linguagem de manipulação de dados

-- traz todos os dados da tabela funcionarios
SELECT * FROM tb_funcionarios;

SELECT id, nome, salario FROM tb_funcionarios WHERE salario > 2000;
SELECT id, nome, salario FROM tb_funcionarios WHERE salario < 2000;

SELECT nome, COUNT(nome) FROM tb_funcionarios GROUP BY nome;

-- inserir dados
INSERT INTO tb_funcionarios (nome, salario, setor) VALUES ("Beatriz", 10000.60, "Analista de Sistemas");

-- modificar linha já existente
-- SET SQL_SAFE_UPDATES = 0;
UPDATE tb_funcionarios SET salario = 1000.99 WHERE id = 3;

DELETE FROM tb_funcionarios WHERE id = 1 AND nome = "Jessica Lopes";
DELETE FROM tb_funcionarios WHERE id = 6;
