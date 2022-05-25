package com.idat.MayoServicioPrueba.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MayoServicioPrueba.model.Productos;
import com.idat.MayoServicioPrueba.repository.ProductoRepositori;

@Service
public class ProcutoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepositori repositori;
	

	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		repositori.guardarProducto(producto);

	}

	@Override
	public void actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub
		repositori.actualizarProducto(producto);

	}

	@Override
	public void eliminarProcuto(Integer id) {
		// TODO Auto-generated method stub
		repositori.eliminarProcuto(id);

	}

	@Override
	public List<Productos> ListarProductos() {
		// TODO Auto-generated method stub
		return repositori.ListarProductos();
	}

	@Override
	public Productos obtenerProductosId(Integer id) {
		// TODO Auto-generated method stub
		return repositori.obtenerProductosId(id);
	}

}
