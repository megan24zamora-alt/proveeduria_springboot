/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.models.RolModel;
import com.example.demo.service.RolService;
import java.util.List;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Megan
 */

@RestController
@RequestMapping("/api/roles")
@CrossOrigin(origins = "*")
public class RolController {

    private final RolService service;

    public RolController(RolService service) {
        this.service = service;
    }

    @GetMapping
    public List<RolModel> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public RolModel getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
