package interfaces;
/**
 * 
 *Interfaz para las fabricas de listas
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @version 2.0 agosto 15, 2016
 * 
 */
public interface ListaFactory {

	/**
	 * @param tipolist , tipo de lista enlazada escogida
	 * @return	el tipo de lista seleccionada
	 */
	List crearLista (String tipolist);

}
