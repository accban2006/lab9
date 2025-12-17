
package com.example.securecustomerapi.dto;

import com.example.securecustomerapi.entity.Role;

import jakarta.validation.constraints.NotNull;

public class UpdateRoleDTO {
    @NotNull
    private Role role;
}
