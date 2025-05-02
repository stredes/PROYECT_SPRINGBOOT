package com.example.biblioecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    
    private int id;
    private String titulo;
    private String autor;   
    private String editorial;
    private int fechaPublicacion;
    private String isbn;
}
