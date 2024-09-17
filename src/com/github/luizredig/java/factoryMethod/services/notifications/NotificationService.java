package com.github.luizredig.java.factoryMethod.services.notifications;

import com.github.luizredig.java.factoryMethod.model.abstracts.NotificationFactory;
import com.github.luizredig.java.factoryMethod.model.interfaces.INotification;

public class NotificationService {
    public void sendNotification(NotificationFactory nf, String content){
        INotification notification = nf.createNotification();
        notification.sendNotification(content);
    }
}
