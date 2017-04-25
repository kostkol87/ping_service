package com.my.ping.controllers;

import com.my.ping.model.InetAdr;
import com.my.ping.service.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping/")
public class PingController {

    @Autowired
    PingService pingService;

    @PostMapping
    public String PerformQualityChecks(@RequestBody InetAdr address){
        return pingService.ping(address.getAddress());
    }
}
