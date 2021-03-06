package ar.edu.davinci.dvds20202cg00.model;

/**
 * Tipo de Prendas
 * 
 * @author frmontero
 *
 */
public enum TipoPrenda {

	SACO("Saco"), 
	PANTALON("Pantalón"), 
	CAMISA("Camisa"), 
	CAMPERA("Campera"), 
	TAPADO("Tapado"), 
	CHAQUETA("Chaqueta");

	private String descripcion;

	TipoPrenda(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public static TipoPrenda buscar(String descipcion) {
		return TipoPrenda.valueOf(descipcion);
	}
}
