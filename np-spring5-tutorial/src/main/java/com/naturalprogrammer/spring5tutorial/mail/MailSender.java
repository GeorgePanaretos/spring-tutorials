package com.naturalprogrammer.spring5tutorial.mail;

import javax.mail.MessagingException;

public interface MailSender {

    void Send(String to, String subject, String body) throws MessagingException;
    
}
