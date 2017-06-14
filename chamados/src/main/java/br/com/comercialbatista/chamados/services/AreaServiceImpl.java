package br.com.comercialbatista.chamados.services;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.comercialbatista.chamados.daos.AreaDAO;
import br.com.comercialbatista.chamados.models.Area;


@Service
public class AreaServiceImpl implements AreaService {
	
	
	@Autowired
	private AreaDAO areaDAO;

	@Override
	@Transactional
	public List<Area> all() {
		return areaDAO.all();
	}

	@Override
	@Transactional
	public void save(Area area) {
		areaDAO.save(area);
		
	}

	@Override
	@Transactional
	public Area findById(Integer id) {
		return areaDAO.findById(id);
	}

	@Override
	@Transactional
	public void remove(Area area) {
		areaDAO.remove(area);
		
	}

	@Override
	@Transactional
	public void update(Area area) {
		areaDAO.update(area);
		
	}

}
