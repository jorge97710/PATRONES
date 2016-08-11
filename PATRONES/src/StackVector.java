import java.util.Vector;

/**
*Utiliza la interfaz Stack<E> para crear un Stack que use la ADT Vector
*@author UVG
*/

public class StackVector<E> implements Stack<E>
{
	protected Vector<E> vec; 
	public StackVector()
	// post: constructs a new, empty stack
	{
		vec = new Vector<E>();
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		vec.add(item);
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return vec.remove(size()-1);
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return vec.get(size() - 1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return vec.size();
	}
  
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}