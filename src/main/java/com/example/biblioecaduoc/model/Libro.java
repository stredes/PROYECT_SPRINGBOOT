package com.example.biblioecaduoc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "libros") // opcional, puedes omitir si el nombre coincide
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;
    private String autor;
    private String editorial;
    private int fechaPublicacion; // puedes cambiar a LocalDate si prefieres
    private String isbn;
}
