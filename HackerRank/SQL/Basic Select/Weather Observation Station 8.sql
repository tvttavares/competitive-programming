SELECT DISTINCT CITY FROM station WHERE city regexp '[aeiou]$' AND city IN (SELECT CITY FROM STATION WHERE CITY REGEXP '^[aeiou]');