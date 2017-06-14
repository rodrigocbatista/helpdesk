package br.com.comercialbatista.chamados.daos;

import java.util.List;

import br.com.comercialbatista.chamados.models.SubArea;

public interface SubAreaDAO {
	
	public List<SubArea> all();
	
	public void save(SubArea subArea);
	
	public SubArea findById(Integer id);
	
	public void remove(SubArea subArea);
	
	public void update(SubArea subArea);

}
