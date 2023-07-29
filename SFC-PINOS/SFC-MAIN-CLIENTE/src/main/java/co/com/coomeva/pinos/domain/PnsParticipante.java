package co.com.coomeva.pinos.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import co.com.coomeva.pinos.DTO.PnsParticipanteDTO;

@Entity
@Table(name ="PNS_PARTICIPANTE" , schema = "PINOS")
@IdClass(PnsParticipanteId.class)
@NamedQuery(name ="PnsParticipante.findAll", query = "SELECT a FROM PnsParticipante a")
public class PnsParticipante implements Serializable{

	@Id
	@Column(name ="TIPO_DOCUMENTO")
	private String tipoDocumento;
	
	@Id
	@Column(name = "NUMERO_DOCUMENTO")
	private String numeroDocumento;
	
	@Column(name = "NOMBRE_1")
	private String primerNombre;
	
	@Column(name = "NOMBRE_2")
	private String segundoNombre;
	
	@Column(name = "APELLIDO_1")
	private String primerApellido;
	
	@Column(name = "APELLIDO_2")
	private String segundoApellido;
	
	@Column(name = "GENERO")
	private String genero;
	
	@Column(name = "FECHA_NACIMIENTO")
	private Long fechaNacimiento;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "CELULAR")
	private Long celular;
	
	@Column(name = "TIPO_PERSONA")
	private String tipoPersona;
	
	@Column(name = "ESTADO")
	private Long estado;
	
	@Column(name = "TIPO_VINCULACION")
	private Character tipoVinculacion;
	
	@Column(name = "FECHA_MODIFICACION")
	private Long fechaModificacion;
	
	@Column(name = "INSCRIPCION")
	private Character inscripcion;
	
	@Column(name = "HABEAS_DATA")
	private Character habeasData;
	
	@Column(name = "FECHA_INSCRIPCION")
	private Long fechaInscripcion;
	
	@Column(name = "USUARIO")
	private String usuario;
	
	@Column(name = "FECHA_ESTADO")
	private Long fechaEstado;
	
	public PnsParticipante(PnsParticipanteDTO dto) {
		
		this.setTipoDocumento(dto.getTipoDocumento());
		this.setNumeroDocumento(dto.getNumeroDocumento());
		this.setPrimerNombre(dto.getPrimerNombre());
		this.setSegundoNombre(dto.getSegundoNombre());
		this.setPrimerApellido(dto.getPrimerApellido());
		this.setSegundoApellido(dto.getSegundoApellido());
		this.setGenero(dto.getGenero());
		this.setFechaNacimiento(dto.getFechaNacimiento());
		this.setEmail(dto.getEmail());
		this.setCelular(dto.getCelular());
		this.setFechaEstado(dto.getFechaEstado());
		
	}
	
	public PnsParticipante() {
		// TODO Auto-generated constructor stub
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

	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
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



	public Long getEstado() {
		return estado;
	}



	public void setEstado(Long estado) {
		this.estado = estado;
	}



	public Character getTipoVinculacion() {
		return tipoVinculacion;
	}



	public void setTipoVinculacion(Character tipoVinculacion) {
		this.tipoVinculacion = tipoVinculacion;
	}



	public Long getFechaModificacion() {
		return fechaModificacion;
	}



	public void setFechaModificacion(Long fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}



	public Character getInscripcion() {
		return inscripcion;
	}



	public void setInscripcion(Character inscripcion) {
		this.inscripcion = inscripcion;
	}



	public Character getHabeasData() {
		return habeasData;
	}



	public void setHabeasData(Character habeasData) {
		this.habeasData = habeasData;
	}



	public Long getFechaInscripcion() {
		return fechaInscripcion;
	}



	public void setFechaInscripcion(Long fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}



	public Long getFechaEstado() {
		return fechaEstado;
	}



	public void setFechaEstado(Long fechaEstado) {
		this.fechaEstado = fechaEstado;
	}
	
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "PnsParticipante [tipoDocumento=" + tipoDocumento + ", numeroDocumento=" + numeroDocumento
				+ ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", primerApellido="
				+ primerApellido + ", segundoApellido=" + segundoApellido + ", genero=" + genero + ", fechaNacimiento="
				+ fechaNacimiento + ", email=" + email + ", celular=" + celular + ", tipoPersona=" + tipoPersona
				+ ", estado=" + estado + ", tipoVinculacion=" + tipoVinculacion + ", fechaModificacion="
				+ fechaModificacion + ", inscripcion=" + inscripcion + ", habeasData=" + habeasData
				+ ", fechaInscripcion=" + fechaInscripcion + ", usuario=" + usuario + ", fechaEstado=" + fechaEstado
				+ "]";
	}
	
	
}
