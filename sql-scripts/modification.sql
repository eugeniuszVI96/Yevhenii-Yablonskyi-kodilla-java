UPDATE POSTS
SET USER_ID = 3
WHERE ID = 4;

COMMIT;

SELECT *
FROM POSTS;

DELETE
FROM posts
WHERE ID = 4;

COMMIT;
