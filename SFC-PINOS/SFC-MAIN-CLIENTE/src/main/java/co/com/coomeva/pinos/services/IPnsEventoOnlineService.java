package co.com.coomeva.pinos.services;

import java.util.List;

import co.com.coomeva.pinos.domain.PnsEventoOnline;

public interface IPnsEventoOnlineService {
	
	public List <PnsEventoOnline> findAll();

	public PnsEventoOnline save (PnsEventoOnline eventoOnline);
	
	public PnsEventoOnline findById(Long id);
	
	
}
