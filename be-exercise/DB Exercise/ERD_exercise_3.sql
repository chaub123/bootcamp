CREATE DATABASE exercise3;
use exercise3;


-- Question 1a : Create tables

CREATE TABLE city (
	id integer auto_increment primary key,
    city_name varchar(2)
);

SELECT * FROM city;


CREATE TABLE CUSTOMER (
	id INTEGER auto_increment PRIMARY KEY,
	customer_name VARCHAR(255) not null,
    city_id INTEGER,
    customer_address VARCHAR(255) not null,
    contact_person VARCHAR(255),
    email VARCHAR(128) not null,
	phone VARCHAR(128) not null,
    foreign key (city_id) references city(id)
);

SELECT * FROM CUSTOMER;


CREATE TABLE product (
	id integer auto_increment primary key,
	sku VARCHAR(32) not null,
    product_name varchar(128) not null,
    product_description text not null,
    current_price decimal(8, 2) not null,
    quantity_in_stock Integer not null
);

Select * from product;


create table invoice (
	id Integer auto_increment primary key,
    invoice_number varchar(255) not null,
    customer_id integer,
    user_account_id integer not null,
    total_price decimal(8, 2) not null,
    time_issued varchar(21),
    time_due varchar(21),
    time_paid varchar(21),
    time_canceled varchar(21),
    time_refunded varchar(21),
    foreign key (customer_id) references CUSTOMER(ID)
);

Select * from invoice;


create table invoice_item (
	id integer auto_increment primary key,
    invoice_id integer,
    product_id integer,
    quantity integer not null,
    price decimal(8,2) not null,
    line_total_price decimal(8,2) not null,
    foreign key (invoice_id) references invoice(id),
    foreign key (product_id) references product(id)
);

Select * from invoice_item;



-- Questoin 1b, insert data

INSERT INTO CITY values 
	(1, 'HK'),
    (2, 'JP'),
    (3, 'UK'),
    (4, 'US'),
    (5, 'TW'),
    (6, 'KR')
;

INSERT INTO CUSTOMER VALUES
	(1, 'Drogerie Wien', 1, 'Deckergasse 15A', 'Emil Steinbach', 'emil@drogeriewien.com', '094234234'),
    (2, 'Cosmetics Store', 4, 'Watling Street 347', 'Jeremy Corbyn', 'jeremy@c-store.org', '093923923'),
    (3, 'Kosmetikstudio', 3, 'Rothenbaumachaussee 53', 'Willy Brandt', 'willy@kosmetikstudio.com', '0941562222'),
    (4, 'Neue Kosmetik', 1, 'Karlsplatz 2', NULL, 'info@neuekosmetik.com', '094109253'),
    (5, 'Bio Kosmetik', 2, 'MotzstraBe 23', 'Clara Zetkin', 'clara@biokosmetik.org', '093825825'),
    (6, 'K-Wien', 1, 'Karntner StraBe 204', 'Maria Rauch-Kallat', 'maria@kwien.org', '093427002'),
    (7, 'Natural Cosmetics', 4, 'Clerkenwell Road 14B', 'Glenda Jackson', 'giena.j@natural-cosmetics.com', '093555123'),
    (8, 'Kosmetik Plus', 2, 'Unter den Linden 1', 'Angela Merkel', 'angela@k-plus.com', '094727727'),
    (9, 'New Line Cosmetics', 4, 'Devonshire Street 92', 'Oliver Cromwell', 'oliver@nic.org', '093202404');
    
INSERT INTO PRODUCT VALUES
    (1, '330120', 'Game Of Thrones - URBAN DECAY', 'Grame Of Thrones Eyeshadow Palette', 65.00, 122),
    (2, '330121', 'Advanced Night Repair-ESTEE LAUDER', 'Advanced Night Repair Synchronized Recovery Complex II', 98.00, 51),
    (3, '330122', 'Rose Deep Hydration - FRESH', 'Rose Deep Hydration Facial Toner', 45.00, 34),
    (4, '330123', 'Pore-Perfecting Moisturizer - TATCHA', 'Pore-Perfecting Moisturizer & Cleanser Duo', 25.00, 393),
    (5, '330124', 'Capture Youth - DIOR', 'Capture Youth Serum Collection', 95.00, 74),
    (6, '330125', 'Slice of Glow - GLOW RECIPE', 'Slice of Glow Set', 45.00, 40), 
    (7, '330126', 'Healthy Skin - KIEHL S SINCE 1851', 'Healthy Skin Squad', 68.00, 154),
    (8, '330127', 'Power Pair! - IT COSMETIC', 'IT is Your Skincare Power Pair! Best-Selling Moisturizer & Eye Cream Duo', 80.00, 0),
    (9, '330128', 'Dewy Skin Mist - TATCHA', 'Limited Edition Dewy Skin Mist Mini', 20.00, 281),
    (10, '330129', 'Slik Pillowcase - SLIP', 'Silk Pillowcase Duo + Scrunchies Kit', 170.00, 0);
    
    
