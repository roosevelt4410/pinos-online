package co.com.coomeva.pinos.services;

import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tecnocom.mediosdepago.sfc.webservice.creacion.SFCP7542600WS;
import com.tecnocom.mediosdepago.sfc.webservice.creacion.SFCP7542600WSPortType;
import com.tecnocom.mediosdepago.sfc.webservice.xsd.creacion.PeticionP7542600WS;
import com.tecnocom.mediosdepago.sfc.webservice.xsd.creacion.RespuestaP7542600WS;

import co.com.coomeva.pinos.domain.PnsParticipante;
import co.com.coomeva.pinos.domain.PnsParticipanteId;
import co.com.coomeva.pinos.repository.PnsParticipanteRepository;

@Service
public class PnsParticipanteServiceImpl implements IPnsParticipanteService{
	
	@Value("${pinos.url.servicio.altacuentas}")
	private String urlServicio;

	@Autowired
	private PnsParticipanteRepository pnsParticipanteRepository;
	
	
	
	public List<PnsParticipante> findAll() {
		return (List<PnsParticipante>) pnsParticipanteRepository.findAll();
	}

	
	public PnsParticipante findById(PnsParticipanteId pnsParticipanteId) {
		return pnsParticipanteRepository.findById(pnsParticipanteId).orElse(null);
	}

	
	public PnsParticipante save(PnsParticipante pnsParticipante) {
		return pnsParticipanteRepository.save(pnsParticipante);
	}

	
	public Page<PnsParticipante> findAll(Pageable pageable) {
		return pnsParticipanteRepository.findAll(pageable);
	}


	public RespuestaP7542600WS consumirServicioAltaCuentas(PeticionP7542600WS  msgEnvio) {
			RespuestaP7542600WS respuesta = new RespuestaP7542600WS();
			SFCP7542600WS SFCP7542600WSvariable = new SFCP7542600WS();
		    SFCP7542600WSPortType porType = SFCP7542600WSvariable.getSFCP7542600WSHttpEndpoint();	    
		    BindingProvider bindingProvider = (BindingProvider) porType;
		    Map<String, Object> contexto = bindingProvider.getRequestContext();
		    contexto.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, urlServicio);
		try {
		    respuesta = porType.runService(msgEnvio);
		} catch (com.tecnocom.mediosdepago.sfc.webservice.creacion.Exception_Exception e) {
		    e.printStackTrace();
		} 
		return respuesta;
	}
}
