package br.com.comercialbatista.chamados.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="area")
public class Area {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	
	private String descricao;
	
	@OneToMany(mappedBy = "area", cascade = CascadeType.ALL, fetch= FetchType.EAGER)
	private List<SubArea> subAreas;
	
	

}
