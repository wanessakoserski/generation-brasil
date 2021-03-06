-- MySQL Script generated by MySQL Workbench
-- seg 27 jun 2022 11:17:53
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema personal_blog
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema personal_blog
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `personal_blog` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
USE `personal_blog` ;

-- -----------------------------------------------------
-- Table `personal_blog`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `personal_blog`.`categories` (
  `id_category` BIGINT NOT NULL AUTO_INCREMENT,
  `category` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_category`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `personal_blog`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `personal_blog`.`user` (
  `email` VARCHAR(255) NOT NULL,
  `username` VARCHAR(16) NOT NULL,
  `password` VARCHAR(32) NOT NULL,
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`email`));


-- -----------------------------------------------------
-- Table `personal_blog`.`games`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `personal_blog`.`games` (
  `id_game` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `description` VARCHAR(255) NULL,
  `console` VARCHAR(255) NULL,
  `price` DECIMAL(10,2) NULL,
  `photo` VARCHAR(255) NOT NULL,
  `category` VARCHAR(255) NOT NULL,
  `category` BIGINT NOT NULL,
  `email` VARCHAR(255) NULL,
  PRIMARY KEY (`id_game`),
  INDEX `fk_games_categories_idx` (`category` ASC) VISIBLE,
  INDEX `fk_user1_idx` (`email` ASC) VISIBLE,
  CONSTRAINT `fk_games_categories`
    FOREIGN KEY (`category`)
    REFERENCES `personal_blog`.`categories` (`id_category`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user1`
    FOREIGN KEY (`email`)
    REFERENCES `personal_blog`.`user` (`email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `personal_blog`.`themes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `personal_blog`.`themes` (
  `id_theme` BIGINT NOT NULL AUTO_INCREMENT,
  `theme` VARCHAR(255) NOT NULL,
  `color` VARCHAR(7) NOT NULL,
  PRIMARY KEY (`id_theme`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `personal_blog`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `personal_blog`.`user` (
  `email` VARCHAR(255) NOT NULL,
  `username` VARCHAR(16) NOT NULL,
  `password` VARCHAR(32) NOT NULL,
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`email`));


-- -----------------------------------------------------
-- Table `personal_blog`.`post`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `personal_blog`.`post` (
  `id_post` INT(6) UNSIGNED NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `text` VARCHAR(1000) NOT NULL,
  `data` DATE NULL,
  `user` VARCHAR(255) NOT NULL,
  `image` VARCHAR(255) NULL,
  `theme` VARCHAR(255) NULL,
  `email` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_post`),
  INDEX `fk_user2_idx` (`email` ASC) VISIBLE,
  CONSTRAINT `fk_user2`
    FOREIGN KEY (`email`)
    REFERENCES `personal_blog`.`user` (`email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `personal_blog`.`themes_has_post`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `personal_blog`.`themes_has_post` (
  `id_theme` BIGINT NOT NULL,
  `id_post` INT(6) UNSIGNED NOT NULL,
  PRIMARY KEY (`id_theme`, `id_post`),
  INDEX `fk_post1_idx` (`id_post` ASC) VISIBLE,
  INDEX `fk_themes1_idx` (`id_theme` ASC) VISIBLE,
  CONSTRAINT `fk_themes1`
    FOREIGN KEY (`id_theme`)
    REFERENCES `personal_blog`.`themes` (`id_theme`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_post1`
    FOREIGN KEY (`id_post`)
    REFERENCES `personal_blog`.`post` (`id_post`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
