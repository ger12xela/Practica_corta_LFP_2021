package funcion;

public class Funcion {
	
	String entrada;
	String salida;
	Tokens tipo;
	String letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	String numeros = "1234567890";
	String simbolos = "[]{};,";
	String lexema = " ";
	boolean perteneceL;
	/**
	 * recibe el texto y lo separa en caracteres
	 * @param entrada
	 * @return
	 */
	public String paso1(String entrada) {
		this.entrada = entrada;
		
		perteneceL = false;
		
		for (int i = 0; i < entrada.length(); i++) {
			char token = entrada.charAt(i);
			
			if (token == ' ') {
				perteneceL = true;
				lexema = "";
				tipo = null;
			}

			//compara con las letras
			for (int j = 0; j <letras.length() ; j++) {
				if (token == letras.charAt(j)){
					perteneceL = true;

					if(i == 0) {
						tipo=Tokens.identificador;
						lexema = "";
					}
					if(i>0 &&' ' == entrada.charAt(i-1)) {
						tipo = Tokens.identificador;
						lexema="";
					}
					if(tipo == Tokens.identificador) {
						tipo =Tokens.identificador;
						lexema += token;
					}
					if(tipo == Tokens.entero) {
						lexema += token;
						tipo = Tokens.error;
					}
				}
			}
			//compara con los numeros
			for (int j = 0; j < numeros.length(); j++) {
				
				if (token == numeros.charAt(j)){
					perteneceL = true;

					if(i == 0) {
						tipo=Tokens.entero;
						lexema = "";
					}
					if(i>0 &&' ' == entrada.charAt(i-1)) {
						tipo = Tokens.entero;
						lexema="";
					}
					if(tipo == Tokens.identificador) {
						tipo =Tokens.identificador;
						lexema += token;
					}
					if(tipo == Tokens.entero) {
						tipo = Tokens.entero;
						lexema += token;
					}
					if (tipo == Tokens.error) {
						tipo = Tokens.entero;
						lexema +=token;
					}
					if (tipo == Tokens.simbolo) {
						tipo = Tokens.entero;
						lexema = Character.toString(token);
					}
				}
				
			}
			//compara con los simbolos 
			for (int j = 0; j < simbolos.length(); j++) {
				if (token == simbolos.charAt(j)) {
					perteneceL = true;

					tipo=Tokens.simbolo;
					lexema= "";
					lexema= Character.toString(token);
				}
			}
			
			if (perteneceL == false) {
				
				tipo = Tokens.error;
				System.out.println("no pertenece al lenguaje");
			}
				
			if (tipo != null) {
				System.out.println(lexema + "----->" + tipo.getTipo());
				String temporal = lexema + "----->" + tipo.getTipo();
				salida += (temporal + "\n") ;
			}
			
		}
		return salida;
		
	}
}
