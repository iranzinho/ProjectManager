package facade;

import java.util.ArrayList;


public class Facade {
	
	 public static boolean cadastrarUsuario(Usuario usuario){
	        return UsuarioControl.cadastrarUsuario(usuario);
	    }

	 
	 public static boolean editarUsuario(Usuario usuario){
	        return UsuarioControl.editarUsuario(usuario);
	    }
	 
	 
	 public static boolean deletarUsuario(Usuario usuario){
	        return UsuarioControl.deletarUsuario(usuario;
	    }
	 
	 	 
	 public static ArrayList<Usuario> listarUsuarios(){
	        return UsuarioControl.listarUsuario(;
	    }
	 	 
}
