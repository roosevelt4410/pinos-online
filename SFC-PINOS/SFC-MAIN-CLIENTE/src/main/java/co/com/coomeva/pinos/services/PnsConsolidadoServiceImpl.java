package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.com.coomeva.pinos.domain.PnsConsolidado;
import co.com.coomeva.pinos.domain.PnsConsolidadoId;
import co.com.coomeva.pinos.repository.PnsConsolidadoRepository;

@Service
public class PnsConsolidadoServiceImpl implements IPnsConsolidadoService {

	@Autowired
	PnsConsolidadoRepository pnsConsolidadoRepository;
	
	
	public List<PnsConsolidado> findAll() {
		return (List<PnsConsolidado>) pnsConsolidadoRepository.findAll();
	}

	
	public PnsConsolidado findById(PnsConsolidadoId pnsConsolidadoId) {
		return pnsConsolidadoRepository.findById(pnsConsolidadoId).orElse(null);
	}

	
	public PnsConsolidado save(PnsConsolidado pnsConsolidado) {
		return pnsConsolidadoRepository.save(pnsConsolidado);
	}

	
	public Page<PnsConsolidado> findAll(Pageable pageable) {
		return pnsConsolidadoRepository.findAll(pageable);
	}

}
