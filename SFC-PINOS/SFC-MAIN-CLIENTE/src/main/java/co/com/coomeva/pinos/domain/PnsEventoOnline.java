package co.com.coomeva.pinos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PNS_EVENTO_ONLINE", schema = "PINOS")
public class PnsEventoOnline implements Serializable {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_EVENTO")
	private Long id;

	@Column(name = "PROCEDENCIA")
	private String procedencia;

	@Column(name = "APLICA_CONDICION")
	private String aplicaCondicion;

	@Column(name = "VALOR")
	private Long valor;

	@Column(name = "EQUIVALENCIA_PINO")
	private Long equivalencia;

	@Column(name = "NUMERO_PINO")
	private Long numeroPino;

	@Column(name = "FECHA_CREACION")
	private Long fechaCreacion;

	@ManyToOne
	@JoinColumn(name = "EMPRESA_ID_EMPRESA")
	private PnsEmpresa pnsEmpresa;

	@ManyToOne
	@JoinColumn(name = "idEstado")
	private PnsEstado pnsEstado;

	@ManyToOne
	@JoinColumn(name = "PRODUCTOS_ID_PRODUCTO")
	private PnsProducto pnsProducto;

	@Column(name = "CODIGO_OPERACION")
	private String codigoOperacion;

	@Column(name = "TIPO_VINCULACION")
	private String tipoVinculacion;

	@Column(name = "FECHA_MODIFICACION")
	private Long fechaModificacion;

	@Column(name = "USUARIO_CREA")
	private String usuarioCrea;
	
	@Column(name = "CODIGO_APLICACION")
	private String codigoAplicacion;

	public Long getId() {
		return id;
	}

	public String getCodigoAplicacion() {
		return codigoAplicacion;
	}

	public void setCodigoAplicacion(String codigoAplicacion) {
		this.codigoAplicacion = codigoAplicacion;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getAplicaCondicion() {
		return aplicaCondicion;
	}

	public void setAplicaCondicion(String aplicaCondicion) {
		this.aplicaCondicion = aplicaCondicion;
	}

	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	public Long getEquivalencia() {
		return equivalencia;
	}

	public void setEquivalencia(Long equivalencia) {
		this.equivalencia = equivalencia;
	}

	public Long getNumeroPino() {
		return numeroPino;
	}

	public void setNumeroPino(Long numeroPino) {
		this.numeroPino = numeroPino;
	}

	public Long getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Long fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public PnsEmpresa getPnsEmpresa() {
		return pnsEmpresa;
	}

	public void setPnsEmpresa(PnsEmpresa pnsEmpresa) {
		this.pnsEmpresa = pnsEmpresa;
	}

	public PnsEstado getPnsEstado() {
		return pnsEstado;
	}

	public void setPnsEstado(PnsEstado pnsEstado) {
		this.pnsEstado = pnsEstado;
	}

	public PnsProducto getPnsProducto() {
		return pnsProducto;
	}

	public void setPnsProducto(PnsProducto pnsProducto) {
		this.pnsProducto = pnsProducto;
	}

	public String getCodigoOperacion() {
		return codigoOperacion;
	}

	public void setCodigoOperacion(String codigoOperacion) {
		this.codigoOperacion = codigoOperacion;
	}

	public String getTipoVinculacion() {
		return tipoVinculacion;
	}

	public void setTipoVinculacion(String tipoVinculacion) {
		this.tipoVinculacion = tipoVinculacion;
	}

	public Long getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Long fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getUsuarioCrea() {
		return usuarioCrea;
	}

	public void setUsuarioCrea(String usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}

}