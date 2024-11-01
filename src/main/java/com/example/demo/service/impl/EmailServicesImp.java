package com.example.demo.service.impl;

import com.example.demo.service.EmailServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServicesImp implements EmailServices {

    private Logger logger = LoggerFactory.getLogger(EmailServicesImp.class);

    @Autowired
    private JavaMailSender mailSender;


    @Override
    public void sendEmail(String to, String message, String subject) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("hkkabaddi63@gmail.com");
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);
        mailSender.send(simpleMailMessage);
        logger.info("Email sent success..");
    }
}
