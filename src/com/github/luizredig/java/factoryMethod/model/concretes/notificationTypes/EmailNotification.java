package com.github.luizredig.java.factoryMethod.model.concretes.notificationTypes;

import com.github.luizredig.java.factoryMethod.model.interfaces.INotification;

public class EmailNotification implements INotification {
    @Override
    public void sendNotification(String content) {
        System.out.println(content);
    }
}
