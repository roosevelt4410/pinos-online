package co.com.coomeva.pinos.DTO;

public class PnsTransAcumulacionDTO {
	
	private Long idTransaccion;

	private Long enteAcumulador;

	private String tipoDocumento;

	private String numeroDocumento;

	private String detalle2;

	private String primerNombre;

	private String segundoNombre;

	private String primerApellido;

	private String segundoApellido;
	
	private String generoCliente;

	private Long fechaNacimiento;

	private String email;

	private Long celular;

	private Long fechaCreacion;

//	private Long fechaVencimiento;
	
	private String descOperacion;

	//llega el id, se debe buscar en la bd
	private Long pnsEstadoTrans;

	private String numTransaccion;

//	null
	private Long fechaActualizacionBuc;

//	null
	private Long fechaEstado;

	public Long getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(Long idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public Long getEnteAcumulador() {
		return enteAcumulador;
	}

	public void setEnteAcumulador(Long enteAcumulador) {
		this.enteAcumulador = enteAcumulador;
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

	public String getDetalle2() {
		return detalle2;
	}

	public void setDetalle2(String detalle2) {
		this.detalle2 = detalle2;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primeroApellido) {
		this.primerApellido = primeroApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getGeneroCliente() {
		return generoCliente;
	}

	public void setGeneroCliente(String generoCliente) {
		this.generoCliente = generoCliente;
	}

	public Long getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Long fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public Long getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Long fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getDescOperacion() {
		return descOperacion;
	}

	public void setDescOperacion(String descOperacion) {
		this.descOperacion = descOperacion;
	}

	public Long getPnsEstadoTrans() {
		return pnsEstadoTrans;
	}

	public void setPnsEstadoTrans(Long pnsEstadoTrans) {
		this.pnsEstadoTrans = pnsEstadoTrans;
	}

	public String getNumTransaccion() {
		return numTransaccion;
	}

	public void setNumTransaccion(String numTransaccion) {
		this.numTransaccion = numTransaccion;
	}

	public Long getFechaActualizacionBuc() {
		return fechaActualizacionBuc;
	}

	public void setFechaActualizacionBuc(Long fechaActualizacionBuc) {
		this.fechaActualizacionBuc = fechaActualizacionBuc;
	}

	public Long getFechaEstado() {
		return fechaEstado;
	}

	public void setFechaEstado(Long fechaEstado) {
		this.fechaEstado = fechaEstado;
	}

	

}
