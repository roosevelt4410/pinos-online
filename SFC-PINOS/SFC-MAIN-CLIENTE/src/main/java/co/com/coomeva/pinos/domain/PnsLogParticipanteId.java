package co.com.coomeva.pinos.domain;

import java.io.Serializable;

public class PnsLogParticipanteId implements Serializable{
	
	private String tipoDocumento;
	private String numeroDocumento;
	
	public PnsLogParticipanteId() {
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

	private static final long serialVersionUID = 1L;
}
