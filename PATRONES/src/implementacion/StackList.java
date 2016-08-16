package implementacion;
import java.util.LinkedList;
import java.util.List;

import abstractas.AbstractStack;
import interfaces.Stack;
/**
 * Clase que implementa estructura de Pila (Stack).
 *
 * @author UVG
 * @version 2.0 agosto 15, 2016
 */

public class StackList<E> extends AbstractStack<E> {
	/** Atributos**/
	protected List<E> vec;

	/**
	 * Constructor, construye una nueva lista
	 */
	public StackList(){
		vec = new LinkedList<E>();
	}

	/* (non-Javadoc)
	 * @see abstractas.AbstractStack#push(java.lang.Object)
	 */
	public void push(E item){
		vec.add(item);
	}

	/* (non-Javadoc)
	 * @see abstractas.AbstractStack#pop()
	 */
	public E pop(){
		return vec.remove(size() - 1);
	}


	/* (non-Javadoc)
	 * @see abstractas.AbstractStack#size()
	 */
	public int size(){
		return vec.size();
	}

	/* (non-Javadoc)
	 * @see abstractas.AbstractStack#empty()
	 */
	public boolean empty(){
		return size() == 0;
	}
}