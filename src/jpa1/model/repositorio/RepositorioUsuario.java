package jpa1.model.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa1.model.Usuario;

public class RepositorioUsuario {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public RepositorioUsuario() {
		emf = Persistence.createEntityManagerFactory("mohr");
		em = emf.createEntityManager();
	}

	public void salvar(Usuario u){
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Usuario u){
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		emf.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Usuario> listarUsuarios(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select usuario * from");
		List<Usuario> usuarios = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return usuarios;
		
	}

}
