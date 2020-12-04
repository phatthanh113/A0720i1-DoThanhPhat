use bank ;
-- tạo bảng customers
create table customers(
 id int auto_increment,
 name nvarchar(50) not null ,
 address nvarchar(50) not null ,
 email nvarchar(50) not null unique,
 primary key(id)
);
alter table bank.customers
add phone int(10) not null unique 
after email;
use bank ;
create table accounts(
 account_number int(12) not null primary key,
 account_type nvarchar(20) default "medium",
 open_date date not null,
 balance double not null ,
 account_id int ,
 foreign key(account_id) REFERENCES bank.customers(id) 
);
create table transactions(
 code_transactions int not null primary key ,
 balance double not null,
 time_open datetime not null,
 describe_info text ,
 account_transaction int(12) not null ,
 foreign key (account_transactiotransactions_ibfk_1n) references accounts(account_number)
);