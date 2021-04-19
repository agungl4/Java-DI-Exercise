package com.enigma.bean;

import org.springframework.stereotype.Component;


public class SmsNotification implements Notification{
    public void send() {
        System.out.println("ini sms notif. transaksi sukses");
    }
}
