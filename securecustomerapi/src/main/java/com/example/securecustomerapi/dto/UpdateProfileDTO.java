package com.example.securecustomerapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UpdateProfileDTO {
    @NotBlank
    private String fullName;
    
    @Email
    private String email;
}
