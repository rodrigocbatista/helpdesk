package br.com.comercialbatista.chamados.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.comercialbatista.chamados.daos.ChamadoDAO;
import br.com.comercialbatista.chamados.models.Chamado;

@Service
public class ChamadoServiceImpl implements ChamadoService {
	
	@Autowired
	private ChamadoDAO chamadoDAO;

	@Override
	@Transactional
	public List<Chamado> all() {
		return chamadoDAO.all();
	}

	@Override
	@Transactional
	public void save(Chamado chamado) {
		chamadoDAO.save(chamado);
		
	}

	@Override
	@Transactional
	public Chamado findById(Integer id) {
		return chamadoDAO.findById(id);
	}

	@Override
	@Transactional
	public void remove(Chamado chamado) {
		chamadoDAO.remove(chamado);
		
	}

	@Override
	@Transactional
	public void update(Chamado chamado) {
		chamadoDAO.update(chamado);
		
	}

}
