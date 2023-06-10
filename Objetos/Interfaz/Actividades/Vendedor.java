public class Vendedor{

	String cedula_vendedor;
	String nombre_vendedor;

	public Vendedor(String cedula_vendedor, String nombre_vendedor){
		this.cedula_vendedor = cedula_vendedor;
		this.nombre_vendedor = nombre_vendedor;
	}

	public String getCedulaVendedor(){
		return this.cedula_vendedor;
	}

	public String getNombreVendedor(){
		return this.nombre_vendedor;
	}
}