CREATE PROCEDURE solution()
    SELECT id, IF (given_answer = correct_answer, "correct", IF (given_answer = '' or given_answer is null, "no answer" , "incorrect") ) AS checks
    FROM answers
    ORDER BY id;
