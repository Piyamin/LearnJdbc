package com.Jdbc.Jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

public class AccountJoinRowMapper implements RowMapper<AccountJoin>{

    @Override
    public AccountJoin mapRow(ResultSet rs, int rowNum) throws SQLException {

        AccountJoin accountJoin = new AccountJoin();
        accountJoin.setId(rs.getInt("id"));
        accountJoin.setUsername(rs.getString("username"));
        accountJoin.setPassword(rs.getString("password"));
        accountJoin.setuserId(rs.getInt("user_id"));
        accountJoin.setCreateDtm(rs.getTimestamp("create_dtm"));
        accountJoin.setFirstname(rs.getString("firstname"));
        accountJoin.setLastname(rs.getString("lastname"));
        
        return accountJoin;
        
    }
    
}
