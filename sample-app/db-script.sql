use mydata;


CREATE table accounts
(
id int primary key auto_increment,
first_name varchar(30),
last_name varchar(30),
username varchar(30)
);

CREATE table rewards
(
id int auto_increment primary key,
createdDate date,
amount numeric(10,2),
description varchar(150),
payeeName varchar(20),
account_id int,
constraint fk1 foreign key(account_id)  references accounts(id)
);
