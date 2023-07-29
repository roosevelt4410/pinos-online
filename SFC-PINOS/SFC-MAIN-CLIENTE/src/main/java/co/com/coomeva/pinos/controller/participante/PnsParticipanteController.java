package co.com.coomeva.pinos.controller.participante;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.xml.bind.JAXBElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnocom.mediosdepago.sfc.webservice.xsd.creacion.PeticionP7542600WS;
import com.tecnocom.mediosdepago.sfc.webservice.xsd.creacion.RespuestaP7542600WS;

import co.com.coomeva.pinos.DTO.PnsParticipanteDTO;
import co.com.coomeva.pinos.constants.PnsParticipanteConstants;
import co.com.coomeva.pinos.domain.PnsLogParticipante;
import co.com.coomeva.pinos.domain.PnsPGeneral;
import co.com.coomeva.pinos.domain.PnsParticipante;
import co.com.coomeva.pinos.domain.PnsParticipanteId;

import co.com.coomeva.pinos.services.IPnsLogParticipanteService;
import co.com.coomeva.pinos.services.IPnsPGeneralService;
import co.com.coomeva.pinos.services.IPnsParticipanteService;
import co.com.coomeva.pinos.util.DateFormatter;
import ease.soapwebservices.commons.xsd.creacion.EaseDate;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class PnsParticipanteController {

	@Value("${pinos.asociado.ENTIDAD}")
	private String entidad;

	@Value("${pinos.asociado.IDIOMA}")
	private String es;

	@Value("${pinos.asociado.OFICINA}")
	private String oficina;

	@Value("${pinos.asociado.PASSWORD}")
	private String pass;

	@Value("${pinos.asociado.OPERACION}")
	private String operacion;

	@Value("${pinos.asociado.USUARIO}")
	private String user;

	@Value("${pinos.asociado.PROGR}")
	private String progr;

	@Value("${pinos.asociado.DESCC}")
	private String descc;

	@Autowired
	private IPnsParticipanteService pnsParticipanteService;

	@Autowired
	private IPnsLogParticipanteService logParticipanteService;
	
	@Autowired
	private IPnsPGeneralService pnsGeneralService;

	@PostMapping("/CreaAsociadoPinos")
	public ResponseEntity<?> create(@RequestBody PnsParticipanteDTO pnsParticipanteDTO) {

		PnsParticipante nuevoPnsParticipante = null;

		Map<String, Object> response = new HashMap();
		RespuestaP7542600WS respuestaWebService = new RespuestaP7542600WS();
		

		try {
			System.out.println(pnsParticipanteDTO.getTipoDocumento());
			String tipodocumentooooo = pnsParticipanteDTO.getTipoDocumento().equals("PS")?"PA":pnsParticipanteDTO.getTipoDocumento();
			PnsParticipanteId pnsParticipanteId = new PnsParticipanteId(tipodocumentooooo,
					pnsParticipanteDTO.getNumeroDocumento());
			PnsParticipante pnsParticipanteActual = new PnsParticipante();
			pnsParticipanteActual = pnsParticipanteService.findById(pnsParticipanteId);

			if (pnsParticipanteActual == null) {
				
				pnsParticipanteDTO.setTipoDocumento(tipodocumentooooo);
				pnsParticipanteActual = new PnsParticipante(pnsParticipanteDTO);

				pnsParticipanteActual.setTipoPersona(PnsParticipanteConstants.TIPO_PERSONA);
				pnsParticipanteActual.setEstado(PnsParticipanteConstants.ESTADO);
				pnsParticipanteActual.setTipoVinculacion(PnsParticipanteConstants.TIPO_VINCULACION);
				pnsParticipanteActual.setFechaModificacion(PnsParticipanteConstants.FECHA_MODIFICACION);
				pnsParticipanteActual.setInscripcion(PnsParticipanteConstants.INSCRIPCION);
				pnsParticipanteActual.setHabeasData(PnsParticipanteConstants.HABEAS_DATA);
				pnsParticipanteActual.setUsuario(PnsParticipanteConstants.USUARIO);
				pnsParticipanteActual.setFechaInscripcion(DateFormatter.actualDateLongYYYYMMDD());
				System.out.println(pnsParticipanteActual.toString());

				nuevoPnsParticipante = pnsParticipanteService.save(pnsParticipanteActual);

				response.put("Mensaje", "El participante ha sido creado con exito!");

			} else {

				pnsParticipanteActual.setPrimerNombre(pnsParticipanteDTO.getPrimerNombre());
				pnsParticipanteActual.setSegundoNombre(pnsParticipanteDTO.getSegundoNombre());
				pnsParticipanteActual.setPrimerApellido(pnsParticipanteDTO.getPrimerApellido());
				pnsParticipanteActual.setSegundoApellido(pnsParticipanteDTO.getPrimerApellido());
				pnsParticipanteActual.setGenero(pnsParticipanteDTO.getGenero());
				pnsParticipanteActual.setFechaNacimiento(pnsParticipanteDTO.getFechaNacimiento());
				pnsParticipanteActual.setEmail(pnsParticipanteDTO.getEmail());
				pnsParticipanteActual.setCelular(pnsParticipanteDTO.getCelular());
				pnsParticipanteActual.setFechaEstado(pnsParticipanteDTO.getFechaEstado());
				pnsParticipanteActual.setFechaModificacion(DateFormatter.actualDateLongYYYYMMDD());

				nuevoPnsParticipante = pnsParticipanteService.save(pnsParticipanteActual);

				response.put("Mensaje", "El participante ha sido editado con exito!");

			}

		} catch (DataAccessException e) {
			response.put("Mensaje", "No se logró finalizar la transacción");
			response.put("Error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
		
		try {
			
			// CREACIÓN DEL ALTA DE CUENTA A TRAVES DEL SFC P7542600
			respuestaWebService = new RespuestaP7542600WS();
			respuestaWebService = service(nuevoPnsParticipante);

			// CREACION LOG PARTICIPANTE
			PnsLogParticipante logParticipante = new PnsLogParticipante();
			String tipodocumentooooo = nuevoPnsParticipante.getTipoDocumento().equals("PA")?"PS":nuevoPnsParticipante.getTipoDocumento();
			logParticipante.setTipoDocumento(tipodocumentooooo);
			logParticipante.setNumeroDocumento(nuevoPnsParticipante.getNumeroDocumento());
			logParticipante.setFechaTransaccion(DateFormatter.actualDateStringYYYYMMDD());
			logParticipante.setHoraTransaccion(DateFormatter.actualTimeHHMMSS());
			logParticipante.setRespuestaServicio(respuestaWebService.getRetorno().getValue());
			logParticipante.setRespuestaDetalle(respuestaWebService.getDescRetorno().getValue());
			logParticipanteService.save(logParticipante);
		} catch (DataAccessException e) {
			response.put("Mensaje", "Error al realizar el guardado del Log en la base de datos");
			response.put("Error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if (Objects.isNull(respuestaWebService)) {
			response.put("Mensaje respuesta alta de cuentas", "Falló la petición al webservice");
		} else {
			response.put("Codigo retorno alta de cuentas", respuestaWebService.getRetorno().getValue());
			response.put("Mensaje respuesta alta de cuentas", respuestaWebService.getDescRetorno().getValue());
			
		}

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
	}

	private RespuestaP7542600WS service(PnsParticipante participante) {
		
		PeticionP7542600WS mensajeEnvioo = new PeticionP7542600WS();
		RespuestaP7542600WS respuesta = new RespuestaP7542600WS();
		ease.soapwebservices.sfcnewage.xsd.creacion.ObjectFactory ofPeticionNewAge = new ease.soapwebservices.sfcnewage.xsd.creacion.ObjectFactory();

		JAXBElement<String> codEntid = ofPeticionNewAge.createPeticionNewAgeEntidad(entidad);
		mensajeEnvioo.setEntidad(codEntid);

		JAXBElement<String> idioma = ofPeticionNewAge.createPeticionNewAgeIdioma(es);
		mensajeEnvioo.setIdioma(idioma);

		JAXBElement<String> codOficina = ofPeticionNewAge.createPeticionNewAgeOficina(oficina);
		mensajeEnvioo.setOficina(codOficina);

		JAXBElement<String> password = ofPeticionNewAge.createPeticionNewAgePassword(pass);
		mensajeEnvioo.setPassword(password);

		JAXBElement<String> tipoOperacion = ofPeticionNewAge.createPeticionNewAgeTipoOperacion(operacion);
		mensajeEnvioo.setTipoOperacion(tipoOperacion);

		JAXBElement<String> usuario = ofPeticionNewAge.createPeticionNewAgeUsuario(user);
		mensajeEnvioo.setUsuario(usuario);
		
		mensajeEnvioo.setCodultex(25);

		String tipodocumentooooo = participante.getTipoDocumento().equals("PA")?"PS":participante.getTipoDocumento();
		String codcuenta = tipodocumentooooo + participante.getNumeroDocumento();
		
		com.tecnocom.mediosdepago.sfc.webservice.xsd.creacion.ObjectFactory ofregistro = new com.tecnocom.mediosdepago.sfc.webservice.xsd.creacion.ObjectFactory();
		
		
		EaseDate easedate = new EaseDate();
					
		JAXBElement<EaseDate> fecultex = ofregistro.createPeticionP7542600WSFecultex(easedate);
		mensajeEnvioo.setFecultex(fecultex);
		
		JAXBElement<String> codcuent = ofregistro.createPeticionP7542600WSBuscadorCodcuent(codcuenta);
		mensajeEnvioo.setCodcuent(codcuent);
		
		JAXBElement<String> codprogr = ofregistro.createPeticionP7542600WSCodprogr(progr);
		mensajeEnvioo.setCodprogr(codprogr);
		
		JAXBElement<String> descccue = ofregistro.createPeticionP7542600WSDescccue(descc);
		mensajeEnvioo.setDescccue(descccue);
		
		JAXBElement<String> idclient = ofregistro.createRegistroP7542600WSIdclient(participante.getNumeroDocumento());
		mensajeEnvioo.setIdclient(idclient);
		
		List<PnsPGeneral> pnsGeneralList = pnsGeneralService.findAll();
		String tipidcliiFinal = "";
		for (int i = 0; i < pnsGeneralList.size(); i++) {
			if(pnsGeneralList.get(i).getCodigoParametro().equals("TIPO_DOCUMENTO") && pnsGeneralList.get(i).getDescrParametro().equals(tipodocumentooooo)) {
				tipidcliiFinal = pnsGeneralList.get(i).getValorParametro();
			}
		}
		
		JAXBElement<String> tipidclii = ofregistro.createRegistroP7542600WSTipidcli(tipidcliiFinal);
		mensajeEnvioo.setTipidcli(tipidclii);
		
		return pnsParticipanteService.consumirServicioAltaCuentas(mensajeEnvioo);
	}

}
