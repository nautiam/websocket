package com.sunteco.stccloud.middleware.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Created by @author viosoft on 7/27/21
 */
@Service
public class ServerDemo {

    @Autowired
    private static SimpMessagingTemplate template;

    public static void main(String[] args) {
        sendMessage();
    }

    public static void sendMessage() {
        System.out.println("Fire");
        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        template.convertAndSend("/topic/messages", new OutputMessage("Boss", "Notify Message", time));
    }
}
