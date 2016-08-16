package implementacion;

import java.util.Iterator;

import abstractas.AbstractList;

/**
 * Esta clase corresponde a una lista simplemente enlazada, y utiliza la clase Node.
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * Inspirado en codigo de BB de UVG.
 * @version 2.0 agosto 15, 2016
 *
 * @param <E> Dato generico, para indicar cual sera el tipo de dato que se ingresara a la lista.
 */
public class SinglyLinkedList<E> extends AbstractList<E>
{
	/** Atributos**/
	protected int count; // list size
	protected Node<E> head; // ref. to first element

	/**
	 * Constructor, genera una lista enlazada vacia y un contador inicial.
	 */
	public SinglyLinkedList(){
		head = null;
		count = 0;
	}

	/* (non-Javadoc)
	 * @see interfaces.List#size()
	 */
	public int size(){
		return count;
	}

	/* (non-Javadoc)
	 * @see interfaces.List#push(java.lang.Object)
	 */
	@Override
	public void push(E value) {
		head = new Node<E>(value, head);//La cabeza del nodo ahora se vuelve la siguiente
		count++;
	}

	/* (non-Javadoc)
	 * @see interfaces.List#pop()
	 */
	@Override
	public E pop() {

		Node<E> temp = head;
		head = head.next(); // move head down list
		count--;
		return temp.value();
	}  

}