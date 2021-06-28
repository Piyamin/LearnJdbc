package com.Jdbc.Jdbc.service;

import java.util.List;
// import java.util.Map;
import java.util.Map;

// import com.Jdbc.Jdbc.model.AccountJoin;
// import com.Jdbc.Jdbc.model.AccountJoinRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ConnectService {


    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public  List<Map<String, Object>>  findUserProfileAccount(Integer userId) {
        String sql = "select * from account ac join userprofile up on ac.user_id = up.id where ac.user_id ="+userId+"";
        System.out.println(sql);
        List<Map<String, Object>> userProfileAccount = jdbcTemplate.queryForList(sql);
        return userProfileAccount;
    }

    
}
