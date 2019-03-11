--mydb zameniti sa: avio_prevoznik
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`firma`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`firma` (
  `idfirma` INT NOT NULL,
  `naziv` VARCHAR(45) NULL,
  `adresa` VARCHAR(45) NULL,
  PRIMARY KEY (`idfirma`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`putnik`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`putnik` (
  `idputnik` INT NOT NULL,
  `ime` VARCHAR(45) NULL,
  `prezime` VARCHAR(45) NULL,
  `br_pasosa` VARCHAR(45) NULL,
  `firma_idfirma` INT NOT NULL,
  PRIMARY KEY (`idputnik`, `firma_idfirma`),
  INDEX `fk_putnik_firma1_idx` (`firma_idfirma` ASC),
  CONSTRAINT `fk_putnik_firma1`
    FOREIGN KEY (`firma_idfirma`)
    REFERENCES `mydb`.`firma` (`idfirma`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`racun`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`racun` (
  `idracun` INT NOT NULL,
  `novac` INT NULL,
  `putnik_idputnik` INT NOT NULL,
  `firma_idfirma` INT NOT NULL,
  PRIMARY KEY (`idracun`, `putnik_idputnik`, `firma_idfirma`),
  INDEX `fk_racun_putnik1_idx` (`putnik_idputnik` ASC),
  INDEX `fk_racun_firma1_idx` (`firma_idfirma` ASC),
  CONSTRAINT `fk_racun_putnik1`
    FOREIGN KEY (`putnik_idputnik`)
    REFERENCES `mydb`.`putnik` (`idputnik`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_racun_firma1`
    FOREIGN KEY (`firma_idfirma`)
    REFERENCES `mydb`.`firma` (`idfirma`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`let`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`let` (
  `idlet` INT NOT NULL,
  `od_lokacija` VARCHAR(45) NULL,
  `do_lokacija` VARCHAR(45) NULL,
  `vreme` VARCHAR(45) NULL,
  PRIMARY KEY (`idlet`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`karta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`karta` (
  `idkarta` INT NOT NULL,
  `cena` INT NULL,
  `putnik_idputnik` INT NOT NULL,
  `let_idlet` INT NOT NULL,
  PRIMARY KEY (`idkarta`, `putnik_idputnik`, `let_idlet`),
  INDEX `fk_karta_putnik1_idx` (`putnik_idputnik` ASC),
  INDEX `fk_karta_let1_idx` (`let_idlet` ASC),
  CONSTRAINT `fk_karta_putnik1`
    FOREIGN KEY (`putnik_idputnik`)
    REFERENCES `mydb`.`putnik` (`idputnik`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_karta_let1`
    FOREIGN KEY (`let_idlet`)
    REFERENCES `mydb`.`let` (`idlet`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`putnik_has_let`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`putnik_has_let` (
  `putnik_idputnik` INT NOT NULL,
  `let_idlet` INT NOT NULL,
  `id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_putnik_has_let_let1_idx` (`let_idlet` ASC),
  INDEX `fk_putnik_has_let_putnik_idx` (`putnik_idputnik` ASC),
  CONSTRAINT `fk_putnik_has_let_putnik`
    FOREIGN KEY (`putnik_idputnik`)
    REFERENCES `mydb`.`putnik` (`idputnik`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_putnik_has_let_let1`
    FOREIGN KEY (`let_idlet`)
    REFERENCES `mydb`.`let` (`idlet`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
