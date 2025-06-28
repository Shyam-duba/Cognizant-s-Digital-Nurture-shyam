BEGIN
    FOR cust IN (
        SELECT c.CustomerID, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID
        WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) > 60
    ) LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE LoanID = cust.LoanID;

        DBMS_OUTPUT.PUT_LINE('Applied 1% discount to Customer ID ' || cust.CustomerID);
    END LOOP;


END;