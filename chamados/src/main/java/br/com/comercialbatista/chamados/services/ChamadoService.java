package br.com.comercialbatista.chamados.services;

import java.util.List;

import br.com.comercialbatista.chamados.models.Chamado;

public interface ChamadoService {
	
	public List<Chamado> all();
	
	public void save(Chamado chamado);
	
	public Chamado findById(Integer id);
	
	public void remove(Chamado chamado);
	
	public void update(Chamado chamado);

}
