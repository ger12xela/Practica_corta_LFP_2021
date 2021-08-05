import java.awt.EventQueue;

import funcion.Funcion;
import funcion.Tokens;
import iu.Ventana;

/**
 * 
 */

/**
 * @author Gerson Reynoso
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Ventana principal = new Ventana();
		principal.setVisible(true);
		Funcion prueba = new Funcion();
		
//		Tokens imp = Tokens.entero;
//		System.out.println(imp.getTipo());
		prueba.paso1("hola como[] estas");
		
	}
	

}
