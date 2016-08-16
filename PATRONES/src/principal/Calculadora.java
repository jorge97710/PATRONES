package principal;

import java.io.BufferedReader;


import java.io.FileReader;
import javax.swing.JOptionPane;
import interfaces.List;
import interfaces.Stack;

public class Calculadora {
	/* Atributos */
	//private Stack<String> miStack = new StackVector<String>();
	private Stack<String> miStack;
	private List<String> miLista;
	public String textoArray[];
	String dire = "";
	private String tipo="";
	private static Calculadora calcu;
	
	public Stack<String> getMiStack() {
		return miStack;
	}
	public void setMiStack(Stack<String> miStack) {
		this.miStack = miStack;
	}
	public List<String> getMiLista() {
		return miLista;
	}
	public void setMiLista(List<String> miLista) {
		this.miLista = miLista;
	}
	Calculadora(){
		
	}
	public static Calculadora getInstance(){
		if (calcu==null){
			calcu = new Calculadora();
		}
		return calcu;
	}
	
	/**
	 * LeerContenido recibe como parametro el archivo donde estan los datos.
	 * devuelve el texto que esta en la linea. si no se encuentra el archivo
	 * muesta error
	 * 
	 * @param archivo
	 */
	String leerContenido(String archivo) {
		String texto = "", temp = "", bfRead;
		try {
			BufferedReader ar = new BufferedReader(new FileReader(archivo));
			while ((bfRead = ar.readLine()) != null) {
				temp += bfRead;
			}
			texto = temp;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se encontro archivo");
			int con = JOptionPane.showConfirmDialog(null,
					"Desea tratar de nuevo", null, JOptionPane.YES_NO_OPTION);
			if (con == JOptionPane.YES_OPTION) {
				instru(tipo);
			} else if (con == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null,
						"Gracias por usar el programa");
				System.exit(0);
			}
		}
		return texto;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * valido recibe como parametro el String operador. los admitidos son
	 * mas,menos,multiplicacion,division. devuele true si es valido y false si
	 * no lo es
	 * 
	 * @param op
	 *            , el operador a utilizar
	 */
	boolean valido(String op) {
		if (op.equals("+") || op.equals("-") || op.equals("*")
				|| op.equals("/")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * calcular recibe como parametro los numeros a operar y el operando.
	 * devuelve el resultado de la operacion
	 * 
	 * @param x
	 *            ,primer numero a operar en formato double
	 * @param y
	 *            , segundo numero a operar en formato double
	 * @param op
	 *            , string del operador a utilizar
	 */
	double calcular(double x, double y, String op) {
		double resultado = 0.0;
		if (op.equals("+")) {
			resultado = (x + y);
		} else if (op.equals("-")) {
			resultado = (x - y);
		} else if (op.equals("*")) {
			resultado = (x * y);
		} else if (op.equals("/")) {
			resultado = (x / y);
		}
		return resultado;
	}

	/**
	 * listaS recorre la expresion en postfix y la va agregando a la pila. Por
	 * ultimo despliega el resultado No recibe parametros.
	 */
	private void listaS(String dir) {
		String x = "", y = "", texto;
		double resultado = 0, no1, no2;
		texto = leerContenido(dir);
		textoArray = texto.split(" ");
		for (String i : textoArray) {
			// Si es un operador valido
			if (valido(i)) {
				if (this.miStack.size() >= 2) {
					y = this.miStack.pop();
					x = this.miStack.pop();
					no1 = Double.parseDouble(x);
					no2 = Double.parseDouble(y);
					// Operar
					resultado = calcular(no1, no2, i);
					this.miStack.push(Double.toString(resultado));

				}
			}

			// Asumir que es un numero
			// Si el numero es valido
			else if (isNumeric(i) == true) {
				this.miStack.push(i);
			}
			// Si no es un numero
			else if (isNumeric(i) == false) {
				JOptionPane.showMessageDialog(null,
						"No se tiene un formato valido");
				System.exit(0);
			}

		}
		// Desplegar resultado
		String newLine = System.getProperty("line.separator");
		JOptionPane.showMessageDialog(null, "Expresion ingresada: " + texto
				+ newLine + "Resultado= " + resultado, " Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
	/**
	 * lista recorre la expresion en postfix y la va agregando a la pila. Por
	 * ultimo despliega el resultado No recibe parametros.
	 */
	void lista(String dir) {
		String x = "", y = "", texto;
		double resultado = 0, no1, no2;
		texto = leerContenido(dir);
		textoArray = texto.split(" ");
		for (String i : textoArray) {
			// Si es un operador valido
			if (valido(i)) {
				if (miLista.size() >= 2) {
					y = miLista.pop();
					x = miLista.pop();
					no1 = Double.parseDouble(x);
					no2 = Double.parseDouble(y);
					// Operar
					resultado = calcular(no1, no2, i);
					miLista.push(Double.toString(resultado));

				}
			}

			// Asumir que es un numero
			// Si el numero es valido
			else if (isNumeric(i) == true) {
				miLista.push(i);
			}
			// Si no es un numero
			else if (isNumeric(i) == false) {
				JOptionPane.showMessageDialog(null,
						"No se tiene un formato valido");
				System.exit(0);
			}

		}
		// Desplegar resultado
		String newLine = System.getProperty("line.separator");
		JOptionPane.showMessageDialog(null, "Expresion ingresada: " + texto
				+ newLine + "Resultado= " + resultado, " Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
	/**
	 * isNumeric retorna un true o false dependieno si el numero es valido.
	 */
	static boolean isNumeric(String str) {
		return (str.matches("[+-]?\\d*(\\.\\d+)?") && str.equals("") == false);
	}

	/**
	 * instru Se encarga de dictar las instrucciones generales al usuario. No
	 * recibe parametros.
	 */
	void instru(String s) {
		
		JOptionPane.showMessageDialog(null,
				"Por favor ingrese la direccion donde se encuentra ubicado su archivo .txt\n"
						+ "	Por ejemplo:"
						+ "C:\\Users\\Carlos\\Desktop\\txt\\hola.txt",
				"Bienvenido a la calculador PostFix	",
				JOptionPane.INFORMATION_MESSAGE);
		;
		dire = JOptionPane.showInputDialog("Ingrese direccion: ");
		defensiva(dire);
		if (s.equalsIgnoreCase("S")){
			listaS(dire);
		}
		else if (s.equalsIgnoreCase("L")){
			lista(dire);
		}
		
	}
	
	void defensiva(String s){
		if (s==null){
			JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
			System.exit(0);
		}
	}
	public void instru() {
		// TODO Auto-generated method stub
		
	}
}
