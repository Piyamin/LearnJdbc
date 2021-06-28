package com.Jdbc.Jdbc.service;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Jdbc.Jdbc.model.Account;
import com.Jdbc.Jdbc.model.AccountRowMapper;
import com.Jdbc.Jdbc.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

// @Service
@Component
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public  List<Account> listAllAccount() {
        return accountRepository.findAll();
    }
    public String testcall(){
        return "SEE";
    }
    public Account findByUserId(int userId){
        return accountRepository.findByUserId(userId);
    }
    public List<Account> findByCreateDtmGreaterThan(Timestamp createDtm){
        List<Account> accountDtmGt = accountRepository.findByCreateDtmGreaterThan(createDtm);
         return accountDtmGt;
    }
    public List<Account> findByCreateDtmLessThan(Timestamp createDtm){
        List<Account> accountDtmLt = accountRepository.findByCreateDtmLessThan(createDtm);
         return accountDtmLt;
    }
   
    public Account findDateLessThanLimit(Timestamp createDtm) {
        String sql = "SELECT *,max(create_dtm) FROM account WHERE create_dtm < '"+createDtm+"' ORDER BY create_dtm DESC";
        System.out.println(sql);
        Account account = jdbcTemplate.queryForObject(sql, new AccountRowMapper() );
        return account;
    }
    public Account findDateGreaterThanLimit(Timestamp createDtm) {
        String sql = "SELECT *,min(create_dtm) FROM account WHERE create_dtm > '"+createDtm+"' ORDER BY create_dtm DESC";
        System.out.println(sql);
        Account account = jdbcTemplate.queryForObject(sql, new AccountRowMapper() );
        return account;
    }
    public List<Account> findByCreateDtmBetween(Timestamp createDtm){
       Account findByDateLtLim1 = findDateLessThanLimit(createDtm);
       Account findByDateGtLim1 = findDateGreaterThanLimit(createDtm);
       List<Account> findByDateBt = new ArrayList<>();
       findByDateBt.add(findByDateLtLim1);
       findByDateBt.add(findByDateGtLim1);
       return findByDateBt;
    }

    public List<Account> findByCreateDtmGreaterThan2(Date createDtm){
        List<Account> accountDtmGt = accountRepository.findByCreateDtmGreaterThan(createDtm);
         return accountDtmGt;
    }

}
