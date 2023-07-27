DROP SCHEMA IF EXISTS `vet-clinic`;

CREATE SCHEMA `vet-clinic`;

use `vet-clinic`;

SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE `owner` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `phone_number` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)

) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;


CREATE TABLE `pet` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(256) DEFAULT NULL,
  `breed` varchar(256) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `weight` double DEFAULT NULL,
  `owner_id` int DEFAULT NULL,

  PRIMARY KEY (`id`),

  KEY `FK_OWNER_ID_idx` (`owner_id`),

  CONSTRAINT `FK_OWNER` 
  FOREIGN KEY (`owner_id`) 
  REFERENCES `owner` (`id`) 

  ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


SET FOREIGN_KEY_CHECKS = 1;
