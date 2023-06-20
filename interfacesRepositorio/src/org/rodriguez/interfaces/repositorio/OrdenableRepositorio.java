package org.rodriguez.interfaces.repositorio;

import org.rodriguez.interfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
