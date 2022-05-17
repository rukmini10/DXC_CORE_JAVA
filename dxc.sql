-- types of sql commands
-- DDL
-- DML
create database dxcdb;
use dxcdb;
-- create table
-- attribute name datatype(size) [constraints]
-- );
CREATE TABLE `product` (
  `Pid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `price` float NOT NULL,
  PRIMARY KEY (`id`)
);
create table student(
rollno int(8) primary key auto_increment,
name varchar(30) not null,
stream char(15) not null,
avgmarks float(12,2)
);
use mysql;
select * from user;

use dxcdb;
create table person(
id int(8) primary key auto_increment,
firstName varchar(30) not null,
lastName varchar(30) not null,
emailId varchar(30) not null,
city varchar(30) not null
);
-- to see structure of table
describe student;

-- to add new records/tuple
insert into student(name,stream,avgmarks) values
("Rukmini","CSE",92.20),
("Spandana","ECE",82.20),
("Praveen","CSE",95.20),
("Subhash","EEE",52.20);

-- to see all records from student table
select * from student;
select * from employee;
-- to modify student records whose name is subhash
update student set avgmarks=avgmarks+20
where name="Subhash";

-- filtering 1 record from entire record
select * from student where name="Subhash";

-- delete something
delete from student where name="Subhash";

-- to display only few attributes in table
select rollno,avgmarks from student;


/*
Ref no
Name
Phone no 
Adhar no 
Pan card no 
Address
accType
email  
pwd
*/
/* Account Management Project Database
*/
use dxcdb;
-- admin table data
create table admin(
id int(11) not null auto_increment,
email varchar(45) not null,
fullname varchar(45) not null,
password varchar(45) not null,
primary key(id)
)engine=InnoDB;

-- to display table
describe admin;
select * from admin;
insert into admin(email,fullname,password) values
("admin@gmail.com","Admin","admin");

select * from admin;

-- table for customer
use dxcdb;
create table account_holder_Details(

UserName varchar(30) not null,
Full_Name varchar(45) not null,
Email varchar(45) not null,
Phone_Number varchar(45) not null,
Address varchar(45) not null,
Pancard_Number varchar(30) not null,
Security_Question varchar(45) not null,
Balance varchar(30) not null,
Account_Type varchar(30) not null,
Opening_Date varchar(30) not null,
Account_Password varchar(30) not null,
primary key(UserName)
);
drop table account_holder_Details;
describe account_holder_Details;

insert into account_holder_Details(UserName,Full_Name,Email,Phone_Number,Address,Pancard_Number,Security_Question,Balance,Account_Type,Opening_Date,Account_Password) values
("Harish18","HARISH M S","hari@gmail.com","930124568","netaji street, Theni- 986522","630 584 6558","Reading Books","65214","Savings","20/02/1987","user@123"),
("Subha@2","SUBHASHINI M S","subha@gmail.com","752410365"," ablian Street, mdu - 625000","964 852 4123","Writting Scipts","89632","Current","23/07/1985","user@123"),
("dhanj@14","DHANAJ K","dhanj@gmail.com","874563252","Shenbaga Street, Melur- 963252","852 456 8541","Playing Shettle","963021","Savings","08/06/2000","user@123"),
("Rukmini27","Rukmini CH","chebrolurukmini@gmail.com","9505918828","Chippadavari Street, AP- 520001","789 745 7189","Painting","1104512","Savings","05/02/2001","user@123")
;
use dxcdb;
select*from account_holder_Details;
update account_holder_Details set Address="Vijayawada" where UserName="rukmini";

/*tables for deposit*/
create table account_holder(
accnum varchar(20) not null,
date varchar(20) not null,
mdeposit varchar(20) not null
);
select * from account_holder;
create table login
(
id int(10) auto_increment,
accno varchar(20) not null,
pinno varchar(20) not null,
primary key(id)
);

insert into login(accno,pinno)
values("A0001",12345),
("A0002",45678),
("A0003",12345),
("A0004",45678),
("A0005",12345);
select * from login;






CREATE DATABASE demo;
use demo;
drop table users;
create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);
select * from users;




-- cash deposit
use dxcdb;
 create table tr(
 ano varchar(10), 
 t_ano varchar(20),
 t_name varchar(15),
 cname varchar(50), 
 Bal numeric(12,2), 
 tdt timestamp);
 drop table tr;
 
 
 
 
insert into tr values('A101', 456123456854,'Pranav', 'Rukmini', 10545,now()),
('A106',823479876010,'Makam','Surya',302001.45,'2022-04-23 11:10:14'),
('A107',823049310392,'Kommu','Spoorthi',50103.23,'2022-04-30 13:02:45'),
('A108',824501973264,'Dosala','Nithya',10902.56,'2022-05-01 14:54:54'),
('A109',823459374984,'Nimmala','Bharath',67890.65,'2022-04-14'),
('A110',823514790364,'Chiliveru','Bhargav',89000.76,'2022-05-03 12:30:02'),
('A111',823446920156,'srija','yedulla',98702.48,'2022-05-02 15:45:23'),
('A112',834827247820,'Sathvika','katikaneni',74137.38,'2022-05-07'),
('A113',823437851164,'Rukmini','Chebrolu',56721.34,'2022-04-12 16:34:29'),
('A114',832753481478,'Navya','Chandhrika',28741.89,'2022-04-29'),
('A115',834204780214,'Srinika','astum',72197.12,'2022-05-06');
 
 insert into tr
values('A102', 456123456854,'Surya','Harish', 14735.65,'2022-05-06 15:45:30'),
('A103',456123456854,'Praveen', 'Surya', 1454200,'2022-05-04 12:30:10'),
('A104',456123456854,'Chaitanya', 'Sowmya', 24735.65,'2022-05-06 5:45:30'),
('A105',456123456854,'Pavan', 'Navya', 34735.65,'2022-05-02 1:45:30');
 select*from tr;
create table ms
    (ano varchar(12), cname varchar(50), tdate timestamp,
    primary key(ano,tdate));
    
    alter table ms add column bal numeric(12,2);
  use dxcdb;  
     insert into ms
     values('A101','Gaurav','05-01-22 15:45:20',10500.65);
     
      insert into ms values('a101','Gaurav',now(),-500);
      select * from ms;
      
      
create table cb (ano varchar(12), abal numeric(12,2));

insert into cb values('a101', (select distinct sum(bal) from ms where ano='a101'));

-- checking balance
select * from cb;
insert into ms values('a102','Vikas','2022-02-01 10:20:25',5000),('a102','Vikas',now(),-300);

insert into cb values('a102', (select distinct sum(bal) from ms where ano='a102'));
select*from tr;

-- withdraw=balance-cash
drop table transaction;
use dxcdb;
CREATE TABLE `transaction` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `amount` float(10,2) NOT NULL,
  `t_accno` varchar(25) not null,
  `t_accname` varchar(25) not null,
  `date_time` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
drop table transaction;

insert into transaction values(1,"Rukmini",55000,"745896212358795","Nandu","2022-02-01 10:20:25"),
(2,"Rukmini",57800,"45674125948625","Pranav","2022-05-01 10:20:25"),
(3,"Rukmini",852000,"51254896325478","Nandu","2022-03-01 10:20:25"),
(4,"Rukmini",95000,"78945612357896","Spandama","2022-04-05 10:20:25");

insert into transaction values(1,"Harish",85000,"48951222258889","Pritham","2022-02-01 10:20:25");

insert into transaction values(1,"Harish",55000,"745896212358795","Nandu","2022-02-01 10:20:25"),
(2,"Navya",57800,"45674125948625","Pranav","2022-05-01 10:20:25"),
(2,"Subhash",852000,"51254896325478","Nandu","2022-03-01 10:20:25"),
(2,"Surya",95000,"78945612357896","Spandama","2022-04-05 10:20:25"),
(1,"Pranav",55000,"745896212358795","Nandu","2022-02-01 10:20:25"),
(2,"Makam",57800,"45674125948625","Pranav","2022-05-01 10:20:25"),
(2,"Kommu",852000,"51254896325478","Nandu","2022-03-01 10:20:25"),
(2,"Nimmala",95000,"78945612357896","Spandama","2022-04-05 10:20:25"),
(1,"chiliveru",55000,"745896212358795","Nandu","2022-02-01 10:20:25"),
(2,"srija",57800,"45674125948625","Pranav","2022-05-01 10:20:25"),
(2,"nikhila",852000,"51254896325478","Nandu","2022-03-01 10:20:25"),
(2,"srinika",95000,"78945612357896","Spandama","2022-04-05 10:20:25");


insert into transaction values(1,"Harish",55000,"745896212358795","Nandu","2022-02-01 10:20:25"),
(2,"Navya",57800,"45674125948625","Pranav","2022-05-01 10:20:25"),
(2,"surya",852000,"51254896325478","Nandu","2022-03-01 10:20:25"),
(2,"Surya",95000,"78945612357896","Spandama","2022-04-05 10:20:25"),
(1,"Pranav",55000,"745896212358795","Nandu","2022-02-01 10:20:25"),
(2,"pranav",57800,"45674125948625","Pranav","2022-05-01 3:27:45"),
(2,"navya",852000,"51254896325478","Nandu","2022-03-01 6:20:25"),
(2,"navya",95000,"78945612357896","Spandama","2022-04-05 5:10:25"),
(1,"srija",55000,"745896212358795","Nandu","2022-02-01 2:2:25"),
(2,"srija",57800,"45674125948625","Pranav","2022-05-01 7:50:2"),
(2,"Harish",852000,"51254896325478","Nandu","2022-03-01 90:20:5"),
(2,"Harish",95000,"78945612357896","Spandama","2022-04-05 10:20:25");

insert into transaction values(1,"Pranav",55000,"745896212358795","Nandu","2022-02-01 10:20:25"),
(2,"Surya",57800,"45674125948625","Pranav","2022-05-01 10:20:25"),
(2,"srija",852000,"51254896325478","Nandu","2022-03-01 10:20:25"),
(2,"Navya",95000,"78945612357896","Spandama","2022-04-05 10:20:25"),
(1,"Harish",55000,"745896212358795","Nandu","2022-02-01 10:20:25"),
(2,"Pranav",57800,"45674125948625","Pranav","2022-05-01 3:27:45"),
(2,"Makam",852000,"51254896325478","Nandu","2022-03-01 6:20:25"),
(2,"kommu",95000,"78945612357896","Spandama","2022-04-05 5:10:25"),
(1,"Nimmala",55000,"745896212358795","Nandu","2022-02-01 2:2:25"),
(2,"srija",57800,"45674125948625","Pranav","2022-05-01 7:50:2"),
(2,"srinika",852000,"51254896325478","Nandu","2022-03-01 90:20:5"),
(2,"chiliveru",95000,"78945612357896","Spandama","2022-04-05 10:20:25");



select*from transaction;
 