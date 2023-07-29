package co.com.coomeva.pinos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.coomeva.pinos.domain.PnsLogAsignacionPinos;

@Repository
public interface PnsLogAsignacionPinosRepository extends JpaRepository<PnsLogAsignacionPinos, Long>{

}
