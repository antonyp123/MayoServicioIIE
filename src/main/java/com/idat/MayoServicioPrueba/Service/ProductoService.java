package com.idat.MayoServicioPrueba.Service;

import java.util.List;

import com.idat.MayoServicioPrueba.model.Productos;

public interface ProductoService {
	void guardarProducto(Productos producto);
	void actualizarProducto(Productos producto);
	void eliminarProcuto(Integer id);
    List<Productos>ListarProductos();
    Productos obtenerProductosId(Integer id);


}
