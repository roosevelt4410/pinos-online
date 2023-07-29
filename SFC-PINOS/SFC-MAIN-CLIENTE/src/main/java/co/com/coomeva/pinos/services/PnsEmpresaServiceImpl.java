package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.coomeva.pinos.domain.PnsEmpresa;
import co.com.coomeva.pinos.repository.PnsEmpresaRepository;

@Service
public class PnsEmpresaServiceImpl implements IPnsEmpresaService {

	@Autowired
	private PnsEmpresaRepository pnsEmpresaRepository;
	
	public List<PnsEmpresa> findAll() {
		return (List<PnsEmpresa>) pnsEmpresaRepository.findAll();
		
	}

	public PnsEmpresa save(PnsEmpresa pnsEmpresa) {
		return pnsEmpresaRepository.save(pnsEmpresa);
	}

	public PnsEmpresa findById(Long idEmpresa) {
		return pnsEmpresaRepository.findById(idEmpresa).orElse(null);
	}

	public PnsEmpresa findByNitEmpresa(Long nitEmpresa) {
		return pnsEmpresaRepository.findByNitEmpresa(nitEmpresa);
	}

}
