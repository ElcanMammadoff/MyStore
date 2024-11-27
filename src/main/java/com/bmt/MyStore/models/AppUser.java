package com.bmt.MyStore.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name ="users")
@Getter
@Setter
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;

    private String phone;
    private String address;
    private String password;
    private String role;
    private Date createdAt;


}
