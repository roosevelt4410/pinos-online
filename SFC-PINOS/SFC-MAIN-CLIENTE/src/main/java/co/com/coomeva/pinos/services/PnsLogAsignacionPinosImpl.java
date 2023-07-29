package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.com.coomeva.pinos.domain.PnsLogAsignacionPinos;
import co.com.coomeva.pinos.repository.PnsLogAsignacionPinosRepository;

@Service
public class PnsLogAsignacionPinosImpl implements IPnsLogAsignacionPinosService{

	@Autowired
	private PnsLogAsignacionPinosRepository asignacionPinosRepository;
	
	
	public List<PnsLogAsignacionPinos> findAll() {
		return (List<PnsLogAsignacionPinos>) asignacionPinosRepository.findAll();
	}

	
	public PnsLogAsignacionPinos findById(Long id) {
		return asignacionPinosRepository.findById(id).get();
	}

	
	public PnsLogAsignacionPinos save(PnsLogAsignacionPinos logAsignacionPinos) {
		return asignacionPinosRepository.save(logAsignacionPinos);
	}

	
	public Page<PnsLogAsignacionPinos> findAll(Pageable pageable) {
		return asignacionPinosRepository.findAll(pageable);
	}

	
	

}
