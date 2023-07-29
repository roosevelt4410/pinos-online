package co.com.coomeva.pinos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name ="PNS_PRODUCTO" , schema = "PINOS")
@NamedQuery(name ="PnsProducto.findAll", query = "SELECT a FROM PnsProducto a")
public class PnsProducto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6135211005055637641L;

	@Id
	@Column(name ="ID_PRODUCTO")
	private Long idProducto;
	
	@Column(name ="CODIGO_PRODUCTO")
	private String codigoProducto;
	
	@Column(name ="NOMBRE_PRODUCTO")
	private String nombreProducto;
	
	@ManyToOne
    @JoinColumn(name = "idEstado")
	private PnsEstado pnsEstado;
	
	@ManyToOne
    @JoinColumn(name = "idEmpresa")
	private PnsEmpresa pnsEmpresa;

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public PnsEstado getPnsEstado() {
		return pnsEstado;
	}

	public void setPnsEstado(PnsEstado pnsEstado) {
		this.pnsEstado = pnsEstado;
	}

	public PnsEmpresa getPnsEmpresa() {
		return pnsEmpresa;
	}

	public void setPnsEmpresa(PnsEmpresa pnsEmpresa) {
		this.pnsEmpresa = pnsEmpresa;
	}

	
}
