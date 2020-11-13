package com.naturalprogrammer.spring5tutorial.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DemoBean {

    private Log log = LogFactory.getLog(DemoBean.class);

    public DemoBean(){
        log.info("Demo bean created");
    }

}
