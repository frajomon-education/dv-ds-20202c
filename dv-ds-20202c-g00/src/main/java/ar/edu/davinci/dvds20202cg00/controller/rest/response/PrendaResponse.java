package ar.edu.davinci.dvds20202cg00.controller.rest.response;

import java.math.BigDecimal;

import ar.edu.davinci.dvds20202cg00.model.TipoPrenda;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrendaResponse {
	
	private Long id;
	
	private String descripcion;

	private String tipo;

	private BigDecimal precioBase;
	
}
