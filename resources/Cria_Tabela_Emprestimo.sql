CREATE TABLE `biblioteca`.`emprestimo` (
  `idEmprestimo` INT NOT NULL,
  `PessoaID` INT NOT NULL,
  `LivroID` INT NOT NULL,
  `DataEmprestimo` DATE NOT NULL,
  PRIMARY KEY (`idEmprestimo`),
  INDEX `PessoaID_idx` (`PessoaID` ASC) VISIBLE,
  INDEX `LivroID_idx` (`LivroID` ASC) VISIBLE,
  CONSTRAINT `PessoaID`
    FOREIGN KEY (`PessoaID`)
    REFERENCES `biblioteca`.`pessoas` (`PessoaID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `LivroID`
    FOREIGN KEY (`LivroID`)
    REFERENCES `biblioteca`.`livros` (`idlivros`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
