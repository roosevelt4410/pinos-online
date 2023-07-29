package co.com.coomeva.pinos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name ="PNS_P_GENERAL" , schema = "PINOS")
@NamedQuery(name ="PnsPGeneral.findAll", query = "SELECT a FROM PnsPGeneral a")
public class PnsPGeneral implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID_PARAMETRO")
	private Long idParametro;

	@Column(name ="CODIGO_PARAMETRO")
	private String codigoParametro;

	@Column(name ="DESC_PARAMETRO")
	private String descrParametro;
	
	@Column(name ="VALOR_PARAMETRO")
	private String valorParametro;
	
	@Column(name ="ID_ESTADO")
	private Long idEstado;

	public Long getIdParametro() {
		return idParametro;
	}

	public void setIdParametro(Long idParametro) {
		this.idParametro = idParametro;
	}

	public String getCodigoParametro() {
		return codigoParametro;
	}

	public void setCodigoParametro(String codigoParametro) {
		this.codigoParametro = codigoParametro;
	}

	public String getDescrParametro() {
		return descrParametro;
	}

	public void setDescrParametro(String descrParametro) {
		this.descrParametro = descrParametro;
	}

	public String getValorParametro() {
		return valorParametro;
	}

	public void setValorParametro(String valorParametro) {
		this.valorParametro = valorParametro;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	
	

}
