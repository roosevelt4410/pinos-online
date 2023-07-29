package co.com.coomeva.pinos.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import co.com.coomeva.pinos.domain.PnsEmpresa;

public interface PnsEmpresaRepository extends JpaRepository <PnsEmpresa, Long>{

	 PnsEmpresa findByNitEmpresa(Long nitEmpresa);
}
