package co.com.coomeva.pinos.domain;

import java.io.Serializable;

public class PnsConsolidadoId implements Serializable{
	
	
	private String tipoDocumento;
	private String numeroDocumento;
	
	public PnsConsolidadoId(String tipoDocumento, String numeroDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	
	public PnsConsolidadoId() {
		
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
