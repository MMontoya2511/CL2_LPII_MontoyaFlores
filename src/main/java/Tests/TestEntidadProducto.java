package Tests;

import java.util.List;

import Dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {
		//Registrar
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		
		//Ingresando registros
		producto.setIdProductoCL2(1);
		producto.setNombreCL2("Monitor View Sonic");
		producto.setPrecioventaCL2(399.99);
		producto.setPreciocompCL2(499.99);
		producto.setEstadoCL2("Oferta");
		producto.setDescripCL2("Monitor de 24 pulgadas y 75Hz");
		
		//llamamos al metodo Registrar
		crud.RegistrarProducto(producto); 

		//Listado
		List<TblProductocl2> listado = crud.ListadoProductos();
		
		//bucle FOR
		for(TblProductocl2 lis:listado){
			
			System.out.println("ID" + lis.getIdProductoCL2() +
							   "Nombre" + lis.getNombreCL2() + 
							   "PrecioVenta" + lis.getPrecioventaCL2() +
							   "PrecioComp" + lis.getPreciocompCL2() +
							   "Estado" + lis.getEstadoCL2() +
							   "Descripcion" + lis.getDescripCL2());
			
		} //fin FOR
		
	} //fin de MAIN

} //fin de la clase
