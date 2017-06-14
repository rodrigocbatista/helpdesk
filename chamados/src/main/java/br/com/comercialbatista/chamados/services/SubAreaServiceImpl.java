package br.com.comercialbatista.chamados.services;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.comercialbatista.chamados.daos.SubAreaDAO;
import br.com.comercialbatista.chamados.models.SubArea;


@Service
public class SubAreaServiceImpl implements SubAreaService {
	
	@Autowired
	private SubAreaDAO subAreaDAO;

	@Override
	@Transactional
	public List<SubArea> all() {
		return subAreaDAO.all();
	}

	@Override
	@Transactional
	public void save(SubArea subArea) {
		subAreaDAO.save(subArea);

	}

	@Override
	@Transactional
	public SubArea findById(Integer id) {
		return subAreaDAO.findById(id);
	}

	@Override
	@Transactional
	public void remove(SubArea subArea) {
		subAreaDAO.remove(subArea);

	}

	@Override
	@Transactional
	public void update(SubArea subArea) {
		subAreaDAO.update(subArea);

	}

}
