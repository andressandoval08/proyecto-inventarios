package com.asandoval.backend.inventarios.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asandoval.backend.inventarios.model.Producto;
import com.asandoval.backend.inventarios.repositorios.IProductoRepositorio;


@Service 
public class ProductoServicio implements IProductoServicio{

	@Autowired
	private IProductoRepositorio productoRepositorio;
	
	@Override
	public List<Producto> listarProductos() {
		// TODO Auto-generated method stub
		return this.productoRepositorio.findAll();
	}

	@Override
	public Producto buscarProductoPorId(Integer idProducto) {
		// TODO Auto-generated method stub
		Producto producto = this.productoRepositorio.findById(idProducto).orElse(null);
		return producto;
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return this.productoRepositorio.save(producto);
	}

	@Override
	public void eliminarProductoPorId(Integer idProducto) {
		// TODO Auto-generated method stub
		this.productoRepositorio.deleteById(idProducto);		
	}

	
}
