package com.example.email_service.util;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Emailsch {

    private final JavaMailSender emailSender;

    @Scheduled(fixedRate = 5000)
    public void main(){
        System.out.println("========================");
        String text = "Spring Boot-dan email ugurla gonderilmisdir";
        String to = "tarverdiyevaltun@gmail.com";
        String subject = "Matrix subject";

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("abbtaskify@yahoo.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
    }



}
