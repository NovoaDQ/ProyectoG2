package com.Tarea2G2.domain;

import lombok.Data;
import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="cliente")
public class Cliente {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    String nombre;
    String apellidos;
    String correo;
    
    
    public Cliente(){
        
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }
    
    
    
}