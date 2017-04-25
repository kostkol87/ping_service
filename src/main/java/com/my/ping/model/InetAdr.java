package com.my.ping.model;

import org.springframework.stereotype.Component;

@Component
public class InetAdr {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
