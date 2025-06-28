## Exercise-2

### scenario-1
--- This stored procedure processMonthlyInterest calculates and the balance of all savings accounts by applying an interest rate of 1 % to the current balance
```SQL
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    FOR acc IN (SELECT AccountID, Balance FROM Accounts WHERE AccountType = 'Savings') LOOP
        UPDATE Accounts
        SET Balance = Balance + (acc.Balance * 0.01),
            LastModified = SYSDATE
        WHERE AccountID = acc.AccountID;
    END LOOP;
    
    COMMIT;
END;
/
```

### scenario-2
---This stored procedure UpdateEmployeeBonus updates the salary of employes in the given depertment that passed to the procedure as a parameter
```SQL
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_percent / 100)
    WHERE Department = p_department;
    
    COMMIT;
END;
/
```


### scenario-3
---This procedure will tranfers a specified amount from one account to another with proper checking conditions before changing the blance.
```SQL
DELIMITER //

CREATE PROCEDURE TransferFunds(
    IN source_account_id INT, 
    IN destination_account_id INT, 
    IN amount DECIMAL(10,2)
)
BEGIN
    DECLARE current_balance DECIMAL(10,2);

    -- Get source account balance
    SELECT balance INTO current_balance 
    FROM Accounts 
    WHERE account_id = source_account_id;

    -- Check if sufficient funds
    IF current_balance >= amount THEN
        UPDATE Accounts 
        SET balance = balance - amount 
        WHERE account_id = source_account_id;

        UPDATE Accounts 
        SET balance = balance + amount 
        WHERE account_id = destination_account_id;
    ELSE
        SIGNAL SQLSTATE '45000' 
        SET MESSAGE_TEXT = 'Insufficient funds in the source account';
    END IF;
END //

DELIMITER ;
```


image.png