/************创建构建名字字符表***************/
drop table name_character_t;

create table name_character_t(
id number(10,0) primary key,
structure varchar2(10) unique,
char_num number(2,0) not null,
suit_to_name varchar2(20) not null,
suit_to_gener varchar2(20),
pronunciation varchar2(20),
literalness varchar2(20),--字义
quotation varchar2(50),--引用，出处
meaning varchar2(200),--取名意义,解释
religionary varchar2(20),--五行富
is_used_elder varchar2(10)
);


/************创建构建名字字符表对应序列***************/
drop  sequence name_character_s;

create sequence name_character_s increment by 1 start with 1000;

/************插入名字字符表对应序列***************/
insert into name_character_t values(name_character_s.nextval,'李',7,'姓',null,'仄',null,'李唐',null,'木',null);
update name_character_t nct set nct.structure = '?',
                                nct.char_num = 0,
                                nct.suit_to_name = '?',
                                nct.suit_to_gener = '?',
                                nct.pronunciation = '?',
                                nct.literalness = '?',
                                nct.quotation = '?',
                                nct.meaning = '?',
                                nct.religionary = '?',
                                nct.is_used_elder = '?' where nct.id = 1002;
commit;                        
rollback;
select * from name_character_t;


/************创建构建名字表***************/
drop table name_product_t;

create table name_product_t(
name_id number(10,0) primary key,
name varchar2(50) unique,
name_count number(4,0) not null,
name_num number(4,0),--字个数
name_grade varchar2(20),--名字优劣
suit_to_gener varchar2(20),
pronunciation varchar2(20), 
literalness varchar2(20),--名字义
quotation varchar2(50),--引用，出处
meaning varchar2(200),--取名意义,解释
rich_religionary varchar2(20),--五行富
char_is_used_elder varchar2(10)
);

/************创建构建名字表对应序列***************/
drop  sequence name_product_s;

create sequence name_product_s increment by 1 start with 1000;

/************插入名字字符表对应序列***************/
insert into name_product_t values(name_product_s.nextval,'李锻锋',39,3,'优','男','平仄仄','李唐',null,'宝剑锋从锻练出，梅花香自苦寒来',null,'NO');
commit;
select * from name_product_t;
