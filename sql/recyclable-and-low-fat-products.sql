-- Recyclable and Low Fat Products (Easy) - LeetCode 1757
-- Approach: filter rows where both flag columns are 'Y'
SELECT product_id
FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';
