/*Please add ; after each select statement*/
CREATE PROCEDURE solution()
BEGIN
	select first_name, second_name, attribute from users
    where
       attribute like BINARY concat('_%\%',first_name,'\_',second_name,'\%%');
END