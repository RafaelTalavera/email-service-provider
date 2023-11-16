package com.axioma.emailserviceprovider.core;

public record EmailRequest(String to, String subject, String body) {
}