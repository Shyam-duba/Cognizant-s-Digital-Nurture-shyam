package com.cognizant.account.controler;


import com.cognizant.account.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Account getAccountDetails(@PathVariable String number) {
        Account userDetails = new Account(number, "savings", 234845.25);

        return userDetails;
    }
}
