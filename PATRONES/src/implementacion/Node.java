package implementacion;
/**
 * Esta clase corresponde simular un nodo simple.
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * Inspirado en codigo de BB de UVG.
 * @version 2.0 agosto 15, 2016
 *
 * @param <E> Dato generico, para indicar cual sera el tipo de dato que se ingresara a la lista.
 */
public class Node<E>{
	/** Atributos**/
	protected E data; // value stored in this element
	protected Node<E> nextElement; // ref to next

	/**
	 * Constructor para inicializar un nodo.
	 * @param v, valor asociado al nodo
	 * @param next, nodo que es la cabeza de la lista.
	 */
	public Node(E v, Node<E> next){
		data = v;
		nextElement = next;
	}

	 /**
	  * Constructor
	 * @param v, valor de nodo asociado
	 */
	public Node(E v){
	      this(v,null);
	   }
	/**
	 * Getter, devuelve el nodo siguiente al actual 
	 * @return el nodo siguiente al actual
	 */
	public Node<E> next() {
		return nextElement;
	}

	/**
	 * Setter, para modificar el nodo que sigue al actual. 
	 * @param next, retorna el nodo siguiente al actual.
	 */
	public void setNext(Node<E> next){
		nextElement = next;
	}

	/**
	 * Getter para devolver valor del nodo
	 * @return el valor asociado al nodo
	 */
	public E value(){
		return data;
	}

	/**
	 * Setter, para modificar el valor del nodo
	 * @param value, valor para modificar el valor del nodo actual
	 */
	public void setValue(E value){
		data = value;
	}
}