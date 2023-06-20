package org.rodriguez.interfaces.repositorio;

import org.rodriguez.interfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
