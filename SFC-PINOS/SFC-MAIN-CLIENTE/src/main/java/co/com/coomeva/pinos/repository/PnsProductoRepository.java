package co.com.coomeva.pinos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.coomeva.pinos.domain.PnsProducto;

public interface PnsProductoRepository extends JpaRepository <PnsProducto, Long>{
	
	PnsProducto findByCodigoProducto(String codigoProducto);

}
