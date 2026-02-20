package com.crud.card.gestionrh.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre", length = 150, nullable = false)
    private String nombre;

    @Column (name = "apellido", length = 150, nullable = false)
    private String apellido;

    @Column(length = 150, nullable = false, unique = true)
    private String ruc;

    @Column(columnDefinition = "TEXT")
    private String direccion;

    @Column(length = 20)
    private String telefono;

    @Column(name="email", length = 60, nullable = false, unique = true)
    private String email;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime created_at;



}
