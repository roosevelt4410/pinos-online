package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.coomeva.pinos.domain.PnsProducto;
import co.com.coomeva.pinos.repository.PnsProductoRepository;

@Service
public class PnsProductoServiceImpl implements IPnsProductoService {
	
	@Autowired
	private PnsProductoRepository pnsProductoRepository;
	

	public List<PnsProducto> findAll() {
		return (List<PnsProducto>) pnsProductoRepository.findAll();
	}


	public PnsProducto save(PnsProducto pnsProducto) {
		return pnsProductoRepository.save(pnsProducto);
	}

	public PnsProducto findById(Long idProducto) {
		return pnsProductoRepository.findById(idProducto).orElse(null);
	}


	public void delete(Long id) {
		PnsProducto pnsProducto = pnsProductoRepository.findById(id).get();
		System.out.println(pnsProducto);
		pnsProductoRepository.delete(pnsProducto);
		
	}

	public PnsProducto findByCodigoProducto(String codigoProducto) {
		return pnsProductoRepository.findByCodigoProducto(codigoProducto);
	}

}
