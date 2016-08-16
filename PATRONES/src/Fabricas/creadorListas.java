package Fabricas;

import implementacion.CircularList;
import implementacion.DoublyLinkedList;
import implementacion.SinglyLinkedList;
import interfaces.List;
import interfaces.ListaFactory;
/**
 * 
 *Clase fabrica para las listas enlazadas
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @version 2.0 agosto 15, 2016
 * 
 */
public class creadorListas implements ListaFactory {


	/* (non-Javadoc)
	 * @see interfaces.ListaFactory#crearLista(java.lang.String)
	 */
	@Override
	public  List crearLista(String tipolist) {


		if ("LS".equalsIgnoreCase(tipolist)) {
			return new  SinglyLinkedList<String>();

		}
		if ("LD".equalsIgnoreCase(tipolist)) {
			return new  DoublyLinkedList<String>();

		}

		if ("LC".equalsIgnoreCase(tipolist)) {
			return new CircularList<String>(); 

		}



		return null;
	}



}
