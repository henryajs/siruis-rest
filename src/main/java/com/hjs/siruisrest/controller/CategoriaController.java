package com.hjs.siruisrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hjs.siruisrest.entity.Categoria;
import com.hjs.siruisrest.service.CategoriaService;

@RestController
@RequestMapping("/mantenimiento")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
    //http://localhost:8080/siruisrest/sisag/mantenimiento/categorias
	@RequestMapping(value = "/categorias", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Categoria> getAllCategoria() {
		return categoriaService.listarCategoria();
	}
	
	//http://localhost:8080/siruisrest/sisag/mantenimiento/categoria/1
	@RequestMapping(value = "/categoria/{codigo}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Categoria> getCategoria(@PathVariable Integer codigo) {
		System.out.println("Llego ak..");
		Categoria categoria = categoriaService.obtenerCategoria(codigo);
		System.out.println("Paso1.");
		
		ResponseEntity<Categoria> response;
		
		if(categoria == null) {
			System.out.println("No existe.");
			 response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			System.out.println("Si existe.");
			response = new ResponseEntity<>(categoria, HttpStatus.OK);
		}		
		
		return response;
	}
	
	@RequestMapping(value = "/categorias", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void insertCategoria(@RequestBody Categoria categoria) {
		System.out.println("Se insertara.");
		categoriaService.agregarCategoria(categoria);
		System.out.println("Se inserto con exito.");
	}

}
