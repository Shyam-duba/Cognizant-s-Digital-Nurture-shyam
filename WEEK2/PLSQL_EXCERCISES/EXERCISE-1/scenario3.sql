BEGIN
    FOR loan IN (
        SELECT l.LoanID, c.Name, l.DueDate
        FROM Loans l
        JOIN Customers c ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan.LoanID ||
                             ' for ' || loan.Name || ' is due on ' || TO_CHAR(loan.DueDate, 'DD-Mon-YYYY'));
    END LOOP;
END;
