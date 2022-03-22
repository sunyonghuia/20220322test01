CREATE TABLE `user`
(
	`uid` INT PRIMARY KEY AUTO_INCREMENT,
	`uname` VARCHAR(100) NOT NULL,
	`gender` INT(1),
	`phone` VARCHAR(20) UNIQUE,
	`area` VARCHAR(100) NOT NULL,
	`manager` INT(1) DEFAULT 1,
	`username` VARCHAR(50) UNIQUE,
	`password` VARCHAR(50) NOT NULL,
	`photo` VARCHAR(100),
	`create_time` DATETIME
);