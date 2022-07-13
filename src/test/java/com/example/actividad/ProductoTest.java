package com.example.actividad;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.example.actividad.entity.Producto;
import com.example.actividad.repository.ProductoRepo;



@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)

public class ProductoTest {
	@Autowired
	private ProductoRepo productoRepo;

	@Test
	public void TestBuscarProductoId() {
		long id =1;
		Optional<Producto> producto = productoRepo.findById(id);
		assertNotNull(producto);
		
	}
	
	@Test
	@Rollback(false)
	public void TestGuardarProducto() {
		Producto producto = new Producto();
		productoRepo.save(producto);
		
		assertNotNull(producto);
	}
	
	@Test
	@Rollback(false)
	public void TestActualizarProducto() {
		Producto producto = new Producto();
		
		assertNotNull(producto);
		
		
	}
	
	
	@Test
	public void TestListarProducto() {
		List<Producto> producto = (List<Producto>) productoRepo.findAll();
		 for (Producto productos : producto) {
	            System.out.println(productos);
	        }
	        assertThat(producto).size().isGreaterThan(0);
		
	}
	
	@Test
	@Rollback(false)
	public void TestEliminarProducto() {
		long id=1;
		boolean ExisteProducto = productoRepo.findById(id).isPresent();
		productoRepo.deleteById(id);
		boolean NoExisteProducto = productoRepo.findById(id).isPresent();
		
		assertTrue(ExisteProducto);
		assertFalse(NoExisteProducto);
		
		
	}
	
	

}
