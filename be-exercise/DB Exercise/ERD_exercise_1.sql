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
    state_province VARCHAR(12) NOT NULL,
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
    foreign key (department_id) references departments(department_id),
    foreign key (employee_id) references employees(employee_id)
);

CREATE TABLE employees (
	employee_id INTEGER PRIMARY KEY auto_increment,
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
    foreign key (department_id) references departments(department_id),
	foreign key (job_id) references jobs(job_id)
);

CREATE TABLE job_grades (
	grade_level VARCHAR(2) PRIMARY KEY,
    lowest_sal INTEGER NOT NULL,
	highest_sal INTEGER NOT NULL
);

