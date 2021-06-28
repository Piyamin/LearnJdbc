package com.Jdbc.Jdbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.Jdbc.Jdbc.model.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Integer>{
    
    public List<UserProfile> findByFirstname(String keyword);
    public List<UserProfile> findByLastname(String keyword);
    public Integer countByCategory(Integer keyword);
    public List<UserProfile> findByCategory(Integer keyword);
    public List<UserProfile> findByFirstnameOrLastname(String firstname , String lastname);

}
