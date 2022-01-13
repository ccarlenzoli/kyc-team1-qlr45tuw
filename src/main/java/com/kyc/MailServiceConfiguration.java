package com.kyc;

import com.kyc.email.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class MailServiceConfiguration {

    @Autowired
    private EmailSenderService senderService;


    @EventListener(ApplicationReadyEvent.class)
    public void sendMail() {
        senderService.sendEmail("vitopalumbo95@gmail.com",
                "questo è l'oggetto",
                "questo è il contenuto della mail");
    }

}


