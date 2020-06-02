DROP TABLE IF EXISTS `test`;
CREATE TABLE `test`  (
  `id` varchar(8) not null default '' comment 'id',
  `name` varchar(50) comment '名称',
  PRIMARY KEY (`id`)
) engine = innodb default charset=utf8mb4 comment='测试';

INSERT INTO `test` (`id`, `name`) VALUES ('1', '测试');
INSERT INTO `test` (`id`, `name`) VALUES ('2', '成功');

select * from test