package com.app.request;



public class EmailRequest {

    private String to;
    private String subject;
    private String text;
    private String otp;

    // Constructors, getters, and setters

    // Constructor
    public EmailRequest() {
    }

    // Getters and setters

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}
    
    
}

