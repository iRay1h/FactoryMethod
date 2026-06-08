package com.andres.message.service;

import org.springframework.stereotype.Service;

import com.andres.message.dto.MessageDTO;
import com.andres.message.factory.NotificationFactory;
import com.andres.message.interfaces.InterfaceNotifications;

@Service
public class NotificationService {

    private final NotificationFactory factory = new NotificationFactory();

    public MessageDTO<InterfaceNotifications> CrearNotificacion(String tipo) {

        return factory.crear(tipo);

    }
}
