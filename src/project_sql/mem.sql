CREATE TABLE mem(

mNumber number primary key,
mName varchar2(10),
mPhone varchar2(13),
mAddress varchar2(50),
mSum number,
mGrade varchar2 (10));

SELECT *
FROM mem;

INSERT INTO mem
VALUES(1,'김석진','010-1111-1111','과천',400000,'Family');

INSERT INTO mem
VALUES(2,'민윤기','010-2222-2222','대구',5000000,'Vvip');

INSERT INTO mem
VALUES(3,'김남준','010-3333-3333','일산',0,'New');

INSERT INTO mem
VALUES(4,'정호석','010-4444-4444','광주',50000,'New');

INSERT INTO mem
VALUES(5,'김태형','010-5555-5555','거창',105000,'Vip');

INSERT INTO mem
VALUES(6,'박지민','010-6666-6666','부산',2500000,'Vvip');

CREATE SEQUENCE mem_num_seq
INCREMENT BY 1
START WITH 7
MINVALUE 7
MAXVALUE 9999
NOCYCLE
NOCACHE
NOORDER;

SELECT *
FROM mem;

commit;

