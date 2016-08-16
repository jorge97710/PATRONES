package implementacion;
/**
 * Esta clase corresponde simular un nodo de doble enlace.
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * Inspirado en codigo de BB de UVG.
 * @version 2.0 agosto 15, 2016
 *
 * @param <E> Dato generico, para indicar cual sera el tipo de dato que se ingresara a la lista.
 */
public class DoublyLinkedNode<E>{
	/** Atributos**/
	protected E data;
	protected DoublyLinkedNode<E> nextElement;
	protected DoublyLinkedNode<E> previousElement;

	/**
	 * Constructor, para asignar el valor al nodo actual y enlazarlo.
	 * @param v , valor asociado al nodo, 
	 * @param next,nodo de doble enlace siguiente al actual
	 * @param previous , nodo de doble enlace previo al actual
	 */
	public DoublyLinkedNode(E v,DoublyLinkedNode<E> next,DoublyLinkedNode<E> previous){
		data = v;
		nextElement = next;
		if (nextElement != null)
			nextElement.previousElement = this;
		previousElement = previous;
		if (previousElement != null)
			previousElement.nextElement = this;
	}

	/**
	 * Metodo para obtener el nodo siguiente
	 * @return siguiente nodo de la lista
	 */
	public DoublyLinkedNode<E> next(){
		return nextElement;
	}
	/**
	 * Metodo para obtener el nodo anterior
	 * @return el nodo previo al actual
	 */
	public DoublyLinkedNode<E> previous(){
		return previousElement;
	}

	/**
	 * Metodo setter, para cambiar el nodo siguiente
	 * @param next , nodo de doble enlace 
	 */
	public void setNext(DoublyLinkedNode<E> next){
		nextElement = next;
	}

	/**
	 * Metodo para retornar el valor asociado al nodo.
	 * @return valor del nodo
	 */
	public E value(){
		return data;
	}

}