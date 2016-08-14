package principal;

import implementacion.CircularList;
import implementacion.DoublyLinkedList;
import implementacion.SinglyLinkedList;
import interfaces.List;

public class creadorListas implements ListaFactory {

	
	@Override
	public  List crearLista(String tipolist) {
		

		if ("simple".equalsIgnoreCase(tipolist)) {
				return new  SinglyLinkedList();

		}
		if ("doble".equalsIgnoreCase(tipolist)) {
			return new  DoublyLinkedList();

		}

		if ("circular".equalsIgnoreCase(tipolist)) {
				return new CircularList(); 

		}

	
		
		return null;
	}



}
