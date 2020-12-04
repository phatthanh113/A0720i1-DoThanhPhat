use test ;
create table suppliers ( 
supplier_id INT(11) NOT NULL AUTO_INCREMENT,
supplier_name VARCHAR(50) NOT NULL,
account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);
create TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);
CREATE TABLE users(
   user_id INT AUTO_INCREMENT PRIMARY KEY,
   username VARCHAR(40),
   password VARCHAR(255),
   email VARCHAR(255)
);
-- them cot moi 
ALTER TABLE contacts
  ADD last_name varchar(40) NOT NULL
    AFTER contact_id;
    -- thay doi mo ta cot  
ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL;
  -- xoa cot 
  ALTER TABLE contacts
  DROP COLUMN last_name;
  -- doi ten bang
    ALTER TABLE contacts 
    rename to people;