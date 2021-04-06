DROP DATABASE IF EXISTS `mydb`;

CREATE DATABASE IF NOT EXISTS `mydb`;
USE `mydb` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Studio` (
  `idStudio` INT NOT NULL ,
  `nome` VARCHAR(45) NOT NULL,
  `qualidadeAnim` FLOAT NOT NULL,
  `diretorAnimacao` VARCHAR(45) NOT NULL,
  `diretorDublagem` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idStudio`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mydb`.`Editora` (
  `idEditora` INT NOT NULL ,
  `nome` VARCHAR(45) NOT NULL,
  `endereco` VARCHAR(45) NOT NULL,
  `qualidadeServico` FLOAT NOT NULL,
  PRIMARY KEY (`idEditora`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mydb`.`Manga` (
  `idManga` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `autor` VARCHAR(45) NOT NULL,
  `quantCap` INT NOT NULL,
  `edicao` VARCHAR(45) NOT NULL,
  `dataLancamento` DATE NOT NULL,
  PRIMARY KEY (`idManga`))
ENGINE = InnoDB;

SET FOREIGN_KEY_CHECKS=0;
CREATE TABLE IF NOT EXISTS `mydb`.`Anime` (
  `idAnime` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `protagonista` VARCHAR(45) NOT NULL,
  `quantidadeEP` INT NOT NULL,
  `notaAnime` VARCHAR(45) NOT NULL,
  `Studio_idStudio` INT NOT NULL,
  `Editora_idEditora` INT NOT NULL,
  `Manga_idManga` INT NULL,
  PRIMARY KEY (`idAnime`),
  INDEX `fk_Anime_Studio_idx` (`Studio_idStudio` ASC),
  INDEX `fk_Anime_Editora1_idx` (`Editora_idEditora` ASC),
  INDEX `fk_Anime_Manga1_idx` (`Manga_idManga` ASC),
  CONSTRAINT `fk_Anime_Studio`
    FOREIGN KEY (`Studio_idStudio`)
    REFERENCES `mydb`.`Studio` (`idStudio`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Anime_Editora1`
    FOREIGN KEY (`Editora_idEditora`)
    REFERENCES `mydb`.`Editora` (`idEditora`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Anime_Manga1`
    FOREIGN KEY (`Manga_idManga`)
    REFERENCES `mydb`.`Manga` (`idManga`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
   ENGINE = InnoDB;
 SET FOREIGN_KEY_CHECKS=1;

INSERT INTO mydb.Editora(idEditora, nome, endereco, qualidadeServico) VALUES
(0, 'JornalTk', 'rua 24, centro', 7.6),
(1, 'EditaAbril', 'rua 15, leste', 8.1),
(2, 'Taka', 'rua 09, sul', 8.4);
#select * from mydb.Editora;

INSERT INTO mydb.Studio (idStudio, nome, qualidadeAnim, diretorAnimacao, diretorDublagem) VALUES
(0, 'Toeii', '9.6', 'Haku', 'Zabuza'),
(1, 'MadHouse', '8.4', 'Ino', 'Sakura'),
(2, 'TvTokio', '7.2', 'Toneri', 'Choji');
#select * from mydb.Studio;

INSERT INTO mydb.manga (nome, autor, quantCap, edicao, dataLancamento) VALUES 
('Death note', 'Akira', 37 ,'2ª', '2003-11-17'),
('Akame Ga kill', 'Akira', 41 ,'4ª', '2007-04-03'),
('Naruto', 'Hashimoto', 42 ,'6ª', '2004-08-19'),
('Boruto', 'Akira', 375 ,'1ª', '2009-10-06'),
('Black Clover', 'Akira', 96 ,'8ª', '2011-01-08');

INSERT INTO mydb.Anime (nome, protagonista, quantidadeEp, notaAnime, Studio_idStudio, Editora_idEditora, Manga_idManga) VALUES
('Naruto', 'Madara', 723, '9.8', 1, 1, 1),
('Dr Stone', 'Senku', 32, '9.4', 0, 2, 2);


select * from Anime;
select * from Manga;


