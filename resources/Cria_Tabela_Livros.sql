CREATE TABLE `biblioteca`.`livros` (
  `idlivros` INT NOT NULL AUTO_INCREMENT,
  `Titulo` VARCHAR(45) NOT NULL,
  `Serie` VARCHAR(45) NULL,
  `Autor` VARCHAR(45) NOT NULL,
  `Volume` VARCHAR(45) NULL,
  `DataCompra` DATE NOT NULL,
  PRIMARY KEY (`idlivros`));