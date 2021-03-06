package interfaces;

import interfaces.Stack;

/**
 * 
 *Interfaz para las fabricas de Stacks
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @version 2.0 agosto 15, 2016
 * 
 */
public interface Stackfactory {

	/**
	 * @param tipoStack , tipo de Stack escogido
	 * @return	el tipo de Stack seleccionado
	 */
	Stack crearStack (String tipoStack);
}
