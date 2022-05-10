CREATE PROCEDURE solution()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
	SELECT Name, ID
	FROM Grades
	WHERE Final > Midterm1/2 +Midterm2/2 OR Final >Midterm1/4 + Midterm2/4 + Final/2
	ORDER BY substring(Name,1,3), ID;
END