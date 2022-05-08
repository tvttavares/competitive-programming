CREATE PROCEDURE solution()
BEGIN
	/* Write your SQL here. Terminate each statement with a semicolon. */
	select p.project_name, p.team_lead, p.income from Projects p;
END