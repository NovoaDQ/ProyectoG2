package com.Tarea2G2.dao;


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
