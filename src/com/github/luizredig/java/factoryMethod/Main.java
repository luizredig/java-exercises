package com.github.luizredig.java.factoryMethod;

import com.github.luizredig.java.factoryMethod.factories.EmailNotificationFactory;
import com.github.luizredig.java.factoryMethod.factories.PushNotificationFactory;
import com.github.luizredig.java.factoryMethod.factories.SMSNotificationFactory;
import com.github.luizredig.java.factoryMethod.services.notifications.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        notificationService.sendNotification(new EmailNotificationFactory(), "The email was sent successfully!");
        notificationService.sendNotification(new SMSNotificationFactory(), "The SMS was sent successfully!");
        notificationService.sendNotification(new PushNotificationFactory(), "The push was sent successfully!");
    }
}
