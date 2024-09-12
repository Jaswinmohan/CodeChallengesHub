# Write your MySQL query statement below

SELECT customer_id,count(v.visit_id) as count_no_trans
from Visits v 
LEFT JOIN Transactions t 
ON v.visit_id = t.visit_id 
where transaction_id is null
group by customer_id
order by count_no_trans;