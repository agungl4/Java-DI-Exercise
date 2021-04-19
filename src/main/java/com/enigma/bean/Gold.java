package com.enigma.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Gold {
    private Notification notification;
    private Integer stock=100;

    public Integer buyGold(Integer amount){
        this.stock = this.stock-amount;
        return this.stock;
    }

    public Gold(Notification notification) {
        this.notification = notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(){
        notification.send();
    }

    @Override
    public String toString() {
        return "stock=" + stock;
    }
}
