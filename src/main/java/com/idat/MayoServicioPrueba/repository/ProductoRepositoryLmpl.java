package com.idat.MayoServicioPrueba.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.MayoServicioPrueba.model.Productos;

@Repository
public class ProductoRepositoryLmpl implements ProductoRepositori {
	
	public List<Productos> listar = new ArrayList<Productos>();

	@Override
	public void guardarProducto(Productos producto) {
		// TODO Auto-generated method stub.
		listar.add(producto);

	}

	@Override
	public void actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub
		
		listar.remove(0);
		listar.add(producto);

	}

	@Override
	public void eliminarProcuto(Integer id) {
		
		Productos p= obtenerProductosId(id);
		listar.remove(p);

	}

	@Override
	public List<Productos> ListarProductos() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public Productos obtenerProductosId(Integer id) {

	//	
		//if(listar!=null) {
	//	for(Productos producto : listar) {
		//	if (producto.getIdProducto()==id)
		//		return producto;
		//}
	//   }
		
		
		return listar.stream().filter( p -> p.getIdProducto()==id).findFirst().orElse(null);


	}

}
