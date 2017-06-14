package br.com.comercialbatista.chamados.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import br.com.comercialbatista.chamados.models.Area;

@Repository
public class AreaDAOImpl implements AreaDAO {
	
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Area> all() {
		return manager.createQuery("select a from Area a", Area.class).getResultList();
	}

	@Override
	public void save(Area area) {
		manager.persist(area);
		
	}

	@Override
	public Area findById(Integer id) {
		return manager.find(Area.class, id);
	}

	@Override
	public void remove(Area area) {
		manager.remove(area);
		
	}

	@Override
	public void update(Area area) {
		manager.merge(area);
		
	}

}
