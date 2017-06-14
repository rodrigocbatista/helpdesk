package br.com.comercialbatista.chamados.daos;

import java.util.List;

import br.com.comercialbatista.chamados.models.Tramite;



public interface TramiteDAO {
	
	
	
	public List<Tramite> all();
	
	public void save(Tramite tramite);
	
	public Tramite findById(Integer id);
	
	public void remove(Tramite tramite);
	
	public void update(Tramite tramite);

}
