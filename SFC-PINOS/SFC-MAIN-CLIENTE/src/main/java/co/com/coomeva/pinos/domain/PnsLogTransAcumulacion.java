package co.com.coomeva.pinos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PNS_LOG_TRANS_ACUMULACION", schema = "PINOS")
public class PnsLogTransAcumulacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "TIPO_DOCUMENTO")
	private String tipoDocumento;
	
	@Column(name = "NUMERO_DOCUMENTO")
	private String numeroDocumento;

	@Column(name = "FECHA_TRANSACCION")
	private Long fechaTransaccion;
	
	@Column(name = "HORA_TRANSACCION")
	private String horaTransaccion;
	
	@Column(name = "RESPUESTA_SERVICIO")
	private String respuestaServicio;

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

	public Long getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(Long fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	public String getHoraTransaccion() {
		return horaTransaccion;
	}

	public void setHoraTransaccion(String horaTransaccion) {
		this.horaTransaccion = horaTransaccion;
	}

	public String getRespuestaServicio() {
		return respuestaServicio;
	}

	public void setRespuestaServicio(String respuestaServicio) {
		this.respuestaServicio = respuestaServicio;
	}
	
}
