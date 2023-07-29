package co.com.coomeva.pinos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.coomeva.pinos.domain.PnsConsolidado;
import co.com.coomeva.pinos.domain.PnsConsolidadoId;

@Repository
public interface PnsConsolidadoRepository extends JpaRepository <PnsConsolidado, PnsConsolidadoId>{

}
