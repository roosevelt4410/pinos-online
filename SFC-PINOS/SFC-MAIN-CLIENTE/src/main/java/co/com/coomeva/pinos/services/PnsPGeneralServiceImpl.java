package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.coomeva.pinos.domain.PnsPGeneral;
import co.com.coomeva.pinos.repository.PnsPGeneralRepository;

@Service
public class PnsPGeneralServiceImpl implements IPnsPGeneralService {

	@Autowired
	private PnsPGeneralRepository pnsPGeneralRepository;
	

	public List<PnsPGeneral> findAll() {
		return (List<PnsPGeneral>) pnsPGeneralRepository.findAll();	
	}


	public PnsPGeneral findById(Long idEstado) {
		return pnsPGeneralRepository.findById(idEstado).orElse(null);
	}

	
}
