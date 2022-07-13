package com.example.actividad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.actividad.entity.Producto;


@Component
public interface ProductoService {
	
	public List<Producto> getAll();
	Optional<Producto> findById(Long id);
	public Producto insertarProducto(Producto producto);
	public Producto ActualizarProducto(Producto producto);
	void EliminarProducto(Long id);
	
}
