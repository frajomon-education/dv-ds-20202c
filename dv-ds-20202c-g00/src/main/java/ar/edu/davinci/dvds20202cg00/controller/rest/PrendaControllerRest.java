package ar.edu.davinci.dvds20202cg00.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.davinci.dvds20202cg00.controller.TiendaRestApp;
import ar.edu.davinci.dvds20202cg00.model.Prenda;
import ar.edu.davinci.dvds20202cg00.service.PrendaService;


@RestController
public class PrendaControllerRest extends TiendaRestApp{
	
	private final Logger LOGGER = LoggerFactory.getLogger(PrendaControllerRest.class);
	
	private final PrendaService prendaService;
	
	@Autowired
	public PrendaControllerRest(final PrendaService prendaService) {
		this.prendaService = prendaService;
	}

	
	/**
	 * Listar las Prendas
	 */
	@GetMapping(path = "/prendas")
	public List<Prenda>	getPrendas() {
		LOGGER.info("listar todas las prendas");
		return prendaService.listAll();

	}

}
