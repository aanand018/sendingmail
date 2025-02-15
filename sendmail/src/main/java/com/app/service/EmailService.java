package com.app.service;

import com.app.request.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

//    public void sendEmail(String to, String subject, String text) {
//    	
//    	
//    	
//    	
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setTo(to);
//        message.setSubject(subject);
//        message.setText(text);
//
//        javaMailSender.send(message);
//    }
    

        public void sendEmail(EmailRequest emailRequest) {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(emailRequest.getTo());
            message.setSubject(emailRequest.getSubject());

            emailRequest.setText("please use this One Time Password for verifying your account,");
            
            // Include OTP in the email text
            String emailText = emailRequest.getText() + " code : " + emailRequest.getOtp();
            message.setText(emailText);

            javaMailSender.send(message);
        }
    

    
    
    
    
    
    
    
}
