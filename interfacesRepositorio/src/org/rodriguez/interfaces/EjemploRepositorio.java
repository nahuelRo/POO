package org.rodriguez.interfaces;

import org.rodriguez.interfaces.modelo.Cliente;
import org.rodriguez.interfaces.repositorio.*;
import org.rodriguez.interfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        AbstractListRepositorio<Cliente> repo = new ClienteListRepositorio();

        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Bea", "Gonzales"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Andres", "Guzman"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("===== Paginable =====");

        List<Cliente> paginable = repo.listar(1, 3);
        paginable.forEach(System.out::println);

        System.out.println("===== Ordenar ASC =====");

        List<Cliente> clientesOrdenAsc = repo.listar("nombre", Direccion.ASC);
        clientesOrdenAsc.forEach(System.out::println);

        System.out.println("===== Ordenar DESC =====");

        List<Cliente> clientesOrdenDesc = repo.listar("nombre", Direccion.DESC);
        clientesOrdenDesc.forEach(System.out::println);

        System.out.println("===== Editar =====");

        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);

        Cliente bea = repo.porId(2);
        System.out.println(bea);

        System.out.println("===== Eliminar =====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("===== Total =====");
        System.out.println("Total registros: " + repo.total());
    }
}
