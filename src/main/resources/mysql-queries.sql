ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';
CREATE DATABASE SAURABH;
use mysql
select  * from db;

use SAURABH;

create table users(
   id INT NOT NULL AUTO_INCREMENT,
   username VARCHAR(50) NOT NULL,
   password VARCHAR(50) NOT NULL,
   PRIMARY KEY ( id )
);

insert into users values(1,'saurabh','1234');
insert into users values(2,'varun','4567');
insert into users values(3,'bhavana','7892');
insert into users values(4,'rupali','1253');
commit;
