package com.axioma.emailserviceprovider.adapters;

public interface EmailSenderGateway {
    void sendEmail(String toEmail, String subject, String body);
}