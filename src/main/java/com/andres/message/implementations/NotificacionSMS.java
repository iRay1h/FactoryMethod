package com.andres.message.implementations;

import com.andres.message.interfaces.InterfaceNotifications;

public class NotificacionSMS implements InterfaceNotifications {

    @Override
    public String enviar(){
        return "notificación enviada por SMS";
    }
}
