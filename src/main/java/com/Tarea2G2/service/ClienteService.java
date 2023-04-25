package com.Tarea2G2.service;

import com.Tarea2G2.domain.Cliente;
import java.util.List;


public interface ClienteService {
      public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public void save (Cliente cliente);
    
    public void delete (Cliente cliente);
    
    public List<Cliente> getClienteCorreo(String correo);
    
    public List<Cliente> getClienteNombreApellidos(String nombre, String apellidos);
    
    public List<Cliente> getClienteNombre(String nombre);

}
