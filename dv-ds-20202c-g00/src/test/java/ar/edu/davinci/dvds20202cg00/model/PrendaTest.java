package ar.edu.davinci.dvds20202cg00.model;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import ar.edu.davinci.dvds20202cg00.model.Prenda;
import ar.edu.davinci.dvds20202cg00.model.TipoPrenda;

public class PrendaTest {

	@Test
	void testBuilder() {
		
		Prenda prenda = Prenda.builder()
				.id(1L)
				.precioBase(new BigDecimal(10.3D))
				.tipo(TipoPrenda.CAMISA)
				.descripcion("Camisa Celeste")
				.build();
		
		assertNotNull(prenda);
		assertEquals(TipoPrenda.CAMISA, prenda.getTipo());
		assertEquals("Camisa Celeste", prenda.getDescripcion());

	}

}
