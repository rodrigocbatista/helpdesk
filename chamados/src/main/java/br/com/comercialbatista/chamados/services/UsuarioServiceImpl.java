package br.com.comercialbatista.chamados.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.comercialbatista.chamados.daos.UsuarioDAO;
import br.com.comercialbatista.chamados.models.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	@Transactional
	public List<Usuario> all() {
		return usuarioDAO.all();
	}

	@Override
	@Transactional
	public void save(Usuario usuario) {
		usuarioDAO.save(usuario);
		
	}

	@Override
	@Transactional
	public Usuario findById(Integer id) {
		return usuarioDAO.findById(id);
	}

	@Override
	@Transactional
	public void remove(Usuario usuario) {
		usuarioDAO.remove(usuario);
		
	}

	@Override
	@Transactional
	public void update(Usuario usuario) {
		usuarioDAO.update(usuario);
		
	}

}
