// Libro.java
package com.example.biblioecaduoc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "libros")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    @Id
    private int id;

    private String titulo;
    private String autor;
    private String editorial;
    private int fechaPublicacion;
    private String isbn;
}
