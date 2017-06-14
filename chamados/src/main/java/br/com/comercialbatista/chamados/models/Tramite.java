package br.com.comercialbatista.chamados.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="tramites")
public class Tramite {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String descricao;
	
	
	@ManyToOne
	@JoinColumn(name = "chamado_id")
	private Chamado chamado;
	
	
	
	@ManyToOne
	@JoinColumn(name = "usu_tramite")
	private Usuario usuarioTramite;
	
	
	@Column(name="dt_cadastro")
	private Date dataCadastro;


	public Tramite() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Chamado getChamado() {
		return chamado;
	}


	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}


	public Usuario getUsuarioTramite() {
		return usuarioTramite;
	}


	public void setUsuarioTramite(Usuario usuarioTramite) {
		this.usuarioTramite = usuarioTramite;
	}


	public Date getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	@Override
	public String toString() {
		return "Tramite [id=" + id + ", descricao=" + descricao + ", chamado=" + chamado + ", usuarioTramite="
				+ usuarioTramite + ", dataCadastro=" + dataCadastro + "]";
	}

	
	
	
}
