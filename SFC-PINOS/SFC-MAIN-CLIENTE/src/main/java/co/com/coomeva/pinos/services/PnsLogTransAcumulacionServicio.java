package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.coomeva.pinos.domain.PnsLogTransAcumulacion;
import co.com.coomeva.pinos.repository.PnsLogTransAcumulacionRepository;



@Service
public class PnsLogTransAcumulacionServicio implements IPnsLogTransAcumulacionService{
	
	@Autowired
	private PnsLogTransAcumulacionRepository pnsLogTransAcumulacionRepository;

	public List<PnsLogTransAcumulacion> findAll() {
		return (List<PnsLogTransAcumulacion>) pnsLogTransAcumulacionRepository.findAll();
	}

	public PnsLogTransAcumulacion save(PnsLogTransAcumulacion pnsLogTransAcumulacion) {
		return pnsLogTransAcumulacionRepository.save(pnsLogTransAcumulacion);
	}

}
