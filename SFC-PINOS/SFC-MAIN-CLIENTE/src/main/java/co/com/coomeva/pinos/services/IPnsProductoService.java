package co.com.coomeva.pinos.services;

import java.util.List;

import co.com.coomeva.pinos.domain.PnsProducto;

public interface IPnsProductoService {
	
	public List <PnsProducto> findAll();

	public PnsProducto save (PnsProducto pnsProducto);
	
	public PnsProducto findById(Long idProducto);
	
	public void delete(Long id);
	
	public PnsProducto findByCodigoProducto(String codigoProducto);
}
