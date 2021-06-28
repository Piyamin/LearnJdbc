package com.Jdbc.Jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

public class AccountRowMapper implements RowMapper<Account>{

    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {

        Account account = new Account();
        account.setId(rs.getInt("id"));
        account.setUsername(rs.getString("username"));
        account.setPassword(rs.getString("password"));
        account.setuserId(rs.getInt("user_id"));
        account.setCreateDtm(rs.getTimestamp("create_dtm"));
        
        return account;
        
    }
    
}
