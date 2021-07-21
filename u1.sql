/*
SQLyog Ultimate v12.14 (64 bit)
MySQL - 5.7.31 : Database - u1
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`u1` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `u1`;

/*Table structure for table `mguser` */

DROP TABLE IF EXISTS `mguser`;

CREATE TABLE `mguser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `mguser` */

insert  into `mguser`(`id`,`username`,`password`) values 
(1,'123456','123456');

/*Table structure for table `option` */

DROP TABLE IF EXISTS `option`;

CREATE TABLE `option` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `topicid` int(11) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `option` */

/*Table structure for table `test` */

DROP TABLE IF EXISTS `test`;

CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `loginname` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `loginpwd` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `power` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

/*Data for the table `test` */

insert  into `test`(`id`,`loginname`,`loginpwd`,`age`,`name`,`power`) values 
(1,'lll','88',999,'啦啦啦',1),
(2,'kk','88',15,'成',1),
(5,'cc','5656',26,'cici',0),
(6,'ljm','100423',21,'李金梦',0);

/*Table structure for table `topic` */

DROP TABLE IF EXISTS `topic`;

CREATE TABLE `topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `startTime` date DEFAULT NULL,
  `endTime` date DEFAULT NULL,
  `isStart` int(1) DEFAULT NULL,
  `option1` varchar(255) DEFAULT NULL,
  `option2` varchar(255) DEFAULT NULL,
  `option3` varchar(255) DEFAULT NULL,
  `option4` varchar(255) DEFAULT NULL,
  `count1` int(4) DEFAULT NULL,
  `count2` int(4) DEFAULT NULL,
  `count3` int(4) DEFAULT NULL,
  `count4` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `topic` */

insert  into `topic`(`id`,`title`,`startTime`,`endTime`,`isStart`,`option1`,`option2`,`option3`,`option4`,`count1`,`count2`,`count3`,`count4`) values 
(3,'什么最好','2021-05-04','2021-06-02',0,'选项1','选项2','选项3','选项4',0,1,0,4),
(5,'你好11','2021-06-02','2021-06-02',0,'好','很好','非常好','',1,2,1,1),
(7,'6666','2021-06-06','2021-06-06',0,'1','2','3','4',2,0,0,1),
(8,'你的爱好','2021-06-03','2021-06-03',0,'篮球','足球','乒乓球','排球',1,0,0,0);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`) values 
(1,'123','123'),
(2,'admin','123456'),
(37,'xuhao','xuhao'),
(40,'whl','whl'),
(56,'刘瑞','123456');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
