/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.20 : Database - bs_text2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bs_text2` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bs_text2`;

/*Table structure for table `dv_power_dict` */

DROP TABLE IF EXISTS `dv_power_dict`;

CREATE TABLE `dv_power_dict` (
  `power_id` int(20) NOT NULL AUTO_INCREMENT,
  `power_name` varchar(20) NOT NULL COMMENT '权限名称',
  `power_parent_id` int(20) unsigned DEFAULT '0' COMMENT '父级id',
  PRIMARY KEY (`power_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `dv_power_dict` */

insert  into `dv_power_dict`(`power_id`,`power_name`,`power_parent_id`) values (1,'资产管理',0),(2,'维修资产',1),(3,'租借资产',1),(4,'闲置资产',1),(5,'历史记录',0),(6,'维修记录',5),(7,'租借记录',5),(8,'报废记录',5),(9,'系统管理',0),(10,'人员管理',9),(11,'日志管理',9),(12,'其他',9),(13,'数据可视化',0),(14,'资产列表',1);

/*Table structure for table `dv_user_power` */

DROP TABLE IF EXISTS `dv_user_power`;

CREATE TABLE `dv_user_power` (
  `userp_id` varchar(20) NOT NULL,
  `dv_user_id` varchar(20) NOT NULL,
  `dv_power_id` varchar(20) NOT NULL,
  PRIMARY KEY (`userp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dv_user_power` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
