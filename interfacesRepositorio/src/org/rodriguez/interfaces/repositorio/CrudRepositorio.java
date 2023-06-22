package org.rodriguez.interfaces.repositorio;

import org.rodriguez.interfaces.repositorio.excepciones.AccesoDatoException;
import org.rodriguez.interfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.rodriguez.interfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();

    T porId(Integer id) throws AccesoDatoException;

    void crear(T t) throws  AccesoDatoException;

    void editar(T t) throws AccesoDatoException;

    void eliminar(Integer id) throws AccesoDatoException;
}
