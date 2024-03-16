public class Principal{

	public static void main(String [] args){

		Personas lista_clientes [] = new Personas [100];
		Vendedor lista_vendedor [] = new Vendedor [5];
		Producto lista_productos [] = new Producto [5];

		lista_clientes[0] = new Personas ("1088238440", "Mauricio", "Mz4");
		lista_clientes[1] = new Personas ("1088238441", "Aguirre",  "Cs3");
		lista_clientes[2] = new Personas ("1088238442", "Cardona",  "Ps1");
		lista_clientes[3] = new Personas ("1088238443", "julanito", "calle 20");  


		lista_vendedor[0] = new Vendedor ("1088231", "pepe");
		lista_vendedor[1] = new Vendedor ("1088232", "oscar");
		lista_vendedor[2] = new Vendedor ("1088233", "julio");
		lista_vendedor[3] = new Vendedor ("1088234", "garcia");
		lista_vendedor[4] = new Vendedor ("1088235", "pedro");

		lista_productos [0] = new Producto ("100", "Arroz", 4000);
		lista_productos [1] = new Producto ("101", "Panela", 3000);
		lista_productos [2] = new Producto ("102", "Leche", 2500);
		lista_productos [3] = new Producto ("103", "Lentejas", 2000);
		lista_productos [4] = new Producto ("104", "papas", 3500);

		Actividad1 iniciar = new Actividad1(lista_clientes, lista_vendedor, lista_productos);
	}
}