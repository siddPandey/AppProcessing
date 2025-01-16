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
    public Profile getSingleApp(@PathVariable String resourceId){
        Profile profile = new Profile();
        profile.setName("Gubbu");
        profile.setAddress("NY");
        return profileService.processProfile(profile);
    }

    @PostMapping("/api/setProfile")
    public Profile receiveData(@RequestBody Profile profile){
        return profileService.processProfile(profile);
    }
}
