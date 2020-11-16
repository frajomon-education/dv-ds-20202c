package ar.edu.davinci.dvds20202cg00.controller.rest.request;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PrendaUpdateRequest {
	
	
	private BigDecimal precioBase;
	
	private String tipo;
	
	private String descripcion;

}
