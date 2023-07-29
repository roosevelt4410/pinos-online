package co.com.coomeva.pinos.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="PNS_LOG_ASIGNACION_PINOS" , schema = "PINOS")
public class PnsLogAsignacionPinos implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name ="TIPO_DOCUMENTO")
	private String tipoDocumento;
	
	@Id
	@Column(name = "NUMERO_DOCUMENTO")
	private String numeroDocumento;
	
	@Column(name = "FECHA_PROCESO")
	private int fechaTransaccion;

	@Column(name = "HORA_PROCESO")
	private String horaTransaccion;

	@Column(name = "COD_HISTORICO_SFC")
	private String historicoSFC;	

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

	public int getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(int fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	public String getHoraTransaccion() {
		return horaTransaccion;
	}

	public void setHoraTransaccion(String horaTransaccion) {
		this.horaTransaccion = horaTransaccion;
	}

	public String getHistoricoSFC() {
		return historicoSFC;
	}

	public void setHistoricoSFC(String historicoSFC) {
		this.historicoSFC = historicoSFC;
	}

	public String getRespuestaServicio() {
		return respuestaServicio;
	}

	public void setRespuestaServicio(String respuestaServicio) {
		this.respuestaServicio = respuestaServicio;
	}
	
	

}
