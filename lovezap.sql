/*
Navicat MySQL Data Transfer

Source Server         : lovezap
Source Server Version : 50508
Source Host           : localhost:3306
Source Database       : lovezap

Target Server Type    : MYSQL
Target Server Version : 50508
File Encoding         : 65001

Date: 2020-07-25 20:33:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ackind
-- ----------------------------
DROP TABLE IF EXISTS `ackind`;
CREATE TABLE `ackind` (
  `activity` varchar(20) NOT NULL,
  `times` int(20) DEFAULT NULL,
  PRIMARY KEY (`activity`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of ackind
-- ----------------------------
INSERT INTO `ackind` VALUES ('basketball', '3');
INSERT INTO `ackind` VALUES ('movies', '1');
INSERT INTO `ackind` VALUES ('others', '1');

-- ----------------------------
-- Table structure for activity
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `items` varchar(10) DEFAULT NULL,
  `id` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of activity
-- ----------------------------
INSERT INTO `activity` VALUES ('basketball', '1');
INSERT INTO `activity` VALUES ('movies', '2');
INSERT INTO `activity` VALUES ('others', '3');

-- ----------------------------
-- Table structure for basketball
-- ----------------------------
DROP TABLE IF EXISTS `basketball`;
CREATE TABLE `basketball` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `play` varchar(10) DEFAULT NULL,
  `happy` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=778 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of basketball
-- ----------------------------
INSERT INTO `basketball` VALUES ('720', 'zap', 'no', 'soso');
INSERT INTO `basketball` VALUES ('721', 'zap', '没', 'emmmm');
INSERT INTO `basketball` VALUES ('722', 'zap', '没', '。');

-- ----------------------------
-- Table structure for movies
-- ----------------------------
DROP TABLE IF EXISTS `movies`;
CREATE TABLE `movies` (
  `id` int(10) DEFAULT NULL,
  `movie` varchar(20) NOT NULL,
  `time` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`movie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of movies
-- ----------------------------
INSERT INTO `movies` VALUES ('10001', '不能说的秘密', '20200721');

-- ----------------------------
-- Table structure for myactivities
-- ----------------------------
DROP TABLE IF EXISTS `myactivities`;
CREATE TABLE `myactivities` (
  `items` varchar(20) DEFAULT NULL,
  `id` varchar(20) DEFAULT NULL,
  `state` varchar(30) DEFAULT NULL,
  `towrite` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of myactivities
-- ----------------------------
INSERT INTO `myactivities` VALUES ('720', '1', '开心 找到场地 第一天', '投不准 我要加油！');
INSERT INTO `myactivities` VALUES ('721', '2', '开心 第二天', '加油！');
INSERT INTO `myactivities` VALUES ('722', '3', '开心', '加油');
INSERT INTO `myactivities` VALUES ('10001', '4', '不能说的秘密', '伦渣');
INSERT INTO `myactivities` VALUES ('白夜行', '5', '7.22看完', '真的挺好看');
