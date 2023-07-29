package co.com.coomeva.pinos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import co.com.coomeva.pinos.DTO.PnsTransAcumulacionDTO;

@Entity
@Table(name = "PNS_TRANS_ACUMULACION", schema = "PINOS")
public class PnsTransAcumulacion {

	@Id
	@Column(name = "ID_TRANSACCION")
	private Long idTransaccion;

	@Column(name = "ENTE_ACUMULADOR")
	private Long enteAcumulador;

	@Column(name = "CODIGO_APLICACION")
	private String codigoAplicacion;

	@Column(name = "ID_PROCESO")
	private Long idProceso;

	@Column(name = "CONSE_REPORTE_TRANS")
	private Long reporteTrans;

	@Column(name = "FECHA_PROCESO")
	private Long fechaProceso;

	@Column(name = "HORA_PROCESO")
	private String horaProceso;

	@Column(name = "TIPO_DOCUMENTO")
	private String tipoDocumento;

	@Column(name = "NUMERO_DOCUMENTO")
	private String numeroDocumento;

	@Column(name = "FECHA_TRANSACCION")
	private Long fechaTransaccion;

	@Column(name = "HORA_TRANSACCION")
	private String horaTransaccion;

	@Column(name = "VALOR_TRANSACCION")
	private Long valorTrasaccion;

	@Column(name = "CANTIDAD_TRANSACCION")
	private Long cantidadTransaccion;

	@Column(name = "TIPO_TRANSACCION")
	private String tipoTransaccion;

	@Column(name = "PAIS_TRANSACCION")
	private String paisTransaccion;

	@Column(name = "CIUDAD_TRANSACCION")
	private String ciudadTransaccion;

	@Column(name = "TIPO_COMERCIO_TRANS")
	private String tipoComercio;

	@Column(name = "ID_COMERCIO_TRANS")
	private String idComercioTrans;

	@Column(name = "CANAL_TRANSACCION")
	private String canalTransaccion;

	@Column(name = "PUNTO_CONTACTO")
	private String puntoContacto;

	@Column(name = "USUARIO")
	private String usuario;

	@Column(name = "MEDIO_PAGO")
	private String medioPago;

	@Column(name = "OBSERVACION")
	private String observacion;

	@Column(name = "COMPRA_INTERNACIONAL")
	private String compraInternacional;

	@Column(name = "TIPO_NOVEDAD")
	private String tipoNovedad;

	@Column(name = "EDETALLE_1")
	private String detalle1;

	@Column(name = "EDETALLE_2")
	private String detalle2;

	@Column(name = "NOMBRE_1")
	private String primerNombre;

	@Column(name = "NOMBRE_2")
	private String segundoNombre;

	@Column(name = "APELLIDO_1")
	private String primerApellido;

	@Column(name = "APELLIDO_2")
	private String segundoApellido;

	@Column(name = "GENERO_CLIENTE")
	private String generoCliente;

	@Column(name = "FECHA_NACIMIENTO")
	private Long fechaNacimiento;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "CELULAR")
	private Long celular;

	@Column(name = "TIPO_PERSONA")
	private String tipoPersona;

	@Column(name = "REPROCESO")
	private String reproceso;

	@Column(name = "FECHA_CREACION")
	private Long fechaCreacion;

	@Column(name = "TIPO_CARGUE")
	private String tipoCargue;

	@Column(name = "USUARIO_CREA")
	private String usuarioCrea;

	@Column(name = "TIPO_VINCULACION")
	private String tipoVinculacion;

	@Column(name = "COD_PRODUCTO")
	private String codProducto;

