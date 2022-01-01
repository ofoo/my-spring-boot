# Host: localhost  (Version 5.7.3-m13)
# Date: 2022-01-01 11:32:42
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='女神';

#
# Data for table "beauty"
#

INSERT INTO `beauty` VALUES (1,'郭碧婷',NULL,22,2,NULL,'2022-01-01 11:07:04',NULL,NULL,'0'),(2,'唐嫣',NULL,22,2,NULL,'2022-01-01 11:08:31',NULL,NULL,'0');
