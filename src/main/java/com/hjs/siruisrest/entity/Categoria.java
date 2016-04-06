package com.hjs.siruisrest.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the categoria database table.
 * 
 */
@Entity
//@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
@Table(name="categoria")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cate_codigo")
	private int cateCodigo;

	@Column(name="cate_descripcion")
	private String cateDescripcion;

	//bi-directional many-to-one association to Producto
	//@OneToMany(mappedBy="categoria")	
	//private List<Producto> productos;

	public Categoria() {
	}

	public int getCateCodigo() {
		return this.cateCodigo;
	}

	public void setCateCodigo(int cateCodigo) {
		this.cateCodigo = cateCodigo;
	}

	public String getCateDescripcion() {
		return this.cateDescripcion;
	}

	public void setCateDescripcion(String cateDescripcion) {
		this.cateDescripcion = cateDescripcion;
	}
/*
	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}*/
/*
	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setCategoria(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setCategoria(null);

		return producto;
	}
*/
}