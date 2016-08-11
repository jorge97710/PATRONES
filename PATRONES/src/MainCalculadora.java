import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
*Esta clase se encarga de dar la interfaz para el programa. Lee un .txt con una expresion en notacion
*polaca inversa, y luego despliega su respectivo resultado.

@author Carlos Calderon, 15219
@author Jorge Azmitia,15202
@author Javier Jo,14343 
@version 1.4 Julio 24, 2016 
*/
public class MainCalculadora {
	 /* Atributos */
    static Stack<String> miStack = new StackVector<String>();
    static String textoArray[],dire="";
    /**
    LeerContenido recibe como parametro el archivo donde estan los datos. devuelve el texto que esta en la linea. si no se encuentra el archivo muesta error
    @param archivo
  */
    static String leerContenido(String archivo) {
    	String texto="",temp="",bfRead; 
    	try{
			 BufferedReader ar = new BufferedReader (new FileReader(archivo));
			 while ((bfRead = ar.readLine()) != null){
				 temp+=bfRead;
			 }
			 texto=temp;
		 }
		 catch(Exception e){
			 JOptionPane.showMessageDialog(null, "No se encontro archivo");
			 int con = JOptionPane.showConfirmDialog(null, 
					   "Desea tratar de nuevo",null, JOptionPane.YES_NO_OPTION);
		        if(con == JOptionPane.YES_OPTION){
		        	instru();
		        }
		        else if(con == JOptionPane.NO_OPTION){
		            JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
		        	System.exit(0);
		        }
		 }
		 return texto;
	    }
    
    /**
    valido recibe como parametro el String operador. los admitidos son mas,menos,multiplicacion,division. devuele true si es valido y false si no lo es 
    @param op, el operador a utilizar
  */
    static boolean valido(String op){
    	if (op.equals("+") || op.equals("-")||op.equals("*")||op.equals("/")) {
    		return true;
    	}
        else{
        	 return false;
        }
    }
    /**
    calcular recibe como parametro los numeros a operar y el operando. devuelve el resultado de la operacion
    @param x,primer numero a operar en formato double
    @param y, segundo numero a operar en formato double
    @param op, string del operador a utilizar
  */
	static double calcular(double x, double y,String op){
		double resultado=0.0;
		if (op.equals("+")){
			resultado= (x + y);
		}
		else if (op.equals("-")){
			resultado=(x - y);
		}
		else if (op.equals("*")){
			resultado= (x * y);
		}
		else if (op.equals("/")){
			resultado=(x / y);
		}
		return resultado;
	}
	/**
    lista recorre la expresion en postfix y la va agregando a la pila. Por ultimo despliega el resultado
    No recibe parametros.
  */
	static void lista(String dir){
		String x="",y="",texto;
		double resultado = 0,no1,no2;
		texto=leerContenido(dir);
        textoArray = texto.split(" ");
        for(String i : textoArray){
        	// Si es un operador valido
        	if (valido(i)){
        		if (miStack.size()>=2){
        			y=miStack.pop();
        			x=miStack.pop();
        			no1=Double.parseDouble(x);
        			no2=Double.parseDouble(y);
        			//Operar 
        	        resultado = calcular(no1,no2,i);
        	        miStack.push(Double.toString(resultado));
        	        
        			}
        		}
        	
        	//Asumir que es un numero
        	//Si el numero es valido
        	else if (isNumeric(i)==true){
        		miStack.push(i);
        	}
        	//Si no es un numero
        	else if (isNumeric(i)==false){
        		JOptionPane.showMessageDialog(null, "No se tiene un formato valido");
        		System.exit(0);
        	}
        	
          }
        //Desplegar resultado
        String newLine = System.getProperty("line.separator");
        JOptionPane.showMessageDialog(null, "Expresion ingresada: "+texto+newLine+"Resultado= "+resultado," Resultado",JOptionPane.INFORMATION_MESSAGE);
    	System.exit(0);
	}
	/**
    isNumeric retorna un true o false dependieno si el numero es valido.
  */
	  public static boolean isNumeric(String str) {
	        return (str.matches("[+-]?\\d*(\\.\\d+)?") && str.equals("")==false);
	    }
	  /**
	    instru Se encarga de dictar las instrucciones generales al usuario.
	    No recibe parametros.
	  */  
	  static void instru(){
		  JOptionPane.showMessageDialog(null, "Por favor ingrese la direccion donde se encuentra ubicado su archivo .txt\n"
			  		+ "	Por ejemplo:"+"C:\\Users\\Carlos\\Desktop\\txt\\hola.txt", "Bienvenido a la calculador PostFix	", JOptionPane.INFORMATION_MESSAGE);;
		  dire = JOptionPane.showInputDialog("Ingrese direccion: ");
		  if (dire==null){
			  JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
			  System.exit(0);  
		  }
		  lista(dire);
	  }
	  /**
		 * Ejecuta el programa.
		 */
	 public static void main(String[] args) throws IOException { 
		 instru();
		  }
	 
}
