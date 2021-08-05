package funcion;

public class Funcion {
	
	String entrada;
	String salida;
	
	public void paso1(String entrada) {
		this.entrada = entrada;
		String lexema = "";
		String letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String numeros = "1234567890";
		String simbolos = "[]{};,";
		Tokens entero = Tokens.entero;
		Tokens simbolo = Tokens.simbolo;		
		
		
		for (int i = 0; i < entrada.length(); i++) {
			char token = entrada.charAt(i);
			
			if (token == ' ') {
				lexema = "";
			}
			for (int j = 0; j < simbolos.length(); j++) {
				if (token == simbolos.charAt(j)) {
					lexema = Character.toString(token);
					System.out.println(lexema +"------->"+ simbolo.getTipo());
					lexema = "";
				}
			}

			
			for (int j = 0; j < letras.length(); j++) {
				if (token == letras.charAt(j)) {
					
//					lexema = lexema + token;
				}
			}

			

		}
	}
}
