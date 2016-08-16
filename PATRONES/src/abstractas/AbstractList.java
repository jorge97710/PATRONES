package abstractas;
import interfaces.List;

/**
 * Clase abstracta de la que heredan las listas enlazadas
 * @author UVG
 *@version 2.0  agosto 15, 2016
 * @param <E> dato generico
 */
public abstract class AbstractList<E> implements List<E>{
   
/**
 * Constructor
 */
public AbstractList(){
   }

   /* (non-Javadoc)
 * @see interfaces.List#isEmpty()
 */
public boolean isEmpty()
   {
      return size() == 0;
   }
}