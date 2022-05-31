/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.modelo.Producto;
import com.example.demo.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrador
 */
@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public Producto guardar(Producto producto) {

        return productoRepository.save(producto);

    }
    
    public List<Producto> listar(){
     return (List<Producto>) productoRepository.findAll();
    
    }
    
    

}
