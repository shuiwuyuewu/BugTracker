alter table t_bug_bug add column level varchar(1);
alter table t_bug_bug add column priority varchar(1);
alter table t_bug_bug add column code varchar(255);

CREATE TABLE t_sys_config (
    Id varchar(36) NOT NULL default '',
    version varchar(36) default NULL,
    systemName varchar(255) default NULL,
    codeSn int default 1,
    PRIMARY KEY  (Id)
);

alter table t_bug_view add column levels varchar(36);
alter table t_bug_view add column priorities varchar(36);
alter table t_bug_view add column sortField varchar(36);
alter table t_bug_view add column sortTo varchar(36);

alter table t_pjt_pjt add column assistantIds varchar(2048);

insert into t_sys_config(Id, version, systemName) values('000000000000000000000000000000000000', 'ppm-bug v1.2', 'PPM Bug Manage');
