/*
 Navicat Premium Data Transfer

 Source Server         : tms本地
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost:3306
 Source Schema         : test1

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : 65001

 Date: 17/01/2022 16:01:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户账户',
  `user_pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
  `user_token` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户token',
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `delete_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除人',
  `delete_time` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  `is_delete` tinyint(1) UNSIGNED NULL DEFAULT 0 COMMENT '0存在，1删除',
  `version` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1.0' COMMENT '版本号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'zhangsan', '123456', NULL, NULL, '2021-12-29 09:48:47', NULL, '2021-12-29 09:48:51', NULL, NULL, 0, '1.0');
INSERT INTO `user` VALUES (2, 'lisi', '654321', NULL, NULL, '2021-12-30 13:15:08', NULL, '2021-12-30 13:15:21', NULL, NULL, 0, '1.0');
INSERT INTO `user` VALUES (3, 'wangwu', '123', NULL, NULL, '2022-01-17 11:33:30', NULL, '2022-01-17 11:33:30', NULL, NULL, 0, '1.0');
INSERT INTO `user` VALUES (4, 'zhaoliu', '145236', NULL, NULL, '2022-01-17 11:41:31', NULL, '2022-01-17 11:43:07', NULL, NULL, 0, '1.0');

SET FOREIGN_KEY_CHECKS = 1;
