package com.sid.springboot.AppProcessing;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    private final ProfileService profileService;

    public Controller(ProfileService profileService){
        this.profileService = profileService;
    }

    @GetMapping("/api/app")
    public String getAllApp(){
         return "SB response";
    }

    @GetMapping("/api/app/{resourceId}")
    public String getSingleApp(@PathVariable String resourceId){
        return "SB response with resource id :"+resourceId;
    }

    @PostMapping("/api/setProfile")
    public void receiveData(@RequestBody Profile profile){
//        profileService.processProfile(profile);
    }
}
