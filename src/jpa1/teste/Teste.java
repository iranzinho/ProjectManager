package jpa1.teste;

import jpa1.model.Usuario;
import jpa1.model.repositorio.RepositorioUsuario;

public class Teste {

	public static void main(String[] args) {
		
		RepositorioUsuario repositorioUsuario = new RepositorioUsuario();
		Usuario usuario = new Usuario();
		/*usuario.setId(1);
		usuario.setEmail("jeronimo000000@gmail.com");
		usuario.setLoginUsuario("Mago");
		usuario.setSenhaUsuario("mago123");
		usuario.setNomeCompleto("Jeronimo Santos");*/
		
		
		usuario.setEmail("jeronimo_10000@hotmail.com");
		usuario.setLoginUsuario("jeronimo");
		usuario.setSenhaUsuario("mago123");
		usuario.setNomeCompleto("Jeronimo Cunha");
		
		repositorioUsuario.salvar(usuario);

	}

}
