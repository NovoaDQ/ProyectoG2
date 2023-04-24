package com.Tarea2G2.service;



import com.Tarea2G2.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author manul
 */
@Service
public class ClienteSeviceImp implements ClienteService {

    @Autowired
    ClienteDao clienteDao;
    

    @Override
    @Transactional(readOnly = true) // para manejar transacciones de solo lectura
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.deleteById(cliente.getIdCliente());
    }

    @Override
    public List<Cliente> getClienteCorreo(String correo) {
        return (List<Cliente>) clienteDao.findByCorreo(correo);
    }

    @Override
    public List<Cliente> getClienteNombreApellidos(String nombre, String apellidos) {
        return (List<Cliente>) clienteDao.findByNombreOrApellidos(nombre, apellidos);
    }

    @Override
    public List<Cliente> getClienteNombre(String nombre) {
         return (List<Cliente>) clienteDao.findByNombre(nombre);
    }

}
