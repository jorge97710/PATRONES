package implementacion;
import java.util.ArrayList;

import abstractas.AbstractList;
import abstractas.AbstractStack;
import interfaces.Stack;

/**
 * clase que implementa estructura de Pila (Stack).
 *
 * @author UVG
 * @version 2.0 agosto 15, 2016
 */
public class StackArrayList<E> extends AbstractStack<E> {
	/* Atributos */
	protected ArrayList<E> data;

	/**
	 * Constructor, construye un nuevo ArrayList
	 */
	public StackArrayList(){
		data = new ArrayList<E>();
	}

	/* (non-Javadoc)
	 * @see abstractas.AbstractStack#push(java.lang.Object)
	 */
	public void push(E item){
		data.add(item);
	}

	/* (non-Javadoc)
	 * @see abstractas.AbstractStack#pop()
	 */
	public E pop(){
		return data.remove(size() - 1);
	}


	/* (non-Javadoc)
	 * @see abstractas.AbstractStack#size()
	 */
	public int size()
	{
		return data.size();
	}

	/* (non-Javadoc)
	 * @see abstractas.AbstractStack#empty()
	 */
	public boolean empty(){
		return size() == 0;
	}
}