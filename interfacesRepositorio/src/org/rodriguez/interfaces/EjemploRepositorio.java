package org.rodriguez.interfaces;

import org.rodriguez.interfaces.modelo.Cliente;
import org.rodriguez.interfaces.repositorio.*;
import org.rodriguez.interfaces.repositorio.excepciones.AccesoDatoException;
import org.rodriguez.interfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.rodriguez.interfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.rodriguez.interfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import org.rodriguez.interfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        try {
            AbstractListRepositorio<Cliente> repo = new ClienteListRepositorio();

            repo.crear(new Cliente("Jano", "Perez"));
            repo.crear(new Cliente("Bea", "Gonzales"));
            repo.crear(new Cliente("Luci", "Martinez"));
            repo.crear(new Cliente("Andres", "Guzman"));

            Cliente andres = new Cliente("Andres", "Guzman");
            repo.crear(andres);
            repo.crear(andres);

            // repo.crear(null);

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

        }catch (RegistroDuplicadoAccesoDatoException e) {
            System.out.println("Registro duplicado" + e.getMessage());
            e.printStackTrace();
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura" + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e) {
            System.out.println("Escritura" + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println("Generica" + e.getMessage());
            e.printStackTrace();
        }
    }
}
