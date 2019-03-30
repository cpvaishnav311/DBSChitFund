package com.dbs.chitfund.DBSChitFund.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBSChitFundController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
