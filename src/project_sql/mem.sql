CREATE TABLE member(

mNumber number primary key,
mName varchar2(10),
mPhone varchar2(13),
mAddress varchar2(50),
mSum number,
mGrade varchar2 (10));

SELECT *
FROM member;

commit;

ALTER TABLE member MODIFY(mgrade varchar2(10));

INSERT INTO member
VALUES(1,'김석진','010-1111-1111','과천',510000,'Family');

INSERT INTO member
VALUES(2,'민윤기','010-2222-2222','대구',10000000,'Vvip');

INSERT INTO member
VALUES(3,'김남준','010-3333-3333','일산',0,'New');

INSERT INTO member
VALUES(4,'정호석','010-4444-4444','광주',50000,'New');

INSERT INTO member
VALUES(5,'김태형','010-5555-5555','거창',105000,'Vip');

INSERT INTO member
VALUES(6,'박지민','010-6666-6666','부산',2500000,'Vvip');

SELECT *
FROM member;

ALTER TABLE member RENAME TO mem;

commit;

