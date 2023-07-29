package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.com.coomeva.pinos.domain.PnsLogAsignacionPinos;

public interface IPnsLogAsignacionPinosService {
	
	public List<PnsLogAsignacionPinos> findAll();
	
	public PnsLogAsignacionPinos findById(Long id);
	
	public PnsLogAsignacionPinos save(PnsLogAsignacionPinos log);
	
	public  Page <PnsLogAsignacionPinos> findAll(Pageable pageable);
	

}
