CREATE TABLE t_user_depart (
    Id varchar(36) NOT NULL default '',
    name varchar(255) default NULL,
    parentId varchar(36) default NULL,
    managerId varchar(36) default NULL,
    assistantIds varchar(2048) default NULL,
    PRIMARY KEY  (Id)
);

CREATE TABLE t_user_pos (
    Id varchar(36) NOT NULL default '',
    name varchar(255) default NULL,
    intro varchar(2048) default NULL,
    PRIMARY KEY  (Id)
);

CREATE TABLE t_user_role (
    Id varchar(36) NOT NULL default '',
    name varchar(255) default NULL,
    intro varchar(2048) default NULL,
    resourceIds varchar(2048) default NULL,
    PRIMARY KEY  (Id)
);

CREATE TABLE t_user_res (
    Id varchar(36) NOT NULL default '',
    typeStr varchar(255) default NULL,
    catStr varchar(255) default NULL,
    resStr varchar(255) default NULL,
    name varchar(255) default NULL,
    intro varchar(2048) default NULL,
    sortSn int default NULL,
    PRIMARY KEY  (Id)
);

alter table t_sys_user add column departmentId varchar(36);
alter table t_sys_user add column positionId varchar(36);
alter table t_sys_user add column roleIds varchar(2048);
alter table t_sys_user drop column type;

update t_sys_user set password = 'c4ca4238a0b923820dcc509a6f75849b' where id = '000000000000000000000000000000000000';

insert into t_user_pos(Id, name, intro) values('000000000000000000000000000000000000', '项目经理', '项目经理');
insert into t_user_pos(Id, name, intro) values('000000000000000000000000000000000001', '研发工程师', '研发工程师');
insert into t_user_pos(Id, name, intro) values('000000000000000000000000000000000002', '测试工程师', '测试工程师');

insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000000', 0, 'URL', 'PJT', '/pages/project/project.jsp', '查看项目列表');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000001', 1, 'URL', 'PJT', '/project/openProject.do?projectId=*', '查看项目详情页');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000002', 2, 'URL', 'BUG', '/pages/bug/bug.jsp', '查看缺陷列表');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000003', 3, 'URL', 'ORG', '/pages/account/structure.jsp', '查看组织架构');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000004', 4, 'URL', 'ORG', '/entity/dispatch.do?operate=list&model=com.cloud.security.model.Position', '管理职位列表');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000005', 5, 'URL', 'ORG', '/entity/dispatch.do?operate=list&model=com.cloud.security.model.Role', '管理角色权限');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000006', 6, 'URL', 'SYS', '/pages/system/password.jsp', '修改个人密码');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000007', 7, 'URL', 'SYS', '/pages/system/systemName.jsp', '修改系统名称');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000008', 8, 'URL', 'SYS', '/pages/system/bugCode.jsp', '缺陷编号规则');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000009', 9, 'URL', 'SYS', '/system/openField.do', '定制系统字段');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000010', 10, 'URL', 'SYS', '/pages/system/form.jsp', '定制系统表单');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000011', 11, 'URL', 'SYS', '/pages/system/mail.jsp', '配置邮件发送');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000012', 12, 'OP', 'PJT', 'pjt_manage', '管理项目(创建，编辑，关闭)');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000013', 13, 'OP', 'BUG', 'bug_remove', '永久删除缺陷');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000014', 14, 'OP', 'BUG', 'bug_allop', '跨责任人执行缺陷流程');
insert into t_user_res(Id, sortSn, typeStr, catStr, resStr, name) values('000000000000000000000000000000000015', 15, 'OP', 'ORG', 'org_userdepart', '管理组织架构(部门,用户)');

update t_sys_config set version = 'ppm-bug v1.4';