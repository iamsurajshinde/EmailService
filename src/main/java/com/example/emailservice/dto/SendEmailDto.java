package com.example.emailservice.dto;

import lombok.Data;

@Data
public class SendEmailDto {
    private String to;
    private String from;
    private String subject;
    private String body;
}
