# Write your MySQL query statement below
Select name From SalesPerson
    Where sales_id not in 
    (Select Orders.sales_id from Orders join Company 
    on Company.com_id = Orders.com_id 
    where company.name = "RED")