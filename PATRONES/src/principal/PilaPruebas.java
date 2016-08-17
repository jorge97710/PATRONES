package principal;
import interfaces.List;
import interfaces.Stack;
import static org.junit.Assert.*;

import org.junit.Test;
import implementacion.*;
/**
 * Clase para probar que los metodos implementados funcionen correctamente.
 * 	@author Carlos Calderon, 15219
 *  @author Jorge Azmitia,15202
 * @version 2.0 agosto 15, 2016 
 */
public class PilaPruebas {

/*Atributos*/
    static Stack<String> miStack = new StackVector<String>();
    static Stack<String> miStack2 = new StackVector<String>();
    static Stack<String> miStack3 = new StackVector<String>();
	
	@Test
    public void testPushPop() throws Exception{
    	miStack3.push("Carlos");
    	assertEquals("Carlos",miStack3.pop());
    }
	
	@Test
	public void testSize() throws Exception{
		miStack3.push("Carlos");
		int tam=miStack3.size();
		assertEquals(1,tam);
	}
	@Test
	public void testEmpty() throws Exception{
		boolean c= miStack3.empty();
		assertEquals(true,c);
	}
	
}
