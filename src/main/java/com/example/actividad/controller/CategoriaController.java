package com.example.actividad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.actividad.entity.Categoria;
import com.example.actividad.service.CategoriaService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/categoria")
@Slf4j

public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping(value= {"/"})
	public List<Categoria>listarCategoria(){
		
		log.info("Inicio:listarCategoria");
		List<Categoria> categoria = categoriaService.listarCategoria();
		return categoria;
	}
	
	
	@PostMapping(value="/add/{Descripcion}")
	public Categoria insertarCategoria(@PathVariable("Descripcion") String Descripcion) {
		return null;		
		
	}
	
	@GetMapping("/{id}")
	public Categoria obtenerCategoria(@PathVariable Integer id) {
		Categoria categoria = categoriaService.ObtenerCategoria(id);
		return categoria;
		
	}
	
	
	
	


}
