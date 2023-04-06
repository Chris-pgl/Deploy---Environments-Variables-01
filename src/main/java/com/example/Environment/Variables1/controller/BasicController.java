package com.example.Environment.Variables1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {


    @GetMapping("/devInfo")
    public String getDevName() {
        String devName = System.getProperty("devName");
        String authCode = System.getProperty("authCode");
        return "Ciao " + devName + "! questo è il tuo codice "+ authCode + " :D";

    }

    @Value("${authCode}")
    private String authCode;

    @Value("${devName}")
    private String devName;

    @GetMapping("/devInfo2")
    public String getGreeting(){
        return "Caio "+ devName + " e questo è il tuo codice! "+ authCode;

    }
}