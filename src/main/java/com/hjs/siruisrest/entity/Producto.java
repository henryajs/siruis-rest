package com.hjs.siruisrest.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
//@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
@Table(name="producto")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="prod_codigo")
	private int prodCodigo;

	@Column(name="prod_descripcion")
	private String prodDescripcion;

	@Column(name="prod_estado")
	private byte prodEstado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="prod_fecha_compra")
	private Date prodFechaCompra;

	@Temporal(TemporalType.DATE)
	@Column(name="prod_fecha_venta")
	private Date prodFechaVenta;

	@Column(name="prod_precio")
	private BigDecimal prodPrecio;

	//bi-directional many-to-one association to Categoria
	@ManyToOne
	@JoinColumn(name="cate_codigo")
	private Categoria categoria;

	public Producto() {
	}

	public int getProdCodigo() {
		return this.prodCodigo;
	}

	public void setProdCodigo(int prodCodigo) {
		this.prodCodigo = prodCodigo;
	}

	public String getProdDescripcion() {
		return this.prodDescripcion;
	}

	public void setProdDescripcion(String prodDescripcion) {
		this.prodDescripcion = prodDescripcion;
	}

	public byte getProdEstado() {
		return this.prodEstado;
	}

	public void setProdEstado(byte prodEstado) {
		this.prodEstado = prodEstado;
	}

	public Date getProdFechaCompra() {
		return this.prodFechaCompra;
	}

	public void setProdFechaCompra(Date prodFechaCompra) {
		this.prodFechaCompra = prodFechaCompra;
	}

	public Date getProdFechaVenta() {
		return this.prodFechaVenta;
	}

	public void setProdFechaVenta(Date prodFechaVenta) {
		this.prodFechaVenta = prodFechaVenta;
	}

	public BigDecimal getProdPrecio() {
		return this.prodPrecio;
	}

	public void setProdPrecio(BigDecimal prodPrecio) {
		this.prodPrecio = prodPrecio;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}