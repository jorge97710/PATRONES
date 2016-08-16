package implementacion;

import java.util.Iterator;

import abstractas.AbstractList;

/**
 * Esta clase corresponde a una lista doblemente enlazada, y utiliza la clase DoublyLinkedNode.
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * Inspirado en codigo de BB de UVG.
 * @version 2.0 agosto 15, 2016
 *
 * @param <E> Dato generico, para indicar cual sera el tipo de dato que se ingresara a la lista.
 */

public class DoublyLinkedList<E> extends AbstractList<E>{
	/** Atributos**/
	protected int count;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;

	/**
	 * Metodo constructor, inicializa una lista doblemente enlazada. 
	 * Con cola y y cabeza vacias y contador inicializado.
	 */
	public DoublyLinkedList(){

		head = null;
		tail = null;
		count = 0;
	}

	/* (non-Javadoc)
	 * @see interfaces.List#push(java.lang.Object)
	 */
	@Override
	public void push(E value) {

		tail = new DoublyLinkedNode<E>(value, null, tail); //Construye un nuevo elemento
		// fix up head
		if (head == null) head = tail;
		count++;
	}


	/* (non-Javadoc)
	 * @see interfaces.List#pop()
	 */
	@Override
	public E pop() {
		DoublyLinkedNode<E> temp = tail;
		tail = tail.previous();
		if (tail == null) {
			head = null;
		} else {
			tail.setNext(null);
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