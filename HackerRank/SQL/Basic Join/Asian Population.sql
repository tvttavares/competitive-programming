select sum(c.population) from city c 
inner join country cc on c.CountryCode = cc.Code 
where cc.continent = 'Asia'