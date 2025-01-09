package com.sid.springboot.AppProcessing;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    public Profile processProfile(Profile profile){
        System.out.println("Received Profile through service : "+profile.toString());
        profile.setName(profile.getName().concat( " name updated"));
        return profile;
    }
}
