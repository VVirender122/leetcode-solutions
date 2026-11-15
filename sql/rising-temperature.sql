-- Rising Temperature (Easy) - LeetCode 197
-- Approach: self join each day (w2) with the day before it (w1) using DATEDIFF,
-- then keep the days that were warmer than the previous day.
SELECT w2.id
FROM Weather w1
JOIN Weather w2
    ON DATEDIFF(w2.recordDate, w1.recordDate) = 1
WHERE w2.temperature > w1.temperature;
