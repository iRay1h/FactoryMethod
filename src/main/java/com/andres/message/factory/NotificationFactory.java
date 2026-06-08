package com.andres.message.factory;

import com.andres.message.dto.MessageDTO;
import com.andres.message.implementations.*;
import com.andres.message.interfaces.InterfaceNotifications;

public class NotificationFactory {

    public MessageDTO<InterfaceNotifications> crear(String tipo) {
        MessageDTO<InterfaceNotifications> messageDTO = new MessageDTO<>();
        if (tipo == null) {
            messageDTO.setMessage("El tipo de mensaje no puede ser nulo");
            return messageDTO;
        }

        switch (tipo.toLowerCase()) {
            case "sms":
                NotificacionSMS notificacionSMS = new NotificacionSMS();
                messageDTO.setMessagedto(notificacionSMS);
                return messageDTO;

            case "whatsapp":
                NotificacionWhatsApp notificacionWhatsApp = new NotificacionWhatsApp();
                messageDTO.setMessagedto(notificacionWhatsApp);
                return messageDTO;

            case "email":
                NotificacionEmail notificacionEmail = new NotificacionEmail();
                messageDTO.setMessagedto(notificacionEmail);
                return messageDTO;
            default:
                messageDTO.setMessage("tipo de notificcion invalido");
                return messageDTO;

        }

    }
}
