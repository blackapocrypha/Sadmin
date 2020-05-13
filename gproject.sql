/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50556
 Source Host           : localhost:3306
 Source Schema         : gproject

 Target Server Type    : MySQL
 Target Server Version : 50556
 File Encoding         : 65001

 Date: 21/04/2020 10:33:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admindetils
-- ----------------------------
DROP TABLE IF EXISTS `admindetils`;
CREATE TABLE `admindetils`  (
  `username` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录名',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(29) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `urlimg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admindetils
-- ----------------------------
INSERT INTO `admindetils` VALUES ('17860252026', '17860252026', '2818236732@qq.com', 'images/adminimg/t2.png');
INSERT INTO `admindetils` VALUES ('15263661537', '15263661537', '2818236732@qq.com', 'images/adminimg/t4.png');

-- ----------------------------
-- Table structure for admintalkroom
-- ----------------------------
DROP TABLE IF EXISTS `admintalkroom`;
CREATE TABLE `admintalkroom`  (
  `id` int(7) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `year` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年',
  `month` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '月',
  `day` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '日',
  `message-to-send` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言信息',
  `hour` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '小时',
  `minute` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分钟',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admintalkroom
-- ----------------------------
INSERT INTO `admintalkroom` VALUES (1, '17860252026', '2020', '4', '16', '1', '10', '26');
INSERT INTO `admintalkroom` VALUES (2, '17860252026', '2020', '4', '18', '123213', '9', '45');
INSERT INTO `admintalkroom` VALUES (3, '17860252026', '2020', '4', '18', 'asdsadsa', '10', '22');
INSERT INTO `admintalkroom` VALUES (4, '17860252026', '2020', '4', '18', '123123123', '11', '24');
INSERT INTO `admintalkroom` VALUES (5, '10086', '2020', '4', '18', '10086', '12', '29');

-- ----------------------------
-- Table structure for blog_aapptalk
-- ----------------------------
DROP TABLE IF EXISTS `blog_aapptalk`;
CREATE TABLE `blog_aapptalk`  (
  `btid` int(5) NOT NULL AUTO_INCREMENT COMMENT '留言id',
  `tname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言者昵称',
  `kissid` int(5) NULL DEFAULT NULL COMMENT '与被留言者关系绑定的id',
  `talktime` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言时间',
  `talk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言内容',
  `imgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言者头像链接',
  PRIMARY KEY (`btid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表用于记录【博客】下【安卓app】页面的留言信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blog_aapptalk
-- ----------------------------
INSERT INTO `blog_aapptalk` VALUES (1, 'admin', NULL, '2020年3月27日10时0分', 'hello everyone,这是安卓应用下载的一条测试数据', 'http://www.pslywebsite.top/imgfactory/useimg/timg.jpg');
INSERT INTO `blog_aapptalk` VALUES (2, '管理员01', 1, '2020年3月29日10时40分', '@admin<br>这是安卓界面的一条测试回复', 'http://www.pslywebsite.top/tools/img/defaultT/default3.jpg');

-- ----------------------------
-- Table structure for blog_agametalk
-- ----------------------------
DROP TABLE IF EXISTS `blog_agametalk`;
CREATE TABLE `blog_agametalk`  (
  `btid` int(5) NOT NULL AUTO_INCREMENT COMMENT '留言者id',
  `tname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言者昵称',
  `kissid` int(5) NULL DEFAULT NULL COMMENT '与被留言者关系绑定的id',
  `talktime` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言时间',
  `talk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言内容',
  `imgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言者头像地址',
  PRIMARY KEY (`btid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表用于记录【博客】下【安卓游戏】页面的留言信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blog_agametalk
-- ----------------------------
INSERT INTO `blog_agametalk` VALUES (1, 'admin', NULL, '2020年3月27日10时0分', 'hello everyone,这是安卓游戏下载的一条测试数据', 'http://www.pslywebsite.top/imgfactory/useimg/timg.jpg');
INSERT INTO `blog_agametalk` VALUES (4, '管理员01', 1, '2020年3月29日12时39分', '@admin<br>这是测试安卓游戏贴回复', 'http://www.pslywebsite.top/tools/img/defaultT/default3.jpg');

-- ----------------------------
-- Table structure for blog_musictalk
-- ----------------------------
DROP TABLE IF EXISTS `blog_musictalk`;
CREATE TABLE `blog_musictalk`  (
  `btid` int(5) NOT NULL AUTO_INCREMENT COMMENT '留言者id',
  `tname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言者昵称',
  `kissid` int(5) NULL DEFAULT NULL COMMENT '与被留言者关系绑定的id',
  `talktime` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言时间',
  `talk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言内容',
  `imgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言者头像地址',
  PRIMARY KEY (`btid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表用于记录【博客】下【音乐资源】页面的留言信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blog_musictalk
-- ----------------------------
INSERT INTO `blog_musictalk` VALUES (1, 'admin', NULL, '2020年3月29日12时39分', 'hello everyone,这是音乐资源下载的一条测试数据', 'http://www.pslywebsite.top/imgfactory/useimg/timg.jpg');
INSERT INTO `blog_musictalk` VALUES (5, '管理员01', 1, '2020年3月29日19时56分', '@admin<br>音乐资源页测试回复', 'http://www.pslywebsite.top/tools/img/defaultT/default3.jpg');

-- ----------------------------
-- Table structure for blog_pcgametalk
-- ----------------------------
DROP TABLE IF EXISTS `blog_pcgametalk`;
CREATE TABLE `blog_pcgametalk`  (
  `btid` int(5) NOT NULL AUTO_INCREMENT COMMENT '留言者id',
  `tname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言者昵称',
  `kissid` int(5) NULL DEFAULT NULL COMMENT '与被留言者关系绑定的id',
  `talktime` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言时间',
  `talk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言内容',
  `imgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言者头像地址',
  PRIMARY KEY (`btid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表用于记录【博客】下【电脑游戏】页面的留言信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blog_pcgametalk
-- ----------------------------
INSERT INTO `blog_pcgametalk` VALUES (1, 'admin', NULL, '2020年3月29日12时39分', 'hello everyone,这是PC游戏提取界面的一条测试数据', 'http://www.pslywebsite.top/imgfactory/useimg/timg.jpg');
INSERT INTO `blog_pcgametalk` VALUES (5, '管理员01', NULL, '2020年3月29日17时18分', '还是一条测试', 'http://www.pslywebsite.top/tools/img/defaultT/default3.jpg');

-- ----------------------------
-- Table structure for blog_talk
-- ----------------------------
DROP TABLE IF EXISTS `blog_talk`;
CREATE TABLE `blog_talk`  (
  `btid` int(10) NOT NULL AUTO_INCREMENT COMMENT '留言者id',
  `tname` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言者昵称',
  `kissid` int(10) NULL DEFAULT NULL COMMENT '与被留言者关系绑定的id',
  `talktime` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言时间',
  `talk` varchar(301) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言内容',
  `imgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言者头像地址',
  PRIMARY KEY (`btid`) USING BTREE,
  INDEX `tname`(`tname`) USING BTREE,
  INDEX `kissid`(`kissid`) USING BTREE,
  INDEX `imgurl`(`imgurl`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表用于记录【博客】下【在线工具】页面的留言信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blog_talk
-- ----------------------------
INSERT INTO `blog_talk` VALUES (1, 'admin', NULL, '2020年3月26日0时0分', 'hello everyone,这是一条测试数据', 'http://www.pslywebsite.top/imgfactory/useimg/timg.jpg');
INSERT INTO `blog_talk` VALUES (3, '管理员01', NULL, '2020年3月27日10时0分', '这也是一条测试信息', 'http://www.pslywebsite.top/tools/img/defaultT/default3.jpg');
INSERT INTO `blog_talk` VALUES (8, '管理员01', 1, '2020年3月27日11时2分', '@admin<br>这里查看一下回复功能是否正确', 'http://www.pslywebsite.top/tools/img/defaultT/default3.jpg');

-- ----------------------------
-- Table structure for blog_txttalk
-- ----------------------------
DROP TABLE IF EXISTS `blog_txttalk`;
CREATE TABLE `blog_txttalk`  (
  `btid` int(5) NOT NULL AUTO_INCREMENT COMMENT '留言者id',
  `tname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言者昵称',
  `kissid` int(5) NULL DEFAULT NULL COMMENT '与被留言者关系绑定的id',
  `talktime` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言时间',
  `talk` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言内容',
  `imgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '留言者头像地址',
  PRIMARY KEY (`btid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表用于记录【博客】下【电子书籍】页面的留言信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blog_txttalk
-- ----------------------------
INSERT INTO `blog_txttalk` VALUES (1, 'admin', NULL, '2020年3月27日10时20分', 'hello everyone,这是电子书下载页面的一条测试数据', 'http://www.pslywebsite.top/imgfactory/useimg/timg.jpg');
INSERT INTO `blog_txttalk` VALUES (5, '管理员01', 1, '2020年3月29日15时46分', '@admin<br>这里是测试电子书界面的回复', 'http://www.pslywebsite.top/tools/img/defaultT/default3.jpg');

-- ----------------------------
-- Table structure for blogaapp
-- ----------------------------
DROP TABLE IF EXISTS `blogaapp`;
CREATE TABLE `blogaapp`  (
  `nid` int(5) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `appname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'app名称',
  `appimgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'app图片链接',
  `appdis` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'app介绍',
  `appdownurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下载地址',
  PRIMARY KEY (`nid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表储存【博客】下【安卓软件】界面的软件信息。' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blogaapp
-- ----------------------------
INSERT INTO `blogaapp` VALUES (1, 'PsTouch', 'http://static.yingyonghui.com/icon/128/6524681.png', '安卓端ps', 'http://www.pslywebsite.top/tools/bloguse/app/An/pstouchphone.apk');
INSERT INTO `blogaapp` VALUES (2, 'Termux', 'http://static.yingyonghui.com/icon/128/6035294.png', '终端模拟', 'http://www.pslywebsite.top/tools/bloguse/app/An/termux.apk');
INSERT INTO `blogaapp` VALUES (3, 'VMOS', 'http://static.yingyonghui.com/icon/128/6622946.png', '安卓虚拟机', 'http://www.pslywebsite.top/tools/bloguse/app/An/com.vmos.app.apk');
INSERT INTO `blogaapp` VALUES (4, 'JuiceSSH', 'http://static.yingyonghui.com/icon/128/4925713.png', '安卓ssh连接', 'http://www.pslywebsite.top/tools/bloguse/app/An/juicessh.apk');

-- ----------------------------
-- Table structure for blogagame
-- ----------------------------
DROP TABLE IF EXISTS `blogagame`;
CREATE TABLE `blogagame`  (
  `nid` int(5) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `appname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '安卓游戏名称',
  `appimgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '安卓游戏图片地址',
  `appdis` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '安卓游戏介绍',
  `appdownurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '安卓游戏下载地址',
  PRIMARY KEY (`nid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表储存【博客】下【安卓游戏】界面的游戏信息。' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blogagame
-- ----------------------------
INSERT INTO `blogagame` VALUES (1, '我是键盘侠', 'http://static.yingyonghui.com/icon/128/6558223.png', '祖安人民语录', 'http://www.pslywebsite.top/tools/bloguse/app/game/keyboardMan.apk');
INSERT INTO `blogagame` VALUES (2, '植物大战僵尸', 'http://static.yingyonghui.com/icon/128/6618881.png', '大量货币', 'http://www.pslywebsite.top/tools/bloguse/app/game/com.popcap.pvz.apk');
INSERT INTO `blogagame` VALUES (3, '猫里奥', 'http://static.yingyonghui.com/icon/128/4279909.png', '简单版', 'http://www.pslywebsite.top/tools/bloguse/app/game/maoliao.apk');
INSERT INTO `blogagame` VALUES (4, '世界尽头', 'http://www.pslywebsite.top/tools/img/endword.png', '英文版', 'http://www.pslywebsite.top/tools/bloguse/app/game/endword.apk');

-- ----------------------------
-- Table structure for blogmusic
-- ----------------------------
DROP TABLE IF EXISTS `blogmusic`;
CREATE TABLE `blogmusic`  (
  `nid` int(5) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `appname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '音乐名称',
  `appimgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '音乐图片地址',
  `appdis` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '歌手或音乐介绍',
  `appdownurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下载地址',
  PRIMARY KEY (`nid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表储存【博客】下【音乐资源】界面的音乐信息。' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blogmusic
-- ----------------------------
INSERT INTO `blogmusic` VALUES (1, 'Born ready', 'http://www.pslywebsite.top/tools/bloguse/music/bornread.jpg', 'Zayde Wølf', 'http://www.pslywebsite.top/tools/bloguse/music/mp3/Born ready.mp3');
INSERT INTO `blogmusic` VALUES (2, 'counting stars', 'http://www.pslywebsite.top/tools/bloguse/music/countingstar.jpg', 'OneRepublic', 'http://www.pslywebsite.top/tools/bloguse/music/mp3/counting stars.mp3');
INSERT INTO `blogmusic` VALUES (3, 'hall of fame', 'http://www.pslywebsite.top/tools/bloguse/music/halloffame.jpg', 'The Script', 'http://www.pslywebsite.top/tools/bloguse/music/mp3/hall of fame.mp3');
INSERT INTO `blogmusic` VALUES (4, 'lock me up', 'http://www.pslywebsite.top/tools/bloguse/music/lockmeup.jpg', 'The Cab', 'http://www.pslywebsite.top/tools/bloguse/music/mp3/lock me up.mp3');

-- ----------------------------
-- Table structure for blogpcgame
-- ----------------------------
DROP TABLE IF EXISTS `blogpcgame`;
CREATE TABLE `blogpcgame`  (
  `nid` int(5) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `appname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电脑游戏名称',
  `appimgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电脑游戏图片链接',
  `appdis` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '百度云提取码',
  `appdownurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下载地址',
  PRIMARY KEY (`nid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表储存【博客】下【电脑游戏】界面的游戏信息。' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blogpcgame
-- ----------------------------
INSERT INTO `blogpcgame` VALUES (1, '孤岛危机', 'http://www.pslywebsite.top/tools/bloguse/pcgame/gudao.jpg', '提取码：bsay', 'https://pan.baidu.com/s/1qZ2s3i-teIDEheWvJrNtyA');
INSERT INTO `blogpcgame` VALUES (2, '巫师', 'http://www.pslywebsite.top/tools/bloguse/pcgame/wushi.jpg', '提取码：j3nv', 'https://pan.baidu.com/s/1qbKPtATztAas8AAaadTctw');
INSERT INTO `blogpcgame` VALUES (3, '使命召唤', 'http://www.pslywebsite.top/tools/bloguse/pcgame/smzh.jpg', '提取码:7791', 'https://pan.baidu.com/s/1riH7SyHLl674lojmLDOWxA');
INSERT INTO `blogpcgame` VALUES (4, '刺客信条', 'http://www.pslywebsite.top/tools/bloguse/pcgame/panbian.jpg', '提取码：j11n', 'https://pan.baidu.com/s/1WBcQQypFudhW0CPl5Z8XYg');

-- ----------------------------
-- Table structure for blogsearch
-- ----------------------------
DROP TABLE IF EXISTS `blogsearch`;
CREATE TABLE `blogsearch`  (
  `blogid` int(5) NOT NULL AUTO_INCREMENT COMMENT '博客id',
  `blogweb` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '博客地址',
  `blogname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '博客名称',
  PRIMARY KEY (`blogid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表储存【博客】下各界面的搜索跳转功能。' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blogsearch
-- ----------------------------
INSERT INTO `blogsearch` VALUES (1, '/blog_extend/blog-agamesingle.jsp', '安卓游戏');
INSERT INTO `blogsearch` VALUES (2, '/blog_extend/blog-appsingle.jsp', '安卓工具');
INSERT INTO `blogsearch` VALUES (3, '/blog_extend/blog-musicsingle.jsp', '音乐资源');
INSERT INTO `blogsearch` VALUES (4, '/blog_extend/blog-pcgamesingle.jsp', '电脑游戏');
INSERT INTO `blogsearch` VALUES (5, '/blog_extend/blog-txtsingle.jsp', '电子书籍');
INSERT INTO `blogsearch` VALUES (6, '/blog-single.jsp', '在线工具');
INSERT INTO `blogsearch` VALUES (7, '/blog_extend/blog-agamesingle.jsp', '我是键盘侠');
INSERT INTO `blogsearch` VALUES (8, '/blog_extend/blog-agamesingle.jsp', '植物大战僵尸');
INSERT INTO `blogsearch` VALUES (9, '/blog_extend/blog-agamesingle.jsp', '世界尽头');
INSERT INTO `blogsearch` VALUES (10, '/blog_extend/blog-agamesingle.jsp', '猫里奥');
INSERT INTO `blogsearch` VALUES (11, '/blog_extend/blog-appsingle.jsp', 'PsTouch');
INSERT INTO `blogsearch` VALUES (12, '/blog_extend/blog-appsingle.jsp', 'Termux');
INSERT INTO `blogsearch` VALUES (13, '/blog_extend/blog-appsingle.jsp', 'VMOS');
INSERT INTO `blogsearch` VALUES (14, '/blog_extend/blog-appsingle.jsp', 'JuiceSSH');
INSERT INTO `blogsearch` VALUES (15, '/blog_extend/blog-musicsingle.jsp', 'Born ready');
INSERT INTO `blogsearch` VALUES (16, '/blog_extend/blog-musicsingle.jsp', 'counting star');
INSERT INTO `blogsearch` VALUES (17, '/blog_extend/blog-musicsingle.jsp', 'hall of fame');
INSERT INTO `blogsearch` VALUES (18, '/blog_extend/blog-musicsingle.jsp', 'lock me up');
INSERT INTO `blogsearch` VALUES (19, '/blog_extend/blog-pcgamesingle.jsp', '孤岛危机');
INSERT INTO `blogsearch` VALUES (20, '/blog_extend/blog-pcgamesingle.jsp', '巫师');
INSERT INTO `blogsearch` VALUES (21, '/blog_extend/blog-pcgamesingle.jsp', '刺客信条');
INSERT INTO `blogsearch` VALUES (22, '/blog_extend/blog-pcgamesingle.jsp', '使命召唤');
INSERT INTO `blogsearch` VALUES (23, '/blog_extend/blog-txtsingle.jsp', '禁色');
INSERT INTO `blogsearch` VALUES (24, '/blog_extend/blog-txtsingle.jsp', '善恶的彼岸');
INSERT INTO `blogsearch` VALUES (25, '/blog_extend/blog-txtsingle.jsp', '直到孤独尽头');
INSERT INTO `blogsearch` VALUES (26, '/blog_extend/blog-txtsingle.jsp', '沙海无澜');

-- ----------------------------
-- Table structure for blogtools
-- ----------------------------
DROP TABLE IF EXISTS `blogtools`;
CREATE TABLE `blogtools`  (
  `nid` int(4) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `webname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网站名',
  `weburl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网站地址',
  `webdis` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '网站简介',
  PRIMARY KEY (`nid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 54 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表储存【博客】下【在线网站工具】界面的网站信息。' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blogtools
-- ----------------------------
INSERT INTO `blogtools` VALUES (1, 'php中文网：', 'https://www.php.cn/xiazai/', '提供网站素材，模板以及效果js，html,css等');
INSERT INTO `blogtools` VALUES (2, '脚本之家：', 'https://www.jb51.net/', '针对IT技术脚本开发人员提供资讯、技术、资源等服务的网站');
INSERT INTO `blogtools` VALUES (3, '片源网：', 'http://pianyuan.la/', '可以获取到无字幕视频资源');
INSERT INTO `blogtools` VALUES (4, 'CSDN:', 'https://www.csdn.net/', 'CSDN是全球知名中文IT技术交流平台');
INSERT INTO `blogtools` VALUES (5, 'GitHub:', 'https://github.com/', 'GitHub是一个面向开源及私有软件项目的托管平台 ');
INSERT INTO `blogtools` VALUES (6, 'Shodan:', 'https://www.shodan.io/', '用来搜索网络空间中在线设备的搜索引擎');
INSERT INTO `blogtools` VALUES (7, '合天网络安全实验室:', 'http://www.hetianlab.com/', '支持在线实验的信息安全学习的大型服务平台');
INSERT INTO `blogtools` VALUES (8, '秒嘀科技:', 'http://www.miaodiyun.com/', '提供运营商短信资源API的PaaS平台');
INSERT INTO `blogtools` VALUES (9, '互亿无线：', 'https://www.ihuyi.com/', '提供云通信服务');
INSERT INTO `blogtools` VALUES (10, '吾爱破解：', 'https://www.52pojie.cn/index.php', '软件安全与病毒分析论坛');
INSERT INTO `blogtools` VALUES (11, 'virscan：', 'https://www.virscan.org/language/zh-cn/', '多引擎在线病毒扫描网');
INSERT INTO `blogtools` VALUES (12, 'Bing搜索:', 'https://cn.bing.com/?ensearch=1&FORM=BEHPTB', '微软bing搜索');
INSERT INTO `blogtools` VALUES (13, 'Greasy Fork：', 'https://greasyfork.org/zh-CN', '油猴插件脚本库');
INSERT INTO `blogtools` VALUES (14, '音乐聚合搜索引擎：', 'http://www.gequdaquan.net/gqss/', '音乐类搜索引擎');
INSERT INTO `blogtools` VALUES (15, '爱资料工具:', 'https://www.toolnb.com/toolslist/27.html', '多种类在线工具集合');
INSERT INTO `blogtools` VALUES (16, 'iconfont:', 'https://www.iconfont.cn/home/index', '阿里巴巴矢量图标库');
INSERT INTO `blogtools` VALUES (17, '查询网：', 'https://site.ip138.com/', '域名查询ip');
INSERT INTO `blogtools` VALUES (18, 'GPS经纬:', 'http://www.gpsspg.com/maps.htm', '在线地图');
INSERT INTO `blogtools` VALUES (19, '七牛云:', 'https://www.qiniu.com/', '云计算及数据服务提供商');
INSERT INTO `blogtools` VALUES (20, '三丰云:', 'https://www.sanfengyun.com/', '提供限额免费VPS云服务器,免费虚拟主机');
INSERT INTO `blogtools` VALUES (21, '新云免费互联：', 'http://host.tvlixin.cn/index.php/index/index/?', '提供廉价低性能主机');
INSERT INTO `blogtools` VALUES (22, '与佛论禅:', 'http://keyfc.net/bbs/tools/tudoucode.aspx', '文本加密网站');
INSERT INTO `blogtools` VALUES (23, '低端影视：', 'https://ddrk.me/category/movie/', '在线观影');
INSERT INTO `blogtools` VALUES (24, '天翼云:', 'https://www.ctyun.cn/home/', '提供云主机、对象存储、数据库等');
INSERT INTO `blogtools` VALUES (25, 'NordVPN：', 'https://securitysite.tech/zh/', '付费VPN购买');
INSERT INTO `blogtools` VALUES (26, '微信开放文档：', 'https://developers.weixin.qq.com/miniprogram/dev/framework/', '小程序开发帮助文档');
INSERT INTO `blogtools` VALUES (27, 'mpvue :', 'http://mpvue.com/', 'vue开发框架');
INSERT INTO `blogtools` VALUES (28, 'Taro:', 'https://taro.js.org/', 'react语法开发小程序框架');
INSERT INTO `blogtools` VALUES (29, 'PWA：', 'https://developer.mozilla.org/zh-CN/docs/Web/Progressive_web_apps', '渐进式Web应用教程');
INSERT INTO `blogtools` VALUES (30, 'InfoQ：', 'https://www.infoq.cn/', '实践驱动的社区资讯站点');
INSERT INTO `blogtools` VALUES (31, 'z-tree:', 'http://www.treejs.cn/v3/main.php#_zTreeInfo', 'jq树插件');
INSERT INTO `blogtools` VALUES (32, '聚合数据:', 'https://www.juhe.cn/', 'API接口');
INSERT INTO `blogtools` VALUES (33, 'Tmod.JS:', 'https://github.com/aui/tmodjs', '模板引擎');
INSERT INTO `blogtools` VALUES (34, 'chartist:', 'http://www.codeceo.com/article/chartist-js.html', '响应式图表');
INSERT INTO `blogtools` VALUES (35, 'PostCSS:', 'https://www.postcss.com.cn/', 'JavaScript 工具和插件转换 CSS 代码的工具');
INSERT INTO `blogtools` VALUES (36, 'ueditor:', 'http://ueditor.baidu.com/website/index.html', '富文本编辑器插件');
INSERT INTO `blogtools` VALUES (37, 'ckplayer:', 'http://www.ckplayer.com/', '视频播放插件');
INSERT INTO `blogtools` VALUES (38, 'chplayer:', 'http://www.chplayer.com/', '视频直播插件');
INSERT INTO `blogtools` VALUES (39, 'swiper：', 'https://3.swiper.com.cn/', '轮播图插件');
INSERT INTO `blogtools` VALUES (40, 'midishow:', 'https://www.midishow.com/', 'MIDI 音乐学习资源交流与下载网站');
INSERT INTO `blogtools` VALUES (41, 'picker-extend:', 'https://www.npmjs.com/package/picker-extend', '移动端级联插件');
INSERT INTO `blogtools` VALUES (42, 'layui:', 'https://www.layui.com/', '前端快速开发框架');
INSERT INTO `blogtools` VALUES (43, '字体之家：', 'http://www.17ziti.com/cn/', '艺术字体');
INSERT INTO `blogtools` VALUES (44, 'idea注册码获取：', 'http://idea.lanyus.com/', 'idea注册码获取');
INSERT INTO `blogtools` VALUES (45, 'KMS在线激活：', 'http://www.yishimei.cn/network/319.html', 'windows系统破解工具');
INSERT INTO `blogtools` VALUES (46, '草料二维码：', 'https://cli.im/', '在线二维码生成器');
INSERT INTO `blogtools` VALUES (47, '比特虫：', 'http://www.bitbug.net/', '在线制作ico图标');
INSERT INTO `blogtools` VALUES (48, '时间戳工具：', 'http://tool.chinaz.com/Tools/unixtime.aspx', '时间戳转换工具');
INSERT INTO `blogtools` VALUES (49, '在线代码格式化：', 'https://tool.oschina.net/codeformat/js/', '在线代码格式化');
INSERT INTO `blogtools` VALUES (50, '站长之家： ', 'http://sc.chinaz.com/tag_jiaoben/banner.html', '源代码程序下载、海量建站素材');
INSERT INTO `blogtools` VALUES (51, '千图网：', 'https://www.58pic.com/tupian/liebiao.html', 'UI素材');
INSERT INTO `blogtools` VALUES (52, '花瓣网：', 'https://huaban.com/?md=chrome_ex', '图片素材');
INSERT INTO `blogtools` VALUES (53, 'UI中国：', 'https://www.ui.cn/list.html', 'UI图片下载');

-- ----------------------------
-- Table structure for blogtxt
-- ----------------------------
DROP TABLE IF EXISTS `blogtxt`;
CREATE TABLE `blogtxt`  (
  `nid` int(5) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `appname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '书籍名',
  `appimgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '书籍图片地址',
  `appdis` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '作者',
  `appdownurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '下载地址',
  PRIMARY KEY (`nid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表储存【博客】下【电子书籍】界面的书籍信息。' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blogtxt
-- ----------------------------
INSERT INTO `blogtxt` VALUES (1, '禁色', 'http://www.pslywebsite.top/tools/bloguse/txt/jinse.png', '三岛由纪夫', 'http://www.pslywebsite.top/tools/bloguse/txt/jinse.zip');
INSERT INTO `blogtxt` VALUES (2, '善恶的彼岸', 'http://www.pslywebsite.top/tools/bloguse/txt/shane.png', '弗里德里希·尼采 ', 'http://www.pslywebsite.top/tools/bloguse/txt/shane.zip');
INSERT INTO `blogtxt` VALUES (3, '直到孤独尽头', 'http://www.pslywebsite.top/tools/bloguse/txt/alone.png', '贝内迪克特·韦尔斯', 'http://www.pslywebsite.top/tools/bloguse/txt/alone.zip');
INSERT INTO `blogtxt` VALUES (4, '沙海无澜', 'http://www.pslywebsite.top/tools/bloguse/txt/shahai.png', '奥兹', 'http://www.pslywebsite.top/tools/bloguse/txt/shahai.zip');

-- ----------------------------
-- Table structure for softadmin
-- ----------------------------
DROP TABLE IF EXISTS `softadmin`;
CREATE TABLE `softadmin`  (
  `id` int(9) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `username` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员账号',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员密码',
  `urlimg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员图片地址',
  `status` int(1) NULL DEFAULT NULL COMMENT '判断是否登录',
  `power` int(1) NULL DEFAULT NULL COMMENT '是否是超级管理员',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '管理管理员的表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of softadmin
-- ----------------------------
INSERT INTO `softadmin` VALUES (1, '17860252026', 'e10adc3949ba59abbe56e057f20f883e', 'images/adminimg/t2.png', 0, 1);
INSERT INTO `softadmin` VALUES (2, '15263661537', 'e10adc3949ba59abbe56e057f20f883e', 'images/adminimg/t4.png', 0, 0);

-- ----------------------------
-- Table structure for softlist
-- ----------------------------
DROP TABLE IF EXISTS `softlist`;
CREATE TABLE `softlist`  (
  `softname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '软件名',
  `softtype` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '软件类型',
  `imgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '软件图片链接',
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '软件id',
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '软件表储存在主页打印的相关列表信息。' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of softlist
-- ----------------------------
INSERT INTO `softlist` VALUES ('MySql', '数据库', 'http://www.pslywebsite.top/imgfactory/useimg/webdesign.jpg', 1);
INSERT INTO `softlist` VALUES ('VMware15', '虚拟机', 'http://www.pslywebsite.top/imgfactory/useimg/wordpress.jpg', 2);
INSERT INTO `softlist` VALUES ('FireFox浏览器', '浏览器', 'http://www.pslywebsite.top/imgfactory/useimg/javascript.jpg', 3);
INSERT INTO `softlist` VALUES ('Photoshop', '图像处理工具', 'http://www.pslywebsite.top/imgfactory/useimg/photoshop.jpg', 4);
INSERT INTO `softlist` VALUES ('快播', '音视频播放器', 'http://www.pslywebsite.top/imgfactory/useimg/reactjs.jpg', 5);
INSERT INTO `softlist` VALUES ('Tor Browser', '匿名浏览器', 'http://www.pslywebsite.top/imgfactory/useimg/angularjs.jpg', 6);

-- ----------------------------
-- Table structure for softpage
-- ----------------------------
DROP TABLE IF EXISTS `softpage`;
CREATE TABLE `softpage`  (
  `softid` int(15) NOT NULL AUTO_INCREMENT COMMENT '软件id',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '软件图片地址',
  `softname` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '软件名',
  `disline` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '软件下载介绍',
  PRIMARY KEY (`softid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '本表示作用于软件分类界面下的各大图信息' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of softpage
-- ----------------------------
INSERT INTO `softpage` VALUES (1, 'http://www.pslywebsite.top/imgfactory/useimg/webdesign.jpg', 'Mysql', '直接下载，网盘下载');
INSERT INTO `softpage` VALUES (2, 'http://www.pslywebsite.top/imgfactory/useimg/wordpress.jpg', 'VMware15', '直接下载，网盘下载');
INSERT INTO `softpage` VALUES (3, 'http://www.pslywebsite.top/imgfactory/useimg/javascript.jpg', 'FireFox浏览器', '直接下载，网盘下载');
INSERT INTO `softpage` VALUES (4, 'http://www.pslywebsite.top/imgfactory/useimg/photoshop.jpg', 'Photoshop', '直接下载，网盘下载');
INSERT INTO `softpage` VALUES (5, 'http://www.pslywebsite.top/imgfactory/useimg/reactjs.jpg', '快播', '直接下载，网盘下载');
INSERT INTO `softpage` VALUES (6, 'http://www.pslywebsite.top/imgfactory/useimg/angularjs.jpg', 'Tor Browser', '直接下载，网盘下载');

-- ----------------------------
-- Table structure for tsupport
-- ----------------------------
DROP TABLE IF EXISTS `tsupport`;
CREATE TABLE `tsupport`  (
  `tid` int(13) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `tname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '技术支持对象名称',
  `ttype` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '技术支持对象类型',
  `ttypetwo` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '技术支持对象类型二',
  `turl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支持者官网',
  `tdis` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支持者介绍',
  `tEnglist` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '英文名',
  `imgurl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支持者图片地址',
  PRIMARY KEY (`tid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用于打印网站技术支持块区信息。' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tsupport
-- ----------------------------
INSERT INTO `tsupport` VALUES (1, '百度网盘', '云存储服务', '多元化数据存储服务', 'https://pan.baidu.com/ ', '北京百度网讯科技有限公司 ', 'Baidu Netdisk ', 'http://www.pslywebsite.top/tools/img/person_1.jpg');
INSERT INTO `tsupport` VALUES (2, '腾讯课堂', '在线教育', '实现在线即时互动教学', 'https://ke.qq.com/', '深圳市腾讯计算机系统有限公司', 'Tencent classroom', 'http://www.pslywebsite.top/tools/img/person_2.jpg');
INSERT INTO `tsupport` VALUES (3, '阿里云', '云计算 ', '为了无法计算的价值', 'https://www.aliyun.com/ ', '阿里云计算有限公司', 'Ali cloud', 'http://www.pslywebsite.top/tools/img/person_3.jpg');
INSERT INTO `tsupport` VALUES (4, 'Github', '开源代码库', '版本控制系统', 'http://github.com/', 'GitHub于2008年4月10日正式上线，目前，其注册用户已经超过350万', 'github', 'http://www.pslywebsite.top/tools/img/person_4.jpg');

-- ----------------------------
-- Table structure for udetils
-- ----------------------------
DROP TABLE IF EXISTS `udetils`;
CREATE TABLE `udetils`  (
  `udid` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `ufname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `umail` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `usex` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `uage` int(255) NULL DEFAULT NULL COMMENT '年龄',
  `udis` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '个人介绍',
  `uphone` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号',
  PRIMARY KEY (`udid`) USING BTREE,
  INDEX `uphone`(`uphone`) USING BTREE,
  INDEX `ufname`(`ufname`) USING BTREE,
  CONSTRAINT `udetils_ibfk_1` FOREIGN KEY (`uphone`) REFERENCES `users` (`username`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用于注册用户的个人信息展示和丰富。' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of udetils
-- ----------------------------
INSERT INTO `udetils` VALUES (1, '管理员01', '2818236732@qq.com', '男', 21, '没有任何信息', '17860252026');
INSERT INTO `udetils` VALUES (3, '123123', '2818236732@qq.com', '男', 12, 'sadasd', '15263661537');
INSERT INTO `udetils` VALUES (4, 'admin', '2818236732@qq.com', '男', 15, '没有', '123123');
INSERT INTO `udetils` VALUES (5, '11', NULL, NULL, NULL, NULL, '11111');
INSERT INTO `udetils` VALUES (10, '44', NULL, NULL, NULL, NULL, '4444');

-- ----------------------------
-- Table structure for ufaver
-- ----------------------------
DROP TABLE IF EXISTS `ufaver`;
CREATE TABLE `ufaver`  (
  `usernamer` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户账号',
  `uid` int(11) NULL DEFAULT NULL COMMENT '收藏软件所对应的id',
  `tim` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收藏时间',
  `dis` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收藏软件所对应的界面',
  INDEX `uid`(`uid`) USING BTREE,
  INDEX `usernamer`(`usernamer`) USING BTREE,
  CONSTRAINT `ufaver_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `softlist` (`sid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `ufaver_ibfk_3` FOREIGN KEY (`usernamer`) REFERENCES `users` (`username`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用于登录用户个人收藏软件的展示。' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of ufaver
-- ----------------------------
INSERT INTO `ufaver` VALUES ('17860252026', 1, '2020年3月30日20时5分', 'course-single.jsp');
INSERT INTO `ufaver` VALUES ('17860252026', 2, '2020年3月31日15时41分', 'course-web/VM-single.jsp');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账号',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `userimg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  PRIMARY KEY (`uid`) USING BTREE,
  INDEX `username`(`username`) USING BTREE,
  INDEX `userimg`(`userimg`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '储存全部非管理员用户。' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (2, '123123', 'e10adc3949ba59abbe56e057f20f883e', 'http://www.pslywebsite.top/imgfactory/useimg/timg.jpg');
INSERT INTO `users` VALUES (12, '17860252026', 'e10adc3949ba59abbe56e057f20f883e', 'http://www.pslywebsite.top/tools/img/defaultT/default3.jpg');
INSERT INTO `users` VALUES (13, '15263661537', 'e10adc3949ba59abbe56e057f20f883e', 'http://www.pslywebsite.top/imgfactory/uploads/img.jpg');
INSERT INTO `users` VALUES (14, '11111', '111111', 'http://www.pslywebsite.top/imgfactory/useimg/timg.jpg');
INSERT INTO `users` VALUES (19, '4444', '444444', 'http://www.pslywebsite.top/imgfactory/useimg/timg.jpg');

SET FOREIGN_KEY_CHECKS = 1;
