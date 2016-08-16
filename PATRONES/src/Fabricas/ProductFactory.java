package Fabricas;

import interfaces.ListaFactory;
import interfaces.Stackfactory;
/**
 * 
 *Clase fabrica para seleccionar el tipo de fabrica que se quiere (Listas/Stacks)
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @version 2.0 agosto 15, 2016
 * 
 */
public class ProductFactory {
	
	
	
	/**
	 * @return La fabrica de Stacks
	 */
	public static Stackfactory stacks(){
		
		return new creadorstacks();
		
		
	}
	/**
	 * @return La fabrica de Listas
	 */
	public static ListaFactory listas(){
		
		return new creadorListas();
	}


}
