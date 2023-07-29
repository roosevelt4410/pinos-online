package co.com.coomeva.pinos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.coomeva.pinos.domain.PnsLogParticipante;
import co.com.coomeva.pinos.domain.PnsLogParticipanteId;

@Repository
public interface PnsLogParticipanteRepository extends JpaRepository<PnsLogParticipante, PnsLogParticipanteId>{

}
