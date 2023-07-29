package co.com.coomeva.pinos.services;

import java.util.List;

import co.com.coomeva.pinos.domain.PnsEmpresa;

public interface IPnsEmpresaService {
	
	public List <PnsEmpresa> findAll();
	
	public PnsEmpresa save (PnsEmpresa pnsEmpresa);
	
	public PnsEmpresa findById(Long idEmpresa); 
	
	public PnsEmpresa findByNitEmpresa(Long nitEmpresa);

}
