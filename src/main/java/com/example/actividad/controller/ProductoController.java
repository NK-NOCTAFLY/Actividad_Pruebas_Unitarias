package com.example.actividad.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.actividad.entity.Producto;
import com.example.actividad.service.ProductoService;


@RestController
@RequestMapping("/producto")

public class ProductoController {
	
	@Autowired
	private  ProductoService productoService;

	public ProductoController(ProductoService productoService) {
		
		this.productoService = productoService;
	}
	
	
	   @GetMapping
		public List<Producto> listarProducto(){	
			return productoService.getAll();	
		}
	   
	   
	   
	   @GetMapping("/{id}")
	 public Optional<Producto>ObtenerProducto(@PathVariable("id") Long id){
		   return productoService.findById(id);
		   
	   }
	
	
	   @PostMapping
	   public Producto GuardarProducto(@RequestBody Producto producto) {
		  return productoService.insertarProducto(producto); 
	   }
	
	   @PutMapping
	   public Producto ActualizarProducto(@RequestBody Producto producto) {
		   return productoService.ActualizarProducto(producto);
		  
	   
	   }
	   

	   @DeleteMapping("/{id}")
	   public void EliminarProducto(@PathVariable("id") Long id) {
		   productoService.EliminarProducto(id);
		   
	   }
   
	
}


