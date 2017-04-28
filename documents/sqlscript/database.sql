
/**
 *this code by vsk
 *create 201704261019
 *lastModify 201704261019
 *任何人有字段修改需要在注释与本头部进行声明！
*/

/********+*********+*********+*********+*********+*********+*/

/**  公共删除表区，为防止外键冲突,按建表顺序倒序排列  **/

/********+*********+*********+*********+*********+*********+*/

/**  建表区  **/

/**  字段说明区  **/

/**  约束创建区  **/

/**  高耦合初始化数据区，当数据与本初始化耦合度不高时另起脚本initData.sql来进行数据初始化  **/

/**  数据查询区  **/

/********+*********+*********+*********+*********+*********+*/
drop table sysFunctionT ;
drop table sysRolePermissionT ;
drop table sysUserRoleT ;
drop table sysRoleT ;
drop table sysPermissionT ;
drop table sysUserT ;
/********+*********+*********+*********+*********+*********+*/

create table sysUserT(
suId nvarchar2(64)  primary key,        --用户编号
suName nvarchar2(640) unique not null,  --用户名
suPass nvarchar2(640) not null,         --密码
suCredits int  ,                        --用户类型  0超级管理员  1总经理 2本公司操作员 3本公司财务  4下家渠道
suMobile nvarchar2(64),                 --用户手机号 
suNick  nvarchar2(64),                  --用户别名 
suQq    nvarchar2(64),                  --用户qq号
suEmail nvarchar2(64),                  --用户邮箱  
suRegTime timestamp default sysdate ,   --注册时间
suLastIp nvarchar2(64) ,                --最后登陆IP
suLastVisit timestamp                   --最后访问时间
);

comment on table  sysUserT              is '系统用户表'    ;
comment on column sysUserT.suId         is '用户ID'        ;
comment on column sysUserT.suName       is '用户名'        ;
comment on column sysUserT.suPass       is '密码'          ;
comment on column sysUserT.suCredits    is '类型暂不用'    ;
comment on column sysUserT.suMobile     is '手机号'        ;
comment on column sysUserT.suNick       is '别名'          ;
comment on column sysUserT.suQq         is 'qq号'          ;
comment on column sysUserT.suEmail      is '邮箱'          ;
comment on column sysUserT.suRegTime    is '注册时间'      ;
comment on column sysUserT.suLastIp     is '最后登陆IP'    ;
comment on column sysUserT.suLastVisit  is '最后访问时间'  ;

insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000001','admin'            ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000002','zongjingli'       ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000003','fuzongjingli'     ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000004','ciwuzongjian'     ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000005','xushangzongjingli','670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000006','dajiangyouluguo'  ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000007','test1'            ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000008','test2'            ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000009','test3'            ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000010','test4'            ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000011','test5'            ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000012','test6'            ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000013','test7'            ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000014','test8'            ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000015','test9'            ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000016','test10'           ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000017','test11'           ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000018','test12'           ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000019','test13'           ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000020','test14'           ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000021','test15'           ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000022','test16'           ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000023','test17'           ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000024','test18'           ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000025','test19'           ,'670b14728ad9902aecba32e22fa4f6bd');
insert into sysUserT(suId,suName,suPass) VALUES('10000000000000000000000000000026','test20'           ,'670b14728ad9902aecba32e22fa4f6bd');

select * from sysUserT;

/********+*********+*********+*********+*********+*********+*/

create table sysPermissionT(
spId nvarchar2(64)  primary key,       --权限编号
spName nvarchar2(640) unique not null, --权限名
spNick nvarchar2(640) unique not null, --权限中文名
spAddTime timestamp default sysdate    --添加时间
);

comment on table  sysPermissionT              is '系统权限表'    ;
comment on column sysPermissionT.spId         is '权限ID'        ;
comment on column sysPermissionT.spName       is '权限名'        ;
comment on column sysPermissionT.spNick       is '权限中文名'    ;
comment on column sysPermissionT.spAddTime    is '权限添加时间'  ;


