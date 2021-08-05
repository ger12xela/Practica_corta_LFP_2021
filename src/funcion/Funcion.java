package funcion;

public class Funcion {
	
	String entrada;
	String salida;
	Tokens tipo;
	String letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
	String numeros = "1234567890";
	String simbolos = "[]{};,";
	String lexema = " ";
	Tokens entero = Tokens.entero;
	Tokens simbolo = Tokens.simbolo;		
	
	public void paso1(String entrada) {
		this.entrada = entrada;
		
		
		for (int i = 0; i < entrada.length(); i++) {
			char token = entrada.charAt(i);
			
			for (int j = 0; j <letras.length() ; j++) {
				if (token == letras.charAt(j)){
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
				}
			}
			System.out.println(lexema +"----->"+ tipo.getTipo());
			
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
		}
	}
}
