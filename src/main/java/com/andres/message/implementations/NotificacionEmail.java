package com.andres.message.implementations;

import com.andres.message.interfaces.InterfaceNotifications;

public class NotificacionEmail implements InterfaceNotifications {

   @Override
   public String enviar() {
      return "Notificación enviada por email";
   }

}