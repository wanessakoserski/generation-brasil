CREATE DATABASE db_products;

USE db_products;

CREATE TABLE tb_product(

	Number_Serie VARCHAR(20) primary key NOT NULL,
	NameProduct VARCHAR(255) NOT NULL,
    Brand VARCHAR(255),
    Price DECIMAL(9,2),
    InStock BOOLEAN NOT NULL

);

SELECT * FROM tb_product;

INSERT INTO tb_product (Number_Serie, NameProduct, Brand, Price, InStock) 
VALUES ("MTKUA04045003D23W01", "Monitor Gamer 23.8 LED Full HD", "Acer", 1199.90, true);

INSERT INTO tb_product (Number_Serie, NameProduct, Brand, Price, InStock) 
VALUES ("PRTLF04945773G23P21", "Cadeira Gamer Leather Branco", "Alpha Gamer", 2099.90, false);

INSERT INTO tb_product (Number_Serie, NameProduct, Brand, Price, InStock) 
VALUES ("MOLFG12227005H23M11", "Fone de Ouvido Bluetooth", "Edifier", 199.90, true);

INSERT INTO tb_product (Number_Serie, NameProduct, Brand, Price, InStock) 
VALUES ("PLJGR10247025J23J00", "Combo Teclado e Mouse sem fio", "Logitech", 133.90, true);

INSERT INTO tb_product (Number_Serie, NameProduct, Brand, Price, InStock) 
VALUES ("LLMBR82937005G00S77", "Notebook 15.6', 8GB RAM, SSD 256GB, Windows 11 Home", "ASUS", 1899.90, false);

INSERT INTO tb_product (Number_Serie, NameProduct, Brand, Price, InStock) 
VALUES ("PPJGD00721027L00K98", "Mesa digitalizadora pequena", "Wacom", 219.90, true);

INSERT INTO tb_product (Number_Serie, NameProduct, Brand, Price, InStock) 
VALUES ("AFGTA00001267K12M22", "Smartphone 128GB, 6GB RAM", "Samsung", 2149.00, true);

INSERT INTO tb_product (Number_Serie, NameProduct, Brand, Price, InStock) 
VALUES ("GOLFE92735140A44F32", "Caixa de Som Gamer 6W, USB/P2, Rainbow", "Husky Gaming", 74.90, true);

SELECT * FROM tb_product WHERE Price > 500;

SELECT * FROM tb_product WHERE Price < 500;

UPDATE tb_product SET InStock = false WHERE Number_Serie = "GOLFE92735140A44F32";