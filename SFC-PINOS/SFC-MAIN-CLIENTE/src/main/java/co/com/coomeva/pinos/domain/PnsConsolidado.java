package co.com.coomeva.pinos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import co.com.coomeva.pinos.DTO.PnsConsolidadoDTO;

@Entity
@Table(name ="PNS_CONSOLIDADO" , schema = "PINOS")
@IdClass(PnsConsolidadoId.class)
@NamedQuery(name ="PnsConsolidado.findAll", query = "SELECT a FROM PnsConsolidado a")
public class PnsConsolidado implements Serializable {
	
	@Id
	@Column(name ="TIPO_DOCUMENTO")
	private String tipoDocumento;
		
	@Id
	@Column(name = "NUMERO_DOCUMENTO")
	private String numeroDocumento;

	@Column(name = "SALDO_DISPONIBLE")
	private Long saldoDisponible;

	@Column(name = "SALDO_REDIMIDO")
	private Long saldoRedimido;

	@Column(name = "SALDO_VENCIDO")
	private Long saldoVencido;

	@Column(name = "SALDO_AVENCER")
	private Long saldoAvencer;

	@Column(name = "FECHA_VENCIMIENTO")
	private Long fechaVencimiento;

	@Column(name = "FECHA_MODIFICACION")
	private Long fechaModificacion;

	@Column(name = "USUARIO_CREA")
	private String usuarioCrea;

	@ManyToOne
	@JoinColumn(name = "idEstado")
	private PnsEstado pnsEstado;

	public PnsConsolidado(PnsConsolidadoDTO dto) {
		this.setTipoDocumento(dto.getTipoDocumento());
		this.setNumeroDocumento(dto.getNumeroDocumento());
	}

	public PnsConsolidado() {
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Long getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(Long saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public Long getSaldoRedimido() {
		return saldoRedimido;
	}

	public void setSaldoRedimido(Long saldoRedimido) {
		this.saldoRedimido = saldoRedimido;
	}

	public Long getSaldoVencido() {
		return saldoVencido;
	}

	public void setSaldoVencido(Long saldoVencido) {
		this.saldoVencido = saldoVencido;
	}

	public Long getSaldoAvencer() {
		return saldoAvencer;
	}

	public void setSaldoAvencer(Long saldoAvencer) {
		this.saldoAvencer = saldoAvencer;
	}

	public Long getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Long fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
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


	public PnsEstado getPnsEstado() {
		return pnsEstado;
	}

	public void setPnsEstado(PnsEstado pnsEstado) {
		this.pnsEstado = pnsEstado;
	}
	
	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "PnsConsolidado [tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento
				+ ", saldoDisponible=" + saldoDisponible + ", saldoRedimido=" + saldoRedimido + ", saldoVencido="
				+ saldoVencido + ", saldoAvencer=" + saldoAvencer + ", fechaVencimiento=" + fechaVencimiento
				+ ", fechaModificacion=" + fechaModificacion + ", usuarioCrea=" + usuarioCrea + ", pnsEstado="
				+ pnsEstado + ", getTipoDocumento()=" + getTipoDocumento() + ", getNumeroDocumento()="
				+ getNumeroDocumento() + ", getSaldoDisponible()=" + getSaldoDisponible() + ", getSaldoRedimido()="
				+ getSaldoRedimido() + ", getSaldoVencido()=" + getSaldoVencido() + ", getSaldoAvencer()="
				+ getSaldoAvencer() + ", getFechaVencimiento()=" + getFechaVencimiento() + ", getFechaModificacion()="
				+ getFechaModificacion() + ", getUsuarioCrea()=" + getUsuarioCrea() + ", getPnsEstado()="
				+ getPnsEstado() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



}
