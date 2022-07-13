package com.example.actividad.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;

import lombok.ToString;

@Entity
@Table(name="producto")
@ToString
@EqualsAndHashCode

public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String NombreProducto;
	private String  Descripcion;
	
	
	public Producto() {
		
	}
	
	public Producto(Long id,String NombreProducto , String Descripcion) {
		this.id= id;
		this.NombreProducto = NombreProducto;
		this.Descripcion = Descripcion;
	}
	
	
	

	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getNombreProducto() {
		return NombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	

	
}
