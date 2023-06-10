import java.util.Date;

public class TarjetaDebito{

	// Atributos
	private String numero;
	private String titular;
	private String password;
	private int saldo;
	private String [] lista_transacciones;


	// Metodos
	public TarjetaDebito(String numero, String titular, String password, int saldo){
		this.numero = numero;
		this.titular = titular;
		this.password = password;
		this.saldo = saldo;
		this.lista_transacciones = new String [5];
	}

	public boolean disminuirSaldo(int valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			// registrar en log de tarjeta
			this.registrarLog("DESCUENTO_EXITOSO",0,"OK: Accion exitosa");
			return true;
		}else{
			// registrar en log de la tarjeta
			this.registrarLog("SALDO_INSUFICIENTE",0,"ERRROR: No tiene saldo suficinete en la tarjeta");
			return false;
		}
	}

	public int getSaldo(){
		this.registrarLog("CONSULTA_DE_SALDO",0,"OK: Consulta de saldo fue exitoso");
		return this.saldo;
	}

	public String getNumero(){
		return this.numero;
	}

	public void setPassword(String nuevaClave){
		this.password = nuevaClave;
		this.registrarLog("CAMBIO DE TARJETA",0,"OK: Cambio exitoso");
	}

	public void setSaldo(int nuevoSaldo){
		this.saldo += nuevoSaldo;
		this.registrarLog("CAMBIO_DE_SALDO",0,"OK: El saldo se modifico correctamente");
	}

	public boolean verificarPassword(String password){
		return this.password.equals(password);
	}
	
	public void registrarLog(String tipo, int valorTotal,  String estado){
		Date fecha = new Date();
		String log = fecha.toString()+" || "+tipo+" || "+String.valueOf(valorTotal)+" || "+estado;
		
		if (this.lista_transacciones[ this.lista_transacciones.length-1 ] == null) {
			for(int i=0; i<this.lista_transacciones.length; i++){
				if (this.lista_transacciones[i]==null) {
					this.lista_transacciones[i] = log;
					break;
				}
			}
		}else{
			for (int i=0; i<this.lista_transacciones.length-1; i++) {
				this.lista_transacciones[i] = this.lista_transacciones[i+1];
			}
			this.lista_transacciones[this.lista_transacciones.length-1] = log;
		}
	}

	public void imprimirLog(){
		System.out.println("-------------------------------------------------------------------------------------");
		for (int i = 0; i<this.lista_transacciones.length; i++){
			System.out.println(lista_transacciones[i]);
		}
	}

}