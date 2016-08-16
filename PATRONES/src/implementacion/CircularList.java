package implementacion;

import java.util.Iterator;

import abstractas.AbstractList;


/**
 * Esta clase corresponde a una circular enlazada, y utiliza la clase Node.
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * Inspirado en codigo de BB de UVG.
 * @version 2.0 agosto 15, 2016
 *
 * @param <E> Dato generico, para indicar cual sera el tipo de dato que se ingresara a la lista.
 */

public class CircularList<E> extends AbstractList<E>{
	/** Atributos**/
	protected Node<E> tail; 
	protected int count;

	/**
	 * Metodo constructor, inicializa lista circular, con cola vacia y contador inicializado.
	 */
	public CircularList(){
		tail = null;
		count = 0;
	}

	/**
	 * Metodo addFirst, se encarga de anadir un elemento en el primer lugar de la lista.
	 * @param Value, el valor que hay en el nodo
	 */
	public void addFirst(E Value){
		Node<E> temp = new Node<E>(Value);
		if (tail == null) { // first value added
			tail = temp;
			tail.setNext(tail);
		} else { // element exists in list
			temp.setNext(tail.next());
			tail.setNext(temp);
		}
		count++;
	}





	/* (non-Javadoc)
	 * @see interfaces.List#push(java.lang.Object)
	 */
	public void push(E value){

		addFirst(value);
		tail = tail.next(); //Agregar al final de la lista
	}

	/* (non-Javadoc)
	 * @see interfaces.List#pop()
	 */
	/* (non-Javadoc)
	 * @see interfaces.List#pop()
	 */
	public E pop(){

		Node<E> finger = tail;
		while (finger.next() != tail) {
			finger = finger.next();
		}
		// finger now points to second-to-last value
		Node<E> temp = tail;
		if (finger == tail)
		{
			tail = null;
		} else {
			finger.setNext(tail.next());
			tail = finger;
		}
		count--;
		return temp.value();
	}



	/* (non-Javadoc)
	 * @see interfaces.List#size()
	 */
	@Override
	public int size() {
		return count;
	}



}