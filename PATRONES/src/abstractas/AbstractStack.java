package abstractas;

import interfaces.Stack;

/**
 * Clase abstracta de la que heredan las Stacks.
 * @author UVG
 * @version 2.0  agosto 15, 2016
 * @param <E> Dato generico
 */
public class AbstractStack<E> implements Stack<E> {

	/* (non-Javadoc)
	 * @see interfaces.Stack#push(java.lang.Object)
	 */
	@Override
	public void push(E item) {
		
	}

	/* (non-Javadoc)
	 * @see interfaces.Stack#pop()
	 */
	@Override
	public E pop() {
		
		return null;
	}

	
	/* (non-Javadoc)
	 * @see interfaces.Stack#empty()
	 */
	@Override
	public boolean empty() {
		
		return size() == 0;
	}

	/* (non-Javadoc)
	 * @see interfaces.Stack#size()
	 */
	@Override
	public int size() {
		
		return 0;
	}

}
