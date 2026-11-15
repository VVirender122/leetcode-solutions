-- Duplicate Emails (Easy) - LeetCode 182
-- Approach: group rows by email and keep the groups that have more than one row.
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;

-- Alternative with a self join:
-- SELECT DISTINCT p1.email AS Email
-- FROM Person p1
-- JOIN Person p2
--     ON p1.email = p2.email
--     AND p1.id <> p2.id;
