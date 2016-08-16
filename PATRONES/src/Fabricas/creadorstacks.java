package Fabricas;

import implementacion.StackArrayList;
import implementacion.StackList;
import implementacion.StackVector;
import interfaces.Stack;
import interfaces.Stackfactory;
/**
 * 
 *Clase fabrica para los Stacks
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @version 2.0 agosto 15, 2016
 * 
 */
public class creadorstacks implements Stackfactory {

	/* (non-Javadoc)
	 * @see interfaces.Stackfactory#crearStack(java.lang.String)
	 */
	@Override
	public Stack crearStack(String tipostack) {

		if ("A".equalsIgnoreCase(tipostack)) {
			return new StackArrayList<String>();
		}
		if ("LI".equalsIgnoreCase(tipostack)) {
			return new StackList<String>();

		}

		if ("V".equalsIgnoreCase(tipostack)) {
			return new StackVector<String>();

		}

		return null;
	}

}
