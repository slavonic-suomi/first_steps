CREATE TABLE `product` (
   `id` INT NOT NULL ,
   name varchar(255),
   price int,
   date_added datetime,
   PRIMARY KEY (`id`)
);

create table `user` (
   `id` int not null auto_increment,
   `email` varchar(255) unique ,
   PRIMARY KEY (`id`)
);

create table `user_comments` (
  `id` int not null auto_increment,
  `user_id` int not null,
  `data` varchar(255),
  PRIMARY KEY (`id`),
  foreign key (`user_id`) references `user`(`id`)
);

 ALTER TABLE `product`
   CHANGE COLUMN `id` `id` INT(11) NOT NULL AUTO_INCREMENT ;


insert into product (name, price, date_added)
values ('qwe', 23, now());


insert into user_comments (`user_id`, `data`) values
(1, 'a1'),
(1, 'a1'),
(1, 'a2'),
(1, 'a3'),
(2, 'sam1'),
(2, 'sam2');


select * from user where email <> 'sam' and id > 1;

select * from user_comments
where user_id = (select id from user where email = 'sam')
;


select user.id as user_id,
       email,
       user_comments.id as cmt_id ,
       data
from user, user_comments
where user.id = user_comments.user_id
order by email desc, cmt_id desc
;

select user.id as user_id,
       email,
       user_comments.id as cmt_id ,
       data
from user
left join user_comments on
  user.id = user_comments.user_id;

select user.email, count(uc.user_id)
from user
inner join user_comments uc on user.id = uc.user_id
where user_id > 0
group by user.email
having count(uc.user_id) > 3
limit 5,3;

update user set email = 'john wick' where email = 'john';
# select count(*) from user;