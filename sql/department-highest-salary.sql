-- Department Highest Salary (Medium) - LeetCode 184
-- Approach: find each department's maximum salary in a subquery, then keep the
-- employees whose (departmentId, salary) pair matches it. Ties are all included.
SELECT
    Department.name AS Department,
    Employee.name AS Employee,
    Employee.salary AS Salary
FROM Employee
JOIN Department ON Employee.departmentId = Department.id
WHERE (Employee.departmentId, Employee.salary) IN (
    SELECT departmentId, MAX(salary)
    FROM Employee
    GROUP BY departmentId
);

-- Alternative with a window function (MySQL 8):
-- SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary
-- FROM (
--     SELECT *, DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS rnk
--     FROM Employee
-- ) e
-- JOIN Department d ON e.departmentId = d.id
-- WHERE e.rnk = 1;
