# Write your MySQL query statement below
SELECT d.name AS Department, e.name AS Employee , e.salary AS Salary 
FROM Employee as e INNER JOIN Department as d on e.departmentId=d.id 
WHERE (d.id,Salary)  
IN (SELECT  departmentId, MAX(Salary) AS Salary FROM Employee GROUP BY departmentId)