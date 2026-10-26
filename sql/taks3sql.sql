DROP TABLE IF EXISTS films;

CREATE TABLE films (
  id INTEGER,
  name VARCHAR(50),
  genre VARCHAR(50),
  rating INT,
  duration INT,
  release_year INT);
  
INSERT INTO films (id, name, genre, rating, duration, release_year) VALUES
(1, 'The Shawshank Redemption', 'Drama', 9, 112, 1994),
(1, 'The Shawshank Redemption', 'Drama', 9, 112, 1994),
(1, 'The Shawshank Redemption', 'Drama', 9, 112, 1994),
(1, 'The Shawshank Redemption', 'Drama', 9, 112, 1994),
(1, 'The Shawshank Redemption', 'Drama', 9, 112, 1994),
(1, 'The Shawshank Redemption', 'Drama', 9, 112, 1994),
(1, 'The Shawshank Redemption', 'Drama', 9, 112, 1994),
(1, 'The Shawshank Redemption', 'Drama', 9, 112, 1994),
(2, 'The Godfather', 'Crime', 9, 110, 1972),
(3, 'The Dark Knight', 'Action', 9, 152, 2008),
(4, 'Pulp Fiction', 'Crime', 8, 154, 1994),
(5, 'Inception', 'Sci-Fi', 8, 148, 2010),
(6, 'Forrest Gump', 'Drama', 8, 142, 1994),
(7, 'The Matrix', 'Sci-Fi', 8, 136, 1999),
(8, 'Interstellar', 'Sci-Fi', 8, 169, 2014);

  --task1
  SELECT*FROM films;
  --task2
  
    SELECT name, rating FROM films;
	--task3
	
 SELECT*FROM films ORDER BY rating DESC;
 SELECT*FROM films ORDER BY rating ASC;
SELECT*FROM films ORDER BY NAME ASC;
 SELECT*FROM films ORDER BY rating DESC limit 3;
  SELECT*FROM films WHERE duration <120 limit 7;
SELECT*FROM films WHERE genre IN ('Drama','Action');

					




  

