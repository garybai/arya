/*
 Navicat Premium Data Transfer

 Source Server         : localhost-developer
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : arya

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 24/11/2019 22:20:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_authority
-- ----------------------------
DROP TABLE IF EXISTS `t_authority`;
CREATE TABLE `t_authority`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `resource` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_authority
-- ----------------------------
INSERT INTO `t_authority` VALUES (1, '系统管理', '/admin/**', '系统管理', 1, '2019-11-24 21:06:17', '2019-11-24 21:06:19');
INSERT INTO `t_authority` VALUES (2, '个人中心', '/ucenter/**', '个人中心', 2, '2019-11-24 21:07:07', '2019-11-24 21:07:09');

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES (1, '系统管理员', '系统管理员', '2019-11-24 21:04:37', '2019-11-24 21:04:40');
INSERT INTO `t_role` VALUES (2, '普通用户', '普通用户', '2019-11-24 21:04:58', '2019-11-24 21:05:00');

-- ----------------------------
-- Table structure for t_role_authority
-- ----------------------------
DROP TABLE IF EXISTS `t_role_authority`;
CREATE TABLE `t_role_authority`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) DEFAULT NULL,
  `auth_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role_authority
-- ----------------------------
INSERT INTO `t_role_authority` VALUES (1, 1, 1);
INSERT INTO `t_role_authority` VALUES (2, 2, 2);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `is_enabled` tinyint(2) DEFAULT NULL,
  `create_time` datetime(0) DEFAULT NULL,
  `update_time` datetime(0) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'admin', NULL, '系统管理员', '13511111111', '2019-11-24', 1, '2019-11-24 21:03:38', '2019-11-24 21:03:41');
INSERT INTO `t_user` VALUES (2, 'gary', NULL, '白', '15011099551', '2019-11-24', 1, '2019-11-24 21:04:07', '2019-11-24 21:04:10');
INSERT INTO `t_user` VALUES (3, 'demoData', 'demoData', 'demoData', 'demoData', '2019-11-24', 1, '2019-11-24 21:50:55', '2019-11-24 21:50:55');
INSERT INTO `t_user` VALUES (4, 'demoData1', 'demoData1', 'demoData1', 'demoData', '2019-11-24', 1, '2019-11-24 21:51:35', '2019-11-24 21:51:35');
INSERT INTO `t_user` VALUES (5, '', 'demoData', 'demoData', 'demoData', '2019-11-24', 1, '2019-11-24 22:02:33', '2019-11-24 22:02:33');

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES (1, 1, 1);
INSERT INTO `t_user_role` VALUES (2, 2, 2);

SET FOREIGN_KEY_CHECKS = 1;
