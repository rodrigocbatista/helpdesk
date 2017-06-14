package br.com.comercialbatista.chamados.services;

import java.util.List;
import br.com.comercialbatista.chamados.models.Area;

public interface AreaService {
	
	public List<Area> all();
	
	public void save(Area area);
	
	public Area findById(Integer id);
	
	public void remove(Area area);
	
	public void update(Area area);

}
