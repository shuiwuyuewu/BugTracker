alter table t_sys_config add column mailConfig varchar(2048);

insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000017', 17, 'URL', 'SYS', '/system/openMailConfig.do', '邮件发送配置');