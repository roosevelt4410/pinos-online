package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.com.coomeva.pinos.domain.PnsLogParticipante;
import co.com.coomeva.pinos.domain.PnsLogParticipanteId;

public interface IPnsLogParticipanteService {
	
	public List<PnsLogParticipante> findAll();
	
	public PnsLogParticipante findById(PnsLogParticipanteId id);
	
	public PnsLogParticipante save(PnsLogParticipante pnsLogParticipante);
	
	public  Page <PnsLogParticipante> findAll(Pageable pageable);
	

}
