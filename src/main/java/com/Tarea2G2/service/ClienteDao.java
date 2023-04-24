/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tarea2G2.service;

import com.Tarea2G2.domain.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author manul
 */
public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
    List<Cliente> findByCorreo(String correo);
    
    List<Cliente> findByNombreOrApellidos(String nombre, String apellidos);
    
    List<Cliente> findByNombre(String nombre);
}