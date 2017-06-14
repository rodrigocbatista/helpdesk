package br.com.comercialbatista.chamados.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import br.com.comercialbatista.chamados.models.SubArea;

@Repository
public class SubAreaDAOImpl implements SubAreaDAO {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<SubArea> all() {
		return manager.createQuery("select s from SubArea s", SubArea.class).getResultList();
	}

	@Override
	public void save(SubArea subArea) {
		manager.persist(subArea);
		
	}

	@Override
	public SubArea findById(Integer id) {
		return manager.find(SubArea.class, id);
	}

	@Override
	public void remove(SubArea subArea) {
		manager.remove(subArea);
		
	}

	@Override
	public void update(SubArea subArea) {
		manager.merge(subArea);
		
	}

}
