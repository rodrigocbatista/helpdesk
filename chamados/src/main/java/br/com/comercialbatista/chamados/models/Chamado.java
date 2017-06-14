package br.com.comercialbatista.chamados.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="chamados")
public class Chamado {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 
	 
	 private String descricao;
	 
	 @ManyToOne
	 @JoinColumn(name = "area_id")
	 private Area area;
	 
	 @ManyToOne
	 @JoinColumn(name = "subarea_id")
	 private SubArea subarea;
	 
	 private String prioridade;
	 
	 private String status;
	 
	 @Column(name="dt_inicio")
	 private Date dataInicio;
	 
	 @Column(name="dt_fim")
	 private Date dataFim;
	 
	 @ManyToOne
	 @JoinColumn(name = "usuario_cadastro")
	 private Usuario usuarioCadastro;
	 
	 @ManyToOne
	 @JoinColumn(name = "usuario_responsavel")
	 private Usuario usuarioResponsavel;
	 
	 @OneToMany(mappedBy = "chamado", cascade = CascadeType.ALL)
	 private List<Tramite> tramites;

	public Chamado() {
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

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public SubArea getSubarea() {
		return subarea;
	}

	public void setSubarea(SubArea subarea) {
		this.subarea = subarea;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Usuario getUsuarioCadastro() {
		return usuarioCadastro;
	}

	public void setUsuarioCadastro(Usuario usuarioCadastro) {
		this.usuarioCadastro = usuarioCadastro;
	}

	public Usuario getUsuarioResponsavel() {
		return usuarioResponsavel;
	}

	public void setUsuarioResponsavel(Usuario usuarioResponsavel) {
		this.usuarioResponsavel = usuarioResponsavel;
	}

	public List<Tramite> getTramites() {
		return tramites;
	}

	public void setTramites(List<Tramite> tramites) {
		this.tramites = tramites;
	}

	@Override
	public String toString() {
		return "Chamado [id=" + id + ", descricao=" + descricao + ", area=" + area + ", subarea=" + subarea
				+ ", prioridade=" + prioridade + ", status=" + status + ", dataInicio=" + dataInicio + ", dataFim="
				+ dataFim + ", usuarioCadastro=" + usuarioCadastro + ", usuarioResponsavel=" + usuarioResponsavel
				+ ", tramites=" + tramites + "]";
	}
	 
	 
	 

}
