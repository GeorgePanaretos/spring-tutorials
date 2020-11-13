package com.naturalprogrammer.spring5tutorial.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration //xml files to config beans(not best practise)
//@Component as well will enable twice to create the DemoBean
public class MailConfig {

    // @Autowired
    // private JavaMailSender javaMailSender; Not nessecary

    @Bean
    public DemoBean demoDean(){
        return new DemoBean();
    }

    @Bean
    @Profile("dev")
    @ConditionalOnProperty(name = "spring.mail.host", havingValue = "foo, matchIfMissing = true")
    public MailSender mockMailSender(){
        return new MockMailSender();
    }

    @Bean
    @ConditionalOnProperty("spring.mail.host")
    @Profile("!dev") // change the profile value in application properties this bean will avctivated
    public MailSender smtpMailSender(JavaMailSender javaMailSender){
        demoDean(); // one time executed
        return new SmtpMailSender(javaMailSender);
    }
    
}
