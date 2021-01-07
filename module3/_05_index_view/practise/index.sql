select * from customers where customerNumber = 175 ;
EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;
alter table customers add index idx_customerNumber(customerNumber);
alter table customers add index idx_fullname(contactFirstName,contactLastName);