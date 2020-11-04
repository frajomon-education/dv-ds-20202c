DROP IF EXISTS `prendas`;

CREATE TABLE `prendas` (
  `prd_id` bigint NOT NULL AUTO_INCREMENT,
  `prd_description` varchar(255) DEFAULT NULL,
  `prd_precio_base` double DEFAULT NULL,
  `prd_tipo_prenda` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`prd_id`)
)