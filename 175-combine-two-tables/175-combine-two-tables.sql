# Write your MySQL query statement below
select p.firstname, p.lastname, t.city, t.state from Person as p LEFT JOIN Address as t on p.personId = t.personID;