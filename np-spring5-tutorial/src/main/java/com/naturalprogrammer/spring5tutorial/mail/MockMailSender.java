package com.naturalprogrammer.spring5tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component Replace by MailConfig Class
//@Primary Applying primary bean
public class MockMailSender implements MailSender{

    private Log log =LogFactory.getLog(MockMailSender.class);
    
    @Override
    public void Send(String to, String subject, String body) {
        log.info("Sending Mock Mail to" + to);
        log.info("with subject" + subject);
        log.info("and body" + body);

    }
    
}
