package com.example.Biblioteca.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Biblioteca.model.Libro;
import com.example.Biblioteca.service.LibroService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/libri")
@CrossOrigin("*") // Permette chiamate da frontend React/Angular
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> getAllLibri() {
        return libroService.getAllLibri();
    }

    @GetMapping("/{id}")
    public Optional<Libro> getLibroById(@PathVariable Long id) {
        return libroService.getLibroById(id);
    }

    @PostMapping
    public Libro createLibro(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @PutMapping("/{id}")
    public Libro updateLibro(@PathVariable Long id, @RequestBody Libro libro) {
        libro.setId(id);
        return libroService.saveLibro(libro);
    }

    @DeleteMapping("/{id}")
    public void deleteLibro(@PathVariable Long id) {
        libroService.deleteLibro(id);
    }
}

