package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send-email")
    public String sendEmail(@RequestBody EmailRequest emailRequest) {
        // Generate and set OTP
        String otp = generateOTP();
        emailRequest.setOtp(otp);

        // Send email with OTP
        emailService.sendEmail(emailRequest);

        return "Email sent successfully!";
    }

    private String generateOTP() {
        // Implement your OTP generation logic here (e.g., using Random or a library)
        // For simplicity, let's use a 6-digit random number as an example
        return String.format("%06d", new java.util.Random().nextInt(1000000));
    }
}


