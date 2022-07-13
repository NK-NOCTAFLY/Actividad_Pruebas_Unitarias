package com.example.actividad.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.actividad.entity.Categoria;


public interface CategoriaRepo extends JpaRepository<Categoria, Integer> {
	
	public Optional<Categoria>findById(Integer CategoriaId);

}
