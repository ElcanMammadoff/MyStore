package com.bmt.MyStore.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDto {

    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;

    @NotEmpty
    @Email
    private String email;

    private String phone;
    private String address;

    @Size(min=6,message="Minimum Password length is 6 characters")
    private String password;

    private String confirmPassword;



}