insert into sysPermissionT(spId,spName,spNick) VALUES('20000000000000000000000000000001','user:list' ,'用户列表') ;
insert into sysPermissionT(spId,spName,spNick) VALUES('20000000000000000000000000000002','user:add'  ,'用户添加')  ;
insert into sysPermissionT(spId,spName,spNick) VALUES('20000000000000000000000000000003','user:edit' ,'用户修改') ;
insert into sysPermissionT(spId,spName,spNick) VALUES('20000000000000000000000000000004','user:del'  ,'用户删除')  ;


select * from sysPermissionT;
/********+*********+*********+*********+*********+*********+*/

create table sysRoleT(
srId nvarchar2(64)  primary key,       --角色编号
srName nvarchar2(640) unique not null, --角色名
srAddTime timestamp default sysdate    --添加时间
);

comment on table  sysRoleT              is '角色表'        ;
comment on column sysRoleT.srId         is '角色ID'        ;
comment on column sysRoleT.srName       is '角色名'        ;
comment on column sysRoleT.srAddTime    is '角色添加时间'  ;


insert into sysRoleT(srId,srName) VALUES('30000000000000000000000000000001','超级管理员') ;
insert into sysRoleT(srId,srName) VALUES('30000000000000000000000000000002','总经理')     ;
insert into sysRoleT(srId,srName) VALUES('30000000000000000000000000000003','副总经理')   ;
insert into sysRoleT(srId,srName) VALUES('30000000000000000000000000000004','财务总监')   ;
insert into sysRoleT(srId,srName) VALUES('30000000000000000000000000000005','虚商总经理') ;
insert into sysRoleT(srId,srName) VALUES('30000000000000000000000000000006','打酱油参观') ;


select * from sysRoleT;
/********+*********+*********+*********+*********+*********+*/

create table sysUserRoleT(
suId nvarchar2(64) ,                 --用户编号
srId nvarchar2(64) ,                 --角色编号
surAddTime timestamp default sysdate --添加时间
);

comment on table  sysUserRoleT              is '用户角色表'      ;
comment on column sysUserRoleT.suId         is '用户编号'        ;
comment on column sysUserRoleT.srId         is '角色编号'        ;
comment on column sysUserRoleT.surAddTime   is '添加时间'        ;

alter table sysUserRoleT add constraint fk_sysUserRoleT_suId foreign key(suId) references sysUserT(suId);
alter table sysUserRoleT add constraint fk_sysUserRoleT_srId foreign key(srId) references sysRoleT(srId);

insert into sysUserRoleT(suId,srId) VALUES('10000000000000000000000000000001','30000000000000000000000000000001') ;
insert into sysUserRoleT(suId,srId) VALUES('10000000000000000000000000000002','30000000000000000000000000000002') ;
insert into sysUserRoleT(suId,srId) VALUES('10000000000000000000000000000003','30000000000000000000000000000003') ;
insert into sysUserRoleT(suId,srId) VALUES('10000000000000000000000000000004','30000000000000000000000000000004') ;
insert into sysUserRoleT(suId,srId) VALUES('10000000000000000000000000000005','30000000000000000000000000000005') ;
insert into sysUserRoleT(suId,srId) VALUES('10000000000000000000000000000006','30000000000000000000000000000006') ;

select * from sysUserRoleT;

/********+*********+*********+*********+*********+*********+*/

create table sysRolePermissionT(
srId nvarchar2(64) ,                 --角色编号
spId nvarchar2(64) ,                 --权限编号
srpAddTime timestamp default sysdate --添加时间
);

comment on table  sysRolePermissionT              is '角色权限表'      ;
comment on column sysRolePermissionT.srId         is '角色编号'        ;
comment on column sysRolePermissionT.spId         is '权限编号'        ;
comment on column sysRolePermissionT.srpAddTime   is '添加时间'        ;

