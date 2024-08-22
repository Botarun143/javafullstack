package com.neoteric.javafullstack.model;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FullStackController {
    @CrossOrigin("*")
    @PostMapping(value = "/api/registerUser",
    consumes = {"application/json"},
    produces = {"application/json"})


    public OTP registerUser(@RequestBody User user)
    {
    System.out.println("From registeration"+user);
    OTP otp=new OTP();
    otp.mobileNumber=user.getMobile();
    otp.otp="1234";
    return otp;
    }
}
