package com.andres.message.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.andres.message.service.NotificationService;

@Controller
@RequestMapping("/Messages")
public class MessageController {

    private final NotificationService service = new NotificationService();

     @GetMapping("/{tipo}")
    public String crearNoti(@PathVariable String tipo, Model model) {
        model.addAttribute("Message", service.CrearNotificacion(tipo));
        return "Messages/Mostrar";
    }

}
