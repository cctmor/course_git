drop table if exists `chapter`;
create table `chapter` (
    `id` char(8) not null comment 'ID',
    `course_id` char(8) comment '课程ID',
    `name` varchar(50) comment '名称',
    primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='大章';

INSERT INTO `chapter` (`id`, `course_id`,`name`) VALUES ('111','111','测试');
INSERT INTO `chapter` (`id`, `course_id`,`name`) VALUES ('222','222','测试');

------------测试

DROP TABLE IF EXISTS `test`;
CREATE TABLE `test`  (
  `id` varchar(8) not null default '' comment 'id',
  `name` varchar(50) comment '名称',
  PRIMARY KEY (`id`)
) engine = innodb default charset=utf8mb4 comment='测试';

INSERT INTO `test` (`id`, `name`) VALUES ('1', '测试');
INSERT INTO `test` (`id`, `name`) VALUES ('2', '成功');

select * from test;
select * from chapter;