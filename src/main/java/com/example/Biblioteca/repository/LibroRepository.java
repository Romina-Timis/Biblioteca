package com.example.Biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Biblioteca.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
