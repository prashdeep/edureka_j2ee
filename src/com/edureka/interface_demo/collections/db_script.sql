show databases;
create database edureka_jee;
use edureka_jee;
show tables;

create table employee (
    id int unsigned primary key,
    name varchar(40) not null,
    dept_name varchar(40) not null,
    dob date not null
);


insert into employee(name,dept_name, dob)
    values
		('Vinay', 'PAYROLL', '1983-10,2'),
        ( 'Harish', 'PAYROLL', '1983-10,2'),
        ( 'Suman', 'COMMUTE', '1983-10,2'),
        ( 'Vihay', 'FINANCE', '1983-10,2'),
        ('Panesh', 'HR', '1983-10,2');

select * from employee;
alter table employee drop column id;
alter table employee add column id int unsigned auto_increment primary key;

desc employee;
drop table employee;
drop database edureka_jee;