package com.crud.usuarios.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

    public Usuario(long i, String karachi, String s, boolean b, Date fecha, Date fecha1, String s1) {
        this.id=i;
        this.usuario=karachi;
        this.password=s;
        this.activo=b;
        this.fechaCreacion=fecha;
        this.fechaActualizacion=fecha1;
        this.correo=s1;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column(name = "usuario", nullable = false, unique = true, length = 20)
    private String usuario;

    @Column(name = "password", nullable = false, length = 30)
    private String password;

    @Column(name = "activo", nullable = false)
    private boolean activo = true;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion;

    @Column(name = "correo", nullable = false, unique = true)
    private String correo;



}
