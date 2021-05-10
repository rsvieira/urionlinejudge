SELECT C.NAME, R.RENTALS_DATE 
FROM RENTALS R
INNER JOIN CUSTOMERS C ON C.ID = R.ID_CUSTOMERS
WHERE R.RENTALS_DATE BETWEEN '2016-09-01' AND '2016-09-30';