# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below
DELETE person1
FROM Person person1, Person person2
WHERE person1.Email = person2.Email AND person1.id > person2.id;