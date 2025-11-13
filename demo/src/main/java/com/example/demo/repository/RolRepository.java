/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.models.RolModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Megan
 */
public interface RolRepository extends JpaRepository<RolModel, Long> {
}
