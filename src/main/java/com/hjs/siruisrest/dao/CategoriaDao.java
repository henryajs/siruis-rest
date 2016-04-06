package com.hjs.siruisrest.dao;

import java.util.List;

import com.hjs.siruisrest.entity.Categoria;

public interface CategoriaDao {
	
	Categoria get(Integer codigo);
	
	List<Categoria> all();
	
	void insert(Categoria categoria);

}
