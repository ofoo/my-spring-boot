﻿# Host: localhost  (Version 5.7.35-log)
# Date: 2022-01-01 21:35:59
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "beauty"
#

DROP TABLE IF EXISTS `beauty`;
CREATE TABLE `beauty` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `photo` varchar(255) DEFAULT NULL COMMENT '照片',
  `age` tinyint(3) DEFAULT NULL COMMENT '年龄',
  `gender` tinyint(3) DEFAULT NULL COMMENT '性别 0未知 1男 2女',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `add_time` datetime DEFAULT NULL COMMENT '添加时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
  `del_status` varchar(255) DEFAULT NULL COMMENT '删除状态 0正常 1删除',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COMMENT='女神';

#
# Data for table "beauty"
#

INSERT INTO `beauty` VALUES (1,'郭碧婷',NULL,22,2,NULL,'2022-01-01 11:07:04',NULL,'2022-01-01 18:03:26','0'),(2,'唐嫣',NULL,22,2,NULL,'2022-01-01 11:08:31',NULL,'2022-01-01 18:04:24','0'),(3,'张庭',NULL,22,2,NULL,'2022-01-01 13:13:50',NULL,'2022-01-01 18:04:40','0'),(4,'关晓彤',NULL,22,2,NULL,'2022-01-01 13:15:09',NULL,'2022-01-01 18:04:42','0'),(5,'韩雪',NULL,22,2,NULL,'2022-01-01 13:15:19',NULL,'2022-01-01 18:04:43','0'),(6,'张天爱',NULL,22,2,NULL,'2022-01-01 13:15:52',NULL,'2022-01-01 18:04:43','0'),(7,'贾青',NULL,22,2,NULL,'2022-01-01 13:16:15',NULL,'2022-01-01 18:04:44','0'),(8,'虞书欣',NULL,22,2,NULL,'2022-01-01 13:17:00',NULL,'2022-01-01 18:04:45','0'),(9,'江疏影',NULL,22,2,NULL,'2022-01-01 13:17:17',NULL,'2022-01-01 18:04:46','0'),(10,'吴宣仪',NULL,22,2,NULL,'2022-01-01 13:17:33',NULL,'2022-01-01 18:04:46','0'),(11,'123',NULL,123,1,NULL,'2022-01-01 18:05:46',NULL,NULL,'0'),(12,'刘诗诗',NULL,22,2,NULL,'2022-01-01 21:26:01',NULL,NULL,'0'),(13,'杨紫',NULL,22,2,NULL,'2022-01-01 21:29:39',NULL,NULL,'0'),(14,'白百何',NULL,22,2,NULL,'2022-01-01 21:30:14',NULL,NULL,'0'),(15,'12312',NULL,22,2,'2022-01-01 00:00:00','2022-01-01 21:31:40',NULL,NULL,'0'),(16,'12342134',NULL,12,2,NULL,'2022-01-01 21:32:25',NULL,NULL,'0');
