package com.example.actividad.service;

import java.util.List;

import org.springframework.stereotype.Component;
import com.example.actividad.entity.Categoria;

@Component
public interface CategoriaService {

	public List<Categoria>listarCategoria();
	public Categoria ObtenerCategoria(Integer id);
	
}
