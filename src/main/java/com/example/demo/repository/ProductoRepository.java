/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.repository;

import com.example.demo.modelo.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Administrador
 */
public interface ProductoRepository extends CrudRepository<Producto, Long> {
    
}
