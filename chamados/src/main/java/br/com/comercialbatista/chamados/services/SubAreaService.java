package br.com.comercialbatista.chamados.services;

import java.util.List;
import br.com.comercialbatista.chamados.models.SubArea;

public interface SubAreaService {
	
	public List<SubArea> all();
	
	public void save(SubArea subArea);
	
	public SubArea findById(Integer id);
	
	public void remove(SubArea subArea);
	
	public void update(SubArea subArea);

}
