CREATE VIEW customer_view as
select customerNumber,contactLastName,contactFirstName,phone 
from  customers ;
SELECT * FROM classicmodels.customer_view;
-- cập nhật view 
CREATE OR REPLACE VIEW customer_view AS
SELECT customerNumber, customerName, contactFirstName, contactLastName, phone,city
FROM customers
WHERE city = 'Nantes';
