package com.andres.message.implementations;

import com.andres.message.interfaces.InterfaceNotifications;

public class NotificacionWhatsApp implements InterfaceNotifications{

    @Override
    public String enviar(){
        return "notificación enviada por whatsapp";
    }
}