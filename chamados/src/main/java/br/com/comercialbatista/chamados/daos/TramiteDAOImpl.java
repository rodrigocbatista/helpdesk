package br.com.comercialbatista.chamados.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.comercialbatista.chamados.models.Tramite;


@Repository
public class TramiteDAOImpl implements TramiteDAO {
	
	
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Tramite> all() {
	      return manager.createQuery("select t from Tramite t", Tramite.class).getResultList();

	}

	@Override
	public void save(Tramite tramite) {
		 manager.persist(tramite);
		
	}

	@Override
	public Tramite findById(Integer id) {
		return manager.find(Tramite.class, id);
	}

	@Override
	public void remove(Tramite tramite) {
		manager.remove(tramite);
		
	}

	@Override
	public void update(Tramite tramite) {
		manager.merge(tramite);
		
	}

	

}
