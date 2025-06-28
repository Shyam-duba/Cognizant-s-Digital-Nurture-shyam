## Exercise-1

### Scenario1
--- THIS anonimous block gets the complete data of the customers whose age is > 60 and applies discount 
```SQL
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
```


### scenario-2
---This PL/SQL block marks the vip customers whose bank balance greater than 10000 and updates the isVip flag
```SQL
BEGIN
    FOR cust IN (SELECT CustomerID, Balance FROM Customers WHERE Balance > 10000) LOOP
        UPDATE Customers
        SET IsVIP = 'Y'
        WHERE CustomerID = cust.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Customer ID ' || cust.CustomerID || ' marked as VIP.');
    END LOOP;
END;
```

### scenario-3
--- The PL?SQL block will display to pay the loan whose due date is in 30 days and displays it.
```SQL
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
```

image.png