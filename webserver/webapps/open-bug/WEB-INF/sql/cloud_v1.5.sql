CREATE TABLE t_sys_attach (
    Id varchar(36) NOT NULL default '',
    attachId varchar(36) default NULL,
    entityId varchar(36) default NULL,
    fileName varchar(255) default NULL,
    extendType varchar(10) default NULL,
    fileSize int default NULL,
    PRIMARY KEY  (Id)
);

CREATE TABLE t_user_status (
    Id varchar(36) NOT NULL default '',
    userId varchar(36) default NULL,
    workCol varchar(1) default NULL,
    PRIMARY KEY  (Id)
);

alter table t_pjt_pjt add column isClose varchar(1) default 'N';

insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000016', 16, 'URL', 'SYS', '/system/openClean.do', '清理系统数据');
