# Host: localhost  (Version 5.7.3-m13)
# Date: 2021-12-17 23:56:46
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `perms` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'guobiting','123456','user:add'),(2,'tangyan','123456',NULL),(3,'guochao','123456','user:update');
