package principal;

import static org.junit.Assert.*;

import org.junit.Test;

import implementacion.CircularList;
import implementacion.DoublyLinkedList;
import implementacion.SinglyLinkedList;
import implementacion.StackVector;
import interfaces.List;
import interfaces.Stack;

/**
 * Clase para probar que los metodos implementados funcionen correctamente.
 * 	@author Carlos Calderon, 15219
 *  @author Jorge Azmitia,15202
 * @version 2.0 agosto 15, 2016 
 */
public class ListasPruebas {

/*Atributos*/
    static List<String> miLista = new SinglyLinkedList<String>();
    static List<String> miLista2 = new DoublyLinkedList<String>();
    static List<String> miLista3 = new CircularList<String>();
	
	@Test
    public void testPushPop() throws Exception{
    	miLista.push("Carlos");
    	assertEquals("Carlos",miLista.pop());
    }
	
	@Test
	public void testSize() throws Exception{
		miLista.push("Carlos");
		int tam=miLista.size();
		assertEquals(1,tam);
	}
	@Test
	public void testEmpty() throws Exception{
		boolean c= miLista.isEmpty();
		assertEquals(true,c);
	}
	
}
