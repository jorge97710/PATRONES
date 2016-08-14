package principal;
import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

import fabricas.FabricaPilas;
import implementacion.StackVector;
import interfaces.Stack;

/**
 * 
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @version 1 agosto 11, 2016
 * 
 * Esta clase se encarga de dar la interfaz para el programa. Lee un .txt con
 * una expresion en notacion polaca inversa, y luego despliega su respectivo
 * resultado.
 * 
 */
public class MainCalculadora {
	

	
	/**
	 * Ejecuta el programa.
	 */
	public static void main(String[] args) throws IOException {

		Calculadora miCalculadora= Calculadora.getInstance();
		miCalculadora.instru();
	}

}
