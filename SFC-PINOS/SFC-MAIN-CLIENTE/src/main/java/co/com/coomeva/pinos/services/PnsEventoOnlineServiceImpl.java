package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.coomeva.pinos.domain.PnsEventoOnline;
import co.com.coomeva.pinos.repository.PnsEventoOnlineRepository;

@Service
public class PnsEventoOnlineServiceImpl implements IPnsEventoOnlineService {
	
	@Autowired
	private PnsEventoOnlineRepository eventoOnlineRepository;
	
	public List<PnsEventoOnline> findAll() {
		return (List<PnsEventoOnline>) eventoOnlineRepository.findAll();
	}

	public PnsEventoOnline save(PnsEventoOnline eventoOnline) {
		return eventoOnlineRepository.save(eventoOnline);
	}


	public PnsEventoOnline findById(Long id) {
		return eventoOnlineRepository.findById(id).orElse(null);
	}

}
