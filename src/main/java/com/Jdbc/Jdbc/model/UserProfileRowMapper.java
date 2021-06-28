package com.Jdbc.Jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

public class UserProfileRowMapper implements RowMapper<UserProfile>{

    @Override
    public UserProfile mapRow(ResultSet rs, int rowNum) throws SQLException {

        UserProfile userProfile = new UserProfile();
        userProfile.setId(rs.getInt("id"));
        userProfile.setFirstname(rs.getString("firstname"));
        userProfile.setLastname(rs.getString("lastname"));
        userProfile.setCategory(rs.getInt("category"));
        userProfile.setCreateDtm(rs.getTimestamp("create_dtm"));
        
        return userProfile;
        
    }
    
}
