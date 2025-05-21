package com.pragma.user.application.dto.response;

import com.pragma.user.domain.model.RoleModel;

import java.time.LocalDate;

public class UserResponseDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private String celular;
    private LocalDate fechaNacimiento;
    private String correo;
    private RoleModel rol;
}
