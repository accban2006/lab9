package com.example.securecustomerapi.service;

import com.example.securecustomerapi.dto.ChangePasswordDTO;
import com.example.securecustomerapi.dto.LoginRequestDTO;
import com.example.securecustomerapi.dto.LoginResponseDTO;
import com.example.securecustomerapi.dto.RegisterRequestDTO;
import com.example.securecustomerapi.dto.UpdateProfileDTO;
import com.example.securecustomerapi.dto.UpdateRoleDTO;
import com.example.securecustomerapi.dto.UserResponseDTO;

import jakarta.validation.Valid;

public interface UserService {
    
    LoginResponseDTO login(LoginRequestDTO loginRequest);
    
    UserResponseDTO register(RegisterRequestDTO registerRequest);
    
    UserResponseDTO getCurrentUser(String username);

    void changePassword(String username, ChangePasswordDTO dto);

    void deleteAccount(String name, String password);

    Object updateProfile(String name, UpdateProfileDTO dto);

    Object toggleUserStatus(Long id);

    Object getAllUsers();

    Object updateUserRole(Long id, UpdateRoleDTO dto);
}
