package com.github.luizredig.java.factoryMethod.factories;

import com.github.luizredig.java.factoryMethod.model.abstracts.NotificationFactory;
import com.github.luizredig.java.factoryMethod.model.concretes.notificationTypes.SMSNotification;
import com.github.luizredig.java.factoryMethod.model.interfaces.INotification;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public INotification createNotification() {
        return new SMSNotification();
    }
}
