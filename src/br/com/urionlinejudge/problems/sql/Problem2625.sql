SELECT SUBSTR(A.CPF, 1, 3) || '.' ||
       SUBSTR(A.CPF, 4, 3) || '.' ||
       SUBSTR(A.CPF, 7, 3) || '-' ||
       SUBSTR(A.CPF, 10) AS CPF
FROM NATURAL_PERSON A