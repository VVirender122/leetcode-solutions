-- Delete Duplicate Emails (Easy) - LeetCode 196
-- Approach: self join on the same email and delete the row with the larger id,
-- so only the smallest id for each email is kept.
DELETE P
FROM Person P
JOIN Person P2
    ON P.Email = P2.Email
    AND P.Id > P2.Id;

-- Alternative with a subquery (MySQL needs the derived table "t"):
-- DELETE FROM Person
-- WHERE Id NOT IN (
--     SELECT Id FROM (
--         SELECT MIN(Id) AS Id
--         FROM Person
--         GROUP BY Email
--     ) t
-- );
