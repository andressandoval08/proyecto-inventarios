package com.asandoval.backend.inventarios.servicios;

import java.util.List;

import com.asandoval.backend.inventarios.model.Producto;

public interface IProductoServicio {
	
	public List<Producto> listarProductos();
	
	public Producto buscarProductoPorId(Integer idProducto);
	
	public Producto guardarProducto (Producto producto);
	
	public void eliminarProductoPorId(Integer idProducto);

}
