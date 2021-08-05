package funcion;

public enum Tokens {
	entero("entero"),
	identificador("identificador"),
	decimal ("Decimal"),
	simbolo ("Simbolo");
	
	String forma;

	Tokens(String forma) {

		this.forma=forma;
	}
	public String getTipo() {
		return this.forma;
	}

}
