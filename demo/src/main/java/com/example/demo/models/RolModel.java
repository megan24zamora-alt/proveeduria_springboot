/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author Megan
 */
@Entity
@Table(name = "Rol", schema = "dbo") 
public class RolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long id;
    
    @Column(name = "nombre_rol")
    private String nombre;
    
    @OneToMany(mappedBy = "rol")
    @JsonBackReference
    private List<UserModel> usuarios;
    
    public Long getIdRol() {
        return id;
    }

    public void setIdRol(Long id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombre;
    }

    public void setNombreRol(String nombre) {
        this.nombre = nombre;
    }

    public List<UserModel> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UserModel> usuarios) {
        this.usuarios = usuarios;
    }
    
}
