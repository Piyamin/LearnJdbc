package com.Jdbc.Jdbc.service;

import java.util.List;

// import java.util.List;

// import com.Jdbc.Jdbc.model.Account;
import com.Jdbc.Jdbc.model.UserProfile;
import com.Jdbc.Jdbc.model.UserProfileRowMapper;
import com.Jdbc.Jdbc.repository.UserProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserProfileService {
    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    public  List<UserProfile> listAllUser(){
        return userProfileRepository.findAll();
    }
    public List<UserProfile> findFirstnameOrLastnameLike(String keyword) {
        String sql = "SELECT * FROM userprofile WHERE firstname LIKE '%"+keyword+"%' or lastname LIKE '%"+keyword+"%'";
        System.out.println(sql);
        List<UserProfile> userProfile = jdbcTemplate.query(sql, new UserProfileRowMapper() );
        return userProfile;
    }
    public  List<UserProfile> findByFirstname(String keyword){
        return userProfileRepository.findByFirstname(keyword);
    }
    public  List<UserProfile> findByLastname(String keyword){
        return userProfileRepository.findByLastname(keyword);
    }
    public boolean  Findname(String keyword){
        // List<UserProfile> Firstname = findByFirstname(keyword);
        // List<UserProfile> Lastname = findByLastname(keyword);
        List<UserProfile> userProfiles = userProfileRepository.findByFirstnameOrLastname(keyword,keyword);
        boolean result = true;
        if(!userProfiles.isEmpty() ){
            result = false;
        }
        return result;
    }
    public  Integer countByCategory(Integer keyword){
        return userProfileRepository.countByCategory(keyword);
    }
    public  List<UserProfile> findByCategory(Integer keyword){
        return userProfileRepository.findByCategory(keyword);
    }

}
