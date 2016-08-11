import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Clase para probar que los metodos implementados funcionen correctamente.
 * 	@author Carlos Calderon, 15219
 *  @author Jorge Azmitia,15202
 *  @author Javier Jo,14343 
 * 	@version 1.4 Julio 24, 2016
 */
public class CalculadoraPruebas {
	/* Atributos */
	 private MainCalculadora calcu = new MainCalculadora ();
	@Test
	public void testleerContenido()throws Exception {
		String archivo="C:\\Users\\Carlos\\Desktop\\txt\\hola.txt";
		String con=calcu.leerContenido(archivo);
		assertEquals(con,"5 1 2 + 4 * + 3 -");
		
	}
	@Test
	public void testValido()throws Exception {
		boolean v=calcu.valido("+");
		assertEquals(true,v);
	}
	@Test 
	public void testCalcular() throws Exception{
		double calculo= calcu.calcular(3,2,"+");
		assertEquals(calculo,5, 0.00000002);
	}
	
	@Test
	public void testisNumeric() throws Exception{
		boolean v=calcu.isNumeric("+");
		assertEquals(true,v);
	}
	@Test
	 public  void testinstru() throws Exception{
		 calcu.instru();
		 assertEquals(calcu.dire,"C:\\Users\\Carlos\\Desktop\\txt\\hola.txt");
	 }
	@Test
	 public  void testlista() throws Exception{
		 calcu.lista("C:\\Users\\Carlos\\Desktop\\txt\\hola.txt");
		 assertEquals(calcu.textoArray,"5 1 2 + 4 * + 3 -");
	 }
	}
