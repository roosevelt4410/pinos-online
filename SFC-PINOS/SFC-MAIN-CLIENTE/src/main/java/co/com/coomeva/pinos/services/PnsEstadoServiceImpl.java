package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.coomeva.pinos.domain.PnsEstado;
import co.com.coomeva.pinos.repository.PnsEstadoRepository;

@Service
public class PnsEstadoServiceImpl implements IPnsEstadoService {

	@Autowired
	private PnsEstadoRepository pnsEstadoRepository;
	
	
	public List<PnsEstado> findAll() {
		return (List<PnsEstado>) pnsEstadoRepository.findAll();	
	}


	public PnsEstado findById(Long idEstado) {
		return pnsEstadoRepository.findById(idEstado).orElse(null);
	}


}
