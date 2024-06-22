package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class ClassProductoImp implements IProducto{

	public void RegistrarProducto(TblProductocl2 producto) {
		// establecer conexion con la unidad de persistencia...
				EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL2_MontoyaFloresMarceloRodrigo");

				// permitir gestionar entidades
				EntityManager em = fabr.createEntityManager();

				// iniciar transaccion
				em.getTransaction().begin();

				// registrarnos
				em.persist(producto);

				// mensaje consola
				System.out.println("DATO REGISTRADO en la BD");

				// confirmamos
				em.getTransaction().commit();

				// cerramos la transaccion
				em.close();

			} // fin registrar

	public List<TblProductocl2> ListadoProductos() {
		// establecer conexion con la unidad de persistencia...
		EntityManagerFactory fabr = Persistence.createEntityManagerFactory("LPII_CL2_MontoyaFloresMarceloRodrigo");

		// gestionamos las entidades
		EntityManager em = fabr.createEntityManager();

		// iniciar transaccion
		em.getTransaction().begin();

		// recuperamos los productos de la base de datos
		List<TblProductocl2> listadoproductos=em.createQuery("select p from TblProductocl2 p", TblProductocl2.class).getResultList();

		// confirmamos la transaccion
		em.getTransaction().commit();

		// cerramos
		em.close();
		
		return listadoproductos;
	} //fin de LISTAR

}


