CREATE PROCEDURE solution()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
	select name from leaderboard order by score DESC LIMIT 3,5;
END