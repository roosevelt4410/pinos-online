package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.com.coomeva.pinos.domain.PnsLogParticipante;
import co.com.coomeva.pinos.domain.PnsLogParticipanteId;
import co.com.coomeva.pinos.repository.PnsLogParticipanteRepository;

@Service
public class PnsLogTransAcumulacionImpl implements IPnsLogParticipanteService{

	@Autowired
	private PnsLogParticipanteRepository logParticipanteRepository;
	
	
	public List<PnsLogParticipante> findAll() {
		return (List<PnsLogParticipante>) logParticipanteRepository.findAll();
	}

	
	public PnsLogParticipante findById(PnsLogParticipanteId id) {
		return logParticipanteRepository.findById(id).get();
	}

	
	public PnsLogParticipante save(PnsLogParticipante pnsLogTransAcumulacion) {
		return logParticipanteRepository.save(pnsLogTransAcumulacion);
	}

	
	public Page<PnsLogParticipante> findAll(Pageable pageable) {
		return logParticipanteRepository.findAll(pageable);
	}
	
	

}
