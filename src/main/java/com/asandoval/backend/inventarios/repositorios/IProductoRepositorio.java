package com.asandoval.backend.inventarios.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asandoval.backend.inventarios.model.Producto;

public interface IProductoRepositorio extends JpaRepository<Producto, Integer>{
	

}
