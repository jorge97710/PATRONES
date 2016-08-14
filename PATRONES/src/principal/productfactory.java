package principal;

public class productfactory {
	
	
	public static Stackfactory stacks(String tipo){
		
		return new creadorstacks();
		
		
	}
	
	

	public static ListaFactory listas(String tipo){
		
		return new creadorListas();
	}


}
