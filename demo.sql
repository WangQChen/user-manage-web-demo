/*
 Navicat Premium Dump SQL

 Source Server         : MySQL80
 Source Server Type    : MySQL
 Source Server Version : 80017 (8.0.17)
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 80017 (8.0.17)
 File Encoding         : 65001

 Date: 24/08/2024 14:03:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录名',
  `user_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `sex` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `email` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `address` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (0, 'wqc', '王锜琛', '123', '男', '1347745821@qq.com', '天津市南开大学泰达校区');
INSERT INTO `user` VALUES (1, 'lisi1', '李四1', '123', '男', '777@qq.com', '北京市');
INSERT INTO `user` VALUES (5, 'lisi5', '李四5', '123', '男', '777@qq.com', '北京市');
INSERT INTO `user` VALUES (6, 'zhangsan1', '张三1', '123', '男', '888@qq.com', '武汉市');
INSERT INTO `user` VALUES (7, 'zhangsan2', '张三2', '123', '男', '888@qq.com', '武汉市');
INSERT INTO `user` VALUES (8, 'zhangsan3', '张三3', '123', '男', '888@qq.com', '武汉市');
INSERT INTO `user` VALUES (9, 'zhangsan4', '张三4', '123', '男', '888@qq.com', '武汉市');
INSERT INTO `user` VALUES (10, 'zhangsan5', '张三5', '123', '男', '888@qq.com', '武汉市');

SET FOREIGN_KEY_CHECKS = 1;
