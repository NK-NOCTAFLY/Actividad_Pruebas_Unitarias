package com.example.actividad.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.actividad.entity.Producto;

@Repository
public interface ProductoRepo extends JpaRepository<Producto, Long> {

	//public Optional<Producto>findById(Integer ProductoId);

	
	
}
