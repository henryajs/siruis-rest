package com.hjs.siruisrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.hjs.siruisrest.entity.Categoria;

@Repository
public class CategoriaDaoImpl implements CategoriaDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Categoria get(Integer codigo) {
		/*
		 * String hsql = "select c from Categoria c where cate_codigo = 2";
		 * 
		 * Query query = entityManager.createQuery(hsql); Categoria categoria =
		 * (Categoria) query.getSingleResult();
		 */

		return em.find(Categoria.class, codigo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> all() {
		String hsql = "select c from Categoria c";

		Query query = em.createQuery(hsql);
		List<Categoria> listar = query.getResultList();

		return listar;
	}

	@Override
	public void insert(Categoria categoria) {
		em.persist(categoria);
	}

}
