insert into course(id, name, created_date, last_updated_date)
values (10001, 'JPA in 50 steps', sysdate(), sysdate());

insert into course(id, name, created_date, last_updated_date)
values (10002, 'Spring Frame in 100 steps', sysdate(), sysdate());

insert into course(id, name, created_date, last_updated_date)
values (10003, 'Spring Boot in 50 steps', sysdate(), sysdate());

insert into course(id, name, created_date, last_updated_date)
values (10004, 'Spring MVC in 50 steps', sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date)
values (10005, 'Dummy1', sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date)
values (10006, 'Dummy2', sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date)
values (10007, 'Dummy3', sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date)
values (10008, 'Dummy4', sysdate(), sysdate());

insert into passport(id, number)
values (40001, 'E123456');
insert into passport(id, number)
values (40002, 'N231456');
insert into passport(id, number)
values (40003, 'L654321');

insert into student(id, name, passport_id)
values (20001, 'Ranga', 40001);
insert into student(id, name, passport_id)
values (20002, 'Arun', 40002);
insert into student(id, name, passport_id)
values (20003, 'Naga', 40003);

insert into review(id, rating, description, course_id)
values (50001, '5', 'Great Course', 10001);
insert into review(id, rating, description, course_id)
values (50002, '4', 'Wonderful Course', 10001);
insert into review(id, rating, description, course_id)
values (50003, '5', 'Awesome Course', 10003);

insert into student_course(student_id, course_id)
values(20001,10001);
insert into student_course(student_id, course_id)
values(20002,10001);
insert into student_course(student_id, course_id)
values(20003,10001);
insert into student_course(student_id, course_id)
values(20001,10003);