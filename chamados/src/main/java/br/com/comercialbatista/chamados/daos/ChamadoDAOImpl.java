package br.com.comercialbatista.chamados.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import br.com.comercialbatista.chamados.models.Chamado;

@Repository
public class ChamadoDAOImpl implements ChamadoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	

	@Override
	public List<Chamado> all() {
		 return manager.createQuery("select c from Chamado c", Chamado.class).getResultList();
	}

	@Override
	public void save(Chamado chamado) {
		manager.persist(chamado);
	}

	@Override
	public Chamado findById(Integer id) {
		return manager.find(Chamado.class, id);
	}

	@Override
	public void remove(Chamado chamado) {
		manager.remove(chamado);
		
	}

	@Override
	public void update(Chamado chamado) {
		manager.merge(chamado);
		
	}

}