alter table sysRolePermissionT add constraint fk_sysRolePermissionT_srId foreign key(srId) references sysRoleT(srId)      ;
alter table sysRolePermissionT add constraint fk_sysRolePermissionT_spId foreign key(spId) references sysPermissionT(spId);

insert into sysRolePermissionT(srId,spId) VALUES('30000000000000000000000000000001','20000000000000000000000000000001') ;
insert into sysRolePermissionT(srId,spId) VALUES('30000000000000000000000000000001','20000000000000000000000000000002') ;
insert into sysRolePermissionT(srId,spId) VALUES('30000000000000000000000000000001','20000000000000000000000000000003') ;
insert into sysRolePermissionT(srId,spId) VALUES('30000000000000000000000000000001','20000000000000000000000000000004') ;
insert into sysRolePermissionT(srId,spId) VALUES('30000000000000000000000000000002','20000000000000000000000000000001') ;
insert into sysRolePermissionT(srId,spId) VALUES('30000000000000000000000000000002','20000000000000000000000000000002') ;
insert into sysRolePermissionT(srId,spId) VALUES('30000000000000000000000000000003','20000000000000000000000000000001') ;
insert into sysRolePermissionT(srId,spId) VALUES('30000000000000000000000000000004','20000000000000000000000000000001') ;
insert into sysRolePermissionT(srId,spId) VALUES('30000000000000000000000000000005','20000000000000000000000000000001') ;


select * from sysRolePermissionT;
/********+*********+*********+*********+*********+*********+*/

create table sysFunctionT(
sfId nvarchar2(64) primary key,      --权限过滤编号
sfValue nvarchar2(640),              --权限过滤路径
spId nvarchar2(64) ,                 --权限编号
srId nvarchar2(64) ,                 --角色编号
sfType nvarchar2(640),               --过滤类型
sfAddTime timestamp default sysdate  --添加时间
);

comment on table  sysFunctionT              is '权限过滤表'      ;
comment on column sysFunctionT.sfId         is '权限过滤编号'    ;
comment on column sysFunctionT.sfValue      is '权限过滤路径'    ;
comment on column sysFunctionT.spId         is '权限编号'        ;
comment on column sysFunctionT.srId         is '角色编号'        ;
comment on column sysFunctionT.sfType       is '过滤类型'        ;
comment on column sysFunctionT.sfAddTime    is '添加时间'        ;

alter table sysFunctionT add constraint fk_sysFunctionT_spId foreign key(spId) references sysPermissionT(spId);
alter table sysFunctionT add constraint fk_sysFunctionT_srId foreign key(srId) references sysRoleT(srId)      ;

insert into sysFunctionT(sfId,sfValue,spId,srId,sfType) VALUES('40000000000000000000000000000001','/LoginController/login.html'  ,null                              ,null,'anon')  ;
insert into sysFunctionT(sfId,sfValue,spId,srId,sfType) VALUES('40000000000000000000000000000002','/sysUser/sysUserList.html'    ,'20000000000000000000000000000001',null,'perms') ;
insert into sysFunctionT(sfId,sfValue,spId,srId,sfType) VALUES('40000000000000000000000000000003','/sysUser/sysUserAdd.html'     ,'20000000000000000000000000000002',null,'perms') ;
insert into sysFunctionT(sfId,sfValue,spId,srId,sfType) VALUES('40000000000000000000000000000004','/sysUser/sysUserEdit.html'    ,'20000000000000000000000000000003',null,'perms') ;
insert into sysFunctionT(sfId,sfValue,spId,srId,sfType) VALUES('40000000000000000000000000000005','/sysUser/sysUserDel.html'     ,'20000000000000000000000000000004',null,'perms') ;
insert into sysFunctionT(sfId,sfValue,spId,srId,sfType) VALUES('40000000000000000000000000000006','/test.html'                   ,'20000000000000000000000000000001',null,'roles') ;

select * from sysFunctionT;
/********+*********+*********+*********+*********+*********+*/