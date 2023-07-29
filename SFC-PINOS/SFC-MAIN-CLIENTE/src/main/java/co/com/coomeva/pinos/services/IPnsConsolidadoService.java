package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import co.com.coomeva.pinos.domain.PnsConsolidado;
import co.com.coomeva.pinos.domain.PnsConsolidadoId;

public interface IPnsConsolidadoService {

public List<PnsConsolidado> findAll();
	
	public PnsConsolidado findById(PnsConsolidadoId id);
	
	public PnsConsolidado save(PnsConsolidado pnsConsolidado);
	
	public  Page <PnsConsolidado> findAll(Pageable pageable);
	
	
}
