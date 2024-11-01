package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.Length;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "contact-form")
public class ContactFrom {
    @Id
    private String id;
    private String name;
    private String email;
    @Column(length = 11)
    private int phoneNumber;
    private String subject;
    private String message;
}
