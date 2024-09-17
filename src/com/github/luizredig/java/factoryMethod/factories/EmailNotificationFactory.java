package com.github.luizredig.java.factoryMethod.factories;

import com.github.luizredig.java.factoryMethod.model.abstracts.NotificationFactory;
import com.github.luizredig.java.factoryMethod.model.concretes.notificationTypes.EmailNotification;
import com.github.luizredig.java.factoryMethod.model.interfaces.INotification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public INotification createNotification() {
        return new EmailNotification();
    }
}
