package com.example.actividad.service.imp;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.example.actividad.entity.Producto;
import com.example.actividad.repository.ProductoRepo;
import com.example.actividad.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	
	private ProductoRepo  productoRepo;
	
	public ProductoServiceImpl(ProductoRepo productoRepo) {
		
	this.productoRepo = productoRepo;	
	}
	
	@Override
	public List<Producto> getAll() {
		
		return productoRepo.findAll();
	}

	@Override
	public Optional<Producto> findById(Long id) {
		
		return productoRepo.findById(id);
	}

	@Override
	public Producto insertarProducto(Producto producto) {
		
		return productoRepo.save(producto);
	}

	@Override
	public Producto ActualizarProducto(Producto producto) {
		
		return productoRepo.save(producto) ;
	}

	@Override
	public void EliminarProducto(Long id) {
	  productoRepo.deleteById(id);
		
	}



	

	

}
