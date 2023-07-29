package co.com.coomeva.pinos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="PNS_LOG_PARTICIPANTE" , schema = "PINOS")
public class PnsLogParticipante implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name ="TIPO_DOCUMENTO")
	private String tipoDocumento;
	
	@Column(name = "NUMERO_DOCUMENTO")
	private String numeroDocumento;
	
	@Column(name = "FECHA_TRANSACCION")
	private String fechaTransaccion;

	@Column(name = "HORA_TRANSACCION")
	private String horaTransaccion;
	
	@Column(name = "RESPUESTA_SERVICIO")
	private String respuestaServicio;

	@Column(name = "RESPUESTA_DETALLE")
	private String respuestaDetalle;

	public String getRespuestaDetalle() {
		return respuestaDetalle;
	}

	public void setRespuestaDetalle(String respuestaDetalle) {
		this.respuestaDetalle = respuestaDetalle;
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

	public String getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(String fechaTransaccion) {
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
