package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    } //fin del controlador

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("listarProductos".equals(action)) {
            ClassProductoImp crud = new ClassProductoImp();
            List<TblProductocl2> listadoProductos = crud.ListadoProductos();
            
            request.setAttribute("listadoproducto", listadoProductos);
            request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
        } else {
            // Manejar otros casos o acciones según sea necesario
        }
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		//recuperamos 

		
		String nombre= request.getParameter("nombre");
		String precioCompraStr = request.getParameter("precioCompra");
        String precioVentaStr = request.getParameter("precioVenta");
		String estado= request.getParameter("estado");
		String descripcion= request.getParameter("descripcion");
		
        double precioCompra = Double.parseDouble(precioCompraStr);
        double precioVenta = Double.parseDouble(precioVentaStr);
        
		
		//instanciando
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		
		//asignando valores
		producto.setNombreCL2(nombre);
		producto.setPreciocompCL2(precioCompra);
		producto.setPrecioventaCL2(precioVenta);
		producto.setEstadoCL2(estado);
		producto.setDescripCL2(descripcion);
		
		//llamamos a registrar
		crud.RegistrarProducto(producto);
		
		//actualizamos listado
		List<TblProductocl2> listadoproductos=crud.ListadoProductos();
		
		//invocamos al listado del producto para la vista
		request.setAttribute("listadoproducto", listadoproductos);
		
		//redireccionamos
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request,response);
		
		
	} //fin de doPost

}
