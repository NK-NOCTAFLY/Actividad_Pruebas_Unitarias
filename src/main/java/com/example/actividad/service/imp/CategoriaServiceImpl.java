package com.example.actividad.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.actividad.entity.Categoria;
import com.example.actividad.repository.CategoriaRepo;
import com.example.actividad.service.CategoriaService;

@Component
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepo  categoriaRepo;
	
	@Override
	public List<Categoria> listarCategoria() {
	
		return categoriaRepo.findAll();
	}

	@Override
	public Categoria ObtenerCategoria(Integer id) {
		 return categoriaRepo.findById(id).orElse(null);// TODO Auto-generated method stub
		
	}

}
