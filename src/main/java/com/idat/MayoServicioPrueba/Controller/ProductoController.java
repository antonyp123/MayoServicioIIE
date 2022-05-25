package com.idat.MayoServicioPrueba.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MayoServicioPrueba.Service.ProductoService;
import com.idat.MayoServicioPrueba.model.Productos;

@Controller
@RequestMapping("/producto/v1")
public class ProductoController {
	
	@Autowired
	private ProductoService service;
	
	@RequestMapping("/producto/v1")
	public @ResponseBody List<Productos> listar() {
		return null;	
		
	}
	
	

}
