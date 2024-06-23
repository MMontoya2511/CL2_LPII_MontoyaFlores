package Tests;

import Dao.ClassUsuarioImp;
import model.TblUsuariocl2;

public class TestEntidadUsuario {

	public static void main(String[] args) {
		//Registrar
		TblUsuariocl2 usuario=new TblUsuariocl2();
		ClassUsuarioImp crud=new ClassUsuarioImp();
		
		//Ingresando registros
		/*usuario.setIdUsuarioCL2(1);
		usuario.setUsuarioCL2("mcobenias15");
		usuario.setPasswordCL2("limoncito15"); 
		
		usuario.setIdUsuarioCL2(2);
		usuario.setUsuarioCL2("mmontoya25");
		usuario.setPasswordCL2("251104"); */
		
		//invocamos a registrar
		crud.RegistrarUsuario(usuario);

	}

}
