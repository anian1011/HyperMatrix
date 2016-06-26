CREATE TABLE `hm_news` (
  `news_id` int(11) NOT NULL AUTO_INCREMENT,
  `news_title` varchar(50) DEFAULT NULL,
  `news_create_time` datetime DEFAULT NULL,
  `news_author` varchar(10) CHARACTER SET utf8 DEFAULT NULL,
  `news_context` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


CREATE TABLE `hm_function` (
  `function_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_id` varchar(20) CHARACTER SET utf8 NOT NULL,
  `function_name` varchar(20) CHARACTER SET utf8 NOT NULL,
  `function_image` varchar(60) CHARACTER SET utf8 DEFAULT NULL,
  `function_params` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `pakage_name` varchar(20) CHARACTER SET utf8 NOT NULL,
  `class_name` varchar(20) CHARACTER SET utf8 NOT NULL,
  `method_name` varchar(20) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`function_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
