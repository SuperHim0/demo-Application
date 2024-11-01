package com.example.demo.controller;

import com.example.demo.entities.ContactRequest;
import com.example.demo.service.EmailServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/webdev")
@CrossOrigin("*")
public class FormController {

    private Logger logger = LoggerFactory.getLogger(FormController.class);

    @Autowired
    private EmailServices emailServices;

    @PostMapping //getting data from contact page and sending to email
    public ResponseEntity<?> gatContact(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("description") String description,
            @RequestParam("phoneNumber") String phoneNumber,
            @RequestParam("subject") String subject
    ){
        // making costume message.
    String message = "hello ! my name is "+name+" and my email is : "+email+" my phone number is "
            +phoneNumber+"\n"+description;
    //sending to mail specific mail
    String to = "abcdefghyt99@gmail.com";
    //sending message to email
        try{
            //sending mail by sendEmail method
        emailServices.sendEmail(to,message,subject);
        //printing log
        logger.info("Checking the message that generate here : "+message);
        return ResponseEntity.ok(
                CustomResponse
                        .builder()
                        .message("email sent successfully!")
                        .httpStatus(HttpStatus.OK)
                        .success(true)
        );
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to send message");
        }
    }
    @PostMapping("/contact") //getting data from contact page and sending to email
    public ResponseEntity<?> gatContacts(@RequestBody ContactRequest request){
        String name = request.getName();
        String phoneNumber= request.getPhoneNumber();
        String email = request.getEmail();;
        String description = request.getDescription();
        String subject = request.getSubject();

        //using stringBuilder here to reduce the cost of the memory and operation
        // Construct message using StringBuilder
        StringBuilder message = new StringBuilder();
        message.append("Hello! My name is ").append(name)
                .append(" and my email is: ").append(email)
                .append(". My phone number is ").append(phoneNumber)
                .append("\n").append(description);
        // making costume message.
        String to = "abcdefghyt99@gmail.com";
        //sending message to email
        System.out.println(message);
        try {
            // Sending message to email
            emailServices.sendEmail(to, message.toString(), subject);
            return ResponseEntity.ok(
                    CustomResponse.builder()
                            .message("Email sent successfully!")
                            .httpStatus(HttpStatus.OK)
                            .success(true)
                            .build()
            );
        } catch (Exception e) {
            // Handle email sending failure
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to send email.");
        }

    }

}
