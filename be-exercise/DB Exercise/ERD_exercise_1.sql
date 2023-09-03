SHOW databases;
CREATE DATABASE Exercise1;
use Exercise1;

CREATE TABLE regions (
	region_id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    region_name VARCHAR(25) NOT NULL
);

CREATE TABLE countries (
	country_id VARCHAR(2) PRIMARY KEY,
    country_name VARCHAR(20) NOT NULL,
    region_id INTEGER,
    foreign key (region_id) references regions(region_id)
);

CREATE TABLE locations (
	location_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    street_address VARCHAR(25) NOT NULL,
    postal_code VARCHAR(12) NOT NULL,
    city VARCHAR(30) NOT NULL,
    state_province VARCHAR(12),
    country_id VARCHAR(2) NOT NULL,
    foreign key (country_id) references countries(country_id)
);

CREATE TABLE departments (
	department_id INTEGER PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(30) NOT NULL,
    manager_id INTEGER NOT NULL,
    location_id INTEGER NOT NULL,
    foreign key (location_id) references locations(location_id)
);

CREATE TABLE jobs (
	job_id VARCHAR(10) PRIMARY KEY,
    job_title VARCHAR(35) NOT NULL,
    min_salary INTEGER NOT NULL,
    max_salary INTEGER NOT NULL
);


CREATE TABLE job_history (
	employee_id INTEGER,
    start_date DATE NOT NULL,
    END_DATE DATE,
    job_id VARCHAR(10) NOT NULL, 
    department_id INTEGER NOT NULL,
    PRIMARY KEY(employee_id, start_date),
    foreign key (job_id) references jobs(job_id),
    foreign key (department_id) references departments(department_id)
);


CREATE TABLE employees (
	employee_id INTEGER PRIMARY KEY,
    first_name VARCHAR(20) NOT NULL,
	last_name VARCHAR(25) NOT NULL,
	email VARCHAR(25) NOT NULL,
	phone_number VARCHAR(20) NOT NULL,
    hire_date DATE NOT NULL,
    job_id VARCHAR(10) NOT NULL,
    salary INTEGER NOT NULL,
    commission INTEGER NOT NULL,
    manager_id INTEGER NOT NULL,
    department_id INTEGER NOT NULL,
    foreign key (employee_id) references job_history(employee_id),
    foreign key (department_id) references departments(department_id),
	foreign key (job_id) references jobs(job_id)
);

CREATE TABLE job_grades (
	grade_level VARCHAR(2) PRIMARY KEY,
    lowest_sal INTEGER NOT NULL,
	highest_sal INTEGER NOT NULL
);

-- Insert record to regions
INSERT INTO regions values (1, 'Europe');
INSERT INTO regions values (2, 'America');
INSERT INTO regions values (3, 'Asia');
INSERT INTO regions values (4, 'Africa');
INSERT INTO regions values (5, 'Australia');

Select * from regions;

-- Insert record to countries
INSERT INTO countries values ('DE', 'Germary' , 1);
INSERT INTO countries values ('IT', 'Italy' , 1);
INSERT INTO countries values ('JP', 'Japan' , 3);
INSERT INTO countries values ('US', 'United State' , 2);

select * from countries;

-- Insert records to locations
Alter table locations modify state_province VARCHAR(15);

INSERT INTO locations values (1000, '1297 Via Cola di Rie', 989, 'Roma', null, 'IT');
INSERT INTO locations values (1100, '93091 Calle della Te', 10934, 'Venice', null, 'IT');
INSERT INTO locations values (1200, '2017 Shinjuku-ku', 1689, 'Tokyo', 'Tokyo Refectu', 'JP');
INSERT INTO locations values (1400, '2014 Jabberwocky Rd', 26192, 'Southlake', 'Texas', 'US');

Select * from locations;

-- Insert records to department
INSERT INTO departments values (10, 'Administration', 200, 1100);
INSERT INTO departments values (20, 'Marketing', 201, 1200);
INSERT INTO departments values (30, 'Purchasing', 202, 1400);

select * from departments;

-- Insert records to Jobs

INSERT INTO jobs values ('IT_PROD', 'Programmer', 20000, 35000);
INSERT INTO jobs values ('MK_REP', 'MKT Officer', 15000, 25000);
INSERT INTO jobs values ('ST_CLERK', 'Admin Officer', 10000, 15000);

select *from jobs;

-- Insert records to job_history

