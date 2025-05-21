package com.pragma.user.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;

    @Column(name = "numero_documento", nullable = false, unique = true)
    private String numeroDocumento;

    private String celular;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    private String correo;

    private String clave;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol", nullable = false)
    private RoleEntity rol;
}