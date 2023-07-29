package co.com.coomeva.pinos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import co.com.coomeva.pinos.domain.PnsParticipante;
import co.com.coomeva.pinos.domain.PnsParticipanteId;

@Repository
public interface PnsParticipanteRepository extends JpaRepository<PnsParticipante, PnsParticipanteId>{
	
}
