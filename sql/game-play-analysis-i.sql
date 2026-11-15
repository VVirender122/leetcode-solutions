-- Game Play Analysis I (Easy) - LeetCode 511
-- Approach: group by player and take the earliest event_date with MIN.
SELECT
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;
