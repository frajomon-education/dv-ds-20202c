package ar.edu.davinci.dvds20202cg00.controller.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.davinci.dvds20202cg00.controller.TiendaAppRest;
import ar.edu.davinci.dvds20202cg00.model.Prenda;
import ar.edu.davinci.dvds20202cg00.service.PrendaService;


@RestController
public class PrendaControllerRest extends TiendaAppRest{
	
	private final Logger LOGGER = LoggerFactory.getLogger(PrendaControllerRest.class);
	
	private final PrendaService prendaService;
	
	@Autowired
	public PrendaControllerRest(final PrendaService prendaService) {
		this.prendaService = prendaService;
	}

	
	/**
	 * Listar las Prendas
	 */
	@GetMapping(path = "/prendas/all")
	public List<Prenda> getListAll() {
		LOGGER.info("listar todas las prendas");

		return prendaService.listAll();
	}
	

	/**
	 * Listar paginado
	 */
	@GetMapping(path = "/prendas")
	public Page<Prenda> getList(Pageable pageable) {
		LOGGER.info("listar todas las prendas paginadas");
		LOGGER.info("Pageable: " + pageable);
		return prendaService.list(pageable);
	}

}
