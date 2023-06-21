package org.rodriguez.interfaces;

import org.rodriguez.interfaces.modelo.Cliente;
import org.rodriguez.interfaces.modelo.Producto;
import org.rodriguez.interfaces.repositorio.AbstractListRepositorio;
import org.rodriguez.interfaces.repositorio.Direccion;
import org.rodriguez.interfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        AbstractListRepositorio<Producto> repo = new ProductoListRepositorio();

        repo.crear(new Producto("mesa", 50.52));
        repo.crear(new Producto("silla", 18));
        repo.crear(new Producto("Lampara", 15.5));
        repo.crear(new Producto("notebook", 400.89));

        List<Producto> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("===== Paginable =====");

        List<Producto> paginable = repo.listar(1, 3);
        paginable.forEach(System.out::println);

        System.out.println("===== Ordenar ASC =====");

        List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.ASC);
        productosOrdenAsc.forEach(System.out::println);

        System.out.println("===== Ordenar DESC =====");

        List<Producto> productosOrdenDesc = repo.listar("precio", Direccion.DESC);
        productosOrdenDesc.forEach(System.out::println);

        System.out.println("===== Editar =====");

        Producto lamparaActualizar = new Producto("Lampara escritorio", 23);
        lamparaActualizar.setId(2);
        repo.editar(lamparaActualizar);

        Producto lampara = repo.porId(2);
        System.out.println(lampara);

        System.out.println("===== Eliminar =====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("===== Total =====");
        System.out.println("Total registros: " + repo.total());
    }
}
