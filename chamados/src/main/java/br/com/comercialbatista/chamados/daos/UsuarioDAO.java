package br.com.comercialbatista.chamados.daos;

import java.util.List;

import br.com.comercialbatista.chamados.models.Usuario;

public interface UsuarioDAO {
	
	public List<Usuario> all();
	
	public void save(Usuario usuario);
	
	public Usuario findById(Integer id);
	
	public void remove(Usuario usuario);
	
	public void update(Usuario usuario);
	

}
