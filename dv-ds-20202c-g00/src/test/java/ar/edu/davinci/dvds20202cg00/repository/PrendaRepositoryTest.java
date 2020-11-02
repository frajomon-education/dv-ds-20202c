package ar.edu.davinci.dvds20202cg00.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import ar.edu.davinci.dvds20202cg00.model.Prenda;
import ar.edu.davinci.dvds20202cg00.repository.PrendaRepository;


@SpringBootTest
@ExtendWith(SpringExtension.class)
public class PrendaRepositoryTest {
	
	@Autowired
	PrendaRepository prendaRepository;

	@Test
	void testFindAll() {
		
		List<Prenda> prendas = prendaRepository.findAll(); 
		System.out.println("prendas.size: " + prendas.size()) ;
		assertNotNull(prendas);
		assertTrue(prendas.size() > 0);
	}

	@Test
	void testFindById() {
		Long id = 1L;
		Optional<Prenda> prendaOptional = prendaRepository.findById(id);

		System.out.println("prenda is present: " + prendaOptional.isPresent()) ;
		
		assertTrue(prendaOptional.isPresent());
		
		if (prendaOptional.isPresent()) {
			assertNotNull(prendaOptional.get());
			System.out.println("prenda: " + prendaOptional.get()) ;
		}
	}

}
