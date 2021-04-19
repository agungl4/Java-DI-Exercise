package com.enigma.bean;

import org.springframework.stereotype.Component;


public class EmailNotification implements Notification {
    public void send() {
        System.out.println("ini email notif. transaksi sukses");
    }
}
