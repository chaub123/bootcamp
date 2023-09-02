CREATE DATABASE ORG;
show databases;
use org;

CREATE TABLE WORKER (
  WORKER_ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  FIRST_NAME CHAR(25),
  LAST_NAME CHAR(25),
  SALARY NUMERIC(15),
  JOINING_DATE DATETIME,
  DEPARTMENT CHAR(25)
);

-- inesrt data to worker
INSERT INTO WORKER 
  (FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
    ('Monika', 'Arora', 100000, '21-02-20 09:00:00', 'HR'),
    ('Niharika', 'Verma', 80000, '21-06-11 09:00:00', 'Admin'),
    ('Vishal', 'Singhal', 300000, '21-02-20 09:00:00', 'HR'),
    ('Mohan', 'Sarah', 300000, '12-03-19 09:00:00', 'Admin'),
    ('Amitabh', 'Singh', 500000, '21-02-20 09:00:00', 'Admin'),
    ('Vivek', 'Bhati', 490000, '21-06-11 09:00:00', 'Admin'),
    ('Vipul', 'Diwan', 200000, '21-06-11 09:00:00', 'Account'),
    ('Satish', 'Kumar', 75000, '21-01-20 09:00:00', 'Account'),
    ('Geetika', 'Chauhan', 90000, '21-04-11 09:00:00', 'Admin');

-- create table bonus
CREATE TABLE BONUS (
  WORKER_REF_ID INTEGER,
  BONUS_AMOUNT NUMERIC(10),
  BONUS_DATE DATETIME,
  FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

Select * from worker;
Select * from BONUS;


-- TASK 1 : insert data
INSERT INTO bonus values (6, 32000, '21-11-02 09:00:00');
INSERT INTO bonus values (6, 20000, '22-11-02 09:00:00');
INSERT INTO bonus values (5, 21000, '21-11-02 09:00:00');
INSERT INTO bonus values (9, 30000, '21-11-02 09:00:00');
INSERT INTO bonus values (8, 4500, '22-11-02 09:00:00');

-- TASK 2 : show second highest salary
SELECT * FROM WORKER ORDER BY SALARY DESC LIMIT 1 OFFSET 1;

-- TASK 3 : show highest salary in each department
SELECT department, max(salary) as highest_salary from worker group by department;

-- Task 4 : fetch the list of employee with same salary
Select w1.first_name, w1.last_name, w1.salary
FROM worker w1, worker w2
WHERE w1.WORKER_ID <> w2.WORKER_ID
AND w1.salary = w2.salary;

-- Task 5 : find worker name with salary + bouns in 2021
SELECT w.first_name, 
w.last_name, 
CASE
	WHEN b.bonus_amount IS NULL OR date_format(b.BONUS_DATE, '%Y') <> '2021' THEN w.salary
    ELSE w.salary + b.bonus_amount
END as total
FROM worker w LEFT JOIN bonus b on w.worker_ID = b.worker_ref_id
WHERE date_format(JOINING_DATE, '%Y') = '2021'
;

-- Task 6 :


-- TAsk 7 :