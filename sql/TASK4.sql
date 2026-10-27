DROP TABLE IF EXISTS costumers;

CREATE TABLE costumers (
  id SERIAL PRIMARY KEY,
  FirStName VARCHAR(50) NOT NULL,
   LastName VARCHAR(50) NOT NULL,
email VARCHAR(50) UNIQUE CHECK (email LIKE '%@gmail.com'),
totalSpend INTEGER CHECK(totalSpend>0),
  status VARCHAR (50) DEFAULT 'active',
  registrationDate DATE DEFAULT CURRENT_DATE

);

INSERT INTO costumers (FirStName, LastName, email, totalSpend, status, registrationDate)
VALUES
  ('Ivan',   'Petrov',    'ivan.petrov@gmail.com',   1500, 'active',   '2021-03-15'),
  ('Anna',   'Smirnova',  'anna.smirnova@gmail.com', 3200, 'vip',      '2020-07-22'),
  ('Dmitry', 'Kuznetsov', 'dmitry.k@gmail.com',       450, 'active',   '2022-01-10'),
  ('Elena',  'Sokolova',  'elena.sokolova@gmail.com', 780, 'inactive', '2019-11-05'),
  ('Sergey', 'Volkov',    'sergey.volkov@gmail.com', 5100, 'vip',      '2018-05-30'),
  ('Maria',  'Popova',    'maria.popova@gmail.com',   220, 'new',      '2024-09-18'),
  ('Alex',   'Ivanov',    'alex.ivanov@gmail.com',   1900, 'active',   '2023-04-27');

SELECT * FROM costumers;
SELECT CURRENT_DATE;
SELECT ROUND(totalSpend) FROM costumers;
SELECT CEIL(totalSpend) FROM costumers;
SELECT FLOOR(totalSpend) FROM costumers;
SELECT MOD(totalSpend,100) FROM costumers;
SELECT POWER(totalSpend,2) FROM costumers;
SELECT SQRT(totalSpend) FROM costumers;
SELECT UPPER(FirStName) FROM costumers;
SELECT UPPER(LastName) FROM costumers;
SELECT LOWER(FirStName) FROM costumers;
SELECT LOWER(LastName) FROM costumers;
SELECT TRIM(LastName) FROM costumers;

SELECT LENGTH(LastName) FROM costumers;
SELECT ABS(totalSpend-1000) FROM costumers;
SELECT ROUND(totalSpend*0.02,2) FROM costumers;







    