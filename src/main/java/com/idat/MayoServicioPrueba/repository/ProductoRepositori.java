package com.idat.MayoServicioPrueba.repository;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Productos;

public interface ProductoRepositori {
	
	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProcuto(Integer id);
    List<Productos>ListarProductos();
    Productos obtenerProductosId(Integer id);

}
