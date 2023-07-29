package co.com.coomeva.pinos.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class PnsUsuarioLogin implements Serializable{

	@Id
	@Column(name ="CONS_LOGN")
	private Integer consLogn;
	
	@Column(name ="USUARIO_INGRESO")
	private String usuarioIngreso;
	
	@Column(name ="FECHA")
	private Date fecha;
	
	@Column(name ="IP_EQUIPO")
	private String ipEquipo;
	
	@Column(name ="OPERACION")
	private Character operacion;
	
	
	
	public Integer getConsLogn() {
		return consLogn;
	}



	public void setConsLogn(Integer consLogn) {
		this.consLogn = consLogn;
	}



	public String getUsuarioIngreso() {
		return usuarioIngreso;
	}



	public void setUsuarioIngreso(String usuarioIngreso) {
		this.usuarioIngreso = usuarioIngreso;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String getIpEquipo() {
		return ipEquipo;
	}



	public void setIpEquipo(String ipEquipo) {
		this.ipEquipo = ipEquipo;
	}



	public Character getOperacion() {
		return operacion;
	}



	public void setOperacion(Character operacion) {
		this.operacion = operacion;
	}



	private static final long serialVersionUID = 1L;
}
