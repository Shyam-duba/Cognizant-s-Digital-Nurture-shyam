package com.cognizant.loan.controller;


import com.cognizant.loan.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoansController {

    @GetMapping("/{number}")
    public Loan getLoanDetails(@PathVariable String number){
        System.out.println("fknmvkdmf");
        Loan loanDetails = new Loan(number, "bike", 40000,3258, 18);

        return loanDetails;
    }
}