INSERT INTO job_history values (102, '1993-01-13', '1998-07-24', 'IT_PROD', 20);
INSERT INTO job_history values (101, '1993-09-21', '1993-10-27', 'MK_REP', 10);
INSERT INTO job_history values (101, '1993-10-28', '1997-03-15', 'MK_REP', 30);
INSERT INTO job_history values (100, '1996-02-17', '1999-12-19', 'ST_CLERK', 30);
INSERT INTO job_history values (103, '1998-03-24', '1999-12-31', 'MK_REP', 20);
INSERT INTO job_history values (200, '1991-03-03', '2000-12-31', 'ST_CLERK', 10);
INSERT INTO job_history values (201, '1991-03-13', '2002-03-31', 'IT_PROD', 30);
INSERT INTO job_history values (202, '1991-07-21', '2001-01-31', 'MK_REP', 20);

Select * from job_history;

INSERT INTO employees values (100, 'Steven', 'King', 'SKING', '515-1234567', '1987-06-17', 'ST_CLERK', 24000, 0, 109, 10);
INSERT INTO employees values (101, 'Neena', 'Kochhar', 'NKOCHHAR', '515-1234568', '1987-06-18', 'MK_REP', 17000, 0, 103, 20);
INSERT INTO employees values (102, 'Lex', 'De Haan', 'LDEHAAN', '515-1234569', '1987-06-19', 'IT_PROD', 17000, 0, 108, 30);
INSERT INTO employees values (103, 'Alexander', 'Hunold', 'AHUNOLD', '590-1234567', '1987-06-20', 'MK_REP', 9000, 0, 105, 20);
INSERT INTO employees values (200, 'Hugh', 'Jackman', 'HUGHJACKMAN', '590-1234568', '1987-06-20', 'ST_CLERK', 21450, 0, 301, 10);
INSERT INTO employees values (201, 'Sasha', 'Calle', 'SASHACALLE', '590-1234569', '1987-06-20', 'IT_PROD', 25000, 0, 301, 30);
INSERT INTO employees values (202, 'John', 'Doe', 'JOHNDOE', '590-1123444', '1987-06-20', 'MK_REP', 23500, 0, 301, 20);

Select * from employees;


-- Task 3: write a query to find the location_id, street_address, city, state_province, country_name of locations

SELECT l.location_id, l.street_address, l.city, l.state_province, c.country_name
FROM locations l LEFT JOIN countries c on l.country_id = c.country_id;

-- Task 4: Write a query to find the first_name, last name, department id of all the employees

SELECT first_name, last_name, department_id FROM employees;

-- Task 5: Write a query to find the first_name, last name, job_id, department id of the employee who works in japan

SELECT e.first_name, e.last_name, e.job_id, e.department_id, l.country_id 
FROM employees e LEFT JOIN departments d ON e.department_id = d.department_id
LEFT JOIN locations l ON d.location_ID = l.location_ID
WHERE country_id = 'JP';

-- Task 6: Write a query to find the employee id, last_name along with their manager_id and last_name
SELECT e1.employee_id, e1.last_name, e1.manager_ID, e2.last_name
FROM employees e1 LEFT JOIN employees e2 on e1.manager_id = e2.employee_id;

-- Task 7: Write a query to find first_name, last_name and hire date of the employee who was hired after 'Lex De Haa'
Select first_name, last_name, hire_date
FROM employees
WHERE hire_date > (Select hire_date FROM employees WHERE Employee_Id = 102)
LIMIT 1;

-- Task 8: Write a query to get the department name and number of employees of each the department

SELECT d.department_name, count(1) as number_of_employee
FROM employees e LEFT JOIN departments d on e.department_id = d.department_id
GROUP BY e.department_ID
;

-- Task 9: Write a query to find the employee ID, job title, number of days between ending date and starting date for all jobs in department ID 30

SELECT h.employee_id, j.job_title, datediff(h.end_date, h.start_date) as duration
FROM job_history h LEFT JOIN jobs j ON h.job_id = j.job_id
WHERE h.department_id = 30;

-- Task 10: Write a query to display all department name, manager name, city and country name
SELECT d.department_name, e.first_name, e.last_name, l.city, c.country_name
FROM departments d LEFT JOIN employees e ON d.manager_ID = e.employee_id
LEFT JOIN locations l ON d.location_id = l.location_id
LEFT JOIN countries c ON c.country_ID = l.country_id;

-- Task 11: Write a query to display all the average salary of each department

SELECT d.department_name, round(AVG(e.SALARY), 2) as Average_Salary
FROM employees e LEFT JOIN departments d on d.department_id = e.department_id
GROUP BY e.department_ID;

-- Task 12: Now, we try perform the average salary of each department
-- a. How do you re-design the table 'jobs'? and adding table 'job_grades'
