package com.example.biblioecaduoc.repository;

import com.example.biblioecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    public Libro buscarPorId(int id) {
        for (Libro libro : listaLibros){
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null; // o lanzar una excepción si no se encuentra el libro
    }

    public Libro buscarPorIsbn (String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null; // o lanzar una excepción si no se encuentra el libro
    }

    public Libro guardar(Libro libro) {
        listaLibros.add(libro);
        return libro;
    }

    public Libro actualizar (Libro lib) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == lib.getId()) {
                id = lib.getId();
                idPosicion = i;
            }

        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        listaLibros.set(idPosicion, libro1);
        return libro1;

    }

    public void eliminar (int id) {
        Libro libro = buscarPorId(id);
        if (libro != null) {
            listaLibros.remove (libro);
        }
    }
    

}
