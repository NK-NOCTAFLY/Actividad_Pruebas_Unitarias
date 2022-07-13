package com.example.actividad.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="categoria")
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Categoria {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer CategoriaId;
	private String Descripcion;
	public Integer getCategoriaId() {
		return CategoriaId;
	}
	public void setCategoriaId(Integer categoriaId) {
		CategoriaId = categoriaId;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
}
