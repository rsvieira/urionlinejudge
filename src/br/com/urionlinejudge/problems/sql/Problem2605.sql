SELECT P.NAME, P2.NAME
FROM PRODUCTS P
INNER JOIN PROVIDERS P2 ON P2.ID = P.ID_PROVIDERS
INNER JOIN CATEGORIES C ON C.ID = P.ID_CATEGORIES
WHERE C.ID = 6;