package com.sid.springboot.AppProcessing;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    public void processProfile(Profile profile){
        System.out.println("Received Profile through service : "+profile.toString());
    }
}
