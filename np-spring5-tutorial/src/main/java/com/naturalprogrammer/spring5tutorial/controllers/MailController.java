package com.naturalprogrammer.spring5tutorial.controllers;

import javax.mail.MessagingException;

import com.naturalprogrammer.spring5tutorial.mail.MailSender;
import com.naturalprogrammer.spring5tutorial.mail.MockMailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    // @Autowired
    private MailSender mailSender;

    public MailController(MailSender smtp) { // @Qualifier("smtpMailSender") inject it in stmp
        this.mailSender = smtp;
    }

    @RequestMapping("/mail")
    public String mail() throws MessagingException {

		mailSender.Send("trupti.green@gmail.com", "Test Mail", "Body of Test Mail");
        
        return "Mail Send";
	}
    
}
