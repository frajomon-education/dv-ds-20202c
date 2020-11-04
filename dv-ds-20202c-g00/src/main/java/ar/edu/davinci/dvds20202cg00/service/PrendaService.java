package ar.edu.davinci.dvds20202cg00.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ar.edu.davinci.dvds20202cg00.model.Prenda;
import ar.edu.davinci.dvds20202cg00.repository.PrendaRepository;

@Service
public class PrendaService {
	
	private final Logger LOGGER = LoggerFactory.getLogger(PrendaService.class);

	private final PrendaRepository prendaRepository;
	
	@Autowired
	public PrendaService(final PrendaRepository prendaRepository) {
		this.prendaRepository = prendaRepository;
	}

	public List<Prenda> listAll(){
		return prendaRepository.findAll();
		
	}
	
	public Page<Prenda> list(Pageable pageable) {
		LOGGER.info("Pagegable: offset: " + pageable.getOffset() + " - pageSize:" + pageable.getPageSize());
		return prendaRepository.findAll(pageable);
	}
	
	
	public Prenda searchById(final Long prendaId) {
		Optional<Prenda> prendaOptional = prendaRepository.findById(prendaId);
		if (prendaOptional.isPresent()) {
			return prendaOptional.get();
		}
		return null;
	}
	
	public Prenda save(Prenda prenda) {
		return prendaRepository.save(prenda);
	}

	public void delete(Long prendaId) {
		prendaRepository.deleteById(prendaId);
	}

}
