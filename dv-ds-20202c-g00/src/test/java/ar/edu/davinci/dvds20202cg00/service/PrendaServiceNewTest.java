package ar.edu.davinci.dvds20202cg00.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import ar.edu.davinci.dvds20202cg00.model.Prenda;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class PrendaServiceNewTest {

	private final Logger LOGGER = LoggerFactory.getLogger(PrendaServiceNewTest.class);

	@Autowired
	private PrendaServiceNew prendaService;
	
	@Test
	void testListAll() {
		List<Prenda> prendas = prendaService.listAll();
		LOGGER.info("Find All - prendas.size: " + prendas.size()) ;
		assertNotNull(prendas);
		assertTrue(prendas.size() > 0);
	}

	@Test
	void testList() {
		LOGGER.info("Not yet implemented");
		//fail("Not yet implemented");
	}

	@Test
	void testSearchById() {
		LOGGER.info("Not yet implemented");
		//fail("Not yet implemented");
	}

	@Test
	void testSave() {
		LOGGER.info("Not yet implemented");
		//fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		LOGGER.info("Not yet implemented");
		//fail("Not yet implemented");
	}

}
