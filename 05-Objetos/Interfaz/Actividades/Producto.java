public class Producto{
	// producto 

	private String id;
	private String nombre_pro;
	private int precio;

	public Producto(String id, String nombre_pro, int precio){
		this.id = id;
		this.nombre_pro = nombre_pro;
		this.precio = precio;
	}

	public String getId(){
		return this.id;
	}

	public String getNombrePro(){
		return this.nombre_pro;
	}

	public int getPrecio(){
		return this.precio;
	}
}
