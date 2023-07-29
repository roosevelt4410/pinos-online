//package co.com.coomeva.pinos.services;
//
//import java.awt.print.Pageable;
//import java.util.List;
//import java.util.Map;
//
//import javax.xml.ws.BindingProvider;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Service;
//
//import com.tecnocom.mediosdepago.sfc.webservice.Exception_Exception;
//import com.tecnocom.mediosdepago.sfc.webservice.SFCP7549200WS;
//import com.tecnocom.mediosdepago.sfc.webservice.SFCP7549200WSPortType;
//import com.tecnocom.mediosdepago.sfc.webservice.xsd.RespuestaP7549200WS;
//
//import co.com.coomeva.pinos.domain.PnsTransAcumulacion;
//import co.com.coomeva.pinos.repository.PnsTransAcumulacionRepository;
//
//@Service
//public class PnsTransAcumulacionServiceImpl implements IPnsTransAcumulacionService{
//	
//	@Value("${pinos.url.servicio.altapinos}")
//	private String urlServicio;
//
//	@Autowired
//	PnsTransAcumulacionRepository pnsTransAcumulacionRepository;
//	
//	public List<PnsTransAcumulacion> findAll() {
//		return (List<PnsTransAcumulacion>) pnsTransAcumulacionRepository.findAll();
//	}
//	
//	public PnsTransAcumulacion save(PnsTransAcumulacion pnsTransAcumulacion) {
//		return pnsTransAcumulacionRepository.save(pnsTransAcumulacion);
//	}
//
//	public PnsTransAcumulacion findById(Long id) {
//		return pnsTransAcumulacionRepository.findById(id).orElse(null);	
//	}
//	
//	public RespuestaP7549200WS correrServicioAltaPinos(com.tecnocom.mediosdepago.sfc.webservice.xsd.PeticionP7549200WS mensajeEnvio) {
//		
//       
//		RespuestaP7549200WS respuestaServicio = new RespuestaP7549200WS();
//
//			 SFCP7549200WS SFCP7549200WSvariable = new SFCP7549200WS();
//		     SFCP7549200WSPortType porType = SFCP7549200WSvariable.getSFCP7549200WSHttpEndpoint();
//		     
//		     BindingProvider bindingProvider = (BindingProvider) porType;
//		     Map<String, Object> contexto = bindingProvider.getRequestContext();
//		     contexto.put(bindingProvider.ENDPOINT_ADDRESS_PROPERTY, urlServicio);
//		     
//			try {
//				respuestaServicio = porType.runService(mensajeEnvio);
//			} catch (Exception_Exception e) {
//				 
//				e.printStackTrace();
//			}
//			return respuestaServicio;
//	
//		
//		
//	}
//	
//
//}