INSERT INTO INVOICE VALUES
    (1, 'in_25181b07ba800c8d2fc967fe991807d9', 7, 4, 1436.00, '7/20/2019 3:05:07 PM', '7/27/2019 3:05:07 PM', '7/25/2019 9:24:12 AM', NULL, NULL),
    (2, '8fba000fd456b27502b9f81e9d52481', 9, 2, 1000.00, '7/20/2019 3:07:11 PM', '7/27/2019 3:07:11 PM', '7/20/2019 3:10:32 PM', NULL, NULL),
    (3, '3b6638118246b6b6cfd3dfcd9be487599', 3, 2, 360.00, '7/20/2019 3:06:15 PM', '7/27/2019 3:06:15 PM', '7/31/2019 9:22:11 PM', NULL, NULL),
    (4, 'dfe7f0a01a682196car0120a9adbb550', 5, 2, 1675.00, '7/20/2019 3:05:34 PM', '7/27/2019 3:05:34 PM', NULL, NULL, NULL),
    (5, '2a24cc2ad4440d698878a0a1a71f70fa', 6, 2, 9500.00, '7/20/2019 3:05:42 PM', '7/27/2019 3:05:42 PM', NULL, '7/22/2019 11:17:02 AM', NULL),
    (6, 'cbd304872ca62577716bcab8fc43204d7', 4, 2, 150.00, '7/20/2019 3:08:15 PM', '7/27/2019 3:08:15 PM', '7/27/2019 3:08:15 PM', NULL, '7/27/2019 2:11:20 PM');
    
INSERT INTO INVOICE_ITEM VALUES
    (1, 1, 1, 20, 65.00, 1300.00),
    (2, 1, 7, 2, 68.00, 136.00),
    (3, 1, 5, 10, 100.00, 1000.00),
    (4, 3, 10, 2, 180.00, 360.00),
    (5, 4, 1, 5, 65.00, 325.00),
    (6, 4, 2, 10, 95.00, 950.00),
    (7, 4, 5, 4, 100.00, 400.00),
    (8, 5, 10, 100, 95.00, 9500.00),
    (9, 6, 4, 6, 25.00, 150.00);
    
    
    
    
-- Question 1c : List customer and product without sales

SELECT C.id, C.CUSTOMER_NAME
FROM CUSTOMER C 
LEFT JOIN INVOICE I ON C.id = I.CUSTOMER_ID
WHERE C.id IS NOT NULL AND I.CUSTOMER_ID IS NULL
UNION
SELECT P.id, P.PRODUCT_NAME
FROM PRODUCT P
LEFT JOIN INVOICE_ITEM i ON P.id = i.PRODUCT_ID
WHERE P.id IS NOT NULL AND i.PRODUCT_ID IS NULL; 


-- Question 2 : run the following SQL to create tables

CREATE TABLE EMPLOYEE (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    EMPLOYEE_NAME VARCHAR(30) NOT NULL,
    SALARY NUMERIC(8,2),
    PHONE NUMERIC(15),
    EMAIL VARCHAR(50),
    DEPT_ID INTEGER NOT NULL
);

DROP TABLE DEPARTMENT;
CREATE TABLE DEPARTMENT (
	ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    DEPT_CODE VARCHAR(3) NOT NULL,
    DEPT_NAME VARCHAR(200) NOT NULL
);


-- Question 2a : 


DELETE FROM EMPLOYEE;
INSERT INTO EMPLOYEE VALUES
    (1, 'JOHN', 20000, 90234567, 'JOHN@GMAIL.COM', 1),
    (2, 'MARY', 10000, 90234561, 'MARY@GMAIL.COM', 1),
    (3, 'STEVE', 30000, 90234562, 'STEVE@GMAIL.COM', 3),
    (4, 'SUNNY', 40000, 90234563, 'SUNNY@GMAIL.COM', 4);

DELETE FROM DEPARTMENT;
INSERT INTO DEPARTMENT VALUES
    (1, 'HR', 'HUMAN RESOURCES'),
    (2, '9UP', '9UP DEPARTMENT'),
    (3, 'SA', 'SALES DEPARTMENT'),
    (4, 'IT', 'INFORMATION TECHNOLOGY DEPARTMENT');


SELECT  D.DEPT_CODE, COUNT(E.ID) AS number_of_employees
FROM EMPLOYEE E
right OUTER JOIN DEPARTMENT D ON E.DEPT_ID = D.ID
GROUP BY D.DEPT_CODE
ORDER BY 
	CASE
        WHEN D.DEPT_CODE REGEXP '^[0-9]' THEN 2  -- Numbers
        ELSE 1                                  -- Others
    END,
	D.DEPT_CODE ASC
;

-- Question 2b : 

DELETE FROM DEPARTMENT WHERE ID = 5;
INSERT INTO DEPARTMENT VALUES (5, 'IT', 'INFORMATION TECHNOLOGY DEPARTMENT');
SELECT * FROM DEPARTMENT;