BEGIN
    FOR cust IN (SELECT CustomerID, Balance FROM Customers WHERE Balance > 10000) LOOP
        UPDATE Customers
        SET IsVIP = 'Y'
        WHERE CustomerID = cust.CustomerID;

        DBMS_OUTPUT.PUT_LINE('Customer ID ' || cust.CustomerID || ' marked as VIP.');
    END LOOP;
END;
