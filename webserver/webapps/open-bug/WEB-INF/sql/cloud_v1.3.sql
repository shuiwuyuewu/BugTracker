CREATE TABLE t_bug_share (
    Id varchar(36) NOT NULL default '',
    bugId varchar(36) default NULL,
    createTime varchar(36) default NULL,
    PRIMARY KEY  (Id)
);

CREATE TABLE t_bug_field (
    Id varchar(36) NOT NULL default '',
    type int default 1,
    name varchar(255) default NULL,
    label varchar(255) default NULL,
    htmlType varchar(20) default NULL,
    PRIMARY KEY  (Id)
);

CREATE TABLE t_bug_pagefield (
    Id varchar(36) NOT NULL default '',
    pageFlag int default NULL,
    fieldId varchar(36) default NULL,
    isRequire varchar(1) default 'N',
    sortSn int default NULL,
    PRIMARY KEY  (Id)
);

insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000000', 0, 'name', '缺陷名称', 'TEXT');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000001', 0, 'projectId', '所属项目', 'PROJECT');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000002', 0, 'auditorId', '审核人', 'USER');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000003', 0, 'intro', '缺陷描述', 'TEXTAREA');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000004', 0, 'reappear', '重现步骤', 'TEXTAREA');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000005', 0, 'note', '备注', 'TEXTAREA');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000006', 0, 'modifierId', '修改人', 'USER');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000007', 0, 'testorId', '测试人', 'USER');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000008', 0, 'solveInfo', '解决方法', 'TEXTAREA');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000009', 0, 'relateTest', '关联测试', 'TEXTAREA');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000010', 0, 'attach', '附件', 'ATTACH');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000011', 0, 'level', '严重性', 'SELECT');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000012', 0, 'priority', '优先级', 'SELECT');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000013', 0, 'status', '缺陷状态', 'SELECT');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000014', 0, 'createTime', '创建时间', 'DATE');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000015', 0, 'modifyTime', '最近更新时间', 'DATETIME');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000016', 0, 'ownerId', '[责任人]', 'USER');
insert into t_bug_field(Id, type, name, label, htmlType) values('000000000000000000000000000000000017', 0, 'creatorId', '创建人', 'USER');

insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000000', '000000000000000000000000000000000013', 'N', 1, 1);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000001', '000000000000000000000000000000000001', 'N', 2, 1);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000002', '000000000000000000000000000000000016', 'N', 3, 1);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000003', '000000000000000000000000000000000002', 'N', 4, 1);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000004', '000000000000000000000000000000000011', 'N', 5, 1);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000005', '000000000000000000000000000000000012', 'N', 6, 1);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000006', '000000000000000000000000000000000003', 'N', 7, 1);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000007', '000000000000000000000000000000000004', 'N', 8, 1);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000008', '000000000000000000000000000000000014', 'N', 9, 1);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000009', '000000000000000000000000000000000015', 'N', 10, 1);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000111', '000000000000000000000000000000000010', 'N', 11, 1);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000010', '000000000000000000000000000000000013', 'N', 1, 2);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000011', '000000000000000000000000000000000001', 'N', 2, 2);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000012', '000000000000000000000000000000000016', 'N', 3, 2);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000013', '000000000000000000000000000000000002', 'N', 4, 2);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000014', '000000000000000000000000000000000011', 'N', 5, 2);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000015', '000000000000000000000000000000000012', 'N', 6, 2);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000016', '000000000000000000000000000000000003', 'N', 7, 2);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000017', '000000000000000000000000000000000004', 'N', 8, 2);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000018', '000000000000000000000000000000000014', 'N', 9, 2);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000019', '000000000000000000000000000000000015', 'N', 10, 2);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000222', '000000000000000000000000000000000010', 'N', 11, 2);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000020', '000000000000000000000000000000000013', 'N', 1, 3);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000021', '000000000000000000000000000000000001', 'N', 2, 3);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000022', '000000000000000000000000000000000016', 'N', 3, 3);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000023', '000000000000000000000000000000000006', 'N', 4, 3);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000024', '000000000000000000000000000000000011', 'N', 5, 3);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000025', '000000000000000000000000000000000012', 'N', 6, 3);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000026', '000000000000000000000000000000000003', 'N', 7, 3);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000027', '000000000000000000000000000000000004', 'N', 8, 3);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000028', '000000000000000000000000000000000014', 'N', 9, 3);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000029', '000000000000000000000000000000000015', 'N', 10, 3);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000333', '000000000000000000000000000000000010', 'N', 11, 3);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000030', '000000000000000000000000000000000013', 'N', 1, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000031', '000000000000000000000000000000000001', 'N', 2, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000032', '000000000000000000000000000000000016', 'N', 3, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000033', '000000000000000000000000000000000007', 'N', 4, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000034', '000000000000000000000000000000000011', 'N', 5, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000035', '000000000000000000000000000000000012', 'N', 6, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000036', '000000000000000000000000000000000003', 'N', 7, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000037', '000000000000000000000000000000000004', 'N', 8, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000038', '000000000000000000000000000000000008', 'N', 9, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000039', '000000000000000000000000000000000009', 'N', 10, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000040', '000000000000000000000000000000000014', 'N', 11, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000041', '000000000000000000000000000000000015', 'N', 12, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000444', '000000000000000000000000000000000010', 'N', 13, 4);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000042', '000000000000000000000000000000000013', 'N', 1, 5);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000043', '000000000000000000000000000000000001', 'N', 2, 5);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000044', '000000000000000000000000000000000016', 'N', 3, 5);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000045', '000000000000000000000000000000000002', 'N', 4, 5);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000046', '000000000000000000000000000000000011', 'N', 5, 5);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000047', '000000000000000000000000000000000012', 'N', 6, 5);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000048', '000000000000000000000000000000000003', 'N', 7, 5);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000049', '000000000000000000000000000000000004', 'N', 8, 5);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000050', '000000000000000000000000000000000014', 'N', 9, 5);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000051', '000000000000000000000000000000000015', 'N', 10, 5);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000555', '000000000000000000000000000000000010', 'N', 11, 5);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000052', '000000000000000000000000000000000013', 'N', 1, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000053', '000000000000000000000000000000000001', 'N', 2, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000054', '000000000000000000000000000000000017', 'N', 3, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000055', '000000000000000000000000000000000002', 'N', 4, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000056', '000000000000000000000000000000000006', 'N', 5, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000057', '000000000000000000000000000000000007', 'N', 6, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000058', '000000000000000000000000000000000011', 'N', 7, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000059', '000000000000000000000000000000000012', 'N', 8, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000060', '000000000000000000000000000000000003', 'N', 9, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000061', '000000000000000000000000000000000004', 'N', 10, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000062', '000000000000000000000000000000000008', 'N', 11, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000063', '000000000000000000000000000000000009', 'N', 12, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000064', '000000000000000000000000000000000014', 'N', 13, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000065', '000000000000000000000000000000000015', 'N', 14, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000666', '000000000000000000000000000000000010', 'N', 15, 6);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000066', '000000000000000000000000000000000000', 'Y', 1, 7);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000067', '000000000000000000000000000000000001', 'Y', 2, 7);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000068', '000000000000000000000000000000000002', 'Y', 3, 7);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000069', '000000000000000000000000000000000011', 'N', 4, 7);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000070', '000000000000000000000000000000000012', 'N', 5, 7);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000071', '000000000000000000000000000000000003', 'N', 6, 7);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000072', '000000000000000000000000000000000004', 'N', 7, 7);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000073', '000000000000000000000000000000000010', 'N', 8, 7);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000074', '000000000000000000000000000000000006', 'Y', 1, 8);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000075', '000000000000000000000000000000000010', 'N', 2, 8);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000076', '000000000000000000000000000000000005', 'N', 1, 9);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000077', '000000000000000000000000000000000007', 'Y', 1, 10);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000078', '000000000000000000000000000000000008', 'N', 2, 10);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000079', '000000000000000000000000000000000009', 'N', 3, 10);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000080', '000000000000000000000000000000000005', 'N', 1, 11);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000081', '000000000000000000000000000000000005', 'N', 1, 12);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000082', '000000000000000000000000000000000003', 'N', 2, 12);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000083', '000000000000000000000000000000000004', 'N', 3, 12);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000084', '000000000000000000000000000000000010', 'N', 4, 12);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000085', '000000000000000000000000000000000005', 'N', 1, 13);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000086', '000000000000000000000000000000000007', 'Y', 1, 14);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000087', '000000000000000000000000000000000005', 'N', 1, 15);
insert into t_bug_pagefield(Id, fieldId, isRequire, sortSn, pageFlag) values('000000000000000000000000000000000088', '000000000000000000000000000000000005', 'N', 1, 16);

update t_sys_config set version = 'ppm-bug v1.3';