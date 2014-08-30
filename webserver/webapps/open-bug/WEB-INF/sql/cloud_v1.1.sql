CREATE TABLE t_sys_user (
    Id varchar(36) NOT NULL default '',
    type int default NULL,
    isValid varchar(1) default 'Y',
    username varchar(255) default NULL,
    password varchar(255) default NULL,
    email varchar(255) default NULL,
    address varchar(255) default NULL,
    PRIMARY KEY  (Id)
);

CREATE TABLE t_pjt_pjt (
    Id varchar(36) NOT NULL default '',
    name varchar(255) default NULL,
    managerId varchar(36) default NULL,
    startDate date default NULL,
    endDate date default NULL,
    intro varchar(2048) default NULL,
    createTime varchar(36) default NULL,
    PRIMARY KEY  (Id)
);

CREATE TABLE t_bug_bug (
    Id varchar(36) NOT NULL default '',
    ownerId varchar(36) default NULL,
    status int default NULL,
    name varchar(255) default NULL,
    projectId varchar(36) default NULL,
    auditorId varchar(36) default NULL,
    intro varchar(2048) default NULL,
    reappear varchar(2048) default NULL,
    modifierId varchar(36) default NULL,
    testorId varchar(36) default NULL,
    solveInfo varchar(36) default NULL,
    relateTest varchar(36) default NULL,
    creatorId varchar(36) default NULL,
    createTime varchar(36) default NULL,
    modifyTime varchar(36) default NULL,
    PRIMARY KEY  (Id)
);

CREATE TABLE t_bug_attach (
    Id varchar(36) NOT NULL default '',
    attachId varchar(36) default NULL,
    bugId varchar(36) default NULL,
    fileName varchar(255) default NULL,
    extendType varchar(10) default NULL,
    fileSize int default NULL,
    PRIMARY KEY  (Id)
);

CREATE TABLE t_bug_record (
    Id varchar(36) NOT NULL default '',
    bugId varchar(36) default NULL,
    operate varchar(36) default NULL,
    note varchar(2048) default NULL,
    fromStatus int default NULL,
    toStatus int default NULL,
    creatorId varchar(36) default NULL,
    createTime varchar(36) default NULL,
    PRIMARY KEY  (Id)
);

CREATE TABLE t_bug_view (
    Id varchar(36) NOT NULL default '',
    name varchar(255) default NULL,
    isDefault varchar(1) default NULL,
    pageSize int default NULL,
    bugName varchar(255) default NULL,
    projectIds varchar(2048) default NULL,
    status varchar(2048) default NULL,
    ownerIds varchar(2048) default NULL,
    creatorId varchar(36) default NULL,
    createTime varchar(36) default NULL,
    PRIMARY KEY  (Id)
);

insert into t_sys_user(Id, type, username,password,email,address) values('000000000000000000000000000000000000', 1, 'admin', '1', 'admin@admin.com', 'admin address');