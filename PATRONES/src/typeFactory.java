import java.util.Stack;

/**
 * 
 * @author Carlos Calderon, 15219
 * @author Jorge Azmitia,15202
 * @version 1 agosto 11, 2016
 * @param <E>
 */
class typeFactory <E> {
	// returns an instance of LastFirst or FirstFirst
	// depending on whether a comma is found

	public Stack<E> crear1(String opcion1){
		if(opcion1.equals("arraylist")){
			return  new StackArraylist<E>();

		}
		if(opcion1.equals("vector")){
			return  new StackVector<E>();

		}
		if(opcion1.equals("list")){
			return  new StackList<E>();

		}
	
		
	}
	
	public List<E> crear2(String opcion1){
		if(opcion1.equals("simple")){
			return new SinglyLinkedList<E>();
		}
		if(opcion1.equals("doble")){
			return new DoublyLinkedList<E>();

		}
		if(opcion1.equals("circular")){
			return new CircularList<E>();

		}
		
		
	}
	
	public void decidir(String opcion,String opcion1){
		if(opcion.equals("stack")){
		crear1(opcion1);	
		}
		
		if(opcion.equals("lista")){
			crear2(opcion1);	
			}
		
		
		
	}
}