# Write your MySQL query statement below
select * from Cinema 
where mod(id,2)=1 AND description <> 'boring'
order by rating DESC;