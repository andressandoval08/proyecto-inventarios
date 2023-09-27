package com.asandoval.backend.inventarios.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/* Si los datos salen asi ([{},{}]) esto se debe a que la dependencia "lombok.Data" 
 * no crea los metodos GETTER Y SETTER de manera implicita. 
 * agregar manualmente los metodos Getter y Setter, para solucionar el problema
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idProducto;

	String descripcion;
	Double precio;
	Integer existencia;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getExistencia() {
		return existencia;
	}

	public void setExistencia(Integer existencia) {
		this.existencia = existencia;
	}

}
