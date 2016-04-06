package com.hjs.siruisrest.service;

import java.util.List;

import com.hjs.siruisrest.entity.Categoria;

public interface CategoriaService {
	
	Categoria obtenerCategoria(Integer codigo);
	
	List<Categoria> listarCategoria();
	
	void agregarCategoria(Categoria categoria);

}
