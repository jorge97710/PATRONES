package principal;

import implementacion.StackArrayList;
import implementacion.StackList;
import implementacion.StackVector;
import interfaces.Stack;

public class creadorstacks implements Stackfactory {

	@Override
	public Stack crearStack(String tipostack) {

		if ("ArrayList".equalsIgnoreCase(tipostack)) {
				return new StackArrayList();
		}
		if ("Lista".equalsIgnoreCase(tipostack)) {
			return new StackList();

		}

		if ("Vector".equalsIgnoreCase(tipostack)) {
			return new StackVector();

		}

		return null;
	}

}
