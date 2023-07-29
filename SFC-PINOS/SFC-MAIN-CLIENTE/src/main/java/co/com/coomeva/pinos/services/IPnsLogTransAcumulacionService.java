package co.com.coomeva.pinos.services;

import java.util.List;

import co.com.coomeva.pinos.domain.PnsLogTransAcumulacion;

public interface IPnsLogTransAcumulacionService {

	public List <PnsLogTransAcumulacion> findAll();
	
	public PnsLogTransAcumulacion save(PnsLogTransAcumulacion pnsLogTransAcumulacion);
	

}
