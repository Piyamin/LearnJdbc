package com.Jdbc.Jdbc.controller;

import java.util.List;

// import java.util.List;

import com.Jdbc.Jdbc.model.UserProfile;
import com.Jdbc.Jdbc.service.UserProfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userprofile")
public class UserProfileController {
    
    @Autowired
    UserProfileService userProfileService ;

    @GetMapping("/all-user")
    public List<UserProfile> list() {
        List<UserProfile> listAllUser = userProfileService.listAllUser();
        return listAllUser;
    }
    @GetMapping("/user/{keyword}")
    public List<UserProfile> findFirstnameOrLastnameLike(@PathVariable String keyword) {
        List<UserProfile> findbylike = userProfileService.findFirstnameOrLastnameLike(keyword);
        return findbylike;
    }
    @GetMapping("/checkuser/{keyword}")
    public boolean Findname(@PathVariable String keyword) {
        boolean findbylike = userProfileService.Findname(keyword);
        return findbylike;
    }
    @GetMapping("/countcategory/{keyword}")
    public Integer countByCategory(@PathVariable Integer keyword) {
        Integer findbylike = userProfileService.countByCategory(keyword);
        return findbylike;
    }
    @GetMapping("/findcategory/{keyword}")
    public List<UserProfile> findByCategory(@PathVariable Integer keyword) {
        List<UserProfile> findbylike = userProfileService.findByCategory(keyword);
        return findbylike;
    }
}
