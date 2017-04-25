package com.my.ping.service;

import org.springframework.stereotype.Service;

import java.net.InetAddress;

@Service
public class PingService {

    public String ping(String addr) {

        String resultString = "not responding";

        try {
            InetAddress address = InetAddress.getByName(addr);
            boolean reachable = address.isReachable(10000);
            resultString = "Is host reachable?  " + addr + " : " + reachable;
            System.out.println(resultString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultString;
    }
}
