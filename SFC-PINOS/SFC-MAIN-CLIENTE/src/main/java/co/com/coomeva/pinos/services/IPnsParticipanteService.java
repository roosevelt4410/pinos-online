package co.com.coomeva.pinos.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tecnocom.mediosdepago.sfc.webservice.xsd.creacion.PeticionP7542600WS;
import com.tecnocom.mediosdepago.sfc.webservice.xsd.creacion.RespuestaP7542600WS;

import co.com.coomeva.pinos.domain.PnsParticipante;
import co.com.coomeva.pinos.domain.PnsParticipanteId;

public interface IPnsParticipanteService {

	public List<PnsParticipante> findAll();
	
	public PnsParticipante findById(PnsParticipanteId id);
	
	public PnsParticipante save(PnsParticipante pnsParticipante);
	
	public  Page <PnsParticipante> findAll(Pageable pageable);
	
	public RespuestaP7542600WS  consumirServicioAltaCuentas(PeticionP7542600WS msgEnvio);
}
