package principal;
import java.io.IOException;
import javax.swing.JOptionPane;
import Fabricas.ProductFactory;
import interfaces.List;
import interfaces.ListaFactory;
import interfaces.Stack;
import interfaces.Stackfactory;

/**
 * 
 * Esta clase se encarga de dar la interfaz para el programa. Lee un .txt con
 * una expresion en notacion polaca inversa, y luego despliega su respectivo
 * resultado.
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @version 2.0 agosto 15, 2016
 * 
 */
public class MainCalculadora {
	static String tipo="",tipoL="",tipoS="";
	static Calculadora miCalculadora= Calculadora.getInstance();
	
	static void ejecutar(){
		JOptionPane.showMessageDialog(null,
				"Por favor ingrese el ADT que desee utilizar\n"
				+ "Para Listas enlazadas ingrese ''L''\n"
				+ "Para Stack ingrese ''S''\n",
				"Datos necesarios",
				JOptionPane.INFORMATION_MESSAGE);
		tipo = JOptionPane.showInputDialog("Ingrese el tipo: ");
		miCalculadora.defensiva(tipo);
		miCalculadora.setTipo(tipo);
		if ("S".equalsIgnoreCase(tipo)){
			JOptionPane.showMessageDialog(null,
					"Por favor ingrese el Stack que desee utilizar\n"
					+ "Para Vector ingrese ''V''\n"
					+ "Para ArrayList ''A''\n"
					+ "Para Lista ingrese ''LI''\n",
					"Datos necesarios",
					JOptionPane.INFORMATION_MESSAGE);
			tipoS = JOptionPane.showInputDialog("Ingrese el tipo de Stack: ");
			miCalculadora.defensiva(tipoS);
			Stackfactory creadorStacks=  ProductFactory.stacks();
			Stack miStack= creadorStacks.crearStack(tipoS);
			miCalculadora.setMiStack(miStack);
		}
		if("L".equalsIgnoreCase(tipo)){
				JOptionPane.showMessageDialog(null,
						"Por favor ingrese la Lista que desee utilizar\n"
						+ "Para Lista simplemente enlazada ''LS''\n"
						+ "Para Lista doblemente enlazada ''LD''\n"
						+ "Para Lista circular ''LC''\n",
						"Datos necesarios",
						JOptionPane.INFORMATION_MESSAGE);
			tipoL = JOptionPane.showInputDialog("Ingrese el tipo de Stack: ");
			miCalculadora.defensiva(tipoL);
			ListaFactory creadorListas=  ProductFactory.listas();
			List miLista= creadorListas.crearLista(tipoL);
			miCalculadora.setMiLista(miLista);
		}
		
		miCalculadora.instru(tipo);
	}
	
	/**
	 * Metodo main, para ejecutar el programa
	 * @param args, args
	 */
	public static void main(String[] args) {

		ejecutar();
		
	}

}
