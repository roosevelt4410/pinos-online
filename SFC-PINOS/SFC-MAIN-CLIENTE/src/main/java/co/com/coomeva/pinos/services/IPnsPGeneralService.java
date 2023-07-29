package co.com.coomeva.pinos.services;

import java.util.List;

import co.com.coomeva.pinos.domain.PnsPGeneral;

public interface IPnsPGeneralService {
	
	public List <PnsPGeneral> findAll();
	
	public PnsPGeneral findById(Long idEmpresa); 

}
