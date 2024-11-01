package com.example.demo.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class ContactRequest {
    private String name;
    private String phoneNumber;
    private String description;
    private String email;
    private String subject;
}
