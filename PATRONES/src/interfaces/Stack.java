package interfaces;
/**
 * Interfaz para implementar una estructura de Pila (Stack).
 *
 * @author UVG
 * @version 2.0  agosto 15, 2016
 * @param <E> Dato generico
 */
public interface Stack<E> {

	/**
	 * Metodo para insertar elementos a la lista
	 * @param item, tipo de dato a insertar
	 */
	public void push(E item);

	/**
	 * Metodo pop, para sacar elementos a la lista
	 * @return dato removido
	 */
	public E pop();


	/**
	   Metodo  Empty,  para conocer si la lista esta vacia
	   @return si la lista esta vacia
	   True implica vacia
	   False implica no vacia
		 */
	public boolean empty();

	/**
    Metodo  size,  para conocer el numero de elementos
    @return tamano de la lista
	 */
	public int size();
	// post: returns the number of elements in the stack

}