package Interfaces;

import java.util.List;

import model.TblProductocl2;;

public interface IProducto {
	//declarando metodos
	public void RegistrarProducto(TblProductocl2 producto);
	public List<TblProductocl2> ListadoProductos();
	
	
} //fin del interface
