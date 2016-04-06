package com.hjs.siruisrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hjs.siruisrest.dao.CategoriaDao;
import com.hjs.siruisrest.entity.Categoria;

@Service
@Transactional
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaDao categoriaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Categoria> listarCategoria() {
		return categoriaDao.all();
	}

	@Override
	@Transactional(readOnly = true)
	public Categoria obtenerCategoria(Integer codigo) {
		return categoriaDao.get(codigo);
	}

	@Override
	public void agregarCategoria(Categoria categoria) {
		categoriaDao.insert(categoria);
	}

}
