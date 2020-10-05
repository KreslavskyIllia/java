CREATE TABLE `users`.`users` (
`id` INT(10) NOT NULL AUTO_INCREMENT ,
`nickname` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`login` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`password` VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL , PRIMARY KEY (`id`)
) ENGINE = InnoDB;