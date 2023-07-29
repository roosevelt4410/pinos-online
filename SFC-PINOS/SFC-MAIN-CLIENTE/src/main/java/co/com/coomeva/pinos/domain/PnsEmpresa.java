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
@Table(name ="PNS_EMPRESA" , schema = "PINOS")
@NamedQuery(name ="PnsEmpresa.findAll", query = "SELECT a FROM PnsEmpresa a")
public class PnsEmpresa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7072566230764826606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="ID_EMPRESA")
	private Long idEmpresa;

	@Column(name ="NIT_EMPRESA")
	private Long nitEmpresa;

	@Column(name ="NOMBRE_EMPRESA")
	private String nombreEmpresa;

	@Column(name ="ID_ESTADO")
	private Long idEstado;

	@Column(name ="TIPO_EMPRESA")
	private String tipoEmpresa;
	
	
	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public Long getNitEmpresa() {
		return nitEmpresa;
	}

	public void setNitEmpresa(Long nitEmpresa) {
		this.nitEmpresa = nitEmpresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public Long getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}


}