//poner relacion
	@ManyToOne
	@JoinColumn(name = "idEstado")
	private PnsEstado pnsEstado;

	@Column(name = "CANTIDAD_PINO")
	private Long cantidadPinos;

	@Column(name = "VALOR_PINO_PESOS")
	private Long valorPinosPeso;

	@Nullable
	@Column(name = "PINO_REDIMIDO")
	private Long pinoRedimido;

	@Column(name = "FECHA_VENCIMIENTO")
	private Long fechaVencimiento;

	@Nullable
	@Column(name = "ID_PROGRAMA_SFC")
	private Long idProgramaSfc;

	@Nullable
	@Column(name = "NUM_SEC_REGISTRO")
	private Long numSecRegistro;

	@Nullable
	@Column(name = "COD_HISTORICO_SFC")
	private Long codHistorico;

	@Column(name = "COD_OPERACION")
	private String codOperacion;

	@Column(name = "DESC_OPERACION")
	private String descOperacion;

	// poner relacion
	@ManyToOne
	@JoinColumn(name = "ID_ESTADO_TRANS")
	private PnsEstado pnsEstadoTrans;

	@Column(name = "NUM_TRANSACCION")
	private String numTransaccion;

	@Column(name = "COD_SECTOR")
	private Long codSector;

	@Nullable
	@Column(name = "NOMBRE_ARCHIVO")
	private String nombreArchivo;

	@Column(name = "FECHA_ACTUALIZA_BUC")
	private Long fechaActualizacionBuc;

	@Column(name = "FECHA_ESTADOS")
	private Long fechaEstado;
	
	public PnsTransAcumulacion(PnsTransAcumulacionDTO dto) {
		
		this.setIdTransaccion(dto.getIdTransaccion());
		this.setEnteAcumulador(dto.getEnteAcumulador());
		this.setTipoDocumento(dto.getTipoDocumento());
		this.setNumeroDocumento(dto.getNumeroDocumento());
		this.setDetalle2(dto.getDetalle2());
		this.setPrimerNombre(dto.getPrimerNombre());
		this.setSegundoNombre(dto.getSegundoNombre());
		this.setPrimerApellido(dto.getPrimerApellido());
		this.setSegundoApellido(dto.getSegundoApellido());
		this.setGeneroCliente(dto.getGeneroCliente());
		this.setFechaNacimiento(dto.getFechaNacimiento());
		this.setEmail(dto.getEmail());
		this.setCelular(dto.getCelular());
		this.setFechaCreacion(dto.getFechaCreacion());
		this.setDescOperacion(dto.getDescOperacion());
		this.setNumTransaccion(dto.getNumTransaccion());
		
	}
	
	

	public PnsTransAcumulacion() {
		super();
	}



	public Long getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(Long idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public Long getEnteAcumulagor() {
		return enteAcumulador;
	}

	public void setEnteAcumulagor(Long enteAcumulador) {
		this.enteAcumulador = enteAcumulador;
	}

	public String getCodigoAplicacion() {
		return codigoAplicacion;
	}

	public void setCodigoAplicacion(String codigoAplicacion) {
		this.codigoAplicacion = codigoAplicacion;
	}

	public Long getIdProceso() {
		return idProceso;
	}

	public void setIdProceso(Long idProceso) {
		this.idProceso = idProceso;
	}

	public Long getReporteTrans() {
		return reporteTrans;
	}

	public void setReporteTrans(Long reporteTrans) {
		this.reporteTrans = reporteTrans;
	}

	public Long getFechaProceso() {
		return fechaProceso;
	}

	public void setFechaProceso(Long fechaProceso) {
		this.fechaProceso = fechaProceso;
	}

	public String getHoraProceso() {
		return horaProceso;
	}

	public void setHoraProceso(String horaProceso) {
		this.horaProceso = horaProceso;
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

	public Long getValorTrasaccion() {
		return valorTrasaccion;
	}

	public void setValorTrasaccion(Long valorTrasaccion) {
		this.valorTrasaccion = valorTrasaccion;
	}

	public Long getCantidadTransaccion() {
		return cantidadTransaccion;
	}

	public void setCantidadTransaccion(Long cantidadTransaccion) {
		this.cantidadTransaccion = cantidadTransaccion;
	}

	public String getTipoTransaccion() {
		return tipoTransaccion;
	}

	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}

	public String getPaisTransaccion() {
		return paisTransaccion;
	}

	public void setPaisTransaccion(String paisTransaccion) {
		this.paisTransaccion = paisTransaccion;
	}

	public String getCiudadTransaccion() {
		return ciudadTransaccion;
	}

	public void setCiudadTransaccion(String ciudadTransaccion) {
		this.ciudadTransaccion = ciudadTransaccion;
	}

	public String getTipoComercio() {
		return tipoComercio;
	}

	public void setTipoComercio(String tipoComercio) {
		this.tipoComercio = tipoComercio;
	}

	public String getIdComercioTrans() {
		return idComercioTrans;
	}

	public void setIdComercioTrans(String idComercioTrans) {
		this.idComercioTrans = idComercioTrans;
	}

	public String getCanalTransaccion() {
		return canalTransaccion;
	}

	public void setCanalTransaccion(String canalTransaccion) {
		this.canalTransaccion = canalTransaccion;
	}

	public String getPuntoContacto() {
		return puntoContacto;
	}

	public void setPuntoContacto(String puntoContacto) {
		this.puntoContacto = puntoContacto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getCompraInternacional() {
		return compraInternacional;
	}

	public void setCompraInternacional(String compraInternacional) {
		this.compraInternacional = compraInternacional;
	}

	public String getTipoNovedad() {
		return tipoNovedad;
	}

	public void setTipoNovedad(String tipoNovedad) {
		this.tipoNovedad = tipoNovedad;
	}

	public String getDetalle1() {
		return detalle1;
	}

	public void setDetalle1(String detalle1) {
		this.detalle1 = detalle1;
	}

	public String getDetalle2() {
		return detalle2;
	}

	public void setDetalle2(String detalle2) {
		this.detalle2 = detalle2;
	}

	public Long getEnteAcumulador() {
		return enteAcumulador;
	}

	public void setEnteAcumulador(Long enteAcumulador) {
		this.enteAcumulador = enteAcumulador;
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

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
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

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getReproceso() {
		return reproceso;
	}

	public void setReproceso(String reproceso) {
		this.reproceso = reproceso;
	}

	public Long getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Long fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getTipoCargue() {
		return tipoCargue;
	}

	public void setTipoCargue(String tipoCargue) {
		this.tipoCargue = tipoCargue;
	}

	public String getUsuarioCrea() {
		return usuarioCrea;
	}

	public void setUsuarioCrea(String usuarioCrea) {
		this.usuarioCrea = usuarioCrea;
	}

	public String getTipoVinculacion() {
		return tipoVinculacion;
	}

	public void setTipoVinculacion(String tipoVinculacion) {
		this.tipoVinculacion = tipoVinculacion;
	}

	public String getCodProducto() {
		return codProducto;
	}

	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}

	public Long getCantidadPinos() {
		return cantidadPinos;
	}

	public void setCantidadPinos(Long cantidadPinos) {
		this.cantidadPinos = cantidadPinos;
	}

	public Long getValorPinosPeso() {
		return valorPinosPeso;
	}

	public void setValorPinosPeso(Long valorPinosPeso) {
		this.valorPinosPeso = valorPinosPeso;
	}

	public Long getPinoRedimido() {
		return pinoRedimido;
	}

	public void setPinoRedimido(Long pinoRedimido) {
		this.pinoRedimido = pinoRedimido;
	}

	public Long getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Long fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Long getIdProgramaSfc() {
		return idProgramaSfc;
	}

	public void setIdProgramaSfc(Long idProgramaSfc) {
		this.idProgramaSfc = idProgramaSfc;
	}

	public Long getNumSecRegistro() {
		return numSecRegistro;
	}

	public void setNumSecRegistro(Long numSecRegistro) {
		this.numSecRegistro = numSecRegistro;
	}

	public Long getCodHistorico() {
		return codHistorico;
	}

	public void setCodHistorico(Long codHistorico) {
		this.codHistorico = codHistorico;
	}

	public String getCodOperacion() {
		return codOperacion;
	}

	public void setCodOperacion(String codOperacion) {
		this.codOperacion = codOperacion;
	}

	public String getDescOperacion() {
		return descOperacion;
	}

	public void setDescOperacion(String descOperacion) {
		this.descOperacion = descOperacion;
	}

	public PnsEstado getPnsEstadoTrans() {
		return pnsEstadoTrans;
	}

	public void setPnsEstadoTrans(PnsEstado pnsEstadoTrans) {
		this.pnsEstadoTrans = pnsEstadoTrans;
	}

	public String getNumTransaccion() {
		return numTransaccion;
	}

	public void setNumTransaccion(String numTransaccion) {
		this.numTransaccion = numTransaccion;
	}

	public Long getCodSector() {
		return codSector;
	}

	public void setCodSector(Long codSector) {
		this.codSector = codSector;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
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

	public PnsEstado getPnsEstado() {
		return pnsEstado;
	}

	public void setPnsEstado(PnsEstado pnsEstado) {
		this.pnsEstado = pnsEstado;
	}

	@Override
	public String toString() {
		return "PnsTransAcumulacion [idTransaccion=" + idTransaccion + ", enteAcumulador=" + enteAcumulador
				+ ", codigoAplicacion=" + codigoAplicacion + ", idProceso=" + idProceso + ", reporteTrans="
				+ reporteTrans + ", fechaProceso=" + fechaProceso + ", horaProceso=" + horaProceso + ", tipoDocumento="
				+ tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", fechaTransaccion=" + fechaTransaccion
				+ ", horaTransaccion=" + horaTransaccion + ", valorTrasaccion=" + valorTrasaccion
				+ ", cantidadTransaccion=" + cantidadTransaccion + ", tipoTransaccion=" + tipoTransaccion
				+ ", paisTransaccion=" + paisTransaccion + ", ciudadTransaccion=" + ciudadTransaccion
				+ ", tipoComercio=" + tipoComercio + ", idComercioTrans=" + idComercioTrans + ", canalTransaccion="
				+ canalTransaccion + ", puntoContacto=" + puntoContacto + ", usuario=" + usuario + ", medioPago="
				+ medioPago + ", observacion=" + observacion + ", compraInternacional=" + compraInternacional
				+ ", tipoNovedad=" + tipoNovedad + ", detalle1=" + detalle1 + ", detalle2=" + detalle2
				+ ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido="
				+ primerApellido + ", segundoApellido=" + segundoApellido + ", generoCliente=" + generoCliente
				+ ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + ", celular=" + celular
				+ ", tipoPersona=" + tipoPersona + ", reproceso=" + reproceso + ", fechaCreacion=" + fechaCreacion
				+ ", tipoCargue=" + tipoCargue + ", usuarioCrea=" + usuarioCrea + ", tipoVinculacion=" + tipoVinculacion
				+ ", codProducto=" + codProducto + ", pnsEstado=" + pnsEstado + ", cantidadPinos=" + cantidadPinos
				+ ", valorPinosPeso=" + valorPinosPeso + ", pinoRedimido=" + pinoRedimido + ", fechaVencimiento="
				+ fechaVencimiento + ", idProgramaSfc=" + idProgramaSfc + ", numSecRegistro=" + numSecRegistro
				+ ", codHistorico=" + codHistorico + ", codOperacion=" + codOperacion + ", descOperacion="
				+ descOperacion + ", pnsEstadoTrans=" + pnsEstadoTrans + ", numTransaccion=" + numTransaccion
				+ ", codSector=" + codSector + ", nombreArchivo=" + nombreArchivo + ", fechaActualizacionBuc="
				+ fechaActualizacionBuc + ", fechaEstado=" + fechaEstado + "]";
	}
	
	

}
