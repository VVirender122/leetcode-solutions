-- Customers Who Never Order (Easy) - LeetCode 183
-- Approach: keep customers whose id does not appear in the Orders table.
-- Note: NOT IN returns nothing if the subquery contains a NULL.
SELECT name AS Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
);

-- NULL-safe alternative:
-- SELECT c.name AS Customers
-- FROM Customers c
-- WHERE NOT EXISTS (
--     SELECT 1
--     FROM Orders o
--     WHERE o.customerId = c.id
-- );
