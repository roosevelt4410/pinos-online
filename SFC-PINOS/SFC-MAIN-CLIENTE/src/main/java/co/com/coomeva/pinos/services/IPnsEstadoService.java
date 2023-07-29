package co.com.coomeva.pinos.services;

import java.util.List;

import co.com.coomeva.pinos.domain.PnsEstado;

public interface IPnsEstadoService {
	
	public List <PnsEstado> findAll();
	
	public PnsEstado findById(Long idEmpresa); 
	

}
