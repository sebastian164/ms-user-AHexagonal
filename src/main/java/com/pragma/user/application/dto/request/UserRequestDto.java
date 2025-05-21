package com.pragma.user.application.dto.request;

import com.pragma.user.domain.model.RoleModel;

import java.time.LocalDate;

public class UserRequestDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private String celular;
    private LocalDate fechaNacimiento;
    private String correo;
    private String clave;
    private RoleModel rol;
}
