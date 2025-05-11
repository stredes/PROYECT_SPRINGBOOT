package com.example.biblioecaduoc.services;

import com.example.biblioecaduoc.model.Libro;
import com.example.biblioecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.findAll();
    }

    public Libro getLibroId(int id) {
        return libroRepository.findById(id).orElse(null);
    }

    public Libro getLibroByIsbn(String isbn) {
        return libroRepository.findByIsbn(isbn);
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public Libro updateLibro(int id, Libro libro) {
        Optional<Libro> optional = libroRepository.findById(id);
        if (optional.isPresent()) {
            Libro existente = optional.get();
            existente.setAutor(libro.getAutor());
            existente.setEditorial(libro.getEditorial());
            existente.setFechaPublicacion(libro.getFechaPublicacion());
            existente.setIsbn(libro.getIsbn());
            existente.setTitulo(libro.getTitulo());
            return libroRepository.save(existente);
        }
        return null;
    }

    public boolean deleteLibro(int id) {
        if (libroRepository.existsById(id)) {
            libroRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
