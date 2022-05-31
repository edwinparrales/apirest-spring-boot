/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.modelo.Producto;
import com.example.demo.service.ProductoService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrador
 */
@RestController
@RequestMapping(value = "/api")
public class HomeController {

    @Autowired
    ProductoService servicio;

    @GetMapping(value = "/saludo")
    public String saludo() {

        return "Hola desde Spring boot" + LocalDateTime.now();
    }

    //http://localhost:8080/api/producto/listar
    @GetMapping(value = "producto/listar")
    public ResponseEntity<List<Producto>> listar() {
        return new ResponseEntity<>(servicio.listar(), HttpStatus.OK);
    }
    //http://localhost:8080/api/producto/guardar
    @PostMapping(value = "producto/guardar")

    public ResponseEntity<Producto> guardar(@RequestBody Producto producto) {

        return new ResponseEntity<>(servicio.guardar(producto), HttpStatus.OK);
    }
}
