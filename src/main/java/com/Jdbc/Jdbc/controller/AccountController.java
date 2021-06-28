package com.Jdbc.Jdbc.controller;


import java.sql.Timestamp;
// import java.util.Date;
// import java.util.List;
import java.util.List;

import com.Jdbc.Jdbc.model.Account;
import com.Jdbc.Jdbc.model.AccountRequest;
import com.Jdbc.Jdbc.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/all-account")
    public List<Account> list() {
        // return accountService.listAllAccount();
        List<Account> accountList = accountService.listAllAccount();
        return accountList;
    }
    @GetMapping("/test")
    public String test() {
        return accountService.testcall();
    }
    
    @GetMapping("/user/{userId}")
    public Account findByUserId(@PathVariable Integer userId) {
        return accountService.findByUserId(userId);
    }
    @GetMapping("/createDtmGt/{createDtm}") // test Datetime format yyyy-mm-dd h:m:s
    public List<Account> findByCreateDtmGreaterThan(@PathVariable Timestamp createDtm) {
        List<Account> accountDtmGt = accountService.findByCreateDtmGreaterThan(createDtm);
        return accountDtmGt; 
    }
    @GetMapping("/createDtmLt/{createDtm}") // test Datetime format yyyy-mm-dd h:m:s
    public List<Account> findByCreateDtmLessThan(@PathVariable Timestamp createDtm) {
        List<Account> accountDtmLt = accountService.findByCreateDtmLessThan(createDtm);
        return accountDtmLt; 
    }
    @GetMapping("/datebetween/{createDtm}") // test Datetime format yyyy-mm-dd h:m:s
    public List<Account> findByCreateDtmBetween(@PathVariable Timestamp createDtm) {
        List<Account> accountDtmLt = accountService.findByCreateDtmBetween(createDtm);
        return accountDtmLt; 
    }

    @PostMapping("/datedtm") // test Datetime format yyyy-mm-dd h:m:s
    public List<Account> findByCreateDtmBetween(@RequestBody  AccountRequest accountRequest) {
        List<Account> accountDtmLt = accountService.findByCreateDtmGreaterThan2(accountRequest.getDtmDate());
        return accountDtmLt; 
    }

    // @GetMapping("/datelimit/{createDtm}") // test Datetime format yyyy-mm-dd h:m:s
    // public  Account  findDateLessThanLimit(@PathVariable Timestamp createDtm) {
    //     Account  accountDtmLt = accountService.findDateLessThanLimit(createDtm);
    //     return accountDtmLt; 
    // }
}
