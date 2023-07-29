//package co.com.coomeva.pinos.controller.asignacion;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.xml.bind.JAXBElement;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.dao.DataAccessException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.tecnocom.mediosdepago.sfc.webservice.xsd.PeticionP7549200WS;
//
//import com.tecnocom.mediosdepago.sfc.webservice.xsd.RespuestaP7549200WS;
//
//
//import co.com.coomeva.pinos.DTO.PnsTransAcumulacionDTO;
//import co.com.coomeva.pinos.constants.PnsConsolidadoConstants;
//import co.com.coomeva.pinos.constants.PnsTransAcumulacionConstants;
//import co.com.coomeva.pinos.domain.PnsConsolidado;
//import co.com.coomeva.pinos.domain.PnsConsolidadoId;
//import co.com.coomeva.pinos.domain.PnsEmpresa;
//import co.com.coomeva.pinos.domain.PnsEventoOnline;
//import co.com.coomeva.pinos.domain.PnsLogAsignacionPinos;
//import co.com.coomeva.pinos.domain.PnsLogTransAcumulacion;
//import co.com.coomeva.pinos.domain.PnsProducto;
//import co.com.coomeva.pinos.domain.PnsTransAcumulacion;
//import co.com.coomeva.pinos.services.IPnsConsolidadoService;
//import co.com.coomeva.pinos.services.IPnsEstadoService;
//import co.com.coomeva.pinos.services.IPnsEventoOnlineService;
//import co.com.coomeva.pinos.services.IPnsLogAsignacionPinosService;
//import co.com.coomeva.pinos.services.IPnsLogTransAcumulacionService;
//import co.com.coomeva.pinos.services.IPnsProductoService;
//import co.com.coomeva.pinos.services.IPnsTransAcumulacionService;
//import co.com.coomeva.pinos.util.DateFormatter;
//import ease.soapwebservices.sfcnewage.xsd.ObjectFactory;
//
//@RestController
//@RequestMapping("/api")
//@CrossOrigin("*")
//public class PnsTransAcumulacionController {
//	
//	@Value("${pinos.asignacion.ENTIDAD}")
//	private String entidad;
//	
//	@Value("${pinos.asignacion.IDIOMA}")
//	private String idiomaa;
//	
//	@Value("${pinos.asignacion.OFICINA}")
//	private String oficina;
//	
//	@Value("${pinos.asignacion.PASSWORD}")
//	private String pass;
//	
//	@Value("${pinos.asignacion.OPERACION}")
//	private String operacion;
//	
//	@Value("${pinos.asignacion.USUARIO}")
//	private String user;
//	
//	@Value("${pinos.asignacion.PROGR}")
//	private String progr;
//	
//	@Value("${pinos.asignacion.AUTOPAGINABLE}")
//	private String autopaginable;
//	
//	@Value("${pinos.asignacion.AVANZAR}")
//	private String avanzar;
//	
//	@Value("${pinos.asignacion.CLAVE}")
//	private String clave;
//	
//	@Value("${pinos.asignacion.INDMASDATOS}")
//	private String indmasdatos;
//	
//	@Value("${pinos.asignacion.PANTPAGINA}")
//	private String pantpagina;
//	
//	@Value("${pinos.asignacion.RETROCEDER}")
//	private String retroceder;
//	
//	@Value("${pinos.asignacion.CODTERMI}")
//	private String codtermi;
//	
//	@Value("${pinos.asignacion.CODUSUAR}")
//	private String codusuario;
//	
//	@Value("${pinos.asignacion.LONGMENS}")
//	private String longmens;
//	
//	@Value("${pinos.asignacion.CODIDMSJ}")
//	private String codidmsj;
//	
//	@Value("${pinos.asignacion.IDREPETI}")
//	private String idrepeti;
//	
//	@Value("${pinos.asignacion.IDSENTID}")
//	private String idsentid;
//	
//	@Value("${pinos.asignacion.TIPTRANS}")
//	private String tiptrans;
//	
//	@Value("${pinos.asignacion.IDTRANSA}")
//	private String idtransa;
//	
//	@Value("${pinos.asignacion.TIMETRAN}")
//	private String timetran;
//	
//	@Value("${pinos.asignacion.IDTRAORI}")
//	private String idtraori;
//	
//	@Value("${pinos.asignacion.CODAPLIC}")
//	private String codaplic;
//	
//	@Value("${pinos.asignacion.CODEVENT}")
//	private String codevent;
//	
//	@Value("${pinos.asignacion.enteacum}")
//	private String enteacum;
//	
//	@Value("${pinos.asignacion.CODAAPLICC}")
//	private String CODAAPLICC;
//	
//	@Value("${pinos.asignacion.idproceso}")
//	private String idproceso;
//	
//	@Value("${pinos.asignacion.consecutivoreporte}")
//	private String consecutivoreporte;
//	
//	@Value("${pinos.asignacion.tipodocumentoo}")
//	private String tipodocumentoo;
//	
//	@Value("${pinos.asignacion.numerodocumentoo}")
//	private String numerodocumentoo;
//	
//	@Value("${pinos.asignacion.fechatransaccion}")
//	private String fechatransaccion;
//	
//	@Value("${pinos.asignacion.horatransaccion}")
//	private String horatransaccion;
//	
//	@Value("${pinos.asignacion.numerotransaccion}")
//	private String numerotransaccion;
//	
//	@Value("${pinos.asignacion.valor}")
//	private String valor;
//	
//	@Value("${pinos.asignacion.cantidadtransaccional}")
//	private String cantidadtransaccional;
//	
//	@Value("${pinos.asignacion.tipovinculacion}")
//	private String tipovinculacion;
//	
//	@Value("${pinos.asignacion.codigoproducto}")
//	private String codigoproducto;
//	
//	@Value("${pinos.asignacion.nombreproducto}")
//	private String nombreproducto;
//	
//	@Value("${pinos.asignacion.codigooperacion}")
//	private String codigooperacion;
//	
//	@Value("${pinos.asignacion.descripcionoperacion}")
//	private String descripcionoperacion;
//	
//	@Value("${pinos.asignacion.tipotransaccion}")
//	private String tipotransaccion;
//	
//	@Value("${pinos.asignacion.paistransaccion}")
//	private String paistransaccion;
//	
//	@Value("${pinos.asignacion.ciudadtransaccion}")
//	private String ciudadtransaccion;
//	
//	@Value("${pinos.asignacion.tipocomercio}")
//	private String tipocomercio;
//	
//	@Value("${pinos.asignacion.idcomercio}")
//	private String idcomercio;
//	
//	@Value("${pinos.asignacion.canaltransaccional1}")
//	private String canaltransaccional1;
//	
//	@Value("${pinos.asignacion.puntocontacto}")
//	private String puntocontacto;
//	
//	@Value("${pinos.asignacion.comprainternacional}")
//	private String comprainternacional;
//	
//	@Value("${pinos.asignacion.tiponovedad1}")
//	private String tiponovedad1;
//	
//	@Value("${pinos.asignacion.detalle1}")
//	private String detalle1;
//	
//	@Value("${pinos.asignacion.detalle2}")
//	private String detalle2;
//	
//	@Value("${pinos.asignacion.fechaNacimiento}")
//	private String fechaNacimiento;
//	
//	@Value("${pinos.asignacion.tiponovedad2}")
//	private String tiponovedad2;
//	
//	@Value("${pinos.asignacion.reproceso}")
//	private String reproceso;
//	
//	@Value("${pinos.asignacion.tipocargue}")
//	private String tipocargue;
//	
//	@Value("${pinos.asignacion.idtransaccion}")
//	private String idtransaccion;
//	
//	@Value("${pinos.asignacion.canaltransaccional2}")
//	private String canaltransaccional2;
//	
//	@Value("${pinos.asignacion.tipodocumento}")
//	private String tipodocumento;
//	
//	@Value("${pinos.asignacion.numerodocumento}")
//	private String numerodocumento;
//	
//	@Value("${pinos.asignacion.programa}")
//	private String programa;
//	
//	@Value("${pinos.asignacion.valortxr}")
//	private String valortxr;
//	
//	@Value("${pinos.asignacion.codproddesc}")
//	private String codproddesc;
//	
//	@Autowired
//	private IPnsTransAcumulacionService iPnsTransAcumulacionService;
//	
//	@Autowired
//	private IPnsEstadoService iPnsEstadoService;
//	
//	@Autowired
//	private IPnsProductoService iPnsProductoService;
//	
//	@Autowired
//	private IPnsEventoOnlineService iPnsEventoOnlineService;
//	
//	@Autowired
//	private IPnsLogAsignacionPinosService iPnsLogAsignacionPinosService;
//	
//	@Autowired 
//	private IPnsConsolidadoService iPnsConsolidadoService;
//	
//	@Autowired 
//	private IPnsLogTransAcumulacionService pnsLogTransAcumulacionService;
//	
//	
//
//	@PostMapping("/CreaTransaccionPinos")
//	public ResponseEntity<?> create(@RequestBody PnsTransAcumulacionDTO transAcumulacionDTO, BindingResult result)  {
//
//		PnsTransAcumulacion nuevoTransAcumulacion = new PnsTransAcumulacion(transAcumulacionDTO);
//		RespuestaP7549200WS respuestaWebService = new RespuestaP7549200WS();
//		
//		Map<String, Object> response = new HashMap<String, Object>();
//		
//		try {
//			
//			if(iPnsTransAcumulacionService.findById(transAcumulacionDTO.getIdTransaccion()) != null) {
//				response.put("Mensaje","No se logró finalizar la transacción. IdTransacción ya existe en base de datos");
//				return new ResponseEntity<Map<String,Object>>(response,HttpStatus.ALREADY_REPORTED);
//			}
//			
//			if(transAcumulacionDTO.getIdTransaccion().toString().length() != 12) {
//				response.put("Mensaje","No se logró finalizar la transacción. IdTransacción no cumple con la longitud requerida (12)");
//				return new ResponseEntity<Map<String,Object>>(response,HttpStatus.ALREADY_REPORTED);
//			}
//			
//			
//			nuevoTransAcumulacion.setCodigoAplicacion(PnsTransAcumulacionConstants.CODIGO_APLICACION);
//			nuevoTransAcumulacion.setReporteTrans(PnsTransAcumulacionConstants.CONSECUTIVO_TRANSACCION);
//			nuevoTransAcumulacion.setCantidadTransaccion(PnsTransAcumulacionConstants.CANTIDAD_TRANSACCION);
//			nuevoTransAcumulacion.setTipoTransaccion(PnsTransAcumulacionConstants.TIPO_TRANSACCION);
//			nuevoTransAcumulacion.setPaisTransaccion(PnsTransAcumulacionConstants.PAIS_TRANSACCION);
//			nuevoTransAcumulacion.setCiudadTransaccion(PnsTransAcumulacionConstants.CIUDAD_TRANSACCION);
//			nuevoTransAcumulacion.setTipoComercio(PnsTransAcumulacionConstants.TIPO_COMERCIO);
//			nuevoTransAcumulacion.setIdComercioTrans(PnsTransAcumulacionConstants.ID_COMERCIO);
//			nuevoTransAcumulacion.setCanalTransaccion(PnsTransAcumulacionConstants.CANAL_TRANSACCION);
//			nuevoTransAcumulacion.setPuntoContacto(PnsTransAcumulacionConstants.PUNTO_CONTACTO);
//			nuevoTransAcumulacion.setUsuario(PnsTransAcumulacionConstants.USUARIO);
//			nuevoTransAcumulacion.setMedioPago(PnsTransAcumulacionConstants.MEDIO_PAGO);
//			nuevoTransAcumulacion.setObservacion(PnsTransAcumulacionConstants.OBSERVACION);
//			nuevoTransAcumulacion.setCompraInternacional(PnsTransAcumulacionConstants.COMPRA_INTERNACIONAL);
//			nuevoTransAcumulacion.setTipoNovedad(PnsTransAcumulacionConstants.TIPO_NOVEDAD);
//			nuevoTransAcumulacion.setTipoPersona(PnsTransAcumulacionConstants.TIPO_PERSONA);
//			nuevoTransAcumulacion.setReproceso(PnsTransAcumulacionConstants.REPROCESO);
//			nuevoTransAcumulacion.setTipoCargue(PnsTransAcumulacionConstants.TIPO_CARGUE);
//			nuevoTransAcumulacion.setUsuarioCrea(PnsTransAcumulacionConstants.USUARIO_CREACION);
//			nuevoTransAcumulacion.setPnsEstado(iPnsEstadoService.findById(PnsTransAcumulacionConstants.ESTADO));
//			nuevoTransAcumulacion.setPnsEstadoTrans(iPnsEstadoService.findById(transAcumulacionDTO.getPnsEstadoTrans()));
//			nuevoTransAcumulacion.setTipoVinculacion(PnsTransAcumulacionConstants.TIPO_VINCULACION);
//			nuevoTransAcumulacion.setCodOperacion(PnsTransAcumulacionConstants.COD_OPERACION);
//			nuevoTransAcumulacion.setCodSector(PnsTransAcumulacionConstants.COD_SECTOR);
//			nuevoTransAcumulacion.setCodProducto(PnsTransAcumulacionConstants.CODIGO_PRODUCTO);
//			nuevoTransAcumulacion.setDetalle1(PnsTransAcumulacionConstants.DETALLE1);
//			PnsProducto productoActual = iPnsProductoService.findById(Long.valueOf(PnsTransAcumulacionConstants.CODIGO_PRODUCTO));
//			PnsEventoOnline eventoOnlineActual = iPnsEventoOnlineService.findById(PnsTransAcumulacionConstants.CODIGO_EVENTO_ONLINE);
//			nuevoTransAcumulacion.setEnteAcumulador(productoActual.getPnsEmpresa().getNitEmpresa());
//			nuevoTransAcumulacion.setIdProceso(Long.valueOf(DateFormatter.actualDateStringYYYYMMDD()+DateFormatter.actualTimeHHMMSSwithoutDoublePoints()));
//			nuevoTransAcumulacion.setFechaProceso(DateFormatter.actualDateLongYYYYMMDD());
//			nuevoTransAcumulacion.setHoraProceso(DateFormatter.actualTimeHHMMSS());
//			nuevoTransAcumulacion.setFechaTransaccion(DateFormatter.actualDateLongYYYYMMDD());
//			nuevoTransAcumulacion.setHoraTransaccion(DateFormatter.actualTimeHHMMSS());
//			
//			
//			nuevoTransAcumulacion.setValorTrasaccion(eventoOnlineActual.getValor());
//			nuevoTransAcumulacion.setCantidadPinos(eventoOnlineActual.getNumeroPino());
//			nuevoTransAcumulacion.setValorPinosPeso(eventoOnlineActual.getEquivalencia());
//			nuevoTransAcumulacion.setFechaVencimiento(Long.valueOf(DateFormatter.sumarFecha()));		
//			nuevoTransAcumulacion = iPnsTransAcumulacionService.save(nuevoTransAcumulacion);
//			
//			//REGISTRO WEBSERVICE ALTA CUENTAS ASIGNACION PINOS
//			respuestaWebService = new RespuestaP7549200WS();
//		
//			respuestaWebService =  servicee(nuevoTransAcumulacion);
//		
//			
//			//SAVE LOG ASIGNACION PINOS
//			 
//			PnsLogAsignacionPinos logAsignacion = new PnsLogAsignacionPinos();
//			
//			
//			String tipodocumentooooo = nuevoTransAcumulacion.getTipoDocumento().equals("PS")?"PA":nuevoTransAcumulacion.getTipoDocumento();
//			logAsignacion.setTipoDocumento(nuevoTransAcumulacion.getTipoDocumento());
//			logAsignacion.setNumeroDocumento(tipodocumentooooo);
//			logAsignacion.setFechaTransaccion(Integer.valueOf(DateFormatter.actualDateStringYYYYMMDD()));
//			logAsignacion.setHoraTransaccion(DateFormatter.actualTimeHHMMSS());
//			logAsignacion.setRespuestaServicio(respuestaWebService.getRetorno().getValue());
//			logAsignacion.setHistoricoSFC(String.valueOf(respuestaWebService.getRegistrosP7549200().get(0).getCodhisto()));
//			iPnsLogAsignacionPinosService.save(logAsignacion);
//			
//			nuevoTransAcumulacion.setCodHistorico(Long.valueOf(respuestaWebService.getRegistrosP7549200().get(0).getCodhisto()));
//			iPnsTransAcumulacionService.save(nuevoTransAcumulacion);
//			
//			//SAVE PnsConsolidado
//			
//			this.createConsolidado(new PnsConsolidadoId(nuevoTransAcumulacion.getTipoDocumento(), nuevoTransAcumulacion.getNumeroDocumento()));
//			
//		}catch(DataAccessException e) {
//			response.put("Mensaje","Error:" + e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
//			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//		response.put("Mensaje","pnsTransAcumulacion creado con exito.");
//		response.put("Codigo retorno alta de cuentas", respuestaWebService.getRetorno().getValue());
//		response.put("Mensaje Retorno Alta de cuenta", respuestaWebService.getDescRetorno().getValue());
//		response.put("Codigo Historico SFC",nuevoTransAcumulacion.getCodHistorico());
//		
//		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);
//		
//	}
//	
//	    public RespuestaP7549200WS servicee(PnsTransAcumulacion pnsTransAcumulacion) {
//	    	RespuestaP7549200WS respuestaa = new RespuestaP7549200WS();
//	        PeticionP7549200WS mensajeEnviooooo = new PeticionP7549200WS();
//			ObjectFactory ofPeticionNewAge = new ObjectFactory();
//
//			JAXBElement<String> clave = ofPeticionNewAge.createPeticionNewAgeClave("");
//			mensajeEnviooooo.setClave(clave);
//			
//			JAXBElement<String> codEntid = ofPeticionNewAge.createPeticionNewAgeEntidad(entidad);
//			mensajeEnviooooo.setEntidad(codEntid);
//      
//			JAXBElement<String> idioma = ofPeticionNewAge.createPeticionNewAgeIdioma(idiomaa);
//			mensajeEnviooooo.setIdioma(idioma);
//			
//			JAXBElement<String> indMasDatos = ofPeticionNewAge.createRespuestaNewAgeIndMasDatos("N");
//			mensajeEnviooooo.setIndMasDatos(indMasDatos);
//         
//			JAXBElement<String> oficinaa = ofPeticionNewAge.createPeticionNewAgeOficina(oficina);
//			mensajeEnviooooo.setOficina(oficinaa);
//			
//			JAXBElement<String> pantPagina = ofPeticionNewAge.createRespuestaNewAgePantPagina("1");
//			mensajeEnviooooo.setPantPagina(pantPagina);
//			
//			JAXBElement<String> password = ofPeticionNewAge.createPeticionNewAgePassword(pass);
//			mensajeEnviooooo.setPassword(password);
//			
//			JAXBElement<String> tipoOperacion = ofPeticionNewAge.createPeticionNewAgeTipoOperacion(operacion);
//			mensajeEnviooooo.setTipoOperacion(tipoOperacion);
//      
//			JAXBElement<String> usuario = ofPeticionNewAge.createPeticionNewAgeUsuario(user);
//			mensajeEnviooooo.setUsuario(usuario);
//			
//			Integer cero =0;
//
//			mensajeEnviooooo.setCashpr10(cero.floatValue());
//			mensajeEnviooooo.setCashpre1(cero.floatValue());
//			mensajeEnviooooo.setCashpre2(cero.floatValue());
//			mensajeEnviooooo.setCashpre3(cero.floatValue());
//			mensajeEnviooooo.setCashpre4(cero.floatValue());
//			mensajeEnviooooo.setCashpre5(cero.floatValue());
//			mensajeEnviooooo.setCashpre6(cero.floatValue());
//			mensajeEnviooooo.setCashpre7(cero.floatValue());
//			mensajeEnviooooo.setCashpre8(cero.floatValue());
//			mensajeEnviooooo.setCashpre9(cero.floatValue());
//			
//			com.tecnocom.mediosdepago.sfc.webservice.xsd.ObjectFactory ofPeticionP7549200 = new com.tecnocom.mediosdepago.sfc.webservice.xsd.ObjectFactory();
//			   
//			JAXBElement<String> codaplicValue = ofPeticionP7549200.createRegistroP7549200WSCodaplic(codaplic);
//			mensajeEnviooooo.setCodaplic(codaplicValue);
//			
//			JAXBElement<String> codCuent = ofPeticionP7549200.createPeticionP7549200WSCodcue10("");
//			mensajeEnviooooo.setCodcue10(codCuent);
//			
//			JAXBElement<String> codCuent1 = ofPeticionP7549200.createPeticionP7549200WSCodcuen1("");
//			mensajeEnviooooo.setCodcuen1(codCuent1);
//			
//			JAXBElement<String> codCuent2 = ofPeticionP7549200.createPeticionP7549200WSCodcuen2("");
//			mensajeEnviooooo.setCodcuen2(codCuent2);
//			
//			JAXBElement<String> codCuent3 = ofPeticionP7549200.createPeticionP7549200WSCodcuen3("");
//			mensajeEnviooooo.setCodcuen3(codCuent3);
//			
//			JAXBElement<String> codCuent4 = ofPeticionP7549200.createPeticionP7549200WSCodcuen4("");
//			mensajeEnviooooo.setCodcuen4(codCuent4);
//			
//			JAXBElement<String> codCuent5 = ofPeticionP7549200.createPeticionP7549200WSCodcuen5("");
//			mensajeEnviooooo.setCodcuen5(codCuent5);
//			
//			JAXBElement<String> codCuent6 = ofPeticionP7549200.createPeticionP7549200WSCodcuen6("");
//			mensajeEnviooooo.setCodcuen6(codCuent6);
//			
//			JAXBElement<String> codCuent7 = ofPeticionP7549200.createPeticionP7549200WSCodcuen7("");
//			mensajeEnviooooo.setCodcuen7(codCuent7);
//			
//			JAXBElement<String> codCuent8 = ofPeticionP7549200.createPeticionP7549200WSCodcuen8("");
//			mensajeEnviooooo.setCodcuen8(codCuent8);
//			
//			JAXBElement<String> codCuent9 = ofPeticionP7549200.createPeticionP7549200WSCodcuen9("");
//			mensajeEnviooooo.setCodcuen9(codCuent9);
//			
//			JAXBElement<String> codeventValue = ofPeticionP7549200.createRegistroP7549200WSCodevent(codevent);
//			mensajeEnviooooo.setCodevent(codeventValue);
//			
//			mensajeEnviooooo.setCodhisto(0l);
//			
//			mensajeEnviooooo.setCodidmsj(Integer.valueOf(codidmsj));
//			
//			
//			JAXBElement<String> codigoRespuesta = ofPeticionP7549200.createPeticionP7549200WSCodrespu("");
//			mensajeEnviooooo.setCodrespu(codigoRespuesta);
//			
//			JAXBElement<String> codigoRetorno = ofPeticionP7549200.createPeticionP7549200WSCodretor("");
//			mensajeEnviooooo.setCodretor(codigoRetorno);
//			
//			JAXBElement<String> descripcionError = ofPeticionP7549200.createPeticionP7549200WSDeserror("");
//			mensajeEnviooooo.setDeserror(descripcionError);
//			
//			JAXBElement<String> despro10 = ofPeticionP7549200.createPeticionP7549200WSDespro10("");
//			mensajeEnviooooo.setDespro10(despro10);
//			
//			
//			JAXBElement<String> desprog1 = ofPeticionP7549200.createPeticionP7549200WSDesprog1("");
//			mensajeEnviooooo.setDesprog1(desprog1);
//			
//			JAXBElement<String> desprog2 = ofPeticionP7549200.createPeticionP7549200WSDesprog2("");
//			mensajeEnviooooo.setDesprog2(desprog2);
//			
//			JAXBElement<String> desprog3 = ofPeticionP7549200.createPeticionP7549200WSDesprog3("");
//			mensajeEnviooooo.setDesprog3(desprog3);
//			
//			JAXBElement<String> desprog4= ofPeticionP7549200.createPeticionP7549200WSDesprog4("");
//			mensajeEnviooooo.setDesprog4(desprog4);
//			
//			JAXBElement<String> desprog5 = ofPeticionP7549200.createPeticionP7549200WSDesprog5("");
//			mensajeEnviooooo.setDesprog5(desprog5);
//			
//			JAXBElement<String> desprog6 = ofPeticionP7549200.createPeticionP7549200WSDesprog6("");
//			mensajeEnviooooo.setDesprog6(desprog6);
//			
//			JAXBElement<String> desprog7 = ofPeticionP7549200.createPeticionP7549200WSDesprog7("");
//			mensajeEnviooooo.setDesprog7(desprog7);
//			
//			JAXBElement<String> desprog8 = ofPeticionP7549200.createPeticionP7549200WSDesprog8("");
//			mensajeEnviooooo.setDesprog8(desprog8);
//			
//			JAXBElement<String> desprog9 = ofPeticionP7549200.createPeticionP7549200WSDesprog9("");
//			mensajeEnviooooo.setDesprog9(desprog9);
//			
//			
//			JAXBElement<String> idclien10 = ofPeticionP7549200.createPeticionP7549200WSIdclie10("");
//			mensajeEnviooooo.setIdclie10(idclien10);
//			
//			JAXBElement<String> idclien1 = ofPeticionP7549200.createPeticionP7549200WSIdclien1("");
//			mensajeEnviooooo.setIdclien1(idclien1);
//			
//			JAXBElement<String> idclien2 = ofPeticionP7549200.createPeticionP7549200WSIdclien2("");
//			mensajeEnviooooo.setIdclien2(idclien2);
//			
//			JAXBElement<String> idclien3 = ofPeticionP7549200.createPeticionP7549200WSIdclien3("");
//			mensajeEnviooooo.setIdclien3(idclien3);
//			
//			JAXBElement<String> idclien4 = ofPeticionP7549200.createPeticionP7549200WSIdclien4("");
//			mensajeEnviooooo.setIdclien4(idclien4);
//			
//			JAXBElement<String> idclien5 = ofPeticionP7549200.createPeticionP7549200WSIdclien5("");
//			mensajeEnviooooo.setIdclien5(idclien5);
//			
//			JAXBElement<String> idclien6 = ofPeticionP7549200.createPeticionP7549200WSIdclien6("");
//			mensajeEnviooooo.setIdclien6(idclien6);
//			
//			JAXBElement<String> idclien7 = ofPeticionP7549200.createPeticionP7549200WSIdclien7("");
//			mensajeEnviooooo.setIdclien7(idclien7);
//			
//			JAXBElement<String> idclien8 = ofPeticionP7549200.createPeticionP7549200WSIdclien8("");
//			mensajeEnviooooo.setIdclien8(idclien8);
//			
//			JAXBElement<String> idclien9 = ofPeticionP7549200.createPeticionP7549200WSIdclien9("");
//			mensajeEnviooooo.setIdclien9(idclien9);
//			
//			JAXBElement<String> idTraori = ofPeticionP7549200.createPeticionP7549200WSIdtraori("");
//			mensajeEnviooooo.setIdtraori(idTraori);
//			
//			
//			mensajeEnviooooo.setIdrepeti(cero);
//			mensajeEnviooooo.setNumpgeva(cero);
//			mensajeEnviooooo.setNumsol10(cero);
//			mensajeEnviooooo.setNumsoli1(cero);
//			mensajeEnviooooo.setNumsoli2(cero);
//			mensajeEnviooooo.setNumsoli3(cero);
//			mensajeEnviooooo.setNumsoli4(cero);
//			mensajeEnviooooo.setNumsoli5(cero);
//			mensajeEnviooooo.setNumsoli6(cero);
//			mensajeEnviooooo.setNumsoli7(cero);
//			mensajeEnviooooo.setNumsoli8(cero);
//			mensajeEnviooooo.setNumsoli9(cero);
//			mensajeEnviooooo.setPtosor10(0L);
//			mensajeEnviooooo.setPtosori1(0L);
//			mensajeEnviooooo.setPtosori2(0L);
//			mensajeEnviooooo.setPtosori3(0L);
//			mensajeEnviooooo.setPtosori4(0L);
//			mensajeEnviooooo.setPtosori5(0L);
//			mensajeEnviooooo.setPtosori6(0L);
//			mensajeEnviooooo.setPtosori7(0L);
//			mensajeEnviooooo.setPtosori8(0L);
//			mensajeEnviooooo.setPtosori9(0L);
//			mensajeEnviooooo.setPtosre10(0L);
//			mensajeEnviooooo.setPtosred1(0L);
//			mensajeEnviooooo.setPtosred2(0L);
//			mensajeEnviooooo.setPtosred3(0L);
//			mensajeEnviooooo.setPtosred4(0L);
//			mensajeEnviooooo.setPtosred5(0L);
//			mensajeEnviooooo.setPtosred6(0L);
//			mensajeEnviooooo.setPtosred7(0L);
//			mensajeEnviooooo.setPtosred8(0L);
//			mensajeEnviooooo.setPtosred9(0L);
//      
//			
//			JAXBElement<String> texto1 = ofPeticionP7549200.createPeticionP7549200WSTexto1("");
//			mensajeEnviooooo.setTexto1(texto1);
//			
//			JAXBElement<String> texto10 = ofPeticionP7549200.createPeticionP7549200WSTexto10("");
//			mensajeEnviooooo.setTexto10(texto10);
//			
//			JAXBElement<String> texto2 = ofPeticionP7549200.createPeticionP7549200WSTexto2("");
//			mensajeEnviooooo.setTexto2(texto2);
//			
//			JAXBElement<String> texto3 = ofPeticionP7549200.createPeticionP7549200WSTexto3("");
//			mensajeEnviooooo.setTexto3(texto3);
//			
//			JAXBElement<String> texto4 = ofPeticionP7549200.createPeticionP7549200WSTexto4("");
//			mensajeEnviooooo.setTexto4(texto4);
//			
//			JAXBElement<String> texto5 = ofPeticionP7549200.createPeticionP7549200WSTexto5("");
//			mensajeEnviooooo.setTexto5(texto5);
//			
//			JAXBElement<String> texto6 = ofPeticionP7549200.createPeticionP7549200WSTexto6("");
//			mensajeEnviooooo.setTexto6(texto6);
//			
//			JAXBElement<String> texto7 = ofPeticionP7549200.createPeticionP7549200WSTexto7("");
//			mensajeEnviooooo.setTexto7(texto7);
//			
//			JAXBElement<String> texto8 = ofPeticionP7549200.createPeticionP7549200WSTexto8("");
//			mensajeEnviooooo.setTexto8(texto8);
//			
//			JAXBElement<String> texto9 = ofPeticionP7549200.createPeticionP7549200WSTexto9("");
//			mensajeEnviooooo.setTexto9(texto9);
//			
//			
//			JAXBElement<String> tipopu10 = ofPeticionP7549200.createPeticionP7549200WSTipopu10("");
//			mensajeEnviooooo.setTipopu10(tipopu10);
//			
//			JAXBElement<String> tipopu1 = ofPeticionP7549200.createPeticionP7549200WSTipopun1("");
//			mensajeEnviooooo.setTipopun1(tipopu1);
//			
//			JAXBElement<String> tipopu2 = ofPeticionP7549200.createPeticionP7549200WSTipopun2("");
//			mensajeEnviooooo.setTipopun2(tipopu2);
//			
//			JAXBElement<String> tipopu3 = ofPeticionP7549200.createPeticionP7549200WSTipopun3("");
//			mensajeEnviooooo.setTipopun3(tipopu3);
//			
//			JAXBElement<String> tipopu4 = ofPeticionP7549200.createPeticionP7549200WSTipopun4("");
//			mensajeEnviooooo.setTipopun4(tipopu4);
//			
//			JAXBElement<String> tipopu5 = ofPeticionP7549200.createPeticionP7549200WSTipopun5("");
//			mensajeEnviooooo.setTipopun5(tipopu5);
//			
//			JAXBElement<String> tipopu6 = ofPeticionP7549200.createPeticionP7549200WSTipopun6("");
//			mensajeEnviooooo.setTipopun6(tipopu6);
//			
//			JAXBElement<String> tipopu7 = ofPeticionP7549200.createPeticionP7549200WSTipopun7("");
//			mensajeEnviooooo.setTipopun7(tipopu7);
//			
//			JAXBElement<String> tipopu8 = ofPeticionP7549200.createPeticionP7549200WSTipopun8("");
//			mensajeEnviooooo.setTipopun8(tipopu8);
//			
//			JAXBElement<String> tipopu9 = ofPeticionP7549200.createPeticionP7549200WSTipopun9("");
//			mensajeEnviooooo.setTipopun9(tipopu9);
//			
//			JAXBElement<String> tipopunt = ofPeticionP7549200.createPeticionP7549200WSTipopunt("");
//			mensajeEnviooooo.setTipopunt(tipopunt);
//			
//			
//			JAXBElement<String> tipoTransaccion = ofPeticionP7549200.createRegistroP7549200WSTiptrans(tiptrans);
//			mensajeEnviooooo.setTiptrans(tipoTransaccion);
//			
//			mensajeEnviooooo.setTotcashp(cero.floatValue());
//			mensajeEnviooooo.setTotptoor(0L);
//			mensajeEnviooooo.setTotptore(0L);
//
//			JAXBElement<String> codigoTerminal = ofPeticionP7549200.createRegistroP7549200WSCodtermi(codtermi);
//			mensajeEnviooooo.setCodtermi(codigoTerminal);
//
//			JAXBElement<String> codigoUsuario = ofPeticionP7549200.createRegistroP7549200WSCodusuar("0");
//			mensajeEnviooooo.setCodusuar(codigoUsuario);
//			
//			JAXBElement<String> identificadorSentido = ofPeticionP7549200.createRegistroP7549200WSIdsentid(idsentid);
//			mensajeEnviooooo.setIdsentid(identificadorSentido);
//     
//			JAXBElement<String> idtransaValue = ofPeticionP7549200.createRegistroP7549200WSIdtransa(String.valueOf(pnsTransAcumulacion.getIdTransaccion()));
//			mensajeEnviooooo.setIdtransa(idtransaValue);
//      
//			mensajeEnviooooo.setLongmens(Integer.valueOf(longmens));
//       
//			
//			List<PnsEventoOnline> listaEventoOnlinee = iPnsEventoOnlineService.findAll();
//			PnsEmpresa pnsEmpresa = new PnsEmpresa();
//			PnsProducto productoElegido = new PnsProducto(); 
//			
//			for (int i = 0; i < listaEventoOnlinee.size(); i++) {
//				if(listaEventoOnlinee.get(i).getCodigoAplicacion().equals(CODAAPLICC)) {
//					pnsEmpresa = listaEventoOnlinee.get(i).getPnsEmpresa();
//					productoElegido =listaEventoOnlinee.get(i).getPnsProducto();
//				}
//			}
//			
//			
//			
//			String temp = "000".concat(String.valueOf(pnsEmpresa.getNitEmpresa()));   
//			
//			
//			String codigo = String.format("%-20s", listaEventoOnlinee.get(0).getCodigoAplicacion());      
//			temp = temp.concat(codigo);
//       
//
//			
//			Calendar calendarioTransValue = Calendar.getInstance();
//			int horaProcesoTransValue, minutosProcesoTransValue, segundosProcesoTransValue;
//			horaProcesoTransValue =calendarioTransValue.get(Calendar.HOUR_OF_DAY);
//			minutosProcesoTransValue = calendarioTransValue.get(Calendar.MINUTE);
//			segundosProcesoTransValue = calendarioTransValue.get(Calendar.SECOND);
//			String horaProcesoValidd = String.valueOf(horaProcesoTransValue);
//			String minutoProcesoValidd = String.valueOf(minutosProcesoTransValue);
//			String segundoProcesoValidd = String.valueOf(segundosProcesoTransValue);
//			
//			String horaConcatenada = horaProcesoValidd.concat(minutoProcesoValidd).concat(segundoProcesoValidd);
//			
//			Date fechaProcesoooo = new Date();
//			SimpleDateFormat formatt = new SimpleDateFormat("yyyyMMdd");
//			String fechaProcesoStrrr = formatt.format(fechaProcesoooo);
//			
//			String campoTimeTransValue = fechaProcesoStrrr.concat(horaConcatenada);
//			JAXBElement<String> timetransValue = ofPeticionP7549200.createRegistroP7549200WSTimetran(campoTimeTransValue);
//			mensajeEnviooooo.setTimetran(timetransValue);
//
//			Date fechaProcesooo = new Date();
//			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
//			String fechaProcesoStrr = format.format(fechaProcesooo);
//			String fechaprocesocompletado = String.format("%-10s", fechaProcesoStrr.concat("02"));
//			temp = temp.concat(fechaprocesocompletado);
//			temp = temp.concat(consecutivoreporte);
//			
//			Date fechaProcesoo = new Date();
//			
//			String fechaProcesoStr = format.format(fechaProcesoo);
//			String fechaprocesocompletadoo = String.format("%-8s", fechaProcesoStr);
//			temp = temp.concat(fechaprocesocompletadoo);
//			
//			Calendar calendario = Calendar.getInstance();
//			int horaProceso, minutosProceso, segundosProceso;
//			horaProceso =calendario.get(Calendar.HOUR_OF_DAY);
//			minutosProceso = calendario.get(Calendar.MINUTE);
//			segundosProceso = calendario.get(Calendar.SECOND);
//			String horaProcesoValid = String.valueOf(horaProceso);
//			String minutoProcesoValid = String.valueOf(minutosProceso);
//			String segundoProcesoValid = String.valueOf(segundosProceso);
//			if(horaProcesoValid.length()==2) {horaProcesoValid =horaProcesoValid;}else {horaProcesoValid = "0".concat(horaProcesoValid);}
//			if(minutoProcesoValid.length() == 2){minutoProcesoValid =minutoProcesoValid;}else {minutoProcesoValid = "0".concat(minutoProcesoValid);}
//			if(segundoProcesoValid.length() == 2){segundoProcesoValid =segundoProcesoValid;}else {segundoProcesoValid = "0".concat(segundoProcesoValid);}
//			String horaProcesoGeneral = String.valueOf(horaProcesoValid).concat(":");
//			horaProcesoGeneral = horaProcesoGeneral.concat(String.valueOf(minutoProcesoValid)).concat(":");
//			horaProcesoGeneral = horaProcesoGeneral.concat(String.valueOf(segundoProcesoValid));
//
//			temp = temp.concat(horaProcesoGeneral);
//			
//			String tipodocumentooooo ;
//			tipodocumentooooo = pnsTransAcumulacion.getTipoDocumento().equals("PA")?"PS":pnsTransAcumulacion.getTipoDocumento();
//			
//			temp = temp.concat(tipodocumentooooo); 
//			temp = temp.concat(String.format("%-18s", pnsTransAcumulacion.getNumeroDocumento())); 
//			
//			Date fechaTransaccion = new Date();
//			SimpleDateFormat formatFechaTransaccion = new SimpleDateFormat("yyyyMMdd");
//			String fechaTransaccionStr = formatFechaTransaccion.format(fechaTransaccion);
//			temp = temp.concat(fechaTransaccionStr);
//			
//			Calendar calendarioTransaccion = Calendar.getInstance();
//			int horaProcesoTransaccion, minutosProcesoTransaccion, segundosProcesoTransaccion;
//			horaProcesoTransaccion =calendarioTransaccion.get(Calendar.HOUR_OF_DAY);
//			minutosProcesoTransaccion = calendarioTransaccion.get(Calendar.MINUTE);
//			segundosProcesoTransaccion = calendarioTransaccion.get(Calendar.SECOND);
//			String horaProcesoTransaccionValid = String.valueOf(horaProceso);
//			String minutosProcesoTransaccionValid = String.valueOf(minutosProceso);
//			String segundosProcesoTransaccionTransaccionValid = String.valueOf(segundosProceso);
//			if(horaProcesoTransaccionValid.length()==2) {horaProcesoTransaccionValid =horaProcesoTransaccionValid;}else {horaProcesoTransaccionValid = "0".concat(horaProcesoTransaccionValid);}
//			if(minutosProcesoTransaccionValid.length() == 2){minutosProcesoTransaccionValid =minutosProcesoTransaccionValid;}else {minutosProcesoTransaccionValid = "0".concat(minutosProcesoTransaccionValid);}
//			if(segundosProcesoTransaccionTransaccionValid.length() == 2){segundosProcesoTransaccionTransaccionValid =segundosProcesoTransaccionTransaccionValid;}else {segundosProcesoTransaccionTransaccionValid = "0".concat(segundosProcesoTransaccionTransaccionValid);}
//			String horaProcesoGeneralTransaccion = String.valueOf(horaProcesoTransaccionValid).concat(":");
//			horaProcesoGeneralTransaccion = horaProcesoGeneralTransaccion.concat(String.valueOf(minutosProcesoTransaccionValid)).concat(":");
//			horaProcesoGeneralTransaccion = horaProcesoGeneralTransaccion.concat(String.valueOf(segundosProcesoTransaccionTransaccionValid));
//			temp = temp.concat(horaProcesoGeneralTransaccion);
//			
//			String numeroTransaccion = String.format("%-30s",String.valueOf(pnsTransAcumulacion.getNumTransaccion()));
//			temp = temp.concat(numeroTransaccion);
//			List<PnsEventoOnline> listaEventoOnline = iPnsEventoOnlineService.findAll();
//			PnsEventoOnline pnsEventoOnline = new PnsEventoOnline();
//			pnsEventoOnline = listaEventoOnline.get(0);
//			PnsEventoOnline eventoOnlineActual = iPnsEventoOnlineService.findById(PnsTransAcumulacionConstants.CODIGO_EVENTO_ONLINE);
//			
//			String valorrrrFinal = "0000000".concat(Long.toString(eventoOnlineActual.getValor()));
//			
//			String valor = "00".concat(String.valueOf(valorrrrFinal));                                                   
//			temp = temp.concat(String.format("%-15s", valor));
//			
//			String cantidadTransaccionall = "00".concat(cantidadtransaccional);
//			temp = temp.concat(String.format("%-15s", cantidadTransaccionall));                                                   
//			
//			temp = temp.concat("0000");
//
//			temp = temp.concat(String.format("%-2s", pnsEventoOnline.getTipoVinculacion()));
//			temp = temp.concat(String.format("%-20s", productoElegido.getCodigoProducto()));
//			temp = temp.concat(String.format("%-150s", productoElegido.getNombreProducto()));
//			temp = temp.concat(String.format("%-20s",codigooperacion ));
//			temp = temp.concat(String.format("%-150s",nombreproducto)); 
//			temp = temp.concat(String.format("%-2s",tipotransaccion));
//			temp = temp.concat(String.format("%-3s",paistransaccion));
//			temp = temp.concat(String.format("%-10s",ciudadtransaccion));
//			temp = temp.concat(String.format("%-20s",pnsEmpresa.getNitEmpresa())); 
//			temp = temp.concat(String.format("%-20s",pnsEmpresa.getNitEmpresa())); 
//			temp = temp.concat(String.format("%-2s",canaltransaccional1));
//			temp = temp.concat(String.format("%-100s",puntocontacto));
//			temp = temp.concat(String.format("%-15s",user)); 
//			temp = temp.concat(""); 
//			temp = temp.concat(String.format("%-250s",codproddesc));
//			temp = temp.concat(String.format("%-2s",""));
//			temp = temp.concat(String.format("%-2s", comprainternacional));
//			temp = temp.concat(String.format("%-2s", tiponovedad1));
//			temp = temp.concat(String.format("%-238s",""));
//			temp = temp.concat(String.format("%-250s",pnsTransAcumulacion.getDetalle2()));
//			temp = temp.concat(String.format("%-12s",""));
//			temp = temp.concat(String.format("%-2s", pnsTransAcumulacion.getGeneroCliente()));
//			temp = temp.concat(String.format("%-8s", pnsTransAcumulacion.getFechaNacimiento()));
//			temp = temp.concat(String.format("%-10s", tiponovedad2));
//
//			temp = temp.concat(String.format("%-2s", "N")); 
//			temp = temp.concat(String.format("%-10s", tipocargue));
//			temp = temp.concat(String.format("%-12s", pnsTransAcumulacion.getIdTransaccion()));
//			temp = temp.concat(String.format("%-2s", canaltransaccional2));
//			temp = temp.concat(String.format("%-2s", tipodocumentooooo));
//			temp = temp.concat(String.format("%-18s", pnsTransAcumulacion.getNumeroDocumento()));
//
//			temp = temp.concat(String.format("%-8s",programa));
//			temp = temp.concat(String.format("%-488s",""));
//			
//			JAXBElement<String> datosEveValue = ofPeticionP7549200.createRegistroP7549200WSDatoseve(temp);
//			mensajeEnviooooo.setDatoseve(datosEveValue);
//			System.out.println(temp);
//			
//			respuestaa = iPnsTransAcumulacionService.correrServicioAltaPinos(mensajeEnviooooo);
//			
//			PnsLogTransAcumulacion pnsLogTransAcumulacion = new PnsLogTransAcumulacion();
//			
//			pnsLogTransAcumulacion.setNumeroDocumento(pnsTransAcumulacion.getNumeroDocumento());
//			pnsLogTransAcumulacion.setHoraTransaccion(horaProcesoGeneral);
//			pnsLogTransAcumulacion.setFechaTransaccion(Long.parseLong(fechaTransaccionStr));
//			pnsLogTransAcumulacion.setTipoDocumento(pnsTransAcumulacion.getTipoDocumento());
//			String codigoHistorico = String.valueOf(respuestaa.getRegistrosP7549200().get(0).getCodhisto());
//			pnsLogTransAcumulacion.setRespuestaServicio(codigoHistorico);
//			pnsLogTransAcumulacionService.save(pnsLogTransAcumulacion);
//	        return respuestaa;
//	    }
//	    
//	    
//	    public String createConsolidado(PnsConsolidadoId id) {
//			try {
//				PnsConsolidado nuevoPnsConsolidado = new PnsConsolidado();
//				PnsConsolidadoId pnsConsolidadoId = new PnsConsolidadoId(id.getTipoDocumento(), id.getNumeroDocumento());
//				PnsConsolidado pnsConsolidadoActual = new PnsConsolidado();
//				pnsConsolidadoActual = iPnsConsolidadoService.findById(pnsConsolidadoId);
//				
//				if (pnsConsolidadoActual == null) {
//					pnsConsolidadoActual = new PnsConsolidado();
//					pnsConsolidadoActual.setTipoDocumento(pnsConsolidadoId.getTipoDocumento());
//					pnsConsolidadoActual.setNumeroDocumento(pnsConsolidadoId.getNumeroDocumento());			
//					pnsConsolidadoActual.setSaldoDisponible(PnsConsolidadoConstants.SALDO_DISPONIBLE);
//					pnsConsolidadoActual.setSaldoRedimido(PnsConsolidadoConstants.SALDO_REDIMIDO);
//					pnsConsolidadoActual.setSaldoVencido(PnsConsolidadoConstants.SALDO_VENCIDO);
//					pnsConsolidadoActual.setSaldoAvencer(PnsConsolidadoConstants.SALDO_AVENCER);
//					pnsConsolidadoActual.setFechaVencimiento(Long.valueOf(DateFormatter.sumarFecha()));
//					pnsConsolidadoActual.setUsuarioCrea(PnsConsolidadoConstants.USERVDA);
//					pnsConsolidadoActual.setFechaModificacion(DateFormatter.actualDateLongYYYYMMDD());							
//					pnsConsolidadoActual.setPnsEstado(iPnsEstadoService.findById(PnsConsolidadoConstants.ESTADO));		
//					nuevoPnsConsolidado = iPnsConsolidadoService.save(pnsConsolidadoActual);
//				} else {
//					pnsConsolidadoActual.setSaldoDisponible(pnsConsolidadoActual.getSaldoDisponible() + PnsConsolidadoConstants.SALDO_DISPONIBLE);
//					pnsConsolidadoActual.setFechaVencimiento(Long.valueOf(DateFormatter.sumarFecha()));		
//					pnsConsolidadoActual.setFechaModificacion(DateFormatter.actualDateLongYYYYMMDD());							
//					nuevoPnsConsolidado = iPnsConsolidadoService.save(pnsConsolidadoActual);		
//				}
//			} catch (DataAccessException e) {
//				return "PnsConsolidado no se pudo guardar/editar";
//			}
//			return "PnsConsolidado proceso realizado con exito.";
//		}
//}