package com.axioma.emailserviceprovider.core;

public interface EmailSenderUseCase {
    void sendEmail(String toEmail, String subject, String body);
}