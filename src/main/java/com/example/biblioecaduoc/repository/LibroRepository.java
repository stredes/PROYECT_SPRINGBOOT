package com.example.biblioecaduoc.repository;

import com.example.biblioecaduoc.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LibroRepository extends JpaRepository<Libro, Integer> {
    Libro findByIsbn(String isbn);

}
