/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.models.RolModel;
import com.example.demo.repository.RolRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Megan
 */
@Service
public class RolService {

    private final RolRepository repository;

    public RolService(RolRepository repository) {
        this.repository = repository;
    }

    public List<RolModel> getAll() {
        return repository.findAll();
    }

    public RolModel getById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
