package com.enigma;

import com.enigma.bean.EmailNotification;
import com.enigma.bean.Gold;
import com.enigma.bean.SmsNotification;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmsNotification smsNotification = new SmsNotification();
        EmailNotification emailNotification = new EmailNotification();



        Gold gold = new Gold(smsNotification);
        gold.sendNotification();
        gold.buyGold(5);
        System.out.println(gold);

    }
}
