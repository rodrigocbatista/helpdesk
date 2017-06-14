package br.com.comercialbatista.chamados.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import br.com.comercialbatista.chamados.models.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {
	
		@PersistenceContext
		private EntityManager manager;

	   public List<Usuario> all(){
	      return manager.createQuery("select u from Usuario u", Usuario.class).getResultList();
	   }

	   public void save(Usuario usuario){
	      manager.persist(usuario);
	   }

	   public Usuario findById(Integer id){
	      return manager.find(Usuario.class, id);
	   }

	   public void remove(Usuario usuario){
	      manager.remove(usuario);
	   }

	   public void update(Usuario usuario){
	      manager.merge(usuario);
	   }
	

}
