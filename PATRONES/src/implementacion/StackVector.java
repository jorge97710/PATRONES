package implementacion;
import java.util.Vector;

import abstractas.AbstractStack;
import interfaces.Stack;
/**
 * clase que implementa estructura de Pila (Stack).
 *
 * @author UVG
 * @version 2.0 agosto 15, 2016
 */
public class StackVector<E> extends AbstractStack<E>{
	protected Vector<E> vec;

	/**
	 * Constructor, construir un nuevo vector
	 */
	public StackVector(){
		vec = new Vector<E>();
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