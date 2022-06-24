CREATE DATABASE db_game_online_generation;

USE db_game_online_generation;

CREATE TABLE tb_characters(

	id BIGINT auto_increment,
	CharacterName VARCHAR(255),
    Class VARCHAR(255),
    Breed VARCHAR(255),
    XP INT,
    
    PRIMARY KEY (id),
    FOREIGN KEY (Class) REFERENCES tb_classes (Class),
    FOREIGN KEY (Breed) REFERENCES tb_breed (Breed)

);

CREATE TABLE tb_classes(

	Class VARCHAR(255),
    Describing VARCHAR(255),
    LifeDice INT,
    PrimarySkill VARCHAR (255),
    PrificienciesInResistance VARCHAR (255),
    
    PRIMARY KEY (Class)

);

CREATE TABLE tb_breed(

	Breed VARCHAR(255),
    Physical VARCHAR(255),
    Trend VARCHAR(255),
    
    PRIMARY KEY (Breed)

);

SELECT * FROM tb_characters;

SELECT * FROM tb_classes;

SELECT * FROM tb_breed;

INSERT INTO tb_breed (Breed, Physical, Trend)
VALUES("Anão", "Baixo e robustos", "Longa memória, longo rancor");
INSERT INTO tb_breed (Breed, Physical, Trend)
VALUES("Elfo", "Esbeltos e graciosos", "Uma perspectiva atemporal");
INSERT INTO tb_breed (Breed, Physical, Trend)
VALUES("Halfing", "Pequenos e práticos", "Generosos e curiosos");
INSERT INTO tb_breed (Breed, Physical, Trend)
VALUES("Gnomo", "Expressões vibrantes", "Dedicação incrível");
INSERT INTO tb_breed (Breed, Physical, Trend)
VALUES("Tiefling", "Linhagem infernal", "Autoconfiança e desconfiança");

INSERT INTO tb_classes (Class, Describing, LifeDice, PrimarySkill, PrificienciesInResistance)
VALUES("Bárbaro", "Um feroz guerreiro de origem primitiva que pode entrar em fúria durante uma batalha", 
12, "Força", "Força & Constituição");
INSERT INTO tb_classes (Class, Describing, LifeDice, PrimarySkill, PrificienciesInResistance)
VALUES("Bardo", "Um místico inspirador que possui poderes que ecoam a música da criação", 
8, "Carismo", "Destreza & Carisma");
INSERT INTO tb_classes (Class, Describing, LifeDice, PrimarySkill, PrificienciesInResistance)
VALUES("Bruxo", "Um portador de magia derivada de barganha com uma entidade planar", 
8, "Carisma", "Sabedoria & Carisma");
INSERT INTO tb_classes (Class, Describing, LifeDice, PrimarySkill, PrificienciesInResistance)
VALUES("Clérigo", "Um campeão sacerdotal que empunha magia divina a serviço de um poder maior", 
8, "Sabedoria", "Sabedoria & Carisma");
INSERT INTO tb_classes (Class, Describing, LifeDice, PrimarySkill, PrificienciesInResistance)
VALUES("Druida", "Um sacerdote da Crença Antiga, detentor dos poderes da natureza – luz da lua e crescimento das plantas, fogo e relâmpagos – e capaz de adotar formas animais", 
8, "Sabedoria", "Inteligência & Sabedoria");
INSERT INTO tb_classes (Class, Describing, LifeDice, PrimarySkill, PrificienciesInResistance)
VALUES("Feiticeiro", "Um conjurador que possui magia latente advinda de um dom ou linhagem", 
6, "Carisma", "Constituição & Carisma");
INSERT INTO tb_classes (Class, Describing, LifeDice, PrimarySkill, PrificienciesInResistance)
VALUES("Guerreiro", "Um mestre do combate, perito em uma vasta gama de armas e armaduras", 
10, "Força ou Destreza", "Força & Constituição");
INSERT INTO tb_classes (Class, Describing, LifeDice, PrimarySkill, PrificienciesInResistance)
VALUES("Ladino", "Um trapaceiro que utiliza de furtividade e astúcia para sobrepujar os obstáculos e inimigos", 
8, "Destreza", "Força e Constituição");
INSERT INTO tb_classes (Class, Describing, LifeDice, PrimarySkill, PrificienciesInResistance)
VALUES("Mago", "Um usuário de magia escolado, capaz de manipular as estruturas da realidade", 
6, "Inteligência", "Inteligência & Sabedoria");
INSERT INTO tb_classes (Class, Describing, LifeDice, PrimarySkill, PrificienciesInResistance)
VALUES("Monge", "Um mestre das artes marciais, utilizando o poder corporal para atingir a perfeição física e espiritual", 
8, "Destreza & Sabedoria", "Força & Destreza");
INSERT INTO tb_classes (Class, Describing, LifeDice, PrimarySkill, PrificienciesInResistance)
VALUES("Paladino", "Um guerreiro divino vinculado a um juramento sagrado", 
10, "Força & Carisma", "Sabedoria & Carismo");

UPDATE tb_classes
SET Describing = "Um feroz guerreiro de origem primitiva que pode entrar em fúria durante uma batalha"
WHERE Class = "Bárbaro";
UPDATE tb_classes 
SET PrimarySkill = "Carisma"
WHERE Class = "Bardo";
UPDATE tb_classes
SET PrificienciesInResistance = "Sabedoria & Carisma"
WHERE Class = "Bruxo";
UPDATE tb_classes
SET PrificienciesInResistance = "Sabedoria & Carisma"
WHERE Class = "Paladino";

INSERT INTO tb_characters (CharacterName, Class, Breed, XP)
VALUES("Ryan Paixão", "Mago", "Elfo", 0);
INSERT INTO tb_characters (CharacterName, Class, Breed, XP)
VALUES("Matheus Lima", "Monge", "Tiefling", 10);
INSERT INTO tb_characters (CharacterName, Class, Breed, XP)
VALUES("Wanessa Koserski", "Druida", "Halfing", 300);

SELECT tb_characters.CharacterName, tb_characters.Breed, tb_characters.Class, tb_classes.PrimarySkill, tb_breed.Trend 
FROM tb_characters  
INNER JOIN tb_classes ON tb_characters.Class = tb_classes.Class
INNER JOIN tb_breed ON tb_characters.Breed = tb_breed.Breed;

SELECT * FROM tb_classes WHERE Class LIKE "b%";